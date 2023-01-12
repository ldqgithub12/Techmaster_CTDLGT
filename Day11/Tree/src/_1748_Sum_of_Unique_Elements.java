import java.util.HashMap;

public class _1748_Sum_of_Unique_Elements {
    public static int sumOfUnique(int[] nums) {
        int sum = 0;
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        // Thêm lần lượt từng phần tử của mảng vào trong hashmap voi key là num[i] và value là 1;
        //Kiểm tra xem đã contain cái key đó chua nếu rồi thì tăng value tại num[i] +1;
        //Chạy vòng for kiểm tra xem tại phần tử đó kiểm tra key đó xem trong hashmap value là 1 hay >1
        //Nếu là 1 thì nó là duy nhất và += sum
        //Độ phức tạp là O(2n)
        for (int i=0;i<nums.length;i++){
            if (hashMap.containsKey(nums[i])){
                hashMap.put(nums[i],hashMap.get(nums[i])+1);
            }
            else hashMap.put(nums[i],1);
        }
        for (int i =0;i< nums.length;i++){
            if (hashMap.get(nums[i]) == 1){
                sum += nums[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,1};
        System.out.println(sumOfUnique(nums));
    }
}
