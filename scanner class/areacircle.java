import java.util.Scanner;
public class areacircle{
    public static void main (String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the radius:");
        float radius = obj.nextFloat();
        float area = 3.14f*radius*radius;
        System.out.println("area of circle:"+area);
        
    }
}