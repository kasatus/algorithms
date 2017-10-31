package jc_5_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class App {
	public static void main(String[] args) throws FileNotFoundException{
		Machine mac = new Machine();
		Options opt_mac = mac;
		opt_mac.showInfo();
		File file = new File("test.txt");
		
		try {
			FileReader fr = new FileReader(file);
			
			//this will not be executed if an exception is thrown!
			System.out.println("Continuing...");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			FileReader fr = new FileReader(file);
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}
		openFile();
		
	}
	
	public static void openFile() throws FileNotFoundException {
		File file = new File("test.txt");
		FileReader fr = new FileReader(file);
	}
}
