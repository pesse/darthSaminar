/**
 *
 */
package de.apollon.darthSaminar.gunganGrandArmy.model;

/**
 * @author snitsche
 *
 */
public class GunganShieldWarrior extends GunganWarrior
{

	/**
	 * @param name
	 */
	public GunganShieldWarrior(String name)
	{
		super(name);
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.apollon.darthSaminar.gunganGrandArmy.model.GunganWarrior#attack()
	 */
	@Override
	public void attack(String target)
	{
		System.out.println(String.format("%s hits %s with its enormous shield", getName(), target));
	}

}
