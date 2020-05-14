/*
 * Write a class named Assignment4 that declares a string "abcdefghijklmnopqrstuvwxyz". 
 * Use the indexOf() method to print the index of "s" and "f".
 */


public class Assignment4 {
	
	public static void main(String[] args) {
		
		String alpha = new String("abcdefghijklmnopqrstuvwxyz");
		
		System.out.println("The index of the letter s in the alphabet is " + alpha.indexOf("s"));
		System.out.println("The index of the letter f in the alphabet is " + alpha.indexOf("f"));

	}

}
