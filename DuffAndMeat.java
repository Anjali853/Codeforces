import java.util.Scanner;

public class DuffAndMeat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int minprice = Integer.MAX_VALUE;
        long totalCost = 0;
        for(int i =0; i <n; i++){
            int a= sc.nextInt();
            int p= sc.nextInt();

            minprice = Math.min(minprice, p);
            totalCost += (long)a* minprice;
        }
        System.out.println(totalCost);
    }
}