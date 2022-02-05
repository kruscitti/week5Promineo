package week5Assignment;



	public class tester {

		public static boolean checkIfPalindrome(String word) {
			String blank = "";
		char[] charArray = word.toCharArray();
		if((blank + charArray) == (charArray + blank)) {
			return true;
			
		}else {
			return false;
		}
		}


			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(checkIfPalindrome("mom"));
	}

}
