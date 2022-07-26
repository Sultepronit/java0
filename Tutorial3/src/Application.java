import java.util.Scanner;

public class Application {

	static void DoWhile() {
		Scanner scanner = new Scanner(System.in);

		int value = 0;

		do {
			System.out.println("Enter a number: ");

			// int value = scanner.nextInt();
			value = scanner.nextInt();
		} while (value != 5);

		System.out.println("Got 5!");
	}

	static void DoSwitch() {

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter a command: ");
		String text = input.nextLine();

		switch (text) {
		case "start":
			System.out.println("Machine started!");
			break;

		case "stop":
			System.out.println("Machine stopped!");
			break;

		default:
			System.out.println("Command not recognized!");
		}
	}
	
	static void DoArrays() {
		int[][] multInt = {
			{1, 2, 3},
			{4, 5, 6},
			{10, 20, 30, 40}
		};
		System.out.println(multInt[2][2]);
		System.out.println(multInt[2][3]);
		//System.out.println(multInt[0][3]);
		
		int[][] mult2 = new int[3][];
		mult2[0] = new int[3];
		mult2[1] = new int[2];
		mult2[2] = new int[1];
		//mult2[2] = {5,3}; ////error!
		for (int i = 0; i < mult2.length; i++) {
			for (int elem : mult2[i]) {
				System.out.print(elem + "\t");
			}
			System.out.println();
		}
	}
	
	void DoWithout() {
		System.out.println("In Java methods not always must be declared with public/static");
		System.out.println("But in this case method will be public by deault!");
	}

	public static void main(String[] args) {

		//DoWhile();
		//DoSwitch();
		DoArrays();
		//DoWithout(); // error, because this is public method by default
		Application app = new Application();
		app.DoWithout();
		
		
		
	}
}
