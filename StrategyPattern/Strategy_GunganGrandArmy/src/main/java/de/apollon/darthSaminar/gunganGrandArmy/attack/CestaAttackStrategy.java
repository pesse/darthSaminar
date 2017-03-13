/**
 *
 */
package de.apollon.darthSaminar.gunganGrandArmy.attack;

import de.apollon.darthSaminar.gunganGrandArmy.model.GunganWarrior;

/**
 * @author snitsche
 *
 */
public class CestaAttackStrategy implements AttackStrategy
{

	@Override
	public void attack(GunganWarrior warrior, String target)
	{
		System.out.println(String.format("%s hits its cesta over %s's head", warrior.getName(), target));
	}

}
