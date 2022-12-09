import java.util.Arrays;

public class _2469_Convert_the_Temperature {
    public static double[] convertTemperature(double celsius) {
        double[] result = new double[2];
        result[0] = celsius + 273.15;
        result[1] = (celsius*1.80)+32.00;
        return result;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(convertTemperature(36.5)));
    }
}
