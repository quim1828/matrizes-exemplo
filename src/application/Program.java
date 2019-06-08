package application;

import java.util.Random;

//import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Random random = new Random();
		
		double[][] mat = new double[3][3];
		
		for ( int i = 0; i < mat.length; i++) {
			for ( int j = 0; j < mat[i].length; j++ ) {
				mat[i][j] = random.nextInt(10);
			}
		}
		System.out.println("       Matriz");
		System.out.println();
		for ( int i = 0; i < mat.length; i++) {
			for ( int j = 0; j < mat[i].length; j++ ) {
				if ( j == mat[i].length-1 ) {
				System.out.print(mat[i][j]);
				}
				else {
					System.out.print(mat[i][j] + " - ");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		double maior = Double.MIN_VALUE;
		
		for ( int i = 0; i < mat.length; i++) {
			for ( int j = 0; j < mat[i].length; j++ ) {
				if ( mat[i][j] > maior ) {
					maior = mat[i][j];
				}
			}
		}
		System.out.println("Maior valor = " + maior);
	}
}
