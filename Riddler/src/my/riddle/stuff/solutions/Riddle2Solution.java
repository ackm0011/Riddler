package my.riddle.stuff.solutions;

public class Riddle2Solution {

	/*	
	 *	Modify main() and use the given loop and a switch  to draw the shape
	 */	
		private static final String s0 = "X        X";
		private static final String s1 = " X      X "; 
		private static final String s2 = "  X    X  "; 
		private static final String s3 = "   X  X   "; 
		private static final String s4 = "    XX    "; 
		
		public static void main(String[] args) {
	        System.out.println("Riddle 2 Solution:");
	        for(int i = 0; i < 10; i++) {
	        	switch(i) {
	        	case 0:
	        	case 9:
	        		System.out.println(s0);
	        		break;
	        	case 1:
	        	case 8:
	        		System.out.println(s1);
	        		break;
	        	case 2:
	        	case 7:
	        		System.out.println(s2);
	        		break;
	        	case 3:
	        	case 6:
	        		System.out.println(s3);
	        		break;
	        	case 4:
	        	case 5:
	        		System.out.println(s4);
	        		break;
	        	default:
	        		break;
	        	}
	        }	
	    }
	}