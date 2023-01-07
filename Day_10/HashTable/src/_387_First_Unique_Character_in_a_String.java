import java.util.HashMap;

public class _387_First_Unique_Character_in_a_String {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> hashMap = new HashMap<>();
        char[] chars = s.toCharArray();
        for (int i =0;i<chars.length;i++){
            hashMap.put(chars[i], hashMap.getOrDefault(chars[i],0)+1);
        }
        for (int i = 0;i<chars.length;i++){
            if (hashMap.get(chars[i]) == 1){
                return i;
            }
        }
        return -1;
    }

}
