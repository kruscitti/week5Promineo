package week5Assignment;

public class asteriskLogger implements Logger {

/*  4.	The log method on the AsteriskLogger should print out the String it receives 
 * between 3 asterisks on either side of the String (e.g. if the String passed in is “Hello”, 
 * then it should print ***Hello*** to the console.	
 */
	
	@Override
	public void log(String log) {
		// TODO Auto-generated method stub
		
		System.out.println("***" + log + "***");
		
		
		
	}
/*  5.	The error method on the AsteriskLogger should print the String it receives 
 * inside a box of asterisks, with the String preceded by the word “ERROR:”. 
 */
	@Override
	public void error(String error) {
		// TODO Auto-generated method stub
	
		//Should the asterisks in line 27 and 29 coincide with how long the string in line 28 is? (to form the box of asterisks)
		System.out.println("*****************");
		System.out.println("***Error: " + error + "***");
		System.out.println("*****************");
	}

}
