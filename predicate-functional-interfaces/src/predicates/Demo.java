package predicates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class Demo {

	public static void main(String[] args) {

//		Predicate is a java-functional interface, which contains only one abstract methods named 'test'. 
//
//		Best uses in if clause.
//		it always take one parameter
//		it returns always boolean
//		use only if u have conditional check

		// Example 1
		Predicate<Integer> p = (Integer i) -> (i > 10);
		System.out.println(p.test(23));
		System.out.println(p.test(2));
		System.out.println(p.test(-35));

		// Example 2
		// Check the length of the given string is greater than 5 or not.
		Predicate<String> p1 = (s) -> (s.length() >= 5);
		System.out.println(p1.test("Wasim"));

		// Example 3
		// From the list of names, find the names whose length less than 4.
		List<String> names = Arrays.asList("Ben", "Scorpo", "Robux", "Wither", "Lis");
		Predicate<String> p2 = (s) -> (s.length() < 3);
		for (String name : names) {
			if (p2.test(name)) {
				System.out.println(name);
			}
		}
	}
}
