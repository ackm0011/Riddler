package my.riddle.stuff.solutions;

public class Riddle3Solution {

/*	
 *	Modify main() and use the given loops to draw the shape
 *
 *	Restrictions: The existing if/else structure and 3 uses of System.out
 */		


	public static void main(String[] args) {
        System.out.println("Riddle 3 Solution:");
        for(int i = 0; i < 10; i++) {
        	for(int j = 0; j < 11; j++) {
            	if(10 == j) {
            		System.out.println("");
            	} else if(i == j || i == (9-j)) {
            		System.out.print("X");
            	} else {
            		System.out.print(" ");
            	}
            }
        }	
    }
}
