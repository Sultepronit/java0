package toString;

class Frog {
	public String toString() {
		return "Hello toString()!";
	}
}

class Lizard {
	
}

class Snake {
	int id = 7;
	String name = "snake";
	public String toString() {
		String result = String.format("%4d; %s", id, name);
		return result;
	}
}

public class App {

	public static void main(String[] args) {
		
		Frog frog = new Frog();
		System.out.println(frog.toString());
		
		Lizard lizard = new Lizard();
		System.out.println(lizard.toString());
		
		Snake snake = new Snake();
		System.out.println(snake.toString());
	}

}
