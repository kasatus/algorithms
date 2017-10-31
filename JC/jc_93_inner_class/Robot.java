package jc_93_inner_class;

import jc_93_inner_class.Robot.Battery;

public class Robot {
	private int id;
	
	private class Brain {
		public void think() {
			System.out.println("Robot " + id + " is thinking");
		}
	}
	
	public class Heart {
		public void beat() {
			System.out.println("Robot " + id + " has a beating heart!");
		}
	}
	
	static class Battery {
		public void charge() {
			System.out.println("Robot is charging..");
		}
	}
	
	public Robot(int id) {
		this.id = id;
	}
	
	public void start() {
		System.out.println("Stariting robot " + id);
		Brain brain = new Brain();
		brain.think();
		
		String name = "RObot";
		
		class Temp {
			public void doSomething() {
				System.out.println("ID is " + id + " my name is " + name);
			}
		}
		
		Temp temp = new Temp();
		temp.doSomething();
	}
}
