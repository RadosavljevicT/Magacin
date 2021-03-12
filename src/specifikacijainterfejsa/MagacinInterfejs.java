package specifikacijainterfejsa;

import KancelarijskiMaterijali.KancelarijskiMaterijal;
import Knjige.Knjiga;
import KucnaHemija.KucnaHemija;

public interface MagacinInterfejs {

	
	public void dodajKnjigu (Knjiga knjiga) ;
	
	public void dodajKancelarijskiMaterijal (KancelarijskiMaterijal kancelarijskiMaterijal) ;
	
	public void dodajKucnuHemiju (KucnaHemija kucnaHemija) ;
	
	public void izbaciKnjigu (Knjiga knjiga);
	
	public void izbaciKancelarijskiMaterijal (KancelarijskiMaterijal kancelarijskiMaterijal) ;
	
	public void izbaciKucnuHemiju (KucnaHemija kucnaHemija) ;
	
	public int pronadjiKnjigu (int sifra) ;
	
	public int pronadjiKancelarijskiMaterijal (int sifra) ;
	
	public int pronadjiKucnuHemiju (int sifra) ;
}
