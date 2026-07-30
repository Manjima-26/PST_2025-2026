import java.util.Scanner;
public class scanners
{
	public static void main(String[] args) {
	    Scanner obj1 = new Scanner(System.in);
	    int a = obj1.nextInt();
	    obj1.nextLine();
	    String word = obj1.next();
	    float b = obj1.nextFloat();
	    double c = obj1.nextDouble();
	    long d = obj1.nextLong();
	    boolean e = obj1.nextBoolean();
	    System.out.println(a);
	    System.out.println(word);
	    System.out.println(b);
	    System.out.println(c);
	    System.out.println(d);
	    System.out.println(e);
	}
}