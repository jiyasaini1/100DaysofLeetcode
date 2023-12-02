import java.util.*;

public class binarysearch {
    public static int binary(int arr[], int n, int target){
    int start =0; 
    int end = n-1;
    while(start<=end){
        int mid = (start + (end-start) )/ 2;
        if(arr[mid] == target){
            return mid;
        }
        else if(target > arr[mid]){
           start = mid+1;
        }
        else{
            end = mid -1;
        }

    }
    return -1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0 ; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int result = binary(arr, n, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
