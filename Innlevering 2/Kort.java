import java.util.Date;

public abstract class Kort {
	
	private String fornavn;
	private String etternavn;
	private int kode;
	private long kortnummer;
	private boolean sperretKort; // true - sperret, false - åpent
	protected Date opprettet = new Date();
	
	public Kort(String fornavn, String etternavn, int kode, long kortnummer, boolean sperretKort) {
		this.fornavn = fornavn;
		this.etternavn = etternavn;
		this.kode = kode;
		//this.kortnummer = //generere kortnummer
		this.sperretKort = false;
	}
	
	public String getNavn() {
		return fornavn + " " + etternavn;
	}

	public boolean isSperret() {
		return sperretKort;
	}
	
	public String toString() {
		return "Navn: " + getNavn() + ", kortnummer: " + kortnummer + ", PIN: " + kode + ", sperret kort? " + isSperret(); 
	}
	
	public abstract boolean sjekkPIN(int kode) {
		//Sjekk om pinkoden er gyldig
	}
	
	
}
