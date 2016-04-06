import java.util.Scanner;

public class TowerOfHanoi {
	
	private static int teller = 0;
	
	public static void main(String[] args) {
		Scanner leser = new Scanner(System.in);
		System.out.println("Skriv inn antall skiver: ");
		int ant = leser.nextInt();
		leser.close();
		
		System.out.println("Flyttingene av skivene er: ");
		flyttSkiver(ant, 'A', 'B', 'C');
		System.out.println("Totalt antall flyttinger er " + teller);
	}
	
	public static void flyttSkiver(int n, char fraTaarn, char tilTaarn, char viaTaarn) {
		teller ++;
		if (n ==1) {
			System.out.println("Flytt skive " + n + " fra " + fraTaarn + " til " + tilTaarn);
		} else {
			flyttSkiver(n - 1, fraTaarn, viaTaarn, tilTaarn);
			System.out.println("Flytt skive " + n + " fra " + fraTaarn + " til " + tilTaarn);
			flyttSkiver(n - 1, viaTaarn, tilTaarn, fraTaarn);
		}
	}
}

