import java.util.Scanner;
class AssignmentOperator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a =scan.nextInt();
		int b =scan.nextInt();
        a += b;   
        System.out.println("a += b : " + a);

        a -= b;   
        System.out.println("a -= b : " + a);

        a *= b;   
        System.out.println("a *= b : " + a);

        a /= b;   
        System.out.println("a /= b : " + a);

        a %= b;   
        System.out.println("a %= b : " + a);
    }
}
