import java.util.Scanner;

public class Databaze {
	
	private Scanner sc;
	private Kniha [] prvkyDatabaze;
	private Kniha [] pomocnePole;
	
	
	public Databaze(int pocetPrvku)
	{
		prvkyDatabaze=new Kniha[pocetPrvku];
		sc=new Scanner(System.in);
	}
	
	public void setKniha()
	{
		System.out.println("Zadejte nazev knihy");
		String nazev=sc.next();
		System.out.println("Zadejte autora knihy");
		String autor=sc.next();
		System.out.println("Zadejte rok vydani");
		int rok=Test.pouzeCelaCisla(sc);
		System.out.println("Zadejte typ knihy");
		System.out.println("1.....Román");
		System.out.println("2.....Učebnice");
		int volba=Test.pouzeCelaCisla(sc);
		switch(volba) {
			case 1:
				String typ = "Román";
				System.out.println("Zadejte zanr knihy");
				String zanr=sc.next();
				pomocnePole = new Kniha[prvkyDatabaze.length +1];
				for (int i = 0; i<prvkyDatabaze.length; i++) {
					pomocnePole[i] = prvkyDatabaze[i];
				}
				pomocnePole[prvkyDatabaze.length] = new Roman(nazev,autor,rok,typ,true,zanr);
				prvkyDatabaze = new Kniha[pomocnePole.length];
				prvkyDatabaze = pomocnePole;
				break;
/*			case 2:
				typ = "Učebnice";
				System.out.println("Zadejte, pro jaky rocnik je urcena");
				int rocnik=Test.pouzeCelaCisla(sc);
				pomocnePole = new Kniha[prvkyDatabaze.length +1];
				for (int i = 0; i<prvkyDatabaze.length; i++) {
					pomocnePole[i] = prvkyDatabaze[i];
				}
				prvkyDatabaze = new Kniha[pomocnePole.length];
				prvkyDatabaze = pomocnePole;
				break;*/
			}
		//System.out.println("Je kniha dostupna? (A/N)");	
	}
	
	public Kniha getKniha(int idx) 
	{
		return prvkyDatabaze[idx];
	}
}