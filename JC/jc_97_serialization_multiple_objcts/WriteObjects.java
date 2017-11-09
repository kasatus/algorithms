package jc_97_serialization_multiple_objcts;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WriteObjects {
	public static void main(String[] args) {
		System.out.println("Writing objects...");
		
//		Person eula = new Person("eula");
//		Person noni = new Person("noni");
		
		Person[] arr = {new Person("holly-molly"), new Person("molly-holly")};
		List<Person> list = new ArrayList<Person>(Arrays.asList(arr));
		
		System.out.println(arr[0] + "\n" + arr[1] + "\n");
		try(FileOutputStream fs = new FileOutputStream("/Users/skasatki/git/algorithms/target/classes/json_objects/people")) {
			
			ObjectOutputStream os = new ObjectOutputStream(fs);
			
			os.writeObject(arr);os.writeObject(list);
			//for (int i = 0; i < 10; i++) {
//			os.writeObject(eula);
//			os.writeObject(noni);
			//}
			
			
			os.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		System.out.println(eula);
//		System.out.println(noni);
	}
}
