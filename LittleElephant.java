import java.util.Scanner;

public class LittleElephant {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int index = s.indexOf('0');
        if(index!=-1){
            System.out.println(s.substring(0,index) + s.substring(index+1));
        }else{
            System.out.println(s.substring(0, s.length() - 1));
        }
     }
}