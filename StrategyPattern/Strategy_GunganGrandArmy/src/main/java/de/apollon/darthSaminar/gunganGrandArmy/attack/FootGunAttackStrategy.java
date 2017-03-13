/**
 *
 */
package de.apollon.darthSaminar.gunganGrandArmy.attack;

import de.apollon.darthSaminar.gunganGrandArmy.model.GunganWarrior;

/**
 * @author snitsche
 *
 */
public class FootGunAttackStrategy implements AttackStrategy
{

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.apollon.darthSaminar.gunganGrandArmy.attack.AttackStrategy#attack(de.
	 * apollon.darthSaminar.gunganGrandArmy.model.GunganWarrior,
	 * java.lang.String)
	 */
	@Override
	public void attack(GunganWarrior warrior, String target)
	{
		System.out.println(String.format(
				"%s stumbles around with a lasergun tied to its feet, shooting several times, accidently hitting %s with a headshot",
				warrior.getName(), target));
	}

}
