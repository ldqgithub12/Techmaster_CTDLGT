public class Sqrtx {
    public static int mySqrt(int x){
        int result = 1;
        int left = 1;
        int right = x;
        while (left<right){
            int mid = (left+right)/2;
            if (mid > x/mid){
                right = mid;
            }
            else {
                result = mid;
                left = mid+1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(mySqrt(8));
    }
}
