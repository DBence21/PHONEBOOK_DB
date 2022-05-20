package phonebook;

import java.io.*;
import java.util.*;

public class Delete {

	public void torles() {
		try {
			
			ArrayList<Person> lista1=new ArrayList<Person>();
 			File fajl1=new File("telkonyv.txt");
			FileReader file1=new FileReader(fajl1);
			BufferedReader reader1=new BufferedReader(file1);
			String sor1;
			while((sor1=reader1.readLine())!=null) {
				String[] ember1=sor1.split(";");
				Person p=new Person();
				p.setVnev(ember1[0]);
				p.setKnev(ember1[1]);
				p.setTel(ember1[2]);
				p.setEmail(ember1[3]);
				p.setLakcim(ember1[4]);
				lista1.add(p);
				
			}
			reader1.close();
			Scanner sc=new Scanner(System.in);
			System.out.println("Kérem írja be a törölni kívánt személy telefonszámát: ");
			String be=sc.nextLine();
			
			for(Person pp:lista1) {
					if(pp.getTel().equals(be)) {//ha a beírt telefonszám egyezik a listában bármelyik telefonszámmal, akkor a telefonszámhoz tartozó személy adatait törli
						lista1.remove(pp);
						System.out.println("Sikeresen törölve\n");
						break;
					}
					
				}
			
			
			BufferedWriter writer=new BufferedWriter(new FileWriter(fajl1));
			
			for(int i=0;i<lista1.size();i++) {//majd a listában maradt kontaktokat visszaírja a txt-be
				writer.write(lista1.get(i).getVnev()+";"+lista1.get(i).getKnev()+";"+lista1.get(i).getTel()+";"+lista1.get(i).getEmail()+";"+lista1.get(i).getLakcim()+"\n");
				
			}
			writer.close();
			
		}
		catch(Exception e){
			System.out.println("Hiba\n");
			e.printStackTrace();
		}
	}
}
