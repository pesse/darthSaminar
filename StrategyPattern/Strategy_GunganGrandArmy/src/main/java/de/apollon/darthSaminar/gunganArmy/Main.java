/**
 *
 */
package de.apollon.darthSaminar.gunganArmy;

import java.util.ArrayList;
import java.util.List;

import de.apollon.darthSaminar.gunganArmy.attack.AtlatlAttackStrategy;
import de.apollon.darthSaminar.gunganArmy.attack.ElectropoleAttackStrategy;
import de.apollon.darthSaminar.gunganArmy.attack.FootGunStrategy;
import de.apollon.darthSaminar.gunganArmy.model.GunganWarrior;

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
		String target = "Padawan Timo";

		List<GunganWarrior> army = getArmy();

		army.stream().forEach(w -> w.attack(target));

		GunganWarrior warrior = army.get((int) (Math.floor(Math.random() * army.size())));

		System.out.println(String.format(
				"%s approaches %s and slams it into the ground. %s's foot is entangled by a lasergun now.", target,
				warrior.getName(), warrior.getName()));

		warrior.setAttackStrategy(new FootGunStrategy());

		army.stream().forEach(w -> w.attack(target));

		System.out.println(target + " is dead.");
	}

	private static List<GunganWarrior> getArmy()
	{
		ArrayList<GunganWarrior> army = new ArrayList<GunganWarrior>();

		army.add(new GunganWarrior("Es Sle", new ElectropoleAttackStrategy()));
		army.add(new GunganWarrior("Bob Fur", new AtlatlAttackStrategy()));
		army.add(new GunganWarrior("Fruegg-Fruegg Zo", new ElectropoleAttackStrategy()));

		return army;
	}
}
