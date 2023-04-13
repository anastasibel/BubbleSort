import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int n = 10;

        int[] arr = new int[n];

        for (int q = 0; q < n; q++) {
            arr[q] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(arr));

        long start = System.currentTimeMillis();
        for (int k = 1; k < n; k++) {
            for (int i = 0; i < n - k; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
        long end = System.currentTimeMillis();

        long time = end - start;

        System.out.println(time);

    }
}