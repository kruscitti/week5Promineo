package week5Assignment;

public class spacedLogger implements Logger {
// 6.  The SpacedLogger should add spaces between each character of the String argument passed into its methods
	
	@Override
	public void log(String log) {
		// TODO Auto-generated method stub
		String space = "";
		for(int i = 0; i < log.length(); i++) {
		var charArray = log.toCharArray();
		space = space + " " + charArray[i];
		}System.out.println(space);
	}
// 8.  The error method should do the same, but with “ERROR:” preceding the spaced out input (i.e. ERROR: H e l l o)
	
	@Override
	public void error(String error) {
		// TODO Auto-generated method stub
		String space2 = "";
		for(int i = 0; i < error.length(); i++) {
		var char2Array = error.toCharArray();
		space2 = space2 + " " + char2Array[i];
		}System.out.println("ERROR: " + space2);
	}
	

	
		
	}

