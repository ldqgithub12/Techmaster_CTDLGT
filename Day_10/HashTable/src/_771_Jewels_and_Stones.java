import java.util.HashMap;

public class _771_Jewels_and_Stones {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        //ham getOrDefault la lay value cua key duoc truyen vao, neu key do khong co thi truyen vao gia tri default do minh set
        for(char c : stones.toCharArray())
            hashMap.put(c,hashMap.getOrDefault(c,0)+1);
        int res=0;
        for(char c : jewels.toCharArray())
            res+=hashMap.getOrDefault(c,0);
        return res;
    }
}
