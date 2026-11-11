import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();

        if (n <= 1) {
            System.out.println(0);
            return;
        }
        int prev = scanner.nextInt();
        int count = 0;

        for (int i = 1; i < n; i++) {
            int current = scanner.nextInt();
            if (current > prev) {
                count++;
            }
            prev = current;
        }
        System.out.println(count);
    }
}
