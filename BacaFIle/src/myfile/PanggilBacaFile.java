package myfile;

public class PanggilBacaFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String namaFile = "ContohTeks.txt";
        for (int i = 0; i < 5; i++) {
            BacaTulisFile.tulisFile("Teks ke-" + i, namaFile);
        }
         
        String hasil = BacaTulisFile.bacaFile(namaFile);
        System.out.println(hasil);
	}
}
