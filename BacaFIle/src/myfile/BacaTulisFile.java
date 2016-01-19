package myfile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class BacaTulisFile {
	 public static void tulisFile(String teks, String namaFile) {
	        try {
	            PrintWriter out = new PrintWriter(new BufferedWriter(
	                    new FileWriter(namaFile, true)));
	            out.println(teks);
	            out.close();
	        } catch (IOException e) {
	            System.out.println("Gagal menulis ke file " + namaFile);
	            e.printStackTrace();
	        }
	    }
	 
	    // Method baca file
	    public static String bacaFile(String namaFile) {
	        BufferedReader br = null;
	        String stringHasil = "";
	 
	        try {
	            String sCurrentLine;
	            br = new BufferedReader(new FileReader(namaFile));
	            while ((sCurrentLine = br.readLine()) != null) {
	                stringHasil = stringHasil + sCurrentLine + "\n";
	            }
	 
	        } catch (IOException e) {
	            System.out.println("Gagal membaca file " + namaFile);
	            e.printStackTrace();
	        } finally {
	            try {
	                if (br != null)
	                    br.close();
	            } catch (IOException ex) {
	                ex.printStackTrace();
	            }
	        }
	        return stringHasil;
	    }
}
