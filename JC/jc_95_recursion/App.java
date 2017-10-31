package jc_95_recursion;

public class App {
	public static void main(String[] args) {
		int value = 4;
		calculate();
	}
	
	private static void calculate() {
		System.out.println("Hello");
		System.out.println(RevStr.reverse("Hello"));
	}
}
