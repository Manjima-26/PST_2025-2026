package PST;
import java.util.Scanner;
public class oddevencountarray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int evencount=0;
		int oddcount=0;
		System.out.println("Enter the Size of Array:");
		int size = scan.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=scan.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				evencount++;
			}
			else {
				oddcount++;
			}
		}
		System.out.println("evencount:"+evencount);
		System.out.println("oddcount:"+oddcount);
		}
			
		
		}


