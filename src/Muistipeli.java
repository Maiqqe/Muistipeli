import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Muistipeli {

	public static void main(String[] args) {
		tervehdys();
		arvotutNumerot ();
		ruudunTyhjennys ();
		pelaajanArvaus ();

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
	
	public static void pelaajanArvaus () //Pelaajan arvaukset
	{Scanner in = new Scanner(System.in); 
	ArrayList<Integer> arvaukset = new ArrayList<Integer>();

	
    for (int i = 0; i < 7; i++) {
        System.out.print("Syötä " + (i + 1) + ". numero:\n");
        int arvaus = in.nextInt();
        arvaukset.add(arvaus);
        }
    System.out.println("Sinun arvauksesi olivat: " + arvaukset);
	}
}//Vimppa
