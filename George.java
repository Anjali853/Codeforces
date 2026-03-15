import java.util.Scanner;

public class George {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextInt();
        String t = sc.nextInt();

        String[] curr = s.split(":");
        String[] sleep = t.split(":");
        int sh = Integer.parseInt(curr[0]);
        int sm  = Integer.parseInt(curr[1]);
        int tHour = Integer.parseInt(sleep[0]);
        int tMin  = Integer.parseInt(sleep[1]);
        int totalS = sh * 60 + sm;
        int totalT = tHour * 60 + tMin;

         int total = totalS - totalT

         int 

    }
}
