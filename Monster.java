///////////////////////////////////////////////////////////////////////////////
// Main Class File:    Assignment4.java
// File:               Monster.java
// Quarter:            CSE 8b Fall 2021
//
// Author:             Maryam Usman musman@ucsd.edu
// Instructor's Name:  Benjamin Ochoa 
/**
 * This class has an attack method so the monster can attack the hero changes in health after attack 
 * it determines whether the monster is still alive after being attacked based on the health 
 *
 * Bugs: no bugs
 *
 * @author Maryam Usman
 */
public class Monster {

	private String name;
	private int health;
	private int attack;
	private int defense;
	private int speed;
	/**
	 * This gives the monster its stats 
	 *
	 * @param (name) its a string that gives the hero its name
	 * @param (health, attack, defense, speed) this is an integer that gives the hero that certain value of those parameters 
	 * @return no return value
	 */
	public Monster(String name, int health, int attack, int defense, int speed) {
		this.name=name; 
		this.health=health;
		this.attack=attack;
		this.defense=defense;
		this.speed=speed;
		return;
	}
	/**
	 * This checks if monster is still alive based on health parameter. It health is greater than 0 then hero alive 
	 *
	 * 
	 * @return (rerturns boolean true or false depending on validity of if statement)
	 */
	public boolean isStillAlive() {
		if (health>0) {
			return true;
		}
			else {
				System.out.println(name+" is defeated");
			}
		
		return false;
	}
	/**
	 * This method attacks the hero and calculates the damage then prints stats of hero. 
	 *
	 * @param (hero) referring to hero class. hero class is passed into it 
	 * @return void so not return
	 */
	public void attack(Hero hero) {
		int damage=1;
		if (hero.getDefense()>=this.attack) {
			hero.receiveDamage(1);
		}	
		else {
			damage=this.attack-hero.getDefense();
			hero.receiveDamage(damage);
		}
		
			System.out.println(name+" attacks "+hero.getName()+","+" causing "+damage+" damage");
		hero.printStats();
		}
	/**
	 * this determines the damage done to monster 
	 *
	 * @param (int damage) an int value of damage is passed in from attack method
	 * @return void
	 */
	public void receiveDamage(int damage) {
		this.health=this.health-damage;//monster health -damage 
		return;
	}
	/**
	 * retrieves the name
	 *
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 * retrieves the health
	 *
	 * @return health
	 */	
	public int getHealth() {
		return health;
	}
	/**
	 * retrieves the attack
	 *
	 * @return attack
	 */
	public int getAttack() {
		return attack;
	}
	/**
	 * retrieves the defense
	 *
	 * @return defense
	 */	
	public int getDefense() {
		return defense;
	}
	/**
	 * retrieves the speed
	 *
	 * @return speed
	 */
	public int getSpeed() {
		return speed;
	}
	/**
	 * prints the stats
	 *
	 * @return nothing
	 */
	public void printStats() {
		String str = String.format("\t%s - health: %d, attack: %d, defense: %d, speed: %d", this.name, this.health, this.attack, this.defense, this.speed);
		System.out.println(str);
	}
}