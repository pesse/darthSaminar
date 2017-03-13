/**
 *
 */
package de.apollon.darthSaminar.gunganGrandArmy.model;

/**
 * @author snitsche
 *
 */
public abstract class GunganWarrior
{
	protected String name;

	public GunganWarrior(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public abstract void attack(String target);
}
