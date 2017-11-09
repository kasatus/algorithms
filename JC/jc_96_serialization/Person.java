package jc_96_serialization;

import java.io.Serializable;

public class Person implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3504775033371066904L;
	private int id;
	private String name;
	private Person bro;
	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void assignBro(Person b) {
		this.bro = b;
	}
	
	public void getBro() {
		System.out.println(bro.name);
	}
	
	public String toString() {
		return "Person [id = " + id + ", name = " + name + "]";
	}
}

