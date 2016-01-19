package myperpus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MenuPerpus {

	private static BufferedReader datain = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws Exception, IOException {
		int pil; 
		
		
		do {
		// Menu Utama
		System.out.println(" \n Perpustakaan ");
		System.out.println("--------------");
		System.out.println("1. Anggota");
		System.out.println("2. Buku");
		System.out.println("3. Peminjaman");
		System.out.println("4. Petugas");
		System.out.println("0. Keluar Program");
		System.out.print("Pilihan Anda : ");
		pil = Integer.parseInt(datain.readLine());
		
		switch(pil) {
			case 0 : System.exit(0);
			case 1 : dataAnggota2();
		}
		} while (pil != 0);
	
	}
	
	static void dataAnggota() throws Exception {
		Anggota agt = new Anggota();

		System.out.println("Input Anggota");
		System.out.print("Kode Anggota : ");
		agt.setidanggota(datain.readLine());
		
		System.out.print("Nama Anggota : ");
		agt.setnamaanggota(datain.readLine());
		
		System.out.print("Alamat Anggota : ");
		agt.setalamat(datain.readLine());
		
		System.out.print("Kota Anggota : ");
		agt.setkota(datain.readLine());
		
		agt.Tampil();
	}
	
	static void dataAnggota2() throws Exception {
		Anggota agt = new Anggota();
		String a,b,c,d;

		System.out.println("Input Anggota");
		System.out.print("Kode Anggota : ");
		a = datain.readLine();
		
		System.out.print("Nama Anggota : ");
		b = datain.readLine();
		
		System.out.print("Alamat Anggota : ");
		c = datain.readLine();
		
		System.out.print("Kota Anggota : ");
		d = datain.readLine();
		
		agt.InputData(a, b, c, d);
		agt.Tampil();
	}
}