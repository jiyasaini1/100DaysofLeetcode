import java.util.*;

public class gcd {
    public static int find(int a, int b){

        int result = Math.min(a,b);
        while(result > 0){

        if(a % result == 0 && b % result == 0){
            break;
        }
        result--;

    }
    return result;
}
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(find(a , b));
    }
    
}
