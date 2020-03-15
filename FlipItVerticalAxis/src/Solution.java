
public class Solution {

	public static void main(String[] args) {
		int[][] matrix = {{1,0,0},{0,0,1}};
		
		flipItVerticalAxis(matrix);
		print(matrix);

	}
	
	private static void print(int[][] matrix) {
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[i].length; j++){
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
		
	}

	public static void flipItVerticalAxis(int[][] matrix) {
	    
		if(matrix == null || matrix[0].length == 0 || matrix.length == 0){
			return;
		}
		
		int start = 0, end = matrix[0].length-1, temp = 0;
		
		while(start < end){
			for(int i = 0; i < matrix.length; i++){
				temp = matrix[i][start];
				matrix[i][start] = matrix[i][end] ;
				matrix[i][end] = temp;
			}
			start++;
			end--;
		}
		
		
		
	}

}
