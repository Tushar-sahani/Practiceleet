// link - https://leetcode.com/problems/transpose-matrix/
package Java.Practiceleet;
public class transpose {
    public int[][] transposemat(int[][] matrix) {
        int[][] arr = new int[matrix[0].length][matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                arr[j][i] = matrix[i][j];
            }
        }
        return arr;
    }
}