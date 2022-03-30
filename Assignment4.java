///////////////////////////////////////////////////////////////////////////////
// Title:              Assignment4 Hero vs Monsters
// Files:              Assignment4.java, Hero.java, Item.java, Monster.java, Tower.java
// Quarter:            CSE8B Fall 2021
//
// Author:             Maryam Usman
// Email:              musman@ucsd.edu
// Instructor's Name:  Benjamin Ochoa
/**
 * This is the main class where methods from previous classes are called. 
 * This executes the full succinct game. 
 *
 * Bugs: there are no bugs
 *
 * @author Maryam Usman
 */
public class Assignment4 {
	/**
	 * This sets up the tower and the height which is passed into it. It also has Monster methods with parameters.
	 *
	 * @param (height) this passes the height to the tower. 
	 * @param name, HP, Attack, Defense, Speed
	 * @return it returns the tower.
	 */
	public static Tower setUpTower() {
		// Initialize the tower with 5 levels
		Tower tower = new Tower(5);
		// Initialize the different monsters
		// Parameters: Name, HP, Attack, Defense, Speed
		Monster slime = new Monster("slime", 2, 2, 0, 2);
		Monster mummy = new Monster("mummy", 5, 3, 1, 1);
		Monster ghost = new Monster("ghost", 9, 5, 2, 7);
		Monster yeti = new Monster("yeti", 15, 5, 4, 2);
		Monster wyvern = new Monster("wyvern", 20, 7, 6, 8);
		tower.setOneLevel(0, slime, new Item("Knight Sword"));
		tower.setOneLevel(1, mummy, new Item("HP Elixir"));
		tower.setOneLevel(2, ghost, new Item("Platinum Shield"));
		tower.setOneLevel(3, yeti, new Item("Thunder Hammer"));
		tower.setOneLevel(4, wyvern, new Item("Treasure"));
		return tower;
	}

	/**
	 * this takes in all methods and puts it into a game with while and for loops to execute each level and fight.
	 *
	 * @param hero, this passes in hero from the hero class and used to call the hero and all his stats and fight the monster 
	 * @param tower, this calls tower class and allows for monster to be called from tower.method.
	 * @return since its void it doesnt return anything
	 */
	public static void playGame(Hero hero, Tower tower) {
		
		for (int i=0; i<5; i++) {//initiate counter
			Monster monsters=tower.getMonsterAtLevel(i);//create monster object
		System.out.println("\n"+"Level "+i+": "+hero.getName()+" encounters " + tower.getMonsterAtLevel(i).getName());//print statement
		monsters.printStats();//stats of monster
		while (true) {//while loop
			if (hero.isFasterThan(monsters)) {//if statements for speed 
				hero.attack(monsters);//hero attack 
				if (!hero.isStillAlive()) {//hero alive?
					System.out.println("Game Over");
					return;
			}
				if (!monsters.isStillAlive()) {//monster alive?
					hero.equipItem(tower.getItemAtLevel(i));//hero equips items from level
					break;
					
				}
				monsters.attack(hero); //monster attacks 
				
			}
				
			else {
				if (!hero.isFasterThan(monsters)) {//speed 
					monsters.attack(hero); // monster is faster so attacks
					if (!hero.isStillAlive()) {//hero alive?
						System.out.println("Game Over");
						return;
				}
					hero.attack(monsters);//hero attacks monster

					if (!monsters.isStillAlive()) {//monster alive?
						hero.equipItem(tower.getItemAtLevel(i));//hero equips item
						break;
						
					}
					
				}
				
					
				}
				
			}
			// while the hero and monster are still fighting...
			//	if hero is faster than the monster...
			//		hero attacks monster
			//		is monster dead? if yes, then hero equips item, and then break out of infinite while-loop. if no, then keep fighting
			//		monster attack hero
			//		is hero dead? if yes, then print GAME OVER and return;.
			//  if monster is faster...
			//		monster attack hero
			//		is hero dead? if yes, then print GAME OVER and return;.
			//		hero attacks monster
			//		is monster dead? if yes, then hero equips item, and then break out of infinite while-loop. if no, then keep fighting
	}	
		System.out.println("The Hero Wins!");	

	}
	//unit tests 
	public static boolean unitTestOne() { //tests item
		Item sword=new Item ("Knight Sword");//create object
		if (sword.getAttack()!=6) {
			System.out.println("getAttack failed");
			return false;

		}
		if (sword.getHealth()!=0) {//getter methods
			System.out.println("getHealth failed");
			return false;

		}
		if (sword.getDefense()!=0) {
			System.out.println("getDefense failed");
			return false;

		}
		if (sword.getSpeed()!=-1) {
			System.out.println("getSpeed failed");
			return false;

		}
		if (sword.getName()!="Knight Sword") {
			System.out.println("incorrect getName");
			return false;
		}
		return true;
	}
	public static boolean unitTestTwo() { //tests monster
		String name= new String("name");//string object
		Monster monster=new Monster(name, 1, 0, 1, 0);//monster object 
		if (monster.getAttack()!=0) {//checkign getter methods 
			System.out.println("incorrect attack for monster");
			return false;
		}
		if (monster.getHealth()!=1) {
			System.out.println("incorrect health for monster");
			return false;
		}
		if (monster.getDefense()!=1) {
			System.out.println("incorrect defense for monster");
			return false;
		}
		if (monster.getSpeed()!=0) {
			System.out.println("incorrect speed for monster");
			return false;
		}
		if (monster.getName()!=name) {
			System.out.println("incorrect name for monster");
			return false;
		}
		return true;
	}
	public static boolean unitTestThree() { //tests hero
		Item item=new Item("Knight Sword");//item object 
		String name=new String("name");//string object
		Hero hero=new Hero(name, 0,0,0,0,item);//hero object
		if (hero.getName()!=name) {//checking getter methods
			System.out.println("incorrect name for hero");
			return false;
		}
		if (hero.getAttack()!=0) {
			System.out.println("incoorect attack for hero");
		}
		if (hero.getDefense()!=0) {
			System.out.println("incorrect defense for hero");
		}
		if (hero.isStillAlive()!=false) {
			System.out.println("incorrect isStillAlive for hero");
			return false;
		}
		if (hero.getHealth()!=0) {
			System.out.println("incorrect health for hero");
			return false;
		}
		return true;
	}
	public static boolean unitTestFour(){ //tests tower
		Tower tower=new Tower(3);//tower object
		if (tower.getHeight()!=-1) {
			System.out.println("incorrect tower height");
			return false;
		}
			return true;
		
	}



	public static void main(String[] args) {
		
//tests if all unit tests pass 		
if(unitTestOne() && unitTestTwo() && unitTestThree() && unitTestFour()) {
			System.out.println("All unit tests passed.\n");
		} else {
			System.out.println("Failed test.\n");
			return;
		}
		
		Tower tower = setUpTower(); //tower object 
		Hero hero = new Hero("CSE_8B_Hero", 10, 3, 3, 4, new Item("Small Knife"));//hero object created
		playGame(hero, tower);//play game object with hero and tower passed in 
	}
}