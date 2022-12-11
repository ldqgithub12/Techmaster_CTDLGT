import java.util.Arrays;
import java.util.stream.IntStream;

public class D2_Array {
    public static void main(String[] args) {
        int[] a = IntStream.range(0,10).toArray();
        System.out.println(Arrays.toString(a));
    }
}
