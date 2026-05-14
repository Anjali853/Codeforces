import java.util.Scanner;

public class Holidays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fullweek = n/7;
        int rem = n%7;
        int min = fullweek * 2 + Math.max(0, rem - 5);

        int max = fullweek * 2 + Math.min(2, rem);

        System.out.println(min + " " + max);
    }
    
}
