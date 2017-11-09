package jc_97_serialization_multiple_objcts;

import java.io.Serializable;

public class Person implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static int ID = 0;
	private String name;
	private int id;
	
	public Person(String name) {
		ID++;
		id = ID;
		this.name = name;
	}
	public String getInfo() {
		return "name: " + name + ", ID: " + id;
	}
	
	public String toString() {
		return getInfo();
	}
}
