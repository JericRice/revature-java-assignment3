
/*
 * Write a class named Assignment6 that finds the index of the 2nd space character in "Hello My Name is Java"; 
 * 
 * Print this number. (Hint: you may have to combine two String methods)
 */

public class Assignment6 {
	
	public static void main(String[] args) {
		
		String str = new String("Hello My Name is Java");
		
		System.out.println("The second space is at " + str.substring(0, 9).lastIndexOf(" "));
		
		int index = str.indexOf(" ", str.indexOf(" ") + 1);
		
		System.out.println("The second space is at: " + index);
	}

}



/* 
 * Ideal solution below 
 * 
 * public class Assignment6 {

	public static void main(String[] args) {
		String str = "Hello My Name is Java";
		
		int index = str.indexOf(" ", str.indexOf(" ") + 1);
		
		System.out.println("The second space is at: " + index);
	}
}
*/
 
