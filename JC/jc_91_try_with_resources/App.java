package jc_91_try_with_resources;

class Temp implements AutoCloseable {

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("closing!");
	}
	
}

public class App {
	public static void main(String[] args) {
//		Temp temp = new Temp();
//		try {
//		temp.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		// java7:
		
		try(Temp temp = new Temp()) {
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
