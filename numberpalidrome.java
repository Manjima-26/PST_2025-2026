package PST;
import java.util.Scanner;
public class numberpalidrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = scan.nextInt();
		int a=num;//to store the original number
		int reversednum = 0;
		while(num!=0) {
			int digit = num % 10;
			reversednum = reversednum*10+digit;
			num = num/10;
			
		}
		if(a==reversednum) {
			System.out.println("This is number palindrome");
		}
		else {
			System.out.println("This is not palindrome");
		}
		
	}

}
