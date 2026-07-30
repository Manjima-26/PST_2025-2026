public class LargestArray {
    public static void main(String[] args) {
        int[] arr = {5, 12, 3, 7, 20};
        int max = arr[0];

        for (int i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];

        System.out.println(max);
    }
}