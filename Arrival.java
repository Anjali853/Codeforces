// import java.util.*;

// public class Arrival {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int[] arr = new int[n];


//         for(int i = 0; i < n; i++){
//             arr[i] = sc.nextInt();
//         }
//         for(int i = 1; i < n; i++){
//             arr[i] = arr[i] + arr[i-1];
//         }

//         int m = sc.nextInt();

//         for(int i = 0; i < m; i++){
//             int q = sc.nextInt();

//             for(int j = 0; j < n; j++){
//                 if(arr[j] >= q){
//                     System.out.println(j + 1);
//                     break;
//                 }
//             }
//         }
//     }
// }