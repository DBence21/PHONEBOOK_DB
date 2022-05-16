package phonebook;

import java.io.*;
import java.util.*;


public class Main {
	
	public static void menu() {//k�l�n met�dusban ki�rom a men�t, hogy ne kelljen mindig ezt a hossz� sz�veget ki�rni
		
		System.out.println("�dv�z�llek a telefonk�nyvben!\n"
				+ "A k�vetkez� funkci�k k�z�l k�rlek v�lassz egyet:\n"
				+ "1. �j kontakt hozz�ad�sa a telefonk�nyv adatb�zis�hoz\n"
				+ "2. A telefonk�nyv adatb�zis�ban l�v� �sszes kontakt kilist�z�sa\n"
				+ "3. Elt�rolt kontakt t�rl�se az adatb�zisb�l\n"
				+ "4. Kil�p�s\n"
				);
	}
	
	
	
	public static void main(String [] args) throws IOException { //main met�dus, a k�l�nb�z� funkci�kat itt val�s�tom meg
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
				System.out.println("Sz�p napot!");
				System.exit(0);
			}
			else {
				continue;
				
			}
			
			
		
		}
		beker.close();
		
		
	}
}
