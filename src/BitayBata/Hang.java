/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BitayBata;

/**
 *
 * @author Admin
 */
public class Hang extends Names{
    static int count=0;
	public static void hangmanImage() {
                   
		if (count == 1) {
                        System.out.println("********************");
                        System.out.println("Wrong guess, try again");
                        System.out.println("--------------------");
			System.out.println(" ______");
			System.out.println("     _|_");
			System.out.println("    (*!*)");
			System.out.println("    __|__ ");
			System.out.println("      |  ");
                        System.out.println("********************");


		}
		if (count == 2) {
                        System.out.println("********************");
			System.out.println("Wrong guess, try again");
                        System.out.println("--------------------");
			System.out.println(" _______");
			System.out.println("      _|_");
			System.out.println("     (*!*)");
			System.out.println("     __|__ ");
                        System.out.println("********************");
		}
		if (count == 3) {
                        System.out.println("********************");
			System.out.println("Wrong guess, try again");
                        System.out.println("--------------------");
			System.out.println(" _______");
			System.out.println("      _|_ ");
			System.out.println("     (*!*) ");
			System.out.println("       | ");
			System.out.println("********************");

		}
		if (count == 4) {
                        System.out.println("********************");
			System.out.println("Wrong guess, try again");
                        System.out.println("--------------------");
			System.out.println("  _______");
			System.out.println("       _|_");
                        System.out.println("********************");
			
			
		}
                
		if (count == 5) {
			System.out.println("********************");
                        System.out.println("  GAME OVER!");	
                        System.out.println("      ||   ");
			System.out.println("YOU LOSE THE GAME! ");
                        System.out.println("********************");
                        System.out.println("The correct word was:" + " " +word);
		}
	}
}
