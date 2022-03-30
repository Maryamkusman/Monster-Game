///////////////////////////////////////////////////////////////////////////////
// Main Class File:    Assignment4.java
// File:               Tower.java
// Quarter:            CSE 8b Fall 2021
//
// Author:             Maryam Usman musman@ucsd.edu
// Instructor's Name:  Benjamin Ochoa 
/**
 * This class creates the tower and sets the monster and item in each level of the tower.  
 * it also sets a height of the tower. 
 *It also sets the attack with the monster class. and damage taken from the attack 
 * Bugs: no bugs
 *
 * @author Maryam Usman
 */
public class Tower {
//global variables 
	private int height;
	private Monster[] monsterEachLevel;
	private Item[] itemEachLevel;
	/**
	 * this sets height. if height is less than 1 it is set to 1.
	 *
	 * @param (height) passes in an integer of height 
	 * @return no value
	 */
	public Tower(int height) {
		this.height=height;
		if (height<1) {//checking if height is less than 1 
			this.height=1;//then sets it to 1
		}
		monsterEachLevel=new Monster[this.height];//sets a monster array of length height
		itemEachLevel=new Item[this.height];//sets an item array of height 
		return;
	}
	/**
	 * this sets an item and monster at each level of the tower
	 *
	 * @param (level) and integer of level 
	 * @param (monster) called from monster class
	 * @param (item) this is called from item class
	 * @return no value
	 */
	public void setOneLevel(int level, Monster monster, Item item) {
		this.itemEachLevel[level]=item;
		this.monsterEachLevel[level]=monster;
		return;
	}
	/**
	 * retrieves the height
	 *
	 * @return -1
	 */
	public int getHeight() {
		
		return -1;
	}
	/**
	 * retrieves the monster at a level of the tower.
	 *@param an integer called level which was called in a previous method
	 * @return the monster at the level
	 */
	public Monster getMonsterAtLevel(int level) {
		
		return monsterEachLevel[level];
	}
	/**
	 * retrieves the input at a level of the tower.
	 *@param an integer called level which was called in a previous method
	 * @return the input at the level
	 */
	public Item getItemAtLevel(int level) {
		return itemEachLevel[level];
	}
}