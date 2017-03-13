/**
 *
 */
package de.apollon.darthSaminar.gunganGrandArmy.attack;

import de.apollon.darthSaminar.gunganGrandArmy.model.GunganWarrior;

/**
 * @author snitsche
 *
 */
public interface AttackStrategy
{
	public void attack(GunganWarrior warrior, String target);

}
