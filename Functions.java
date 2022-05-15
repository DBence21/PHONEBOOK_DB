package phonebook;
import java.util.*;
import java.io.*;



public class Functions {
	
	
	
	public static void hozzaad() {
		Person p=new Person();
		Scanner be=new Scanner(System.in);
		System.out.println("Vezetéknév: ");
		p.setVnev(be.nextLine());
		System.out.println("Keresztnév: ");
		p.setKnev(be.nextLine());
		System.out.println("Telefonszám: ");
		String s=be.nextLine();
		
		if(s.charAt(0)==3||s.charAt(1)==6) {
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
			writer.write(p.getVnev()+";"+p.getKnev()+";"+p.getTel()+";"+p.getEmail()+";"+p.getLakcim()+"\n");
			writer.close();
			System.out.println("Sikeres kiíratás!\n");
			
			
		}catch(IOException ioe){
			System.out.println("Hiba!\n");
			ioe.printStackTrace();
		}
		
	}
	
	public void beolvasas() {
		
		try {
			
			ArrayList<Person> lista=new ArrayList<Person>();
 			File fajl=new File("telkonyv.txt");
			FileReader file=new FileReader(fajl);
			BufferedReader reader=new BufferedReader(file);
			String sor;
			while((sor=reader.readLine())!=null) {
				String[] ember=sor.split(";");
				Person p=new Person();
				p.setVnev(ember[0]);
				p.setKnev(ember[1]);
				p.setTel(ember[2]);
				p.setEmail(ember[3]);
				p.setLakcim(ember[4]);
				lista.add(p);
				
			}
			reader.close();
			
			for(int i=0;i<lista.size();i++) {
				System.out.print(lista.get(i));
			}
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
			System.out.println("Kérem írja be a törölni kívánt személy telefonszámát: ");
			String be=sc.nextLine();
			
			for(Person pp:lista1) {
					if(pp.getTel().equals(be)) {
						lista1.remove(pp);
						break;
					}
				}
			
			
			BufferedWriter writer=new BufferedWriter(new FileWriter(fajl1));
			
			for(int i=0;i<lista1.size();i++) {
				writer.write(lista1.get(i).vnev+";"+lista1.get(i).knev+";"+lista1.get(i).telefonszam+";"+lista1.get(i).email+";"+lista1.get(i).lakcim+"\n");
				
			}
			writer.close();
			
		}
		catch(Exception e){
			System.out.println("Hiba\n");
			e.printStackTrace();
		}
	}
	

}
