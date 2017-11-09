package jc_97_serialization_multiple_objcts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class ReadObjects {
	public static void main(String[] args) {
		System.out.println("Reading objects...");
		
		try(FileInputStream fi = new FileInputStream("/Users/skasatki/git/algorithms/target/classes/json_objects/people")) {
			ObjectInputStream os = new ObjectInputStream(fi);
			
			Person[] arr = (Person[])os.readObject();
			for (Person p : arr) {
				System.out.println(p);
			}
			List<Person> list = (List<Person>)os.readObject();
			
			for (Person p : list) {
				System.out.println(p);
			}
			
			
			
//			Person person1 = (Person)os.readObject();
			os.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
