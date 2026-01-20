import java.util.Scanner;
public class positiveornegative
{
	public static void main(String[] args) {
	    Scanner obj = new Scanner(System.in);
		int num = obj.nextInt();
		if(num==0){
		    System.out.println("the number is zero");
		}
		else if (num>0) {
		    System.out.println("the number is positive");
		}
		else{
		    System.out.println("the number is negative");
		}
	}
}
