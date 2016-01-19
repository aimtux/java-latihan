package myparkir;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;

public class Capir {

	/**
	 * @param args
	 */
		private static BufferedReader datain = new BufferedReader(new InputStreamReader(System.in));
		
		public static void main(String[] args) throws Exception, IOException {
			int pil; 
						
			do {
				// Menu Utama
				System.out.println(" \n Catatan Parkir ");
				System.out.println("--------------------");
				System.out.println("1. Masuk");
				System.out.println("2. Keluar");
				System.out.println("3. Info");
				System.out.println("0. Keluar Program");
				System.out.print("Pilihan Anda : ");
				pil = Integer.parseInt(datain.readLine());
				
				switch(pil) {
					case 0 : System.exit(0);
					case 1 : dataparkir();
				}
			} while (pil != 0);
		
		}
		
		static void dataparkir() throws Exception {
			kendaraan agt = new kendaraan();
			SimpleDateFormat mytgl = new SimpleDateFormat("dd-MM-yyyy");

			System.out.println("Input Kendaraan");
			System.out.print("Nomer Polisi : ");
			agt.setnopol(datain.readLine());
			
			System.out.print("Jenis Kendaraan : ");
			agt.setjenis(datain.readLine());
			
			System.out.print("Tanggal : ");
			agt.settanggal(mytgl.parse(datain.readLine()));
			
			System.out.print("Jam Masuk : ");
			agt.setjam_masuk(datain.readLine());
			
			System.out.print("Jam Keluar : ");
			agt.setjam_keluar(datain.readLine());
			
			agt.Tampil();
		}
}