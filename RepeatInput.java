/* This Program will repeat whatever
 * the user types by displaying them
 * on the output screen. */

//Import the Scanner class of Java.
import java.util.Scanner;

//HelloWorld class.
public class RepeatInput {
	
	//Main method
	public static void main(String[] args) {
		
		//Create a Scanner object.
		Scanner input = new Scanner(System.in);
		
		//Ask for the users to type whatever they want to display on the screen.
		System.out.print("Please type whatever you want us to display on the Screen: ");
		
		//Store the user input in the String "s".
		String s = input.nextLine();
		
		//Close the input.
		input.close();
		
		//Display the String "s" as the output.
		System.out.println(s);
		
	}	//Main method.

}	//HelloWorld.
