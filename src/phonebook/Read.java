package phonebook;

import java.io.*;
import java.util.*;

public class Read {

public void beolvasas() {
		
		try {
			
			ArrayList<Person> lista=new ArrayList<Person>(); //létrehoz egy Person típusú listát
 			File fajl=new File("telkonyv.txt");
			FileReader file=new FileReader(fajl);
			BufferedReader reader=new BufferedReader(file);
			String sor;
			while((sor=reader.readLine())!=null) { //amíg van sor a txt-ben, beolvassa
				String[] ember=sor.split(";");
				Person p=new Person();
				p.setVnev(ember[0]); //beállítja Person tulajdonságait
				p.setKnev(ember[1]);
				p.setTel(ember[2]);
				p.setEmail(ember[3]);
				p.setLakcim(ember[4]);
				lista.add(p);
				
			}
			reader.close();
			System.out.println("");
			for(int i=0;i<lista.size();i++) {
				System.out.print(lista.get(i)); //kiírja a listában található kontaktokat
			}
			System.out.println("");
		} 
		catch(Exception fnfe){
			System.out.println("Hiba\n");
			fnfe.printStackTrace();
		}
	
	}
}
