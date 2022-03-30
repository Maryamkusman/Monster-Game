///////////////////////////////////////////////////////////////////////////////
// Main Class File:    Assignment4.java
// File:               Hero.java
// Quarter:            CSE 8b Fall 2021
//
// Author:             Maryam Usman musman@ucsd.edu
// Instructor's Name:  Benjamin Ochoa 
/**
 * This class equips the hero with name attack, defense, speed, and Item. 
 * It also has method to determine if the hero is alive that is based on the health variable.
 *It also sets the attack with the monster class. and damage taken from the attack 
 * Bugs: no bugs
 *
 * @author Maryam Usman
 */
public class Hero {

	private String name;
	private int health;
	private int attack;
	private int defense;
	private int speed;
	/**
	 * This gives the hero its stats and equips it with the item
	 *
	 * @param (name) its a string that gives the hero its name
	 * @param (health, attack, defense, speed) this is an integer that gives the hero that certain value of those parameters 
	 * @param (initialItem) this equips the hero with the item from the class Item 
	 * @return no return value
	 */
	public Hero(String name, int health, int attack, int defense, int speed, Item initialItem) {
		this.name=name;
		this.health=health;
		this.attack=attack;
		this.defense=defense;
		this.speed=speed;
		equipItem(initialItem);
	}
	/**
	 * This checks if hero is still alive based on health parameter. It health is greater than 0 then hero alive 
	 *
	 * 
	 * @return (rerturns boolean true or false depending on validity of if statement)
	 */
	public boolean isStillAlive() {
		if (health>0) { //if health greater than 0
			return true;
		}
			else {
				System.out.println(name+" is defeated"); //print statement for defeated hero 
			}
		
		return false;
	}
	/**
	 * This method attacks the monster and calculates the damage then prints stats of monster. 
	 *
	 * @param (monster) referring to monster class. monster class is passed into it 
	 * @return void so not return
	 */
	public void attack(Monster monster) {
		int damage=1; //setting damage variable
		if (monster.getDefense()>=this.attack) {//checking if monsters defense is greater than equal to heros attack
			monster.receiveDamage(1);//if so monster recieves one damage 
			
		}
		else {
			damage = this.attack-monster.getDefense();//otherwise heros damage is his attack minus monster defense 
			monster.receiveDamage(damage);
		}
		System.out.println(name+" attacks "+monster.getName()+
				","+" causing "+damage+" damage");//print statment 
		monster.printStats();//monsters stats 

		
	}
	/**
	 * this allows for the hero to equip item as called above. 
	 *
	 * @param (item ) this calls the item method as that iterated through array to get these stats.
	 * @param (parameter name) (Do the same for each additional parameter)
	 * @return (description of the return value)
	 */
	public void equipItem(Item item) {
		this.health += item.getHealth();//adds heros health to item health
		this.attack+=item.getAttack();
		this.defense+=item.getDefense();
		this.speed+=item.getSpeed();
		System.out.println(name+" received "+item.getName());
	}
	/**
	 * this chekcs if the hero is faster than the monster.
	 *
	 * @param (monster) this calls the monster class method so that the comparison can be made. 
	 * 
	 * @return a boolean true or false depeding on validity of if statement
	 */
	public boolean isFasterThan(Monster monster) {
		if (this.getSpeed()>monster.getSpeed()) {//is hero speed is greater than monster speed 
			return true;
		}
		return false;
	}

	/**
	 * this determines the damage done to hero 
	 *
	 * @param (int damage) an int value of damage is passed in from attack method
	 * @return void
	 */
	public void receiveDamage(int damage) {
		this.health=this.health-damage;

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
	 * prints the stats of hero
	 *
	 * @return nothing
	 */
	public void printStats() {
		String str = String.format("\t%s - health: %d, attack: %d, defense: %d, speed: %d", this.name, this.health, this.attack, this.defense, this.speed);
		System.out.println(str);
	}
}