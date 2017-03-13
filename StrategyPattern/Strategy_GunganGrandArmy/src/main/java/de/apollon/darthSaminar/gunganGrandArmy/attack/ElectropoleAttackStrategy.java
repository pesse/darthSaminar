/**
 *
 */
package de.apollon.darthSaminar.gunganGrandArmy.attack;

import de.apollon.darthSaminar.gunganGrandArmy.model.GunganWarrior;

/**
 * @author snitsche
 *
 */
public class ElectropoleAttackStrategy implements AttackStrategy
{

	@Override
	public void attack(GunganWarrior warrior, String target)
	{
		System.out.println(String.format("%s pokes %s's eye with its electropole", warrior.getName(), target));
	}

}
