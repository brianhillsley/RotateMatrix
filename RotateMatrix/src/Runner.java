/**
 * Will use MatrixRotation to rotate a matrix.
 * @author bhills
 *
 */
public class Runner {
	public static void main(String[] args){
//		int[][] mat = new int[][]{{2,5},{3,9}};
		int[][] mat = new int[][]{{11,12,13,14, 15}, {21,22, 23, 24, 25}, {31, 32, 33, 34, 35}, {41, 42, 43, 44, 45}, {51, 52, 53, 54, 55}};
		int[][] result;
		MatrixRotation rotateMachine = new MatrixRotation(mat);
		result = rotateMachine.rotateMatrix();
		for(int i=0; i<result.length;i++){
			for(int j=0; j<result.length; j++){
				if (j == result.length-1){
					System.out.println(result[i][j]);
				} else {
					System.out.print(result[i][j] + ",");
				}
			}
		}
	}
	
	public static void printArr(int[] arr){
		for(int i=0; i< arr.length; i++){
			System.out.print(arr[i]+ ",");
		}
	}
	
	public static void printArr2D(int[][] arr){
		for(int i=0; i< arr.length; i++){
			for(int j=0; j < arr[0].length; j++){
				System.out.print(arr[i][j]+ ",");
			}
			System.out.println();
		}
	}
}
