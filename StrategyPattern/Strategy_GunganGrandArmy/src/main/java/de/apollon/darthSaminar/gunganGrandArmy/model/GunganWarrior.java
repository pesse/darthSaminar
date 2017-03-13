/**
 *
 */
package de.apollon.darthSaminar.gunganGrandArmy.model;

import de.apollon.darthSaminar.gunganGrandArmy.attack.AttackStrategy;

/**
 * @author snitsche
 *
 */
public class GunganWarrior
{
	protected String name;
	protected AttackStrategy attackStrategy;

	public GunganWarrior(String name)
	{
		this.name = name;
	}

	public GunganWarrior(String name, AttackStrategy attackStrategy)
	{
		this.name = name;
		this.attackStrategy = attackStrategy;
	}

	public String getName()
	{
		return name;
	}

	public void setAttackStrategy(AttackStrategy strategy)
	{
		this.attackStrategy = strategy;
	}

	public void attack(String target)
	{
		if (attackStrategy != null)
			attackStrategy.attack(this, target);
		else
			System.out.println(String.format("%s cannot attack.", getName()));
	}
}
