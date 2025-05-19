package Assignment8;

public class Q4 {
	    
	    static class MatrixMultiplicationThread extends Thread {
	        private int[][] matrixA;
	        private int[][] matrixB;
	        private int[][] result;
	        private int rowIndex;

	       
	        public MatrixMultiplicationThread(int[][] matrixA, int[][] matrixB, int[][] result, int rowIndex) {
	            this.matrixA = matrixA;
	            this.matrixB = matrixB;
	            this.result = result;
	            this.rowIndex = rowIndex;
	        }

	        
	        public void run() {
	            for (int j = 0; j < matrixB[0].length; j++) {
	                result[rowIndex][j] = 0;
	                for (int k = 0; k < matrixB.length; k++) {
	                    result[rowIndex][j] += matrixA[rowIndex][k] * matrixB[k][j];
	                }
	            }
	        }
	    }

	    
	    public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
	        int rowsA = matrixA.length;
	        int colsA = matrixA[0].length;
	        int rowsB = matrixB.length;
	        int colsB = matrixB[0].length;

	       
	        if (colsA != rowsB) {
	            throw new IllegalArgumentException("Matrix dimensions do not match for multiplication.");
	        }

	        
	        int[][] result = new int[rowsA][colsB];

	        
	        Thread[] threads = new Thread[rowsA];

	        for (int i = 0; i < rowsA; i++) {
	            threads[i] = new MatrixMultiplicationThread(matrixA, matrixB, result, i);
	            threads[i].start();
	        }

	      
	        for (int i = 0; i < rowsA; i++) {
	            try {
	                threads[i].join();
	            } catch (InterruptedException e) {
	               System.out.println(e.getMessage());
	            }
	        }

	        return result;
	    }

	    
	    public static void printMatrix(int[][] matrix) {
	        for (int i = 0; i < matrix.length; i++) {
	            for (int j = 0; j < matrix[i].length; j++) {
	                System.out.print(matrix[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }

	   
	    public static void main(String[] args) {
	      
	        int[][] matrixA = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };

	        int[][] matrixB = {
	            {9, 8, 7},
	            {6, 5, 4},
	            {3, 2, 1}
	        };

	     
	        int[][] result = multiplyMatrices(matrixA, matrixB);

	       
	        System.out.println("Resultant Matrix:");
	        printMatrix(result);
	    }
}

//Output
//Resultant Matrix:
//30 24 18 
//84 69 54 
//138 114 90 

