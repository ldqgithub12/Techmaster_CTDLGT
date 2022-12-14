import java.util.Arrays;

public class _1051_Height_Checker {
    public static int heightChecker(int[] heights) {
        int[] copy = Arrays.copyOfRange(heights,0,heights.length);
        int n = heights.length;
        int count = 0;
        for (int i=0;i<n;i++){
            int maxIndex = 0;
            for (int j=0;j<n-i;j++){
                if (heights[maxIndex] < heights[j]){
                    maxIndex = j;
                }
            }
            int temp = heights[maxIndex];
            heights[maxIndex] = heights[n-i-1];
            heights[n-i-1] = temp;
        }
        for (int i = 0;i<n;i++){
            if (heights[i] != copy[i]){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] heights = {1,1,4,2,1,3};
        System.out.println(heightChecker(heights));
    }
}
