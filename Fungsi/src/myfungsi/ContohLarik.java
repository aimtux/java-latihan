package myfungsi;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ContohLarik {
	/**
	 * @param args
	 */
	public static void main(String[] args) throws NumberFormatException, Exception {
		BufferedReader datain = new BufferedReader(new InputStreamReader(System.in));
		int i,xcari;
		int nilai[] = new int[10];
		
		//Input Data
		for (i=0;i<10;i++) {
			System.out.print("Input Nilai Ke "+(i+1)+" : ");
			nilai[i] = Integer.parseInt(datain.readLine()); 
		}	
		//Menampilkan Data
		System.out.println("\nTampil Data di Array");
		System.out.println("=====================");
		for (i=0;i<10;i++) {
			System.out.println("Nilai Ke "+(i+1)+" : "+nilai[i]);
		}
		//?Mencari Data di Array
		System.out.println("\nMencari Data di Array");
		System.out.println("=====================");
		System.out.print("Nilai yang dicari : ");
		xcari = Integer.parseInt(datain.readLine());
		
		for (i=0;i<10;i++) {
			if (xcari == nilai[i]) {
				System.out.println("Data di Temukan");
			}
		}
	}
}