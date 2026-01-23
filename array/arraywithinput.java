package PST;
import java.util.Scanner;
import java.util.Arrays;
public class arraywithinput {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("enter the size of array:");
		int size = obj.nextInt();
		int arr[] = new int [size];
		for (int i=0;i<size;i++) {
			arr[i]=obj.nextInt();
			
		}
		int len=arr.length;
		//to print the array
		System.out.println("the input array:");
		for(int i=0;i<len;i++) {
			System.out.println(arr[i]);
		}
		//to print the reversed array
		System.out.println("the reversed array:");
		for (int i=len-1 ; i<=len;i--) {
			 {
			System.out.println(arr[i]);
			}
		}
	}

	
}
	
