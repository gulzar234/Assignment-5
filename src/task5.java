import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();
        if (n <= 1) {
            System.out.println("NO");
            return;
        }
        int prev = scanner.nextInt();
        boolean hasSameSignPair = false;
        for (int i = 1; i < n; i++) {
            int current = scanner.nextInt();
            if ((prev > 0 && current > 0) || (prev < 0 && current < 0)) {
                hasSameSignPair = true;
            }
            prev = current;
        }
        if (hasSameSignPair) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
