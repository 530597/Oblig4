import java.util.Date;

public class Gjest extends Kort {
	private String navn;
	private Date opprettet;	//tidspunktet kortet er levert ut/aktivert
	private int riktigPin;
	private Date now;
	private long oneWeekInMillisec = 604800000;
	
	public Gjest(String navn, int riktigPin) {
		super();
		this.navn = navn;
		this.riktigPin = 9999;		//Gjest-kort skal ikke ha andre koder enn 9999
		now = new Date();
		opprettet.setTime(0);
	}
	
	public Gjest(String navn, int riktigPin, Date opprettet) {
		super();
		this.navn = navn;
		this.riktigPin = riktigPin;
		now = new Date();
		this.opprettet = opprettet;
	}
	
	public boolean sjekkPIN(int pin) {
		if(opprettet.getTime() > 0){	//sjekker om opprettelsestidspunktet er registrert.
			if(now.before(opprettet)) {	//Hvis kortet prøves å brukes før det har blitt aktivert
				return false;
			}else if(now.getTime() > opprettet.getTime() + oneWeekInMillisec){	//Hvis kortet har vært aktivert lenger enn en uke
				return false;
			}
		}else if (super.isSperret()) {	//hvis kortet er sperret
			return false;
		}else if(riktigPin != pin){	//hvis pinkoden ikke stemmer
			return false;
		}else{	//hvis det er under en uke, kortet ikke er sperret og pinkoden stemmer
			return true;
		}
		return false;
	}
	
	
}
