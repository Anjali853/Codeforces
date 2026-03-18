import java.util.Scanner;

public class Median {
    public static void main(String[] args) {
    
        Scanner sc= new Scanner(System.in);
   
        int n = sc.nextInt();
        int x = sc.nextInt();
        int mid = n/2 + 1;
        int[]arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        } 
        if(mid==0){
            System.out.println(arr[0]);
        }
        else if(mid==n-1){
            System.out.println(arr[n-1]);
        }
        else{
            System.out.println(arr[mid]);
        }
        System.out.println();
    }
}