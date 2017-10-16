package jc_static;

public class Robot {
	protected static int ID = 0;
	public Robot() {
		ID++;
	}
	public void release() {
		System.out.println("Robot " + ID + " has been released!");
	}
}
