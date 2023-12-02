import java.util.*;

public class commomdivisor {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        int y= sc.nextInt();
        int gcd = 1;
        for(int i=0; i<=x && i>=y; i++){
            if (x%i==0 && y%i==0){
                gcd = i;
            }
            System.out.println("gdc of x and y is :" +i);
        }

    }
}
