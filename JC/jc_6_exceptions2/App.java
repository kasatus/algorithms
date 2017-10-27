package jc_6_exceptions2;

import java.io.IOException;

public class App {
	public static void main(String[] args)throws  IOException {
		Machine mac = new Machine();

		try {
			mac.run();
		} catch (MyTestException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Running successfully");
		try {
			mac.run();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			mac.input();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		throw new IOException("Test error!");
		
	}
}
