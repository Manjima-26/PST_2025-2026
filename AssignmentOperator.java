class AssignmentOperator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a =10;
		int b =20;
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

