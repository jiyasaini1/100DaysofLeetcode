import java.util.*;

public class anagram {
    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str1.length(); i++) {
            char ch1 = str1.charAt(i);
            map.put(ch1, map.getOrDefault(ch1, 0) + 1);
        }

        for (int j = 0; j < str2.length(); j++) {
            char ch2 = str2.charAt(j);

            if (map.containsKey(ch2)) {
                if (map.get(ch2) == 1) {
                    map.remove(ch2);
                } else {
                    map.put(ch2, map.get(ch2) - 1);
                }
            } 
            else {
                return false;
            }
        }

        return map.isEmpty();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(isAnagram(str1, str2));
    }
}
