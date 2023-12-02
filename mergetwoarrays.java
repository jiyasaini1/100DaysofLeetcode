import java.util.*;

public class mergetwoarrays {
    public static void merge(int arr1[], int arr2[], int arr3[]){;
    int i=0, j=0, k=0;
    while(i<arr1.length && j<arr2.length){
        if(arr1[i] < arr2[j]){
            arr3[k++] = arr1[i++];
        }
        else{
            arr3[k++] = arr2[j++];
        }

    }
    while(i<arr1.length){
        arr3[k++] = arr1[i++];
    }

    while(j<arr2.length){
        arr3[k++] = arr2[j++];
    }
}
    
    public static void main(String args[]){
        int arr1[] = {3, 7, 9, 14, 19};
        int arr2[] = {-5, -2, 0, 2, 4, 8, 29, 30};
        int arr3[] = new int[13];
        merge(arr1, arr2, arr3);

        for(int i=0; i<arr3.length; i++){
            System.out.print(arr3[i]+ " ");
        }

    }
}
