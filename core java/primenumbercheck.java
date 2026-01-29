package PST;
import java.util.Scanner;
public class primenumbercheck {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = 0;
		System.out.println("enter the number:");
		int n = scan.nextInt();
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("the number is prime");
		}
		else {
			System.out.println("the number is not prime numvber");
		}
	}

}
