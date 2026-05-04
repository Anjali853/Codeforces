import java.util.Scanner;

public class Littlegrl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] freq = new int[26];
        for(char c: s.toCharArray()){
            freq[c-'a']++;
        }
        int oddCount = 0;
        for(int count: freq){
            if(count % 2 != 0){
                oddCount++;
            }
        }
       if(oddCount == 0 || oddCount % 2 == 1){
           System.out.println("First");
        } else {
          System.out.println("Second");
}

    }
    
}
