package jc_94_enum;

public class App {
	public static final int DOG = 0;
	public static final int CAT = 1;
	public static final int MOUSE = 2;
	
	public static void main(String[] args) {
		int animal = CAT;
		
		switch(animal) {
		case DOG:
			System.out.println("Dog");
			break;
		case CAT:
			System.out.println("Cat");
			break;
		case MOUSE:
			System.out.println("Mouse");
			break;
		}
		
		
		/// enum:
		Animals anim = Animals.CAT;
		switch(anim) {
		case CAT:
			System.out.println("Cat");
			break;
		case DOG:
			System.out.println("Dog");
			break;
		case MOUSE:
			System.out.println("Mouse");
			break;
		default:
			break;
		
		}
		
		System.out.println(Animals.DOG);
		System.out.println("Enum name as a string: " + Animals.DOG.name());
		System.out.println(Animals.DOG.getClass());
		System.out.println(Animals.DOG instanceof Animals);
		System.out.println(Animals.DOG instanceof Enum);
		System.out.println(Animals.DOG.getName());
	}
}
