import java.util.Date;

public class Gjest extends Kort {
	
	Date now = new Date();
	
	if(opprettet > now+7dager) {
		return false;
	}else if (isSperret()==true) {
		return false;
	}
	return true;
}
