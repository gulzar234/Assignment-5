import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int count = 0;
        for (int i = 1; i < n - 1; i++) {
            if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
