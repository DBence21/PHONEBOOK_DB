package phonebook;

import java.io.*;
import java.util.*;


public class Main {
	
	public static void menu() {//külön metódusban kiírom a menüt, hogy ne kelljen mindig ezt a hosszú szöveget kiírni
		
		System.out.println("Üdvözöllek a telefonkönyvben!\n"
				+ "A következõ funkciók közül kérlek válassz egyet:\n"
				+ "1. Új kontakt hozzáadása a telefonkönyv adatbázisához\n"
				+ "2. A telefonkönyv adatbázisában lévõ összes kontakt kilistázása\n"
				+ "3. Eltárolt kontakt törlése az adatbázisból\n"
				+ "4. Kilépés\n"
				);
	}
	
	
	
	public static void main(String [] args) throws IOException { //main metódus, a különbözõ funkciókat itt valósítom meg
		Scanner beker=new Scanner(System.in);
		Functions func1=new Functions();
		
		int be = 0;
		
		while(be==0)
		{
			
			menu();
			int i=Integer.parseInt(beker.nextLine());
			if(i==1) {
				
				Functions.hozzaad();
				
			}
			else if(i==2) {
				func1.beolvasas();
				
			}
			
			else if(i==3) {
				func1.torles();
				
			}
			else if(i==4) {
				System.out.println("Szép napot!");
				System.exit(0);
			}
			else {
				continue;
				
			}
			
			
		
		}
		beker.close();
		
		
	}
}
