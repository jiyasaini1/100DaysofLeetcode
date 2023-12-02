// longest substring without repeating character
import java.util.*;

public class longsub {
    public static void longestsubstring(String str){
    int l = 0, r= 0;
    Hashset<Character> ch = new Hashset<>();
    int maxstr = 0;
    int maxl =0, maxr =0;
    // while(r<str.length()){
    //     if(!ch.contains(str.charAt(r))){

    //     }
    // }
    for(int i=0; i<str.length(); i++){
        while(!ch.add(str[i])){
        ch.remove(str[i]);
        l++;
        }
        int max = Math.max(max,i=l+1);
    }
    }
    public static void main(String args[]){
    String str = "Jiiiyyyaaaaa";
    longestsubstring(str);
    }
}


//longest substring with k unique charcters
//longert subset with atleast k unique charcters
//longest substring with atmost k unique charcters

// import java.util.HashSet;
 
// public class Main {
//   public static void printLongestSubstring(String s)
//   {
//     int n = s.length();
//     int l = 0, r = 0;
//     HashSet<Character> visited = new HashSet<>();
//     int maxStr = 0;
//     int maxL = 0, maxR = 0;
//     while (r < n) {
//       if (!visited.contains(s.charAt(r))) {
//         visited.add(s.charAt(r));
//         if (r - l + 1 > maxStr) {
//           maxStr = r - l + 1;
//           maxL = l;
//           maxR = r;
//         }
//         r++;
//       }
//       else {
//         visited.remove(s.charAt(l));
//         l++;
//       }
//     }
//     for (int i = maxL; i <= maxR; i++) {
//       System.out.print(s.charAt(i));
//     }
//     System.out.println();
//   }
 
//   public static void main(String[] args)
//   {
//     String str = "GEEKSFORGEEKS";
//     printLongestSubstring(str);
//   }
// }