public class _326_Power_of_Three {
    public static boolean threePower(int i,int n){
        if (i>n) return false;
        else {
            if (i==n)
                return true;
        }
        return threePower(i*3,n);
    }
    public static boolean isPowerOfThree(int n) {
        if(n == 1) return true;
        else return threePower(3,n);
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(-9));
        System.out.println(isPowerOfThree(9));
    }
}
