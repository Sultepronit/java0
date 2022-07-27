
public class App {

	public static void main(String[] args) {
		
		Machine mac = new Machine();
		mac.showInfo();
		
		Car car = new Car();
		car.start();
		car.showInfo();
		car.showInfoCar();
		car.stop();

	}

}
