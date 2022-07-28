package inside;

public class Plant {
	// Bad practice
	public String name;
	
	// Acceptable practice -- final
	public final static int ID = 2;
	
	private String type;
	
	protected String size;
	
	int height;
	
	public Plant() {
		name = "Freddy";
		type = "plant";
		size = "small";
		height = 8;
	}
}
