package lambdaExpressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.collections.bag.SynchronizedSortedBag;
import org.apache.commons.lang.ArrayUtils;

interface Draw {
	public int draw(int height, int weight);
}

interface Paint {
	public void paint();
}

interface Summable {
	public int add(int a, int b);
	default public void minus(int a, int b) {
	}
}

abstract class Example {
	public abstract void doThis();
}

public class Lambda {
	public static void main(String[] args) {
	//	(argument-list) -> {body}
		int height = 10;
		int weight = 5;
		String coord = "10, 10";
	// 1. Abstract class instead of lambda expressions:
		Draw dr = new Draw() {
			public int draw(int height, int weight) {
				System.out.println("drawing " + height + weight);
				return height * weight;
			}
		};
		dr.draw(height, weight);
		
	// 2. Lambda expressions -- is used for interfaces with just ==ONE== abstract method!
		
		//2.1 with arguments
		Draw d2 = (h, w)->{
			System.out.println("drawing using lambda: " + h + w);
			return h * w;
		};
		System.out.println("lambda returned: " + d2.draw(height, weight));
		
		
		//2.2 without arguments
		Paint p1 = ()->{
			System.out.println("Painting");
		};
		p1.paint();
		
		//2.3 two arguments, no body
		Summable s1 = (a, b) -> a + b;
		System.out.println("Adding two numbers: " + s1.add(1, 2));
		
		//2.4 foreach loop
		List<String> l = new ArrayList();
		for (Integer i = 0; i < 5; i++) {
			l.add(i.toString());
		}
		
		l.forEach(s -> System.out.println(s));
		int[] ar = {1, 2, 3, 4};
		
		List<Integer> l2 = new ArrayList(Arrays.asList(ArrayUtils.toObject(ar)));
		System.out.println((Integer)l2.get(1));
		
		l2.forEach(s -> System.out.println(s));
		
		//abstract classes not possible!:
		class ex2 extends Example {

			@Override
			public void doThis() {
				// TODO Auto-generated method stub
				
			}
		}
		
		//ex2 ex = () -> {}; throws an error! only functional interfaces
		
		
		
	}
}
