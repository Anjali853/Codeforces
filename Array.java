import java.util.ArrayList;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> neg = new ArrayList<>();
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> zero = new ArrayList<>();

        for(int i = 0; i<n; i++){
            int x = sc.nextInt();
            if(x <0)
                neg.add(x);

            else if(x>0)
                pos.add(x);
            else
                zero.add(x);

        }
         System.out.print(1 + " ");
        System.out.println(neg.get(0));
        if (pos.size() > 0) {

            System.out.print(pos.size() + " ");

            for (int x : pos)
                System.out.print(x + " ");

            System.out.println();
            System.out.print((neg.size() - 1 + zero.size()) + " ");

            for (int i = 1; i < neg.size(); i++)
                System.out.print(neg.get(i) + " ");

            for (int x : zero)
                System.out.print(x + " ");
        }

        else {


            System.out.print(2 + " ");
            System.out.println(neg.get(1) + " " + neg.get(2));
            System.out.print((neg.size() - 3 + zero.size()) + " ");

            for (int i = 3; i < neg.size(); i++)
                System.out.print(neg.get(i) + " ");

            for (int x : zero)
                System.out.print(x + " ");
        }
    }
}