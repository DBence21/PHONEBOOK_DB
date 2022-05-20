package phonebook;

import java.awt.TextArea;
import org.junit.Test;

public class ReadTest {
	@Test
	public void beolvasTest() throws Exception{
		
		String txt=new TextArea(new String("\\Users\\Drevenka\\Documents\\Bence\\java\\phonebook")).toString();
	}
	//source: https://stackoverflow.com/questions/3891375/how-to-read-a-text-file-resource-into-java-unit-test
}
