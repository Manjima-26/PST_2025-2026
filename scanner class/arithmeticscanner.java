import java.util.Scanner;
public class arithmeticscannerarea
{
	public static void main(String[] args) {
		Scanner obj1 = new Scanner(System.in);
		int num1=obj1.nextInt();
		int num2=obj1.nextInt();
		System.out.println("the sum of two numbers:"+(num1+num2));
		System.out.println("the diiference of two numbers:"+(num1-num2));
		System.out.println("the product of two numbers:"+(num1*num2));
		System.out.println("the quotient of two numbers:"+(num1/num2));
		
		
	}
}
