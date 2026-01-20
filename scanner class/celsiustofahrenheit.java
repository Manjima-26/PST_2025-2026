import java.util.Scanner;
public class celsiustofahrenheit{
    public static void main (String[] args) {
        Scanner obj = new Scanner(System.in);
        int celsius = obj.nextInt();
        int fahrenheit = (celsius*9/5)+32;
        System.out.println("the celsius"+celsius);
        System.out.println("the fahrenheit:"+ fahrenheit);
    }
}