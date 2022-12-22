import java.util.Arrays;

public class _2418_Sort_the_People {
    public static String[] sortPeople(String[] names, int[] heights) {
        quickSort(names,heights,0,heights.length-1);
        return names;
    }
    public static void quickSort(String[] name, int[] heights, int left, int right){
        if (left>=right){
            return;
        }
        else {
            int key = heights[(left+right)/2];
            int i = left;
            int j = right;
            while (i<j){
                while (heights[i]>key) i++;
                while (heights[j] < key)j--;
                if (i<=j){
                    int temp = heights[i];
                    heights[i] = heights[j];
                    heights[j] = temp;

                    String tempname = name[i];
                    name[i] = name[j];
                    name[j] = tempname;
                    i++;
                    j--;
                }
            }
            quickSort(name,heights,left,j);
            quickSort(name, heights, i, right);
        }
    }
    public static void main(String[] args) {
        String[] names = {"Mary","John","Emma"};
        int[] heights = {180,165,170};
        System.out.println(Arrays.toString(sortPeople(names,heights)));
    }
}
