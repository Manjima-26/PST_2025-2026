public class DuckNumber {
    public static void main(String[] args) {
        int n = 1023;
        String s = String.valueOf(n);

        if (s.charAt(0) != '0' && s.contains("0"))
            System.out.println("Duck Number");
        else
            System.out.println("Not Duck Number");
    }
}