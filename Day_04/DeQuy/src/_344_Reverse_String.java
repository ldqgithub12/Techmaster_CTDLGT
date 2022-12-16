import java.util.Arrays;

public class _344_Reverse_String {

    public static void reverse(char[] s,int i,int n){
        if (i>=n){
            return;
        }
        else {
            char temp = s[i];
            s[i] = s[n];
            s[n] = temp;
            reverse(s,i+1,n-1);
        }
    }
    public static void reverseString(char[] s) {
       reverse(s,0,s.length-1);
       System.out.println(Arrays.toString(s));
    }
    public static void main(String[] args) {
        char[] s = {'h','e','l','k','m','n','o'};
        reverseString(s);
    }
}
