import java.util.Scanner;

public class task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int k = scanner.nextInt();
        k = (k % n + n) % n;

        if (k > 0) {
            reverse(array, 0, n - 1);
            reverse(array, 0, k - 1);
            reverse(array, k, n - 1);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
    private static void reverse(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}

