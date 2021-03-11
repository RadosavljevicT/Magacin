package KucnaHemija;

import java.util.Calendar;

public class KucnaHemija {
	
	private String naziv;
	private int sifra;
	private String opis;
	private int kolicina;
	private Calendar roktrajanja;
	
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public int getSifra() {
		return sifra;
	}
	public void setSifra(int sifra) {
		this.sifra = sifra;
	}
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		this.opis = opis;
	}
	public int getKolicina() {
		return kolicina;
	}
	public void setKolicina(int kolicina) {
		this.kolicina = kolicina;
	}
	public Calendar getRoktrajanja() {
		return roktrajanja;
	}
	public void setRoktrajanja(Calendar roktrajanja) {
		this.roktrajanja = roktrajanja;
	}
	
	

}
