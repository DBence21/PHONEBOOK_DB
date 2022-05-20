package phonebook;
import java.util.*;
import java.io.*;



public class Write {
	
	
	
	public void hozzaad() {
		Person p=new Person(); // Person objektum l�trehoz�sa
		Scanner be=new Scanner(System.in);
		System.out.println("Vezet�kn�v: "); 
		p.setVnev(be.nextLine()); //Person adatait be�ll�tom
		System.out.println("Keresztn�v: ");
		p.setKnev(be.nextLine());
		System.out.println("Telefonsz�m: ");
		//p.setTel(be.nextLine());
		String s=be.nextLine();
		
		if(s.charAt(0)=='3'&& s.charAt(1)=='6') { //ha a telefonsz�m nem 36-al kezd�dik, akkor nem lehet ki�rni szem�lyt a txt-be
			p.setTel(s);
			
		}else {
			System.out.println("Helytelen form�tum!\n");
			return;
			
		}
		
		System.out.println("E-mail c�m: ");
		p.setEmail(be.nextLine());
		System.out.println("Lakc�m: ");
		p.setLakcim(be.nextLine());
		
		;
		try {
			File fajl=new File("telkonyv.txt");
			PrintWriter writer=new PrintWriter(new FileWriter(fajl, true));
			writer.write(p.getVnev()+";"+p.getKnev()+";"+p.getTel()+";"+p.getEmail()+";"+p.getLakcim()+"\n"); //visszaadja Person tulajdons�gait �s ezt ki�rja az adatb�zisba
			writer.close();
			System.out.println("Sikeres ki�rat�s!\n");
			
			
		}catch(IOException ioe){ //hibakezel�s
			System.out.println("Hiba!\n");
			ioe.printStackTrace();
		}
		
	}

	
	
	
	
	

}
