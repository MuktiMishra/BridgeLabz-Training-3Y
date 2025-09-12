import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int k = scanner.nextInt();
            long x = scanner.nextLong();

            for (int i = 0; i < k; i++) {
                // Prioritize the reversal of 3x+1.
                // The previous number, (x-1)/3, must be odd and a whole number.
                if (x % 3 == 1) {
                    long prev = (x - 1) / 3;
                    if (prev > 0) {
                        x = prev;
                    } else {
                        x = x * 2;
                    }
                } else {
                    x = x * 2;
                }
            }
            System.out.println(x);
        }
        scanner.close();
    }
}