import java.util.*;

public class mergesort {
    public static void merge(int arr[], int si, int ei) {
         if(si >= ei){
           return;
       }
        int mid = si + (ei - si) / 2;
        merge(arr, si, mid);
        merge(arr, mid+1, ei);
        sort(arr, mid, si, ei);
         }

    public static void sort(int arr[], int mid, int si, int ei) {
        int temp[] = new int[ei - si + 1];
        
        int i = si;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k]; // Copy from temp to the original array
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        merge(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
