package part2;

import java.util.Scanner;

public class JavaLogProg12 {

	private void method1() {
		Scanner bn = new Scanner(System.in);
		System.out.println("The four numbers are");
		int a = bn.nextInt();
		int b = bn.nextInt();
		int c = bn.nextInt();
		int d = bn.nextInt();
		if (a > b && a > c && a > d) {
			System.out.println("The biggest number is= " + a);
		} else if (b > a && b > c && b > d) {
			System.out.println("The biggest number is= " + b);
		} else if (c > a && c > b && c > d) {
			System.out.println("The biggest number is= " + c);
		} else {
			System.out.println("The biggest number is= " + d);
		}
	}

	private void method2() {
		/*
		 * int a[] = { -12, 45, -23, 64, -100, 24 };
		 * 
		 * for (int i = 0; i < a.length; i++) {
		 * 
		 * for (int j = i + 1; j < a.length; j++) {
		 * 
		 * int temp = 0;
		 * 
		 * if (a[i] < a[j]) {
		 * 
		 * temp = a[j];
		 * 
		 * a[j] = a[i];
		 * 
		 * a[i] = temp; } } } for (int k = 0; k < a.length; k++) {
		 * System.out.println(a[k]); } System.out.println("The Third maximum number is "
		 * + a[a.length]);
		 */

		int[] a = new int[] { 20, 30, 50, 4, 71, 100 };
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}

		System.out.println("From The Array Element Largest Number is :" + max);

	}

	private void method3() {
		String name = "Greens Tech Porur Branch";
		// Split the String by Space
		String[] s = name.split(" ");
		// Create a empty string for Final Output
		String res = "";

		for (int i = 0; i < s.length; i++) {
			// Iterate the Splitted String
			String t = s[i];
			// Apply the reverse logic on Eevery Iteration
			for (int j = t.length() - 1; j >= 0; j--) {
				char ch = t.charAt(j);
				res = res + ch;
			}

			res = res + " ";
		}
	}

}
