package jc_9_abstract;

public class Camera extends Machine{
	
	public void start() {
		System.out.println("Camera started!");
	}

	@Override
	public void doStuff() {
		// TODO Auto-generated method stub
		System.out.println("Camera did some stuff");
	}

	@Override
	public void shutdown() {
		// TODO Auto-generated method stub
		System.out.println("Caemra shutting down");
	}

}
