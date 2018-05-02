package my.riddle.stuff.solutions;

public class Riddle5Solution {

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
        	//your code here
        	if(null == helper || helper.getNum()%2 == 0) {
        		helper = new Helper_1_Class();
        	} else {
        		helper = new Helper_2_Class();
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
	
	public static class Helper_1_Class extends Helper_Class {
		
		final String s = "A";
		
		public Helper_1_Class() {
			super();
			if(10 <= num) {
				test = false;
			} else {
				super.print(num, s);
				num++;
			}
		}
	}
	
public static class Helper_2_Class extends Helper_Class {
		
		final String s = "B";
		
		public Helper_2_Class() {
			super();
			if(10 <= num) {
				test = false;
			} else {
				super.print(num, s);
				num++;
			}
		}
	}
	
}

