/**
 *
 */
package de.apollon.darthSaminar.gunganGrandArmy.attack;

import de.apollon.darthSaminar.gunganGrandArmy.model.GunganWarrior;

/**
 * @author snitsche
 *
 */
public class AtlatlAttackStrategy implements AttackStrategy
{

	@Override
	public void attack(GunganWarrior warrior, String target)
	{
		System.out.println(String.format("%s smashes its atlatl in %s's face", warrior.getName(), target));
	}

}
