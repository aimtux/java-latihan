package myparkir;

import java.util.Date;

public interface parkirselaluada {
	public void InputData(String nopol, String jenis, Date tgl, String jam_masuk, String jam_keluar);
	public void Tampil();
	public void setnopol(String nopol);
	public String getnopol();
	public void setjenis(String jenis);
	public String getjenis();
	public void setjam_masuk(String jam_masuk);
	public String getjam_masuk();
	public void setjam_keluar(String jam_keluar);
	public String getjam_keluar();
	public void settanggal(Date tgl);
	public Date gettanggal();
	
}
