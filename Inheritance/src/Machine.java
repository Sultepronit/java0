
public class Machine {
	public String firstName = "Machine";
	protected String secondName = "Mac";
	private String lastName = "Runner";
	
	public void start() {
		System.out.println("Machine started.");
	}
	
	public void showInfo() {
		StringBuilder builder = new StringBuilder(firstName);
		builder.append(", ").append(secondName)
		.append(", ").append(lastName);
		System.out.println(builder.toString());
	}
	
	public void stop() {
		System.out.println("Stopped.");
	}
}
