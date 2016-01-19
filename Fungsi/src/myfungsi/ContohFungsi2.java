package myfungsi;

import java.util.Scanner;

public class ContohFungsi2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a,b;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input Nilai Pertama : ");
		a = scan.nextInt();
		System.out.print("Input Nilai Kedua : ");
		b = scan.nextInt();
		
		Tambah(a,b);

	}

	private static void Tambah(int a, int b) {
		int c;
		c = a + b;
		System.out.print("Hasil "+a+" + "+b+" = "+c);
	}

}
