package jc_4_exception;

public class App {
	public static void main() {
		Machine mac = new Machine();
		Options opt_mac = mac;
		opt_mac.showInfo();
	}
}
