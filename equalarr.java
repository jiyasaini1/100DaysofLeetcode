import java.util.*;

public class equalarr {
public static boolean isequal(int arr1[], int arr2[]){
       int n = arr1.length;
       int m = arr2.length;

       if(m != n){
        return false;
       }

       Arrays.sort(arr1);
       Arrays.sort(arr2);

       for(int i=0; i<n; i++){
        if(arr1[i] != arr2[i]){
            return false;
        }
       }
       return true;
}
    public static void main(String args[]){
    int arr1[] = {1,2,3,4,5};
    int arr2[] = {5,3,2,4,1};
    System.out.println(isequal(arr1, arr2));

    }
}
