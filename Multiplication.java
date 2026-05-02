import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        long n = sc.nextLong();
        long x = sc.nextLong();
        long count=0;
        for(int i=0; i<n; i++){
            if(x%(i+1)==0){
                count++;
            }
        }
 System.out.println(count);
}
}