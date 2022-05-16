package phonebook;
import java.util.*;
import java.io.*;



public class Functions {
	
	
	
	public static void hozzaad() {
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
			System.out.println("K�rem �rja be a t�r�lni k�v�nt szem�ly telefonsz�m�t: ");
			String be=sc.nextLine();
			
			for(Person pp:lista1) {
					if(pp.getTel().equals(be)) {//ha a be�rt telefonsz�m egyezik a list�ban b�rmelyik telefonsz�mmal, akkor a telefonsz�mhoz tartoz� szem�ly adatait t�rli
						lista1.remove(pp);
						System.out.println("Sikeresen t�r�lve\n");
						break;
					}
					
				}
			
			
			BufferedWriter writer=new BufferedWriter(new FileWriter(fajl1));
			
			for(int i=0;i<lista1.size();i++) {//majd a list�ban maradt kontaktokat vissza�rja a txt-be
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
