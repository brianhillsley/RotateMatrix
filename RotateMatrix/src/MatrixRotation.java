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
		
		p("current matrixSize: " + matrixSize);
		
		int[] temp = new int[val-1];
		
		int maxIndex = matrixSize-1-layer;
		int minIndex = layer;
		
		p("maxIndex:" + maxIndex);
		p("minIndex:" + minIndex);
		
		int x=minIndex, y=minIndex;
		for (x=minIndex; x<maxIndex;x++){
			temp[x-minIndex]=mat[y][x];
			// Copy top to temp
			
		}
		
		for(int i=0; i<mat.length;i++){
			for(int j=0; j<mat.length; j++){
				if (j == mat.length-1){
					System.out.println(mat[i][j]);
				} else {
					System.out.print(mat[i][j] + ",");
				}
			}
		}
		p("B");
		x=maxIndex;
		for (y=minIndex; y<maxIndex;y++){
			//right[y]=mat[y][x];
			// Copy right side to top side
			mat[minIndex][y] = mat[y][x];
			
		}
		
		for(int i=0; i<mat.length;i++){
			for(int j=0; j<mat.length; j++){
				if (j == mat.length-1){
					System.out.println(mat[i][j]);
				} else {
					System.out.print(mat[i][j] + ",");
				}
			}
		}
		p("A");
		
		y=maxIndex;
		for(x=maxIndex;x>minIndex;x--){
			//bottom[maxIndex-x] = mat[y][x];
			// Copy bottom side to right side
			mat[minIndex+maxIndex-x][y] = mat[y][x];
		}
		
		for(int i=0; i<mat.length;i++){
			for(int j=0; j<mat.length; j++){
				if (j == mat.length-1){
					System.out.println(mat[i][j]);
				} else {
					System.out.print(mat[i][j] + ",");
				}
			}
		}
		p("C");
		x=minIndex;
		for(y=maxIndex;y>minIndex;y--){
			//left[maxIndex-y]=mat[y][x];
			// Copy left side to bottom side
			mat[maxIndex][y] = mat[y][x];
		}
		
		for(int i=0; i<mat.length;i++){
			for(int j=0; j<mat.length; j++){
				if (j == mat.length-1){
					System.out.println(mat[i][j]);
				} else {
					System.out.print(mat[i][j] + ",");
				}
			}
		}
		p("D");
		
		for (int i=0;i<temp.length;i++){
			mat[maxIndex-i][minIndex] = temp[i];
		}
		
		for(int i=0; i<mat.length;i++){
			for(int j=0; j<mat.length; j++){
				if (j == mat.length-1){
					System.out.println(mat[i][j]);
				} else {
					System.out.print(mat[i][j] + ",");
				}
			}
		}
		
		p("E");
		
	}
	public void arrayCopy(int[] src, int[] dest){
		System.out.println("----------------");
		System.out.println("src before copy: ");
		pArray(src);
		System.out.println("dest before copy: ");
		pArray(dest);
		System.arraycopy( src, 0, dest, 0, src.length );
		System.out.println("src after copy: ");
		pArray(src);
		System.out.println("dest after copy: ");
		pArray(dest);
		p("");
	}
	// Helper function
	public void pArray(int[] arr){
		int[] result = arr;
		for(int i=0; i<result.length; i++){
			int num = result[i];
			if (i == result.length-1){
				System.out.println(num + "]");
			} else if(i == 0){
				System.out.print("["+num + ", ");
			} else {
				System.out.print(num + ", ");
			}
		}
	}
	// Helper function
	public void p(Object o){
		System.out.println(o);
	}
}
