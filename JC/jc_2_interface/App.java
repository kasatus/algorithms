package jc_2_interface;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Machine mac = new Machine();
		mac.showInfo();
		
		Info info1 = new Machine();
		info1.showInfo();
		
		Info info2 = mac;
		info2.showInfo();
		
		outputInfo(mac);
		outputInfo(info1);
	}
	
	private static void outputInfo(Info info) {
		info.showInfo();
	}

}
