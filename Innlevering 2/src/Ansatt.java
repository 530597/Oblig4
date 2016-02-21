import java.util.Calendar;

public class Ansatt extends Kort {
	private String navn;
	private int riktigPin;
	Calendar now;
	//Kort kort = new Kort();
	
	public Ansatt(String navn, int riktigPin){
		super();
		this.navn = navn;
		this.riktigPin = riktigPin;
		now = Calendar.getInstance();
	}
	
	public boolean sjekkPIN(int pin) {
		if (now.get(Calendar.DAY_OF_WEEK) != 1 && now.get(Calendar.DAY_OF_WEEK) != 7 ) {	//hverdag
			if (now.get(Calendar.HOUR_OF_DAY) > 6 && now.get(Calendar.HOUR_OF_DAY) > 18) { //klokka mellom 07 og 17
				return true;
			}
			return false; 	//ikke hverdag
		}else if (super.isSperret()) {
			return false;		//kortet er sperret
		} else {
			if (riktigPin == pin) {
				return true;		//det er utenfor arbeidstiden, og pinkoden er riktig
			}
		}
		return false;			//det er utenfor arbeidstiden og pinkoden er feil
			
	}

} 