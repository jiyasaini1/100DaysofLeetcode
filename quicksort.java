import java.util.*;

public class quicksort {
    public static void quick(int arr[], int si, int ei){
        if(si >= ei){
            return;
        }

        int pid = partition(arr, si, ei);
        quick(arr, si, pid-1);
        quick(arr, pid+1, ei);


    }
    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si-1;

        for(int j=si; j<ei; j++){
            if(arr[j] <= pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;  
        arr[ei] = arr[i];  //variable change donot reflect in function (call by reference)
        arr[i] = temp;
        return i;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        quick(arr, 0, arr.length-1);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
