
package BitayBata;
import static BitayBata.Test.name;
import java.util.Scanner;


public class Bitay extends Hang{
    static Scanner scan = new Scanner(System.in);
    
    static void welcome(){
        System.out.println("WELCOME");
        System.out.println("  TO");
        System.out.println("BITAY BATA GAME!\n");
        System.out.println("********************");
        System.out.println("The Game Starts Now!");
        System.out.println("********************\n");
        System.out.println(" ___ ");
        System.out.println("  _|_");
	System.out.println(" (*!*)");
	System.out.println(" __|__ ");
	System.out.println("   | ");
	System.out.println("  / \\\n ");
       

            do {
                      System.out.println("Hints: "+hint[rand]);
                      System.out.println(underscore); 
		      System.out.print("\nGuess any letter in the word: ");                    
		      String playerguess = scan.next().toUpperCase();
		      hang(playerguess);
                      
            }while(count < 5 && underscore.contains("_"));
           
    }
    
    
     public static void hang(String playerguess) {
		String newunderscore = "";
		for (int i = 0; i < name.word.length(); i++) {
			if (name.word.charAt(i) == playerguess.charAt(0)) {
				newunderscore  += playerguess.charAt(0);
			} else if (name.underscore.charAt(i) != '_') {
				newunderscore  += name.word.charAt(i);
			} else {
				newunderscore  += "_";
			}
		}

		if (name.underscore.equals(newunderscore )) {
			name.count++;
			name.hangmanImage();
		} else {
			name.underscore = newunderscore ;
		}
		if (name.underscore.equals(name.word)) {
                        System.out.println("********************");
			System.out.println("CONGRATULATIONS!\n ");
                        System.out.println("      ||      \n"); 
                        System.out.println("    YOU WIN!    "); 
                        System.out.println("********************");
                        System.out.println("The word was:"+" "+ name.word);
                        
		}
	}
    
}
