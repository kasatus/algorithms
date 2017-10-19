package jc_3_anonymous_class;

public class App {
	public static void main(String[] args) {
		Machine mac = new Machine();
		mac.start();
		mac.stop();
		/*
		 * Anonymous class = some child class of Machine!
		 */
		Machine mac2 = new Machine() {
			@Override
			public void start() {
				System.out.println("Ovverriden start!");
			}
		};
		mac2.start();
		
		Repair rep = new Repair() {
			@Override
			public void repair() {
				System.out.println("repairing!");
			}
		};
		rep.repair();
	}
	
}
