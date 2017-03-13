/**
 *
 */
package de.apollon.darthSaminar.gunganArmy.attack;

import de.apollon.darthSaminar.gunganArmy.model.GunganWarrior;

/**
 * @author snitsche
 *
 */
public class AtlatlAttackStrategy implements AttackStrategy
{

	/**
	 *
	 */
	public AtlatlAttackStrategy()
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
		System.out.println(String.format("%s hits %s with its atlatl. OUCH!", warrior.getName(), target));
	}

}
