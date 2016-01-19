package myperpus;

public class Anggota {
	String IdAnggota;
	String NamaAnggota;
	String Alamat;
	String Kota;
	
	public void setidanggota(String IdAnggota) {
		this.IdAnggota = IdAnggota;
	}
	
	public String getidanggota() {
		return IdAnggota;
	}
	
	public void setnamaanggota(String NamaAnggota) {
		this.NamaAnggota = NamaAnggota;
	}
	
	public String getnamaanggota() {
		return NamaAnggota;
	}
	
	public void setalamat(String Alamat) {
		this.Alamat = Alamat;
	}
	
	public String getalamat() {
		return Alamat;
	}
	
	public void setkota(String Kota) {
		this.Kota = Kota;
	}
	
	public String getkota() {
		return Kota;
	}
	
	public void Tampil() {
		System.out.println("Id Anggota \t: "+getidanggota());
		System.out.println("Nama Anggota \t: "+getnamaanggota());
		System.out.println("Alamat \t: "+getalamat());
		System.out.println("Kota \t: "+getkota());
	}
	
	public void InputData(String id, String nama, String alamat, String kota) {
		setidanggota(id);
		setnamaanggota(nama);
		setalamat(alamat);
		setkota(kota);
	}
	}
