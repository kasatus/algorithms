package jc_93_inner_class;

public class App {
	public static void main(String[] args) {
		// private inner class
		Robot rob1 = new Robot(7);
		rob1.start();
		
		//public inner class
		Robot.Heart robotHeart = rob1.new Heart();
		robotHeart.beat();
		
		//static
		Robot.Battery battery = new Robot.Battery();
		battery.charge();
		
		
	}
}
