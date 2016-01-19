package myperpus;

public class Petugas {
	String IdPetugas;
	String NamaPetugas;
	String Alamat;
	String Kota;
	
	public void setidPetugas(String IdPetugas) {
		this.IdPetugas = IdPetugas;
	}
	
	public String getidPetugas() {
		return IdPetugas;
	}
	
	public void setnamaPetugas(String NamaPetugas) {
		this.NamaPetugas = NamaPetugas;
	}
	
	public String getnamaPetugas() {
		return NamaPetugas;
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
		System.out.println("Id Petugas \t: "+getidPetugas());
		System.out.println("Nama Petugas \t: "+getnamaPetugas());
		System.out.println("Alamat \t: "+getalamat());
		System.out.println("Kota \t: "+getkota());
	}
	
	public void InputData(String id, String nama, String alamat, String kota) {
		setidPetugas(id);
		setnamaPetugas(nama);
		setalamat(alamat);
		setkota(kota);
	}

}
