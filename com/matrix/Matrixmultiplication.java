package com.matrix;

public class Matrixmultiplication {
	 public static void main(String[] args) {
	        int[][] mat1 = {
	                {1, 2, 3},
	                {4, 5, 6},
	                {7, 8, 9},
	        };
	        int[][] mat2 = {
	                {10,11,12},
	                {13,14,15},
	                {16,17,18},
	        };
	        int rowsA = mat1.length;
	        int rowsB = mat2.length;

	        int colA = mat1[0].length;
	        int colB = mat2[0].length;

	        int[][] mat3 = new int[rowsA][colA];
	        for(int i=0;i<rowsA;i++){
	            for(int j=0;j<colA;j++){
	                for(int k=0;k<rowsB;k++){
	                mat3[i][j] += mat1[i][k] * mat2[k][j];
	                }
	            }
	        }
	        for(int i=0;i<rowsA;i++){
	            for(int j=0;j<colB;j++){
	                System.out.print(mat3[i][j]+ " ");
	            }
	            System.out.println();
	        }
	    }
}
