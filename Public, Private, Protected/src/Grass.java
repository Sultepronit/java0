import inside.Plant;

public class Grass extends Plant {
	
	public Grass() {
	name = "tree";
	
	// private!!!
	//type = "big";
	
	// protected -- accessible to subclasses
	size = "big";
	
	//no access specifier -- invisible outside of package
	//height = 10;
	}
}
