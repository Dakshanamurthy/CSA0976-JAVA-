import java.io.*;
class GFG {
	static void printMatrix(int M[][],int rowSize,int colSize)
	{
		for (int i = 0; i < rowSize; i++) {
			for (int j = 0; j < colSize; j++)
				System.out.print(M[i][j] + " ");

			System.out.println();
		}
	}
	static void multiplyMatrix(
		int row1, int col1, int A[][],
		int row2, int col2, int B[][])
	{
		int i, j, k;
		System.out.println("\nMatrix A:");
		printMatrix(A, row1, col1);
		System.out.println("\nMatrix B:");
		printMatrix(B, row2, col2);
		if (row2 != col1) {
			System.out.println("\nMultiplication Not Possible");
			return;
		}
		int C[][] = new int[row1][col2];
		for (i = 0; i < row1; i++) {
			for (j = 0; j < col2; j++) {
				for (k = 0; k < row2; k++)
					C[i][j] += A[i][k] * B[k][j];
			}
		}
		System.out.println("\nResultant Matrix:");
		printMatrix(C, row1, col2);
	}
	public static void main(String[] args)
	{

		int row1 = 2, col1 = 2, row2 = 2, col2 = 2;

		int A[][] = { { 1 , 2},
				{5,3} };

		int B[][] = { {2, 3},
				{4,1} };

		multiplyMatrix(row1, col1, A,row2, col2, B);
	}
}
