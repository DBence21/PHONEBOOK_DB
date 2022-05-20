package phonebook;
import java.util.*;
import java.io.*;



public class Write {
	
	
	
	public void hozzaad() {
		Person p=new Person(); // Person objektum létrehozása
		Scanner be=new Scanner(System.in);
		System.out.println("Vezetéknév: "); 
		p.setVnev(be.nextLine()); //Person adatait beállítom
		System.out.println("Keresztnév: ");
		p.setKnev(be.nextLine());
		System.out.println("Telefonszám: ");
		//p.setTel(be.nextLine());
		String s=be.nextLine();
		
		if(s.charAt(0)=='3'&& s.charAt(1)=='6') { //ha a telefonszám nem 36-al kezdõdik, akkor nem lehet kiírni személyt a txt-be
			p.setTel(s);
			
		}else {
			System.out.println("Helytelen formátum!\n");
			return;
			
		}
		
		System.out.println("E-mail cím: ");
		p.setEmail(be.nextLine());
		System.out.println("Lakcím: ");
		p.setLakcim(be.nextLine());
		
		;
		try {
			File fajl=new File("telkonyv.txt");
			PrintWriter writer=new PrintWriter(new FileWriter(fajl, true));
			writer.write(p.getVnev()+";"+p.getKnev()+";"+p.getTel()+";"+p.getEmail()+";"+p.getLakcim()+"\n"); //visszaadja Person tulajdonságait és ezt kiírja az adatbázisba
			writer.close();
			System.out.println("Sikeres kiíratás!\n");
			
			
		}catch(IOException ioe){ //hibakezelés
			System.out.println("Hiba!\n");
			ioe.printStackTrace();
		}
		
	}

	
	
	
	
	

}
