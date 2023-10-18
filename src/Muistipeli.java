import java.util.ArrayList;
import java.util.Random;

public class Muistipeli {

	public static void main(String[] args) {
		tervehdys();
		arvotutNumerot ();
		ruudunTyhjennys ();

	}//Mainin loppu
	
	public static void tervehdys ()
	{	System.out.println("Tervetuloa pelaamaan Muistipeliä!");
		System.out.println("Yritä muistaa alla olevat 7 numeroa väliltä 1-5. Näet numerot vain hetken.");
	}
	
	public static ArrayList<Integer> arvotutNumerot ()
	{	Random random = new Random(); // Numeroiden arpoja			
		ArrayList<Integer> arvotut = new ArrayList <Integer>(); //Yksiulotteinen taulukko arvotuille numeroille
	
			for (int i = 0; i < 7; i++)
			{int luvut= random.nextInt(5)+1; 
			arvotut.add(luvut);
			}

			System.out.println(arvotut);
			return arvotut; //Palauttaa arvotut numerot
	}
	
	public static void ruudunTyhjennys ()
	{
		try { // suoritus pysähtyy 3,5 sekunniksi 
			Thread.sleep(3500); 
			} 
		catch(InterruptedException ex) { 
			Thread.currentThread().interrupt(); 
			} 
		for (int i = 0; i < 20; ++i) System.out.println(); //20 tyhjää välilyöntiä "tyhjentämään" konsoli
	}
	
}//Vimppa
