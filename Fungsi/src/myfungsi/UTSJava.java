package myfungsi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UTSJava {

	/**
	 * @param args
	 */
	private static BufferedReader datain = new BufferedReader(new InputStreamReader(System.in));
	private static String nim[] = new String[10];
	private static String nama[] = new String[10];
	private static double ipk[] = new double[10];
	private static int x = 0;
	
	public static void main(String[] args) throws Exception, IOException {
		int pil;
		
		do {
		// Menu Utama
		System.out.println(" \n Menu Array ");
		System.out.println("--------------");
		System.out.println("1. Input Data");
		System.out.println("2. Tampil Data");
		System.out.println("3. Terbesar");
		System.out.println("4. Urutkan");
		System.out.println("0. Keluar Program");
		System.out.print("Pilihan Anda : ");
		pil = Integer.parseInt(datain.readLine());
		
		switch(pil) {
			case 1 : InputData();break;
			case 2 : TampilData();break;
			case 3 : NilaiTerbesar();break;
			case 4 : UrutData();break;
			case 0 : System.exit(0);
		}
		} while (pil != 0);
	}
	
	static void InputData() throws Exception, Exception {
		//Input Data
		int i;
		for (i=0;i<5;i++) {
			System.out.print("Input Nim Ke "+(i+1)+" : ");
			nim[i] = datain.readLine();
			System.out.print("Input Nama Ke "+(i+1)+" : ");
			nama[i] = datain.readLine();
			System.out.print("Input IPK Ke "+(i+1)+" : ");
			ipk[i] = Double.parseDouble(datain.readLine()); 
		}	
		
	}

	
	static void TampilData() {
		//Menampilkan Data
		int i;
		System.out.println("\nTampil Data di Array");
		System.out.println("====================================================");
		System.out.println("No\t Nim\t	Nama\t\t\t	IPK	");
		System.out.println("====================================================");
		for (i=0;i<5;i++) {
			System.out.println((i+1)+" "+nim[i]+"\t\t "+nama[i]+"\t\t\t"+ipk[i]);
		}
		
	}
	
	
	static void NilaiTerbesar() throws Exception, IOException {
		double xcari;
		int i;
		//?Mencari Data di Array
		System.out.println("\nMencari Data IPK Terbesar ");
		System.out.println("============================");
		
		xcari = ipk[1];
		for (i=0;i<5;i++) {
			if (xcari <= ipk[i]) {
				xcari = ipk[i];
				x = i;
			} 
		}
		System.out.println("Data Terbesar adalah : ");
		System.out.println("Nim \t: "+nim[x]);
		System.out.println("Nama \t: "+nama[x]);
		System.out.println("IPK \t: "+ipk[x]);
	}

	//Urutkan Data dari Besar Ke Keccil
	static void UrutData() throws Exception, IOException {
		double temp;
		int i,j,k;
		String tnim,tnama;
		System.out.println("\nMengurutkan Data di Array");
		System.out.println("============================");
		
		for (i=0;i<5;i++) {
			for (j=i;j<5;j++) {
				if (ipk[i] <= ipk[j]) {
					temp = ipk[i];
					tnim = nim[i];
					tnama = nama[i];
					ipk[i] = ipk[j];
					nim[i] = nim[j];
					nama[i] = nama[j];
					ipk[j] = temp;
					nim[j] = tnim;
					nama[j] = tnama;
				} 
			}
		}
		
	}
	
}
