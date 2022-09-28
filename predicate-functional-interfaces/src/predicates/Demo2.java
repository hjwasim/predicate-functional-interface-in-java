package predicates;
import java.util.List;
import java.util.function.Predicate;

public class Demo2 {

	// Joining Predicates using and(),or(), negagte() which basically equals to
	// AND,OR,NOT.
	// and(another predicate),or(another predicate), negagte(null)
	// Example 1
	// I need a numbers list from the 100 numbers, which number is even and greater
	// than 50 and less than 70
	// 0 > number <= 100

	public static void main(String[] args) {
		int[] number_lists = new int[100];
		for (Integer i = 0; i < 100; i++) {
			number_lists[i] = i + 1;
		}
//		Predicate<Integer> p1 = (n) -> (n % 2 == 0); // Even Numbers predicate
//		Predicate<Integer> p2 = (n) -> (n >= 50); // Greater than 50 predicate
//		Predicate<Integer> p3 = (n) -> (n <= 70); // lesser than 70 predicate
//		
//		for (int i = 0; i < number_lists.length; i++) {
//			if(p1.and(p2).and(p3).test(i+1)) {
//				System.out.println(i+1);
//			}
//		}

		// Example 2
		// I need a numbers list from the 100 numbers, which number greater than 60 and
		// divisible by 5 or divisible by 34
		// 0 > number <= 100

		Predicate<Integer> p5 = (n) -> (n % 5 == 0); // Divisible 5 predicate
		Predicate<Integer> p4 = (n) -> (n > 60); // greater than 60
		Predicate<Integer> p6 = (n) -> (n % 34 == 0); // Divisible 34 predicate

		for (int i = 0; i < number_lists.length; i++) {
			if (p4.test(i + 1) && p5.or(p6).test(i + 1)) {
				// System.out.println(i+1);
			}
		}

		// Example 2=3
		// I need a numbers list from the 100 numbers, which number except the numbers greater than 60 and
		// divisible by 5 or divisible by 34
		// 0 > number <= 100

		Predicate<Integer> p7 = (n) -> (n % 5 == 0); // Divisible 5 predicate
		Predicate<Integer> p8 = (n) -> (n > 60); // greater than 60
		Predicate<Integer> p9 = (n) -> (n % 34 == 0); // Divisible 34 predicate

		for (int i = 0; i < number_lists.length; i++) {
			if (p8.negate().test(i + 1) && p7.or(p9).test(i + 1)) {
				System.out.println(i + 1);
			}
		}

	}
}
