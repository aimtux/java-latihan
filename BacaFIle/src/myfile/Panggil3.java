package myfile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Panggil3 {

	/**
	 * @param args
	 */
	private static BufferedReader datain = new BufferedReader(new InputStreamReader(System.in));
	static String Nim, Nama, Prodi;
	static String namaFile = "Simak.txt";

	public static void main(String[] args) throws Exception, IOException {
		int pil; 
		
		
		do {
		// Menu Utama
		System.out.println(" \n Baca & Tulis ");
		System.out.println("------------------");
		System.out.println("1. Tulis");
		System.out.println("2. Baca");
		System.out.println("0. Keluar Program");
		System.out.print("Pilihan Anda : ");
		pil = Integer.parseInt(datain.readLine());
		
		switch(pil) {
			case 0 : System.exit(0);
			case 1 : Tulis();
			case 2 : Baca();
		}
		} while (pil != 0);
	
	}
	
	static void Tulis() throws Exception {
		System.out.println("Input Ke File");
		System.out.print("Nim Mahasiswa : ");
		Nim = datain.readLine();
		BacaTulisFile.tulisFile("Nim	: "+Nim, namaFile);
		
		System.out.print("Nama Mahasiswa : ");
		Nama = datain.readLine();
		BacaTulisFile.tulisFile("Nama	: "+Nama, namaFile);
		
		System.out.print("Prodi : ");
		Prodi = datain.readLine();
		BacaTulisFile.tulisFile("Prodi	: "+Prodi, namaFile);
	}
	
	static void Baca() throws Exception {
		System.out.println("Daftar Mahasiswa");
		String hasil = BacaTulisFile.bacaFile(namaFile);
        System.out.println(hasil);
	}
}
