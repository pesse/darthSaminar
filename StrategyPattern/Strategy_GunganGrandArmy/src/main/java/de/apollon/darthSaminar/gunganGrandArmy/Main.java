/**
 *
 */
package de.apollon.darthSaminar.gunganGrandArmy;

import java.util.ArrayList;
import java.util.List;

import de.apollon.darthSaminar.gunganGrandArmy.model.CestaWarrior;
import de.apollon.darthSaminar.gunganGrandArmy.model.GunganShieldWarrior;
import de.apollon.darthSaminar.gunganGrandArmy.model.GunganWarrior;
import de.apollon.darthSaminar.gunganGrandArmy.model.KaaduWarrior;

/**
 * @author snitsche
 *
 */
public class Main
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		List<GunganWarrior> army = createArmy();

		String target = "Timo";

		army.stream().forEach(warrior -> warrior.attack(target));

		System.out.println(String.format("%s is dead.", target));
	}

	private static ArrayList<GunganWarrior> createArmy()
	{
		ArrayList<GunganWarrior> army = new ArrayList<GunganWarrior>();

		army.add(new GunganShieldWarrior("Ess Bad"));
		army.add(new KaaduWarrior("Nud Peblub"));
		army.add(new CestaWarrior("Off Sid"));

		return army;
	}

}
