package phonebook;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonTest {

	@Test
	public void testsetVnev() {
		Person p=new Person();
		String veznev="Drevenka";
		p.setVnev(veznev);
		assertEquals(veznev, p.getVnev());
	}
	@Test
	public void testgetVnev() {
		Person p1=new Person();
		String vezn="Drevenka";
		p1.setVnev(vezn);
		String vnev=p1.getVnev();
		assertEquals(vezn,vnev);
		
	}
	@Test
	public void testsetKnev() {
		Person p2=new Person();
		String ker="Bence";
		p2.setKnev(ker);
		assertEquals(ker, p2.getKnev());
	}
	@Test
	public void testgetKnev() {
		Person p3=new Person();
		String kern="Bence";
		p3.setKnev(kern);
		String knev=p3.getKnev();
		assertEquals(kern,knev);
		}
	@Test
	public void testsetTel() {
		Person p4=new Person();
		String tel="36701234567";
		p4.setTel(tel);
		assertEquals(tel, p4.getTel());
	}
	@Test
	public void testgetTel() {
		Person p5=new Person();
		String tele="36701234567";
		p5.setTel(tele);
		String telefon=p5.getTel();
		assertEquals(tele,telefon);
		
	}
	@Test
	public void testsetEmail() {
		Person p6=new Person();
		String e="drevenka@bence.com";
		p6.setEmail(e);
		assertEquals(e, p6.getEmail());
	}
	@Test
	public void testgetEmail() {
		Person p7=new Person();
		String em="drevenka@bence.com";
		p7.setEmail(em);
		String email=p7.getEmail();
		assertEquals(em,email);
		
	}
	@Test
	public void testsetLakcim() {
		Person p8=new Person();
		String lak="Bence";
		p8.setLakcim(lak);
		assertEquals(lak, p8.getLakcim());
	}
	@Test
	public void testgetLakcim() {
		Person p9=new Person();
		String lakc="Drevenka";
		p9.setLakcim(lakc);
		String lakcim=p9.getLakcim();
		assertEquals(lakc,lakcim);
		
	}

}
