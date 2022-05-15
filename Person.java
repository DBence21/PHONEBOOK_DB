package phonebook;


public class Person {

	
	private String vnev;
	private String knev;
	private String telefonszam;
	private String email;
	private String lakcim;
	public Person () {}
	
	
	public String getVnev() {
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
	public void setVnev(String s) {
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
	public String toString() {
		return vnev+" "+knev+" "+telefonszam+" "+email+" "+lakcim+"\n";
	}
	
}
