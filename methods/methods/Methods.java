package methods;

interface Sayable {
	public void say();
}

public class Methods {
	public Methods(){};
	//1. non-static
	public void sayNonStatic() {
		System.out.println("saying non-static!");
	}
	
	//2. static
	public static void sayStatic() {
		System.out.println("saying static!");
	}
	
	//3. constructor
	public Methods(String msg) {
		System.out.println("new method! message: " + msg);
	}
	
	@FunctionalInterface
	interface Messageable {
		public void message(String msg);
	}
	
	public static void main(String[] args) {
		//1. non-static
		Methods methodref = new Methods();
		Sayable say1 = methodref::sayNonStatic;
		say1.say();
		
		Sayable say2 = new Methods()::sayNonStatic;
		
		//2. ststic:
		
		Sayable say3 = Methods::sayStatic;
		say3.say();
		
		//3. constructor
		Messageable msg = Methods::new;
		msg.message("constructod method! yoyo");
		
		
		
	}
}
