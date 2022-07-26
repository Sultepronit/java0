class Frog {
	private String name; //encapsulation
	int age;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}

public class App {
	
	public static void main(String[] args) {
		Frog frog0 = new Frog();
		frog0.setName("Jerry");
		//frog0.setAge(2);
		frog0.age = 2;
		String frName = frog0.getName();
		System.out.println(frName + " / " + frog0.age);
	}

}
