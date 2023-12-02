import java.util.*;

public class reverse {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements to be added in an array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int start =0;
        int end = n-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        for(int i=0; i<n; i++){
        System.out.print(arr[i] + " ");
    }
}
}
