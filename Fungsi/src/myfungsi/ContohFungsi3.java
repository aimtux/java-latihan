package myfungsi;

import java.util.Scanner;

public class ContohFungsi3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a,b,c;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input Nilai Pertama : ");
		a = scan.nextInt();
		System.out.print("Input Nilai Kedua : ");
		b = scan.nextInt();
		
		c = Tambah(a,b);
		System.out.print("Hasil "+a+" + "+b+" = "+c);

	}

	private static int Tambah(int a, int b) {
		int c;
		c = a + b;
		return c;
	}

}
