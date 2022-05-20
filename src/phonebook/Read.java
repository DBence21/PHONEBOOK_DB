package phonebook;

import java.io.*;
import java.util.*;

public class Read {

public void beolvasas() {
		
		try {
			
			ArrayList<Person> lista=new ArrayList<Person>(); //l�trehoz egy Person t�pus� list�t
 			File fajl=new File("telkonyv.txt");
			FileReader file=new FileReader(fajl);
			BufferedReader reader=new BufferedReader(file);
			String sor;
			while((sor=reader.readLine())!=null) { //am�g van sor a txt-ben, beolvassa
				String[] ember=sor.split(";");
				Person p=new Person();
				p.setVnev(ember[0]); //be�ll�tja Person tulajdons�gait
				p.setKnev(ember[1]);
				p.setTel(ember[2]);
				p.setEmail(ember[3]);
				p.setLakcim(ember[4]);
				lista.add(p);
				
			}
			reader.close();
			System.out.println("");
			for(int i=0;i<lista.size();i++) {
				System.out.print(lista.get(i)); //ki�rja a list�ban tal�lhat� kontaktokat
			}
			System.out.println("");
		} 
		catch(Exception fnfe){
			System.out.println("Hiba\n");
			fnfe.printStackTrace();
		}
	
	}
}
