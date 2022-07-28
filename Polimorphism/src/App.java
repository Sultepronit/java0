
public class App {

	public static void main(String[] args) {
	
		Plant plant = new Plant();
		Tree tree = new Tree();
		Plant plant2 = new Tree();
		
		plant.grow();
		plant2.grow();
		
		//plant2.shedLeaves();
		tree.shedLeaves();

		
		
		

	}

}
