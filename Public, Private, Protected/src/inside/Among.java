package inside;

public class Among {
	public void function() {
		
	Plant plant = new Plant();
	
	System.out.println(plant.name);
	
	System.out.println(plant.ID);
	System.out.println(Plant.ID);// better, because this is static variable
	
	// type is private!!!
	//System.out.println(plant.type);
	
	System.out.println(plant.size);
	
	System.out.println(plant.height);
	
	}
}
