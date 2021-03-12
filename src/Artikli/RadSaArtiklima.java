package Artikli;

import java.util.LinkedList;

import KancelarijskiMaterijali.KancelarijskiMaterijal;
import Knjige.Knjiga;
import KucnaHemija.KucnaHemija;
import specifikacijainterfejsa.MagacinInterfejs;

public class RadSaArtiklima implements MagacinInterfejs {

	private LinkedList <Knjiga> knjige= new LinkedList<Knjiga>();
	private LinkedList <KancelarijskiMaterijal> kancelarijskiMaterijali = new LinkedList <KancelarijskiMaterijal>();
	private LinkedList <KucnaHemija> kucneHemije = new LinkedList <KucnaHemija> ();

	@Override
	public void dodajKnjigu(Knjiga knjiga) {
		
		if (knjiga == null)
			throw new RuntimeException ("Knjiga ne sme biti null");
		

		else if (knjige.contains(knjiga))
			knjiga.setKolicina(knjiga.getKolicina() +1);
		
		else knjige.add(knjiga);


	}

	@Override
	public void dodajKancelarijskiMaterijal(KancelarijskiMaterijal kancelarijskiMaterijal) {
		
		if (kancelarijskiMaterijal == null)
			throw new RuntimeException ("Kancelarijski materijal ne sme biti null");
		

		else if (kancelarijskiMaterijali.contains(kancelarijskiMaterijal))
			kancelarijskiMaterijal.setKolicina(kancelarijskiMaterijal.getKolicina() +1);
		
		else kancelarijskiMaterijali.add(kancelarijskiMaterijal);

	}

	@Override
	public void dodajKucnuHemiju(KucnaHemija kucnaHemija) {
		

		if (kucnaHemija == null)
			throw new RuntimeException ("Kucna hemija ne sme biti null");	
		
		else if (kucneHemije.contains(kucnaHemija))
			kucnaHemija.setKolicina(kucnaHemija.getKolicina() + 1);
		
		else kucneHemije.add(kucnaHemija);


	}

	@Override
	public void izbaciKnjigu(Knjiga knjiga) {
		
		if (knjige == null || !knjige.contains(knjiga))
			throw new RuntimeException ("Knjiga je null ili ne postoji u sistemu");
		else if  (knjiga.getKolicina() ==0)
			throw new RuntimeException ("Knjiga je vec izbacena iz sistema");
		
		else knjiga.setKolicina(knjiga.getKolicina() - 1);

	}

	@Override
	public void izbaciKancelarijskiMaterijal(KancelarijskiMaterijal kancelarijskiMaterijal) {
		
		if (kancelarijskiMaterijal == null || !kancelarijskiMaterijali.contains(kancelarijskiMaterijal))
			throw new RuntimeException ("Kancelarijski materijal je null ili ne postoji u sistemu");
		
		else if  (kancelarijskiMaterijal.getKolicina() ==0)
			throw new RuntimeException ("Kancelarijski materijal je vec izbacen iz sistema");
		
		else kancelarijskiMaterijal.setKolicina(kancelarijskiMaterijal.getKolicina() - 1);


	}

	@Override
	public void izbaciKucnuHemiju(KucnaHemija kucnaHemija) {
		
		if (kucnaHemija == null || !kucneHemije.contains(kucnaHemija))
			throw new RuntimeException ("Kucna hemija je null ili ne postoji u sistemu");
		
		else if  (kucnaHemija.getKolicina() ==0)
			throw new RuntimeException ("Kucna hemija je vec izbacena iz sistema");
		
		else kucnaHemija.setKolicina(kucnaHemija.getKolicina() - 1);

	}

	@Override
	public int pronadjiKnjigu(int sifra) {
		
		if (sifra < 0)
			throw new RuntimeException ("Sifra ne sme biti negativna");
		
		for (Knjiga knjiga : knjige)
			if (knjiga.getSifra() == sifra)
				return sifra;
			
		return -1;

	}

	@Override
	public int pronadjiKancelarijskiMaterijal(int sifra) {
		
		if (sifra < 0)
			throw new RuntimeException ("Sifra ne sme biti negativna");
		
		for (KancelarijskiMaterijal kancelarijskiMaterijal : kancelarijskiMaterijali)
			if (kancelarijskiMaterijal.getSifra() == sifra)
				return sifra;
		
		return -1;

	}

	@Override
	public int pronadjiKucnuHemiju(int sifra) {
		
		if (sifra < 0)
			throw new RuntimeException ("Sifra ne sme biti negativna");
		
		for (KucnaHemija kucnaHemija : kucneHemije)
			if (kucnaHemija.getSifra() == sifra)
				return sifra;
		
		
		return -1;

	}

}
