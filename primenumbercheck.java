package COREJAVA;
import java.util.Scanner;
public class primenumbercheck {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = scan.nextInt();
		int temp = 0;
		for (int i=2;i<num;i++) {
			if(num%i==0) {
				temp=1;
				
			}
		}
		if(temp==0) {
			System.out.println("it is prime number");
			
		}
		else {
			System.out.println("it is not prime number");
		}
		
	}
	
		
		
}
