/**
 *
 */
package de.apollon.darthSaminar.service;

import java.util.ArrayList;
import java.util.List;

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

	private List<DeathStarFireListener> listeners;

	public void addFireListener(DeathStarFireListener listener)
	{
		if (listeners == null)
			listeners = new ArrayList<>();

		listeners.add(listener);
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
