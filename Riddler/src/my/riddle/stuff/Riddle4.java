package my.riddle.stuff;

public class Riddle4 {

/*	
 *	Modify main() and the helper class variables and constructor
 *
 *	Restrictions: No loops of any kind may be added
 */		


	public static void main(String[] args) {
        System.out.println("Riddle 4:");
        Helper_Class helper = new Helper_Class();
        while(helper.isTest()) {
        	//your code here
        }
    }
	
	public static class Helper_Class {
		
		boolean test = true;
		//your code here
		
		public Helper_Class() {
			super();
			//your code here
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

