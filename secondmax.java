import java.util.*;
public class secondmax {
    public static void second(int arr[]){
        int max = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                secondmax = max;
                max = arr[i];
            }
            else if(arr[i] > secondmax && arr[i] != max){
                secondmax = arr[i];
            }

        }
        System.out.println("Secondmax element in the array is : " + secondmax);
    }
   public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
    }
    second(arr);
   }
}
