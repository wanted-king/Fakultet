package kol2_master.model;

public abstract class Zaposleni {
	
	 private String sifra;
	 private String ime;
	 private String prezime;
	 private double visinaPlate;
	 
	 public Zaposleni() {}
	 
	 public Zaposleni(String sifra, String ime, String prezime, double visinaPlate) {
		super();
		this.sifra = sifra;
		this.ime = ime;
		this.prezime = prezime;
		this.visinaPlate = visinaPlate;
	}
	 
	public String getSifra() {
		return sifra;
	}
	public void setSifra(String sifra) {
		this.sifra = sifra;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public double getVisinaPlate() {
		return visinaPlate;
	}
	public void setVisinaPlate(double visinaPlate) {
		this.visinaPlate = visinaPlate;
	}
	 
}
