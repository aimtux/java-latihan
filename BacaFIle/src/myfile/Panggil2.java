package myfile;

public class Panggil2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String namaFile = "Biodata.txt";
            
		BacaTulisFile.tulisFile("Nim	: 201101002", namaFile);
		BacaTulisFile.tulisFile("Nama	: Budi Hermawan", namaFile);
		BacaTulisFile.tulisFile("Alamat	: Jl Drajat 200", namaFile);
		BacaTulisFile.tulisFile("Prodi	: Teknik Informatika", namaFile);
		
        String hasil = BacaTulisFile.bacaFile(namaFile);
        System.out.println(hasil);

	}

}
