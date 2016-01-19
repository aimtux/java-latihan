package myfungsi;

import java.io.IOException;
import java.util.Scanner;

public class ContohFungsi4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double a,b,c;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input Nilai Pertama : ");
		a = scan.nextDouble();
		System.out.print("Input Nilai Kedua : ");
		b = scan.nextDouble();
		
		c = Tambah(a,b);
		System.out.print("Hasil "+a+" + "+b+" = "+c);


	}

	private static double Tambah(double a, double b) {
		double c;
		c = a + b;
		return c;
	}

}
