/**
 *
 */
package de.apollon.darthSaminar.gunganArmy.attack;

import de.apollon.darthSaminar.gunganArmy.model.GunganWarrior;

/**
 * @author snitsche
 *
 */
public class ElectropoleAttackStrategy implements AttackStrategy
{

	/**
	 *
	 */
	public ElectropoleAttackStrategy()
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
		System.out.println(String.format("%s attacks %s'eyeball with its electropole", warrior.getName(), target));
	}

}
