import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int h = sc.nextInt();
        int total = 0;

        for (int i = 0; i < n; i++) {
            int ai = sc.nextInt();

            if (ai > h) {
                total += 2;
            } else {
                total += 1;
            }
        }

        System.out.print(total);
    }
}
