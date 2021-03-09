
package ewu.cse;
public class Matrix {
    private int row;
    private int col;
    private int [][]array;
    public Matrix(int row, int col, int[][] array) {
        this.row = row;
        this.col = col;
        this.array = array;
    }
    public Matrix add(Matrix b) {
        Matrix result = new Matrix(row, col, array);
        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                result.array[i][j]=array[i][j]+b.array[i][j];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int row =2,col=2;
        int array1[][] = {{1,2},{3,4}};
        int array2[][] = {{4,5},{2,6}}; 
        Matrix matrixA = new Matrix(row, col, array1);
        Matrix matrixB = new Matrix(row, col, array2);
        Matrix result = matrixA.add(matrixB);
        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                System.out.print(result.array[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
