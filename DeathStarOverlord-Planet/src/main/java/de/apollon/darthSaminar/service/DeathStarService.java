/**
 *
 */
package de.apollon.darthSaminar.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Service;

/**
 * @author snitsche
 *
 */
@Service
public class DeathStarService
{
	public interface DeathStarFireListener
	{
		public void fire();
	}

	private Set<DeathStarFireListener> listeners;

	public void addFireListener(DeathStarFireListener listener)
	{
		if (listeners == null)
			listeners = new HashSet<>();

		listeners.add(listener);
	}

	public void removeFireListener(DeathStarFireListener listener)
	{
		if (listeners != null)
			listeners.remove(listener);
	}

	public void fireDeathStar()
	{
		if (listeners != null)
		{
			for (DeathStarFireListener listener : listeners)
			{
				listener.fire();
			}
		}
	}

}
