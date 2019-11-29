package part1;

public class JavaProgramLogical3 {
	public static void main(String[] args) {

		// =============================================================================
		// Q: SUM OF DIGITS
		int d = 1234, i = 0, sum = 0;

		while (d > 0) {
			// PICK A LAST NUMEBR ASSIGNED TO i
			i = d % 10;
			// SUM THE i VALUE ON EVERY ITERATION
			sum = sum + i;
			// REMOVE THE LAST VALUE
			d = d / 10;

		}
		System.out.println(sum);

		// =============================================================================
		// Q : COUNT OF DIGITS
		int count = 0;
		while (d > 0) {
			// REMOVE THE LAST VALUE
			d = d / 10;
			// INCRESE COUNT VALUE EERY ITERTION
			count++;
		}
		System.out.println(count);

		// =============================================================================
		// Q: FACTORIAL OF 1 TO 10

		int fact = 1;
		// factorial itself always starts with 1
		for (int j = 0; j < 10; j++) {

			fact = fact * i;

		}
		System.out.println(fact);
		// =============================================================================
		// Q: FIND THE ACII VALUES

		char c = 7;
		// When assign the char DataType value into int dataType it
		// convert the value as ASCII
		int j = c;

		System.out.println(j);

	}

}