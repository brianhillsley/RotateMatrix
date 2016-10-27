/**
 * Matrix class
 * @author Brian Hillsley
 *
 */
public class SquareMatrix {
	
	int[][] mat;
	int size;
	/**
	 * 
	 * @param size
	 * @param entries Array of integers that will be placed in the top row until it is full, and then the next row until it is full, ect.
	 * For example: if entries is {1,2,3,4,5,6,7,8,9,10} and size is 3 then the resulting matrix will be:<br>
	 * <pre>1  2  3
	 *      4  5  6
	 *      7  8  9
	 * </pre>
	 * <br> The value 10 will be ignored.
	 * 
	 * If size indicates the square matrix [size x size] is larger than the number of entries, then zeros will fill the remaining cells.
	 * 
	 */
	public SquareMatrix(int size, int[] entries){
		mat = new int[][]{};
		this.size = size;
	}
	/**
	 * Precondition: mat must be square, aka N x N where N is some positive integer
	 * @param mat the matrix this class will represent
	 */
	public SquareMatrix(int[][] mat){
		this.mat = mat;
	}
	
	
	/**
	 * Overrided toString prints the matrix out in a format that is easy on the eyes
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<size;i++){
			for(int j=0; j<size; j++){
				if (j==size-1){
					sb.append("" + mat[i][j] + "\n");
				} else {
					sb.append("" + mat[i][j] + ", ");
				}
			}
		}
		return sb.toString();
	}
}
