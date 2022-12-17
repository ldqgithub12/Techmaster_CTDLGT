public class _342_Power_of_Four {
    public static boolean isPowerOfFour(int n) {
        if (n == 1) return true;
        return fourPower(4,n);
    }
    private static boolean fourPower(long i, int n) {
        if (i>n) return false;
        else{
            if (i==n)
                return true;
        }
        return fourPower(i*4,n);
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfFour(15));
        System.out.println(isPowerOfFour(16));
    }
}
