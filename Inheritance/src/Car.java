
public class Car extends Machine {
	
	/*public String firstName = "Car";
	protected String secondName = "Auto";
	private String lastName = "Sonic";*/
	
	public void showInfoCar() {
		StringBuilder builder = new StringBuilder(firstName);
		builder.append(", ").append(secondName);
		//.append(", ").append(lastName); //lastName is private it parent
		System.out.println(builder.toString());
	}

	@Override
	public void start() {
		System.out.println("Car started");
	}
	
	

}
