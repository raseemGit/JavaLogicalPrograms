package part2;

import java.util.HashMap;

public class JavaLogProg4 {

	private void method1() {
		// Reverse a Given String

		String name = "Greens";
		String output = "";

		for (int i = name.length() - 1; i >= 0; i--) {

			char c = name.charAt(i);
			output = output + c;
		}
		System.out.println("reversed string : " + output);
		// Check its palindrome or not

		if (name == output) {
			System.out.println("Its a palindrome");

		} else {
			System.out.println("Its not palindrome");
		}
	}

	private void method2() {
		// Find type of Characters(LowerCase,UpperCase,Digits,SP Charatcters)
		// Seprate the Each character Type and Count of The Characters
		// Seperate only Characters(uppercase and lowerCase), Seperate only Numbers,
		// Seperate only Special Characters

		// To Initialize empty int for count
		int u = 0, l = 0, sp = 0, d = 0;

		// To Initialize empty String for each Characters
		String u1 = "", l1 = "", sp1 = "", d1 = "";

		String value = "Mohamed_Raseem1234@gmail.com";

		for (int i = 0; i < value.length() - 1; i++) {

			char c = value.charAt(i);
			if (Character.isUpperCase(c)) {
				u++;
				u1 = u1 + c;
			} else if (Character.isLowerCase(c)) {

				l++;
				l1 = l1 + c;
			} else if (Character.isDigit(c)) {
				d++;
				d1 = d1 + c;

			} else {
				sp++;
				sp1 = sp1 + c;

			}

		}
		System.out.println("Every Output");
	}

	private void method3() {
		// Without PreDefined Methods
		// To Initialize empty int for count
		int u = 0, l = 0, sp = 0, d = 0;

		// To Initialize empty String for each Characters
		String u1 = "", l1 = "", sp1 = "", d1 = "";

		String value = "Mohamed_Raseem1234@gmail.com";

		for (int i = 0; i < value.length() - 1; i++) {

			char c = value.charAt(i);
			if (c >= 'A' && c <= 'Z') {
				u++;
				u1 = u1 + c;
			} else if (c >= 'a' && c <= 'z') {

				l++;
				l1 = l1 + c;
			} else if (c >= '0' && c <= '9') {
				d++;
				d1 = d1 + c;

			} else {
				sp++;
				sp1 = sp1 + c;

			}

		}
		System.out.println("Every Output");
	}

	private void method4() {
		// Swappint two numbers with thhird Variable

		int a = 10, b = 20, c;

		System.out.println("BEfore Swapping");
		System.out.println(a);
		System.out.println(b);

		c = a;
		a = b;
		b = c;

		System.out.println("After Swapping");
		System.out.println(a);
		System.out.println(b);

	}

	private void method5() {
		// Swappint two numbers without third Variable

		int a = 10, b = 20;

		System.out.println("BEfore Swapping");
		System.out.println(a);
		System.out.println(b);

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("After Swapping");
		System.out.println(a);
		System.out.println(b);

	}

	private void method6() {
		// Print Only vowels
		// Cont of the Each vowels

		String name = "GreensTechnologyPorur";

		int c = 0, v = 0;
		String vowels = "", constants = "";

		for (int i = 0; i < name.length() - 1; i++) {
			char ch = name.charAt(i);

			if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i'
					|| ch == 'o' || ch == 'u') {

				v++;
				vowels = vowels + ch;
			} else {
				c++;
				constants = constants + ch;
			}

		}
		System.out.println("Vowels and Count : " + vowels + " " + v);
		System.out.println("Constants and Count : " + constants + " " + c);

	}

	private void method7() {
		// Find the Count of Each Individual charcters
		String s = "Saranya";
		HashMap<Character, Integer> emp = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length() - 1; i++) {

			char c = s.charAt(i);
			if (emp.containsKey(c)) {
				int count = emp.get(c);
				emp.put(c, count + 1);
			} else {
				emp.put(c, 1);
			}
		}
		System.out.println(emp);
	}

	private void method8() {
		// Find the Count of Each Word
		String s = "this is java class welcome to the java class";
		String[] s1 = s.split(" ");
		HashMap<String, Integer> emp = new HashMap<String, Integer>();
		for (String c : s1) {
			if (emp.containsKey(c)) {
				int x = emp.get(c);
				emp.put(c, x + 1);
			} else {
				emp.put(c, 1);
			}
		}
		System.out.println(emp);
	}

	private void method9(int n) {
		int i, j;
		// To Create a Half Pyramid
		// outer loop to handle number of rows
		// n in this case
		for (i = 0; i < n; i++) {

			// inner loop to handle number of columns
			// values changing acc. to outer loop
			for (j = 0; j <= i; j++) {
				// printing stars same line
				System.out.print("* ");
			}

			// Create line after each row
			System.out.println();
		}
	}

	private void method10(int n) {
		// To Create a Full Pyramid
		// outer loop to handle number of rows
		// n in this case
		for (int i = 0; i < n; i++) {

			// inner loop to handle number spaces
			// values changing acc. to requirement
			for (int j = n - i; j > 1; j--) {
				// printing spaces
				System.out.print(" ");
			}

			// inner loop to handle number of columns
			// values changing acc. to outer loop
			for (int j = 0; j <= i; j++) {
				// printing stars
				System.out.print("* ");
			}

			// ending line after each row
			System.out.println();
		}

	}

	private void method11(int n) {
		int i, j, num;
		// To Create a half pyramid by numbers
		// outer loop to handle number of rows
		// n in this case
		for (i = 0; i < n; i++) {
			// initialising starting number
			num = 1;

			// inner loop to handle number of columns
			// values changing acc. to outer loop
			for (j = 0; j <= i; j++) {
				// printing num with a space
				System.out.print(num + " ");

				// incrementing value of num
				num++;
			}

			// ending line after each row
			System.out.println();
		}
	}

	private void method12() {
		String s = "he,xa,wa,re";
		String x = s.replace(",", "");
		System.out.println(x);
	}
	
	

	public static void main(String[] args) {
		JavaLogProg4 obj = new JavaLogProg4();
		obj.method9(5);

	}
}
