package myfungsi;

import java.util.Scanner;

public class ContohFungsi1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Tambah();

	}

	private static void Tambah() {
		int a,b,c;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input Nilai Pertama : ");
		a = scan.nextInt();
		System.out.print("Input Nilai Kedua : ");
		b = scan.nextInt();
		c = a + b;
		System.out.print("Hasil "+a+" + "+b+" = "+c);
	}

}
