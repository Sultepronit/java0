// Everything should be as private as possible

class Plant {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	private int privateMethod() {
		return 9;
	}
	
	public void publicMethod() {
		System.out.println("Print " + privateMethod());
	}
	
}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
