/**
 *
 */
package de.apollon.darthSaminar.force;

import java.util.HashSet;
import java.util.Set;

import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.spring.annotation.UIScope;

/**
 * @author snitsche
 *
 */
@UIScope
@SpringComponent
public class Force
{
	private Set<ForceSensitive> sensitivObjects;

	public static interface ForceSensitive
	{
		public void disturb();
	}

	public void addForceSensitiveObject(ForceSensitive obj)
	{
		if (sensitivObjects == null)
			sensitivObjects = new HashSet<>();

		if (obj != null)
			sensitivObjects.add(obj);
	}

	public void removeForceSensitiveObject(ForceSensitive obj)
	{
		if (sensitivObjects != null && obj != null)
			sensitivObjects.remove(obj);
	}

	public void createDisturbance()
	{
		if (sensitivObjects != null)
		{
			for (ForceSensitive obj : sensitivObjects)
			{
				obj.disturb();
			}
		}
	}
}
