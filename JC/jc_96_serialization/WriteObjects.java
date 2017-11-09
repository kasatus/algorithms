package jc_96_serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjects {
	public static void main(String[] args) {
		System.out.println("Writing objects...");
		
		Person eula = new Person(1, "eula");
		Person noni = new Person(2, "noni");
		eula.assignBro(noni);
		eula.getBro();
		
		
		try(FileOutputStream fs = new FileOutputStream("/Users/skasatki/git/algorithms/target/classes/json_objects/people")) {
			
			ObjectOutputStream os = new ObjectOutputStream(fs);
			
			for (int i = 0; i < 10; i++) {
			os.writeObject(eula);
			os.writeObject(noni);
			}
			
			
			os.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(eula);
		System.out.println(noni);
	}
}
