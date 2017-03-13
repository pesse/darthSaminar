/**
 *
 */
package de.apollon.darthSaminar.gunganArmy.attack;

import de.apollon.darthSaminar.gunganArmy.model.GunganWarrior;

/**
 * @author snitsche
 *
 */
public interface AttackStrategy
{
	public void attack(GunganWarrior warrior, String target);
}
