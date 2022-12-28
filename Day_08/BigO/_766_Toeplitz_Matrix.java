package BigO;

public class _766_Toeplitz_Matrix {
    public static boolean isToeplitzMatrix(int[][] matrix) {
        if(matrix.length == 1) return true;

        for(int i=1;i<matrix.length;i++){ //2n

            for(int j = 1; j<matrix[0].length ; j++){ //2n

                if(matrix[i-1][j-1] != matrix[i][j]){ //
                    return false;                     //4n^2 + C ==> O(n^2)
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,1,2,3},{9,5,1,2}};
        System.out.println(isToeplitzMatrix(matrix));
    }
}
