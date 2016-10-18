/**
 * Will use MatrixRotation to rotate a matrix.
 * @author bhills
 *
 */
public class Runner {
	public static void main(String[] args){
		int[][] mat = new int[][]{{2,5},{3,9}};
		int[][] result;
		MatrixRotation rotateMachine = new MatrixRotation(mat);
		result = rotateMachine.rotateMatrix();
		for(int i=0; i<result.length;i++){
			for(int j=0; j<result.length; j++){
				if (j== result.length-1){
					System.out.println(result[i][j]);
				} else {
					System.out.print(result[i][j] + ",");
				}
			}
		}

	}
}
