package phonebook;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import org.junit.Test;

public class WriteTest {

	@Test
	public void testWr() throws IOException{
		ArrayList <Person> lista=new ArrayList<Person>();
		Person p=new Person();
		p.setVnev("Drevenka");
		p.setKnev("Bence");
		p.setTel("36212345678");
		p.setEmail("drevenka@b.hu");
		p.setLakcim("Bp");
		lista.add(p);
		String file="telkonyv.txt";
		PrintWriter writer=new PrintWriter(new FileWriter(file));
		for(Person p1: lista) {
			writer.println(p1.getVnev()+";"+p1.getKnev()+";"+p1.getTel()+";"+p1.getEmail()+";"+p1.getLakcim()+"\n");
		}
		writer.close();
		
	}

	
}
