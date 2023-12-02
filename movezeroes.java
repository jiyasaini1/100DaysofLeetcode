import java.util.*;

public class movezeroes {
    public static void zerotolast(int arr[]){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if (arr[i] != 0){
                arr[count++] = arr[i];
            }
        }
            while(count < arr.length){
                arr[count++] = 0;
            
        }


    }
    public static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int arr[] = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        
        zerotolast(arr);
        print(arr);
    }
}
