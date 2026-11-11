import java.util.Scanner;
import java.util.ArrayList;

public class task15 {
    static class BallGroup {
        int color;
        int count;

        BallGroup(int color, int count) {
            this.color = color;
            this.count = count;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();
        ArrayList<BallGroup> stack = new ArrayList<>();
        int totalDestroyed = 0;

        for (int i = 0; i < n; i++) {
            int color = scanner.nextInt();

            if (!stack.isEmpty() && stack.get(stack.size() - 1).color == color) {
                stack.get(stack.size() - 1).count++;
            } else {
                if (!stack.isEmpty() && stack.get(stack.size() - 1).count >= 3) {
                    totalDestroyed += stack.get(stack.size() - 1).count;
                    stack.remove(stack.size() - 1);
                    if (!stack.isEmpty() && stack.get(stack.size() - 1).color == color) {
                        stack.get(stack.size() - 1).count++;
                        continue;
                    }
                }
                stack.add(new BallGroup(color, 1));
            }
        }
        if (!stack.isEmpty() && stack.get(stack.size() - 1).count >= 3) {
            totalDestroyed += stack.get(stack.size() - 1).count;
        }
        System.out.println(totalDestroyed);
    }
}
