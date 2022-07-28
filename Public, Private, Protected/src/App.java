import inside.Plant;
/*
 * public -- from anywhere
 * protected -- inside the package & in subclasses outside
 * no modifier -- inside the package only
 * private -- only within the class.
 */
public class App {

	public static void main(String[] args) {
		Plant plant = new Plant();
		
		System.out.println(plant.name);
		
		System.out.println(plant.ID);
		System.out.println(Plant.ID);// better, because this is static variable
		
		// type is private!!!
		//System.out.println(plant.type);
		//type is protected -- invisible outside of package
		//System.out.println(plant.size);
		
		//no access specifier -- invisible outside of package
		//System.out.println(plant.height);

	}

}
