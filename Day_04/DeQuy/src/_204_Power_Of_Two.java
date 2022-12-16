public class _204_Power_Of_Two {
    public static boolean isPowerOfTwo(int n) {
        if (n == 1) return true;
        else return twoPower(2,n);
    }

    private static boolean twoPower(int i, int n) {
        if (i>n) return false;
        else{
            if (i==n)
                return true;
        }
        return twoPower(i*2,n);
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(15));
        System.out.println(isPowerOfTwo(16));
    }
}
