package jc_8_abstract_cl;

public class App {
	public static void main(String args[]) {
		Camera cam1 = new Camera();
		System.out.println(cam1.getID());
		cam1.setID(10);
		System.out.println(cam1.getID());
		Car car1 = new Car();
		car1.setID(10);
		System.out.println(car1.getID());
		
		Car car2 = new Car();
		System.out.println(car2.getID());
		
	}
}
