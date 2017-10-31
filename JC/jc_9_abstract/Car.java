package jc_9_abstract;

public class Car extends Machine{

	@Override
	public void start() {
		System.out.println("Starting car!");
	}

	@Override
	public void doStuff() {
		// TODO Auto-generated method stub
		System.out.println("car does stuff");
	}

	@Override
	public void shutdown() {
		// TODO Auto-generated method stub
		System.out.println("car shuts down");
	}

}
