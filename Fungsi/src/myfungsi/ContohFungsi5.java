package myfungsi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ContohFungsi5 {

	/**
	 * @param args
	 * @throws Exception 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, Exception {
		BufferedReader datain = new BufferedReader(new InputStreamReader(System.in));
		double a,b,c;
		
		System.out.print("Input Nilai Pertama : ");
		a = Double.parseDouble(datain.readLine());
		System.out.print("Input Nilai Kedua : ");
		b = Double.parseDouble(datain.readLine());
		
		c = Tambah(a,b);
		System.out.print("Hasil "+a+" + "+b+" = "+c);
	}

	private static double Tambah(double a, double b) {
		double c;
		c = a + b;
		return c;
	}

}
