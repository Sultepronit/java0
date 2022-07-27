
public class App {
	
	public static void main(String[] args) {
		
	Machine mac = new Machine();
	mac.start();
	
	Person person = new Person("John");
	person.greet();
	
	Info info1 = new Machine();
	info1.showInfo();
	
	Info info2 = person;
	info2.showInfo();
	
	outputInfo(mac);
	outputInfo(person);
	
	}
	
	private static void outputInfo(Info info) {
		info.showInfo();
	}
}
