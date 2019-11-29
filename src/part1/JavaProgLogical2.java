package part1;

public class JavaProgLogical2 {

	public static void main(String[] args) {
		//=============================================================================

		// Q: REVERSE THE NUMBER
		// CHECK PALINDROME OR NOT

		int a = 123, i = 0, j = 0;
		int rev = a;

		while (a > 0) {
			// pick a last value
			i = a % 10;
			// reverse the value and add with j value
			j = (j * 10) + i;
			// removing last value from given numbers
			a = a / 10;

		}

		System.out.println("Reversed Number is : " + j);

		if (rev == j) {
			System.out.println("Its a palindrome");
		} else {
			System.out.println("Not a palindrome");
		}
		//=============================================================================
		
		//Q : Check ARM STRONG NUMBER or NOT
		//example : 1^3 + 5^3 + 3^3 = 153 mean its a armstrong number
		int x=153 ,y =0,z=0;
		int temp=x;
		
		while(x>0) {
			//picking only last number
			y=x%10;
			//Function for armStrong
			z=(y*y*y)+z;
			//removing last number
			x=x/10;
			
		}
		if(temp==z) {
			System.out.println("Its a palindrome");
		}
		//=============================================================================

		
		
		
	}

}
