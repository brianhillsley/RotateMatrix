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
	}
}
