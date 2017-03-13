/**
 *
 */
package de.apollon.darthSaminar.gunganGrandArmy;

import java.util.ArrayList;
import java.util.List;

import de.apollon.darthSaminar.gunganGrandArmy.attack.AtlatlAttackStrategy;
import de.apollon.darthSaminar.gunganGrandArmy.attack.CestaAttackStrategy;
import de.apollon.darthSaminar.gunganGrandArmy.attack.ElectropoleAttackStrategy;
import de.apollon.darthSaminar.gunganGrandArmy.attack.FootGunAttackStrategy;
import de.apollon.darthSaminar.gunganGrandArmy.model.GunganWarrior;

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

		GunganWarrior warrior = army.get((int) (Math.floor(Math.random() * army.size())));

		System.out
				.println(String.format("%s attacks %s, pushing it around. %s falls and a laser gun entangles its foot.",
						target, warrior.getName(), warrior.getName()));
		warrior.setAttackStrategy(new FootGunAttackStrategy());

		army.stream().forEach(w -> w.attack(target));

		System.out.println(String.format("%s is dead.", target));
	}

	private static ArrayList<GunganWarrior> createArmy()
	{
		ArrayList<GunganWarrior> army = new ArrayList<GunganWarrior>();

		army.add(new GunganWarrior("Ess Bad", new AtlatlAttackStrategy()));
		army.add(new GunganWarrior("Nud Peblub", new CestaAttackStrategy()));
		army.add(new GunganWarrior("Off Sid", new ElectropoleAttackStrategy()));

		return army;
	}

}
