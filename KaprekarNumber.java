public class KaprekarNumber {
    public static void main(String[] args) {
        int n = 45;
        int square = n * n;
        String s = String.valueOf(square);

        int mid = s.length() / 2;
        int left = Integer.parseInt(s.substring(0, mid));
        int right = Integer.parseInt(s.substring(mid));

        if (left + right == n)
            System.out.println("Kaprekar Number");
        else
            System.out.println("Not Kaprekar Number");
    }
}