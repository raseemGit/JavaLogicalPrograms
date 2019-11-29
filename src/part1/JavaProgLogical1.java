package part1;

public class JavaProgLogical1 {

	public static void main(String[] args) {
		// =============================================================================

		// Q :Find the number is ODD or EVEN

		int a = 10;
		if (a % 2 == 0) {
			System.out.println("its a Even Number :" + a);
		} else {

			System.out.println("its a odd number :" + a);
		}

		// Note : If AnyNumber%2==0 Means its a EVEN Number
		// Note : If AnyNumber%2==1 Means its a ODD Number
		// =============================================================================

		// Q : Find its a ODD or EVEN
		int b = 9;
		if (a % 2 == 1) {
			System.out.println("its a ODD Number :" + b);
		} else {
			System.out.println("its a EVEN Number :" + b);
		}
		// =============================================================================

		// Q : Print even numbers present 1 to 100
		// Also count of Even Number

		for (int i = 0; i < 100; i++) {
			int count = 0;
			if (i % 2 == 0) {
				System.out.println(i);
				count++;
			}
			System.out.println(count);
		}
		// =============================================================================

		// Q : Print Odd numbers present 1 to 100
		// Also count of Odd Number

		for (int i = 0; i < 100; i++) {
			int count = 0;
			if (i % 2 == 1) {
				System.out.println(i);
				count++;
			}
			System.out.println(count);
		}
		// =============================================================================

		// Q : Sum the Even Values Present in 1 to 10

		for (int i = 0; i < 10; i++) {
			int sum = 0;
			if (i % 2 == 0) {
				sum = sum + i;
			}
			System.out.println(sum);
		}
		// Q : Sum the Odd numbers present 1 to 700
		// =============================================================================

		for (int i = 0; i < 700; i++) {
			int sum = 0;
			if (i % 2 == 1) {
				sum = sum + i;
			}
			System.out.println(sum);
		}
		// =============================================================================

	}

}
