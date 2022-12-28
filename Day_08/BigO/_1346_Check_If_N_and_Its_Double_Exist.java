package BigO;

public class _1346_Check_If_N_and_Its_Double_Exist {
    public static boolean checkIfExist(int[] arr) {
        for (int i =0;i< arr.length;i++){ //2n
            for (int j = 0;j< arr.length;j++) //2n
            {
                if ((double)arr[i]/2 == arr[j] && i !=j){ // + C ==> 4n^2+C ==> O(n^2)
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {3,1,7,11};
        System.out.println(checkIfExist(arr));
    }
}
