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
 *	Modify inside the while loop to create the new output
 *
 *	Restrictions: The existing if/else structure, no additional uses of system.out, and no calling print() from main, no additional loops
 */		


	public static void main(String[] args) {
        System.out.println("Riddle 5 Solution:");
        Helper_Class helper = null;
        while(null == helper || helper.isTest()) {
        	if(null == helper || helper.getNum()%2 == 0) {
        		helper = new Helper_1_Class();
        	} else {
        		helper = new Helper_2_Class();
        	}
        		
        	
        }
    }
	
	public abstract static class Helper_Class {
		
		private boolean test = true;
		private static int num = 0;
		private String s = "X";

		private void print() {
	      	for(int j = 0; j < 11; j++) {
	          	if(10 == j) {
	          		System.out.println("");
	          	} else if(num == j || num == (9-j)) {
	          		System.out.print(s);
	          	} else {
	          		System.out.print(" ");
	          	}
	      	}
		}
		
		public boolean isTest() {
			return test;
		}
		public void setTest(boolean test) {
			this.test = test;
		}
		public int getNum() {
			return num;
		}
		public void setNum(int num) {
			this.num = num;
		}
		public String getS() {
			return s;
		}
		public void setS(String s) {
			this.s = s;
		}
	}
	
	public static class Helper_1_Class extends Helper_Class {

		public Helper_1_Class() {
			super();
			setS("A");
			if(10 <= getNum()) {
				setTest(false);
			} else {
				super.print();
				setNum(getNum() + 1);
			}
		}
	}
	
	public static class Helper_2_Class extends Helper_Class {

		public Helper_2_Class() {
			super();
			setS("B");
			if(10 <= getNum()) {
				setTest(false);
			} else {
				super.print();
				setNum(getNum() + 1);
			}
		}
	}
	
}

