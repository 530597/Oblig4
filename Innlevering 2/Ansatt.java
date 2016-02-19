import java.util.Date;

public class Ansatt extends Kort {
	
	Date now = new Date();
	Kort kort = new Kort();
	
	public boolean sjekkPIN(int kode) {
		if (klokka mellom 07-17) {
			return true;
		}else if (isSperret()) {
			return false;
		} else {
			if (kort.getKode()) == kode) {
				return true;
			}
		}
		return false;
			
	}

}
   ,m