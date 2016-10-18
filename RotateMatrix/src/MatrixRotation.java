import java.lang.reflect.Array;


public class MatrixRotation {
	int[][] mat;
	/**
	 * The passed in matrix must be square,  NxN in size (N rows, N columns)
	 * @param matrix
	 */
	MatrixRotation(int[][] matrix){
		mat = matrix;
	}
	public int[][] rotateMatrix(){
		if(mat==null && (mat.length <= 0)){
			return null;
		}
		int matSize = mat.length;
		
		for(int layer_i=0; layer_i<Math.floor(matSize/2); layer_i++){
			rotateLayer(layer_i, matSize);
		}
		return mat;
	}
	
	public void rotateLayer(int layer, int matrixSize){
		int val = matrixSize-(layer*2);
		int[] top = new int[val];
		int[] left = new int[val];
		int[] right = new int[val];
		int[] bottom = new int[val];
		
		int maxIndex = matrixSize-1-layer;
		
		int x=0, y=0;
		for (x=0; x<maxIndex-1;x++){
			top[x]=mat[y][x];
		}
		
		x=maxIndex;
		for (y=0; y<maxIndex-1;y++){
			right[x]=mat[y][x];
		}
		
		y=maxIndex;
		for(x=maxIndex;x>0;x--){
			bottom[maxIndex-x] = mat[y][x];
		}
		
		x=0;
		for(y=maxIndex;y>0;y--){
			left[maxIndex-y]=mat[y][x];
		}
		
		int[] temp = new int[val];
		arrayCopy(right, temp);
		
		arrayCopy(top, right); // right = top
		arrayCopy(left, top); // top = left
		arrayCopy(bottom, left); // left = bottom
		arrayCopy(temp, bottom); // bottom = temp
		
	}
	public void arrayCopy(int[] src, int[] dest){
		System.arraycopy( src, 0, dest, 0, src.length );
	}
}
