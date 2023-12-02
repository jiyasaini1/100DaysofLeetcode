import java.util.*;

public class largestsubarrsum {
    public static int sumzero(int arr[]){
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum=0;
        int len =0;

        for(int j=0; j<arr.length; j++){
            sum +=arr[j];
            if(map.containsKey(sum)){
                len = Math.max(len, j-map.get(sum));
            }
            else{
                map.put(sum, j);
            }
        }
        return len;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(sumzero(arr));
    }
}
