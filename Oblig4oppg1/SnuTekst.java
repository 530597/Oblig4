import java.util.Scanner;

public class SnuTekst {
	
	public static int teller = 0;
	
	public static void baklengs(String tekst) {
		int lengde = tekst.length();
		if (lengde > 0) {
			teller ++;
			System.out.print(tekst.charAt(lengde-1));
			String nyTekst = tekst.substring(0, lengde-1);
			baklengs(nyTekst);
		}
	}

	public static void main(String[] args) {
		Scanner leser = new Scanner(System.in);
		System.out.println("Skriv inn en tekst: ");
		String tekst = leser.nextLine();
		leser.close();
		
		System.out.println("Teksten baklengs er: ");
		baklengs(tekst);
		System.out.println("Teksten har " + teller + " tegn.");
	}
}




