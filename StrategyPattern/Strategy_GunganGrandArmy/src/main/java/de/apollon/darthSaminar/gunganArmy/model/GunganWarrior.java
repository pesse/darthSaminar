/**
 *
 */
package de.apollon.darthSaminar.gunganArmy.model;

import de.apollon.darthSaminar.gunganArmy.attack.AttackStrategy;

/**
 * @author snitsche
 *
 */
public class GunganWarrior
{
	protected String name;
	private AttackStrategy attackStrategy;

	public GunganWarrior(String name, AttackStrategy attackStrategy)
	{
		this.name = name;
		this.attackStrategy = attackStrategy;
	}

	public String getName()
	{
		return name;
	}

	public void setAttackStrategy(AttackStrategy s)
	{
		this.attackStrategy = s;
	}

	public void attack(String target)
	{
		if (attackStrategy != null)
			attackStrategy.attack(this, target);
		else
			System.out.println(getName() + " can not attack. Timo?");
	}
}
