import java.util.Scanner;

public class SnuTekst {
	
	public static int teller = 0;
	
	public static void baklengs(String tekst, int siste) {
		if (siste >= 0) {
			teller ++;
			System.out.print(tekst.charAt(siste));
			baklengs(tekst, siste--);
		}
	}
	
	public static void baklengs(String tekst) {
		int siste = tekst.length() - 1;
		baklengs(tekst, siste);
	}

	public static void main(String[] args) {
		Scanner leser = new Scanner(System.in);
		System.out.println("Skriv inn en tekst: ");
		String tekst = leser.nextLine();
		leser.close();
		
		System.out.println("Teksten baklengs er: ");
		baklengs(tekst);
		System.out.println("");
		System.out.println("Teksten har " + teller + " tegn.");
	}
}
