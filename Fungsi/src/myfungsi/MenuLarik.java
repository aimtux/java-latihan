package myfungsi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MenuLarik {

	/**
	 * @param args
	 */
	
	private static BufferedReader datain = new BufferedReader(new InputStreamReader(System.in));
	private static int nilai[] = new int[10];
	
	public static void main(String[] args) throws Exception, IOException {
		int pil;
		
		do {
		// Menu Utama
		System.out.println(" \n Menu Array ");
		System.out.println("--------------");
		System.out.println("1. Input Data");
		System.out.println("2. Tampil Data");
		System.out.println("3. Cari Data");
		System.out.println("4. Terbesar");
		System.out.println("5. Urutkan");
		System.out.println("0. Keluar Program");
		System.out.print("Pilihan Anda : ");
		pil = Integer.parseInt(datain.readLine());
		
		switch(pil) {
			case 1 : InputData();break;
			case 2 : TampilData();break;
			case 3 : CariData();break;
			case 4 : NilaiTerbesar();break;
			case 5 : UrutData();break;
			case 0 : System.exit(0);
		}
		} while (pil != 0);
	}
	
	static void InputData() throws Exception, Exception {
		//Input Data
		int i;
		for (i=0;i<10;i++) {
			System.out.print("Input Nilai Ke "+(i+1)+" : ");
			nilai[i] = Integer.parseInt(datain.readLine()); 
		}	
		
	}

	
	static void TampilData() {
		//Menampilkan Data
		int i;
		System.out.println("\nTampil Data di Array");
		System.out.println("=====================");
		for (i=0;i<10;i++) {
			System.out.println("Nilai Ke "+(i+1)+" : "+nilai[i]);
		}
		
	}
	

	static void CariData() throws Exception, IOException {
		int xcari;
		int i;
		boolean ketemu = false;
		//?Mencari Data di Array
		System.out.println("\nMencari Data di Array");
		System.out.println("=====================");
		System.out.print("Nilai yang dicari : ");
		xcari = Integer.parseInt(datain.readLine());
				
		for (i=0;i<10;i++) {
			if (xcari == nilai[i]) {
				ketemu = true;
			} 
		}
		if (ketemu) {
			System.out.println("Data di Temukan");
		} else {
			System.out.println("Data Tidak di Temukan");
		}
	}
	
	static void NilaiTerbesar() throws Exception, IOException {
		int xcari;
		int i;
		//?Mencari Data di Array
		System.out.println("\nMencari Data Terbesar di Array");
		System.out.println("================================");
		
		xcari = nilai[1];
		for (i=0;i<10;i++) {
			if (xcari <= nilai[i]) {
				xcari = nilai[i];
			} 
		}
		System.out.println("Data Terbesar adalah : "+xcari);
	}

	//Urutkan Data dari Besar Ke Keccil
	static void UrutData() throws Exception, IOException {
		int temp;
		int i,j,k;
		System.out.println("\nMengurutkan Data di Array");
		System.out.println("============================");
		
		for (i=0;i<10;i++) {
			for (j=i;j<10;j++) {
				if (nilai[i] <= nilai[j]) {
					temp = nilai[i];
					nilai[i] = nilai[j];
					nilai[j] = temp;
				} 
			}
			System.out.print("Tahap "+i+" : ");
			for (k=0;k<10;k++) {
				System.out.print(" "+nilai[k]);
			}
			System.out.println("");
		}
		
	}
	
	//Urutkan Data dari Kecil Ke Besar
		static void UrutData2() throws Exception, IOException {
			int temp;
			int i,j;
			System.out.println("\nMengurutkan Data di Array");
			System.out.println("============================");
			
			for (i=0;i<10;i++) {
				for (j=i;j<10;j++) {
					if (nilai[i] >= nilai[j]) {
						temp = nilai[i];
						nilai[i] = nilai[j];
						nilai[j] = temp;
					} 
				}
			}
		}

}
