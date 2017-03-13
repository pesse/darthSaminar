/**
 *
 */
package de.apollon.darthSaminar.gunganArmy.attack;

import de.apollon.darthSaminar.gunganArmy.model.GunganWarrior;

/**
 * @author snitsche
 *
 */
public class FootGunStrategy implements AttackStrategy
{

	/**
	 *
	 */
	public FootGunStrategy()
	{
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.apollon.darthSaminar.gunganArmy.attack.AttackStrategy#attack(de.
	 * apollon.darthSaminar.gunganArmy.model.GunganWarrior, java.lang.String)
	 */
	@Override
	public void attack(GunganWarrior warrior, String target)
	{
		System.out.println(
				String.format("%s stumbles around and accidentially fires in %s nose", warrior.getName(), target));
	}

}
