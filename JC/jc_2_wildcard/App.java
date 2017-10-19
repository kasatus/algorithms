package jc_2_wildcard;

import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String[] args) {
		Machine mac = new Machine();
		Chip chip = new Chip();
		List<Chip> list2 = new ArrayList<Chip>();
		List<Machine> list = new ArrayList<Machine>();
		list.add(mac);
		list.add(mac);
		list.add(mac);
		printInfo(list);
		System.out.println("~~");
		printInfo2(list);
		System.out.println("~~");
		/*
		 * Can't do this since Chip doesn't extend Machine!
		 */
		//printInfo2(list2);
		list2.add(chip);
		printInfo(list2);
		
	}
	
	private static void printInfo(List<?> list) {
		for (Object obj : list)
			System.out.println(obj);
	}
	
	private static void printInfo2(List<? extends Machine> list) {
		for (Machine mac : list) {
			System.out.println(mac);
		}
	}
}
