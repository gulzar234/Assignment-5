import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();

        int positiveCount = 0;
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (num > 0) {
                positiveCount++;
            }
        }
        System.out.println(positiveCount);
    }
}
