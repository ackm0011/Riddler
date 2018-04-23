package my.riddle.stuff.solutions;

public class Riddle4Solution {

/*	
 *	Modify main() and use the given loops to draw the shape
 *
 *	Restrictions: The existing if/else structure and 3 uses of System.out
 */		


	public static void main(String[] args) {
        System.out.println("Riddle 4 Solution:");
        Helper_Class helper = new Helper_Class();
        while(helper.isTest()) {
        	//your code here
        	helper = new Helper_Class();
        }
    }
	
	public static class Helper_Class {
		
		boolean test = true;
		//your code here
		static int num = 0;
		
		public Helper_Class() {
			super();
			//your code here
			if(10 <= num) {
				test = false;
			} else {
				print(num);
				num++;
			}
		}

		public void print(int lineNum) {
	      	for(int j = 0; j < 11; j++) {
	          	if(10 == j) {
	          		System.out.println("");
	          	} else if(lineNum == j || lineNum == (9-j)) {
	          		System.out.print("X");
	          	} else {
	          		System.out.print(" ");
	          	}
	      	}
		}
		public boolean isTest() {
			return test;
		}
	}
	
}

