import java.util.*;

public class Solution {

	static void printSpiral(int[][] matrix) {
		List<Integer> list = new LinkedList<>();
		
		int rowStart = 0;
		int rowEnd = matrix.length - 1;
		int colStart = 0;
		int colEnd = matrix[0].length - 1;
		
		while (colStart <= colEnd && rowStart <= rowEnd) {
			for (int i = colStart; i <= colEnd; i++) {
				list.add(matrix[rowStart][i]);
			}
			
			rowStart++;
			for (int i = rowStart; i <= rowEnd; i++) {
				list.add(matrix[i][colEnd]);
			}

			colEnd--;
			for (int i = colEnd; i >= colStart; i--) {
				list.add(matrix[rowEnd][i]);
			}
			
			rowEnd--;
			for (int i = rowEnd; i >= rowStart; i--) {
				list.add(matrix[i][colStart]);
			}
			
			colStart++;
		}

	}

	
	public static void main(String[] args) {
		int[][] matrix = {
				{1, 2, 3}, 
				{6, 9, 8}, 
				{7, 4, 5}
				};
		printSpiral(matrix);
	}
}