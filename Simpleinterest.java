import java.util.Scanner;
public class Simpleinterest
{
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the Principal amount");
		double principal=obj.nextDouble();
		System.out.print("Enter the Interest");
		double rateofinterest=obj.nextDouble();
		System.out.println("Enter the Time period");
		double timeperiod=obj.nextDouble();
		double simpleinterest=(principal*rateofinterest*timeperiod)/100;
		System.out.println("The calculated simpleinterest"+simpleinterest);

	}
}
