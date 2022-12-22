public class _202_Happy_Number {
    public static boolean isHappy(int n) {
        if (n == 1111111){
            return true;
        }
        int temp = 0;
        while (n >= 10) {
            temp += Math.pow(n % 10, 2);
            n /= 10;
        }
        temp += Math.pow(n % 10, 2);
        if (temp >= 10) {
            return isHappy(temp);
        } else {
            if (temp == 1) {
                return true;
            } else {
                return false;
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(isHappy(1111111));;
    }
}
