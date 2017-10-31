package jc_9_abstract;

public class App {
	public static void main(String[] args) {
		Camera cam1 = new Camera();
		cam1.setID(5);
		
		Car car1 = new Car();
		car1.setID(6);
		
		cam1.run();
		car1.run();
		
	}
	
}
// the biggest difference between child classes extending abstract classes and interfaces is that 
// machine in our case is what the child classes are.. a car IS a machine.. a camera IS a machine
// classes can implement as many interfaces as you like. but you can extend just one class
// interfaces are usually for cases like "showinfo", it can be implemented by different classes.
// you can also define functionality in abstract classes..