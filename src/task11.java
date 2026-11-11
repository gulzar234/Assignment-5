import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();

        if (n == 0) {
            System.out.println(0);
            return;
        }

        int prev = scanner.nextInt();
        int uniqueCount = 1;
        for (int i = 1; i < n; i++) {
            int current = scanner.nextInt();
            if (current != prev) {
                uniqueCount++;
                prev = current;
            }
        }
        System.out.println(uniqueCount);
    }
}
