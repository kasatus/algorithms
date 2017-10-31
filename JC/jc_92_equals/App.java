package jc_92_equals;

class Person {
	private int d;
	private String name;
	public Person(int d, String name) {
		this.d = d;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [d=" + d + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + d;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (d != other.d)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
}

public class App {
	public static void main(String[] args) {
		Person p1 = new Person(5, "nancy");
		Person p2 = new Person(8, "dima");
		Person p3 = new Person(5, "nancy");
		
		System.out.println(p1 == p3); // false! though they have the same content
		
		System.out.println(p1.equals(p3)); // false before overriding equals 
		// true after ovverriding equals
		
		p1 = p3;
		System.out.println(p1 == p3); // true! though they have the same content
		
		Double value1 = 7.2;
		Double value2 = 7.2;
		
		System.out.println("Doubles:");
		System.out.println(value1 == value2);
		System.out.println(value1.equals(value2));
		System.out.println("Integers:");
		
		Integer number1 = 6;
		Integer number2 = 6;
		System.out.println(number1 == number2);
		
		System.out.println("Strings");
		
		String text1 = "hello";
		String text2 = "hello".substring(0, 4);
		System.out.println(text1 == text2);
		System.out.println(text1.equals(text2));
		
		
		
	}
}
