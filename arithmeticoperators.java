import java.util.Scanner;
public class arithmeticoperators
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		System.out.println("the addition of two numbers:"+ (num1+num2));
		System.out.println("the subraction  of two numbers:"+ (num1-num2));
		System.out.println("the multiplication of two numbers:"+ (num1*num2));
        System.out.println("the division of two numbers:"+ (num1/num2));
		System.out.println("the modulus of two numbers:"+ (num1%num2));
		

	}
}
