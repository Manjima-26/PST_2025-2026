import java.util.Scanner;
public class totalandaverage
{
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int mark1= obj.nextInt();
		int mark2= obj.nextInt();
		int mark3= obj.nextInt();
		int total = mark1+mark2+mark3;
		int average = total/3;
		System.out.println("the total of the marks:"+total);
		System.out.println("the average of the marks"+average);
	}
}
