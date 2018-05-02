package my.riddle.stuff;

public class Riddle5 {

/*	
 * 
 * A        A
 *  B      B 
 *   A    A  
 *    B  B   
 *     AA    
 *     BB    
 *    A  A   
 *   B    B  
 *  A      A 
 * B        B
 * 
 * 
 * 
 * 
 * 
 *	Modify inside the while loop to create the new outpu
 *
 *	Restrictions: The existing if/else structure, no additional uses of system.out, and no calling print() from main
 */		


	public static void main(String[] args) {
        System.out.println("Riddle 5 Solution:");
        Helper_Class helper = null;
        while(null == helper || helper.isTest()) {
        	if(//your code here) {
        		//your code here
        	} else {
        		//your code here
        	}
        }
    }
	
	public abstract static class Helper_Class {
		
		boolean test = true;
		static int num = 0;

		private void print(int lineNum, String s) {
	      	for(int j = 0; j < 11; j++) {
	          	if(10 == j) {
	          		System.out.println("");
	          	} else if(lineNum == j || lineNum == (9-j)) {
	          		System.out.print(s);
	          	} else {
	          		System.out.print(" ");
	          	}
	      	}
		}
		
		public boolean isTest() {
			return test;
		}
		
		public int getNum() {
			return num;
		}
	}
	

	

	
}

