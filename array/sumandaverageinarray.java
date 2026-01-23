package PST;
import java.util.Scanner;
public class sumandaverageinarray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum=0;
		System.out.println("Enter the size of the array:");
		int size = scan.nextInt();
		System.out.println("enter the element of the array:");
		int arr[]= new int [size];
		for(int i=0;i<size;i++) {
			arr[i]=scan.nextInt();
		}
		for (int j=0;j<arr.length;j++) {
			sum=sum+arr[j];
			
		}
		float average=sum/size;
		System.out.println("the sum of elements in array:"+sum);
		System.out.println("the average of elements in array:"+average);
		

	}

}
