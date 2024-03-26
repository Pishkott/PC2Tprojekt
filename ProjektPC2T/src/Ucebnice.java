
public class Ucebnice extends Kniha{
	int rocnik;
	
	public Ucebnice(String nazev, String autor, int rok, String typ, boolean dostupnost, int rocnik) {
		super(nazev, autor, rok, typ, dostupnost);
		// TODO Auto-generated constructor stub
		this.rocnik = rocnik;
	}
	
}
