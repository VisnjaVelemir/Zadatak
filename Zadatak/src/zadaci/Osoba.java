package zadaci;

public class Osoba {
	
	
	private String ime;
	private String prezime;
	private String jmbg;
	private String adresa;
	private int brojGodina;
	
	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getJmbg() {
		return jmbg;
	}

	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public int getBrojGodina() {
		return brojGodina;
	}

	public void setBrojGodina(int brojGodina) {
		this.brojGodina = brojGodina;
	}

	@Override
	public String toString() {
		return "Osoba [ime=" + ime + ", prezime=" + prezime + ", jmbg=" + jmbg + ", adresa=" + adresa + ", brojGodina="
				+ brojGodina + "]";
	}

	public Osoba (String ime, String prezime, String jmbg, String adresa, int brojGodina) {
		this.ime = ime;
		this.prezime = prezime;
		this.jmbg = jmbg;
		this.adresa = adresa;
		this.brojGodina = brojGodina;
		if (brojGodina < 18) {
			System.out.println(ime + " " + prezime + "je maloletno dete" );
		}
		
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	{

	
	
	
	

	
	
	
	
	
		
	
}	

}
