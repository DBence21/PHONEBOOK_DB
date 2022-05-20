package phonebook;


public class Person {

	
	private String vnev; //attrib�tumok
	private String knev;
	private String telefonszam;
	private String email;
	private String lakcim;
	
	
	public String getVnev() { //getterek, visszaadj�k a Person adatainak "�rt�k�t"
		return vnev;
	}
	public String getKnev() {
		return knev;
	}
	public String getTel() {
		return telefonszam;
	}
	public String getEmail() {
		return email;
	}
	public String getLakcim() {
		return lakcim;
	}
	public void setVnev(String s) { //setterek, be�ll�tj�k a Person adatait
		this.vnev=s;
	}
	public void setKnev(String s) {
		this.knev=s;
	}
	public void setTel(String s) {
		this.telefonszam=s;
	}
	public void setEmail(String s) {
		this.email=s;
	}
	public void setLakcim(String s) {
		this.lakcim=s;
	}
	public String toString() { //Stringg� konvert�lja az objektumot
		return vnev+" "+knev+" "+telefonszam+" "+email+" "+lakcim+"\n";
	}
	
}
