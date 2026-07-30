public class SmallestArray {
    public static void main(String[] args) {
        int[] arr = {8, 2, 15, 1, 10};
        int min = arr[0];

        for (int i = 1; i < arr.length; i++)
            if (arr[i] < min)
                min = arr[i];

        System.out.println(min);
    }
}