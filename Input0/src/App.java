import java.util.Scanner;
//Ctrl+Shift+O

public class App {
	public static void main(String[] args) {
		
		//Create scanner object
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a line of text: ");
		
		//Wait for the user to enter a line of text
		String line = input.nextLine();
		
		System.out.println("You entered: " + line);
		
		/*System.out.println("Enter an integer: ");
		int value = input.nextInt();
		//double value = input.nextDouble();
		System.out.println("You entered: " + value);*/
	}
}
