import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long x = sc.nextInt();
        long count = 0;
        for (long i = 1; i <= n; i++) {
            if (x % i == 0 &&  x / i <= n ) {
                count++;
            }
        }

        System.out.println(count);
       
    }
}