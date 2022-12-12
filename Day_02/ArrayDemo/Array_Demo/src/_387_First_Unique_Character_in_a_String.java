package PACKAGE_NAME;

import java.util.Arrays;
import java.util.stream.IntStream;

public class _387_First_Unique_Character_in_a_String {
    //Cach 1:
//    public static int firstUniqChar(String s){
//        char[] chars = s.toCharArray();
//        int[] counts = new int[chars.length];
//        for (int i = 0;i<chars.length;i++){
//            int count = 0;
//            for (int j = 0;j<chars.length;j++){
//                if (chars[i] == chars[j]){
//                    count++;
//                }
//            }
//            counts[i] = count;
//        }
//        for (int i = 0; i < counts.length; i++) {
//            if (counts[i] == 1){
//                return i;
//            }
//        }
//       return -1;
//    }
    //Cach 2:
    public static int firstUniqChar2(String s){
        int[] list_Char = new int[150];
        for (int i = 0; i < s.length(); i++){
            int j = (int)s.charAt(i);
            list_Char[j]++;
        }
        for (int i = 0; i < s.length(); i++){
            int j = (int)s.charAt(i);
            if (list_Char[j] == 1){
                return i;
            }
        }
       return -1;
    }
    public static void main(String[] args) {
//        System.out.println(firstUniqChar("aabb"));
        System.out.println(firstUniqChar2("loveleetcode"));
    }
}
