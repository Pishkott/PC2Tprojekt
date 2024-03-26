
public class Kniha {
	
	private String nazev;
	private String autor;
	private int rok;
	private String typ;
	public String getTyp() {
		return typ;
	}

	public void setTyp(String typ) {
		this.typ = typ;
	}

	private boolean dostupnost;
	
	public Kniha(String nazev, String autor, int rok, String typ, boolean dostupnost) {
		this.nazev = nazev;
		this.autor = autor;
		this.rok = rok;
		this.typ = typ;
		this.dostupnost = dostupnost;
	}

	public String getNazev() {
		return nazev;
	}

	public void setNazev(String nazev) {
		this.nazev = nazev;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getRok() {
		return rok;
	}

	public void setRok(int rok) {
		this.rok = rok;
	}

	public boolean isDostupnost() {
		return dostupnost;
	}

	public void setDostupnost(boolean dostupnost) {
		this.dostupnost = dostupnost;
	}

	
}
