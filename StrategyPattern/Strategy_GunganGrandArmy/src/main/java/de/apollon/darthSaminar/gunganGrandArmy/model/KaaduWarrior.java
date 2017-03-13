/**
 *
 */
package de.apollon.darthSaminar.gunganGrandArmy.model;

/**
 * @author snitsche
 *
 */
public class KaaduWarrior extends GunganWarrior
{

	/**
	 * @param name
	 */
	public KaaduWarrior(String name)
	{
		super(name);
		// TODO Auto-generated constructor stub
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
		System.out.println(
				String.format("%s charges into %s, piercing %s's ear with its electropole", getName(), target, target));
	}

}
