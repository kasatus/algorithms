package jc_94_enum;

public enum Animals {
	CAT("ryzhik"), DOG("suka"), MOUSE("nikki");
	private String name;
	
	Animals(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name();
	}
	
	public String toString() {
		return "This animal is called" + name;
	}
}
