import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();
        int[] growth = new int[n];
        for (int i = 0; i < n; i++) {
            growth[i] = scanner.nextInt();
        }
        int petiaGrowth = scanner.nextInt();
        int position = n + 1;
        for (int i = 0; i < n; i++) {
            if (growth[i] < petiaGrowth) {
                position = i + 1;
                break;
            }
        }
        System.out.println(position);
    }
}
