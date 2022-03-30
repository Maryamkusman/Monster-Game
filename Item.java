///////////////////////////////////////////////////////////////////////////////
// Main Class File:    Assignment4.java
// File:               Item.java
// Quarter:            CSE 8b Fall 2021
//
// Author:             Maryam Usman musman@ucsd.edu
// Instructor's Name:  Benjamin Ochoa 
/**
 * This initiates the item from the array or strings 
 * and the stats of the item from the array 
 *
 * Bugs: no bugs
 *
 * @author Maryam Usman
 */
public class Item {

	private String name;
	private int health;
	private int attack;
	private int defense;
	private int speed;

	private static final String[] itemList = {"Small Knife",
											"Wooden Shield",
											"Haste Booster",
											"Knight Sword",
											"HP Potion",
											"Agility Armor",
											"Platinum Shield",
											"HP Elixir",
											"Thunder Hammer",
											"Treasure"};
											
	private static final int[][] itemStats = {{0, 3, 0, 1},
											{0, 0, 1, 0},
											{0, 0, 0, 4},
											{0, 6, 0, -1},
											{6, 0, 0, 0},
											{0, 0, 1, 2},
											{0, 0, 4, -2},
											{10, 0, 0, 0},
											{0, 12, 0, -1},
											{0, 0, 0, 0}};
	/**
	 * iterates through item list and corresponds to itemStats 
	 *
	 * @param name this passes in a string of item name 
	 * @return (no return value
	 */
	public Item(String name) {
		int x = 0; 
		this.name=name;
		
		for (int i=0; i<itemList.length; i++) {//iterating through item list until name is found 
			if (itemList[i].equals(name)) {
				x = i; 
				break;
			}
			
		}
		//setting item stats value to respective healht, attack, defense, speed 
		health = itemStats[x][0];
		attack = itemStats[x][1];
		defense = itemStats[x][2];
		speed = itemStats[x][3];
		
		
		}
	
	/**
	 * retrieves the name
	 *
	 * @return name
	 */
	public String getName() {
		//System.out.println("Item.java getName not yet implemented.");
		return name;
	}
	/**
	 * retrieves the health
	 *
	 * @return health
	 */
	public int getHealth() {
		//System.out.println("Item.java getHealth not yet implemented.");
		return health;
	}
	/**
	 * retrieves the attack
	 *
	 * @return attack
	 */
	public int getAttack() {
		//System.out.println("Item.java getAttack not yet implemented.");
		return attack;
	}
	/**
	 * retrieves the defense
	 *
	 * @return defense
	 */
	public int getDefense() {
		//System.out.println("Item.java getDefense not yet implemented.");
		return defense;
	}
	/**
	 * retrieves the speed
	 *
	 * @return speed
	 */
	public int getSpeed() {
		//System.out.println("Item.java getSpeed not yet implemented.");
		return speed;
	}
}