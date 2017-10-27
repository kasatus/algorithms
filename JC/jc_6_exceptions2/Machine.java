package jc_6_exceptions2;

import java.io.IOException;

public class Machine {
	public void run() throws MyTestException{
		
		// return value from some complex process
		// 0 - failure, 1 - success
		int code = 0;
		
		if (code == 0) {
			// Somrething's wrong!
			throw new MyTestException("return code = " + code); 
		}

		
		System.out.println("Running!");
	}
	
	public void input() throws Exception {
		try {
			run();
			
			/// catch the child exceptions first before catching the parent ones!!!
		} catch (MyTestException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			System.out.println("pizda blea");
		}
	}
}
