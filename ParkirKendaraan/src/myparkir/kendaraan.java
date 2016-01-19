package myparkir;

import java.text.SimpleDateFormat;
import java.util.Date;

public class kendaraan implements parkirselaluada {
	String nopol;
	String jenis;
	String jam_masuk;
	String jam_keluar;
	Date tgl = new Date();
	SimpleDateFormat mytgl = new SimpleDateFormat("dd-MM-yyyy");
	double denda;
	
	public void setnopol(String nopol) {
		this.nopol = nopol;
	}
	
	public String getnopol() {
		return nopol;
	}
	
	public void setjenis(String jenis) {
		this.jenis = jenis;
	}
	
	public String getjenis() {
		return jenis;
	}
	
	public void setjam_masuk(String jam_masuk) {
		this.jam_masuk = jam_masuk;
	}
	
	public String getjam_masuk() {
		return jam_masuk;
	}
	
	public void setjam_keluar(String jam_keluar) {
		this.jam_keluar = jam_keluar;
	}
	
	public String getjam_keluar() {
		return jam_keluar;
	}
	
	public void settanggal(Date tgl) {
		this.tgl = tgl;
	}
	
	public Date gettanggal() {
		return tgl;
	}
	
	public void Tampil() {
		System.out.println("No Polisi \t: "+getnopol());
		System.out.println("Jenis Kendaraan \t: "+getjenis());
		System.out.println("Tanggal \t: "+gettanggal());
		System.out.println("jam Masuk \t: "+getjam_masuk());
		System.out.println("jam Keluar \t: "+getjam_keluar());
	}
	
	public void InputData(String nopol, String jenis, Date tgl, String jam_masuk, String jam_keluar) {
		setnopol(nopol);
		setjenis(jenis);
		settanggal(tgl);
		setjam_masuk(jam_masuk);
		setjam_masuk(jam_keluar);
	}

	
}
