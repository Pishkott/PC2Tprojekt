import java.util.Scanner;


public class Test {
	
	public static int pouzeCelaCisla(Scanner sc) 
	{
		int cislo = 0;
		try
		{
			cislo = sc.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("Nastala vyjimka typu "+e.toString());
			System.out.println("zadejte prosim cele cislo ");
			sc.nextLine();
			cislo = pouzeCelaCisla(sc);
		}
		return cislo;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		Databaze novaDatabaze = new Databaze(1);
		int idx;
		while(run==true){
			
			
			
			System.out.println("*****************************");
			System.out.println("*    P&P - Library index    *");
			System.out.println("*****************************");
			System.out.println("");
			System.out.println("1.....Vytvorit databazi");
			System.out.println("2.....Pridat knihu");
			System.out.println("3.....Upravit knihu");
			System.out.println("4.....Smazat knihu");
			System.out.println("5.....Vypis knih");
			
			
			
			int volba=pouzeCelaCisla(sc);
			switch(volba) {
				case 1:
					System.out.println("Zadejte velikost databaze: ");
					novaDatabaze=new Databaze(pouzeCelaCisla(sc));
					break;
				case 2:
					try
					{
						novaDatabaze.setKniha();
					}
					catch (ArrayIndexOutOfBoundsException e)
					{
						System.out.println("Nebylo mozno vytvorit novou polozku, databaze je plna");
					}
					break;
				case 5:
					System.out.println("Zadejte index knihy");
					idx=pouzeCelaCisla(sc);
					Kniha info = null;
					try 
					{	
						info=novaDatabaze.getKniha(idx);
						if (info instanceof Roman) {
							System.out.println("Nazev: " + info.getNazev() + " autor: " + info.getAutor() + " rok vydani: " + info.getRok() + "typ: " + info.getTyp()+" dostupnost: " + info.isDostupnost()+" zanr: " );
						}
					}
					catch(ArrayIndexOutOfBoundsException e)
					{
						System.out.println("Vybrana polozka mimo rozsah databaze");
					}
					catch (NullPointerException e)
					{
						System.out.println("Vybrana polozka neexistuje");
					}
					break;
			}
		}
	}

}
