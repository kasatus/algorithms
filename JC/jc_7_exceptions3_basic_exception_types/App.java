package jc_7_exceptions3_basic_exception_types;

public class App {

	public static void main(String[] args) {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int a = 7;
		// Runtime exception!!!!
		//a = a / 0;
		
		//nullpointer exception
		
//		String text = null;
//		System.out.println(text.length());
		
		String[] arr = {"one", "two"};
		try {
			System.out.println(arr[2]);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
