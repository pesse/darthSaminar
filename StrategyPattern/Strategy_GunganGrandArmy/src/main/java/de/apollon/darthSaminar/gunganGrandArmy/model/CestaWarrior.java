/**
 *
 */
package de.apollon.darthSaminar.gunganGrandArmy.model;

/**
 * @author snitsche
 *
 */
public class CestaWarrior extends GunganWarrior
{

	/**
	 * @param name
	 */
	public CestaWarrior(String name)
	{
		super(name);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * de.apollon.darthSaminar.gunganGrandArmy.model.GunganWarrior#attack(java.
	 * lang.String)
	 */
	@Override
	public void attack(String target)
	{
		System.out.println(String.format("%s hits its cesta over %s's head", getName(), target));
	}

}
