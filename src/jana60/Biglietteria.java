package jana60;

import java.util.Scanner;

public class Biglietteria {

	public static void main(String[] args) {

		// apro lo scanner
		Scanner scan = new Scanner(System.in);

		// chiedo all'utente i dati
		System.out.print("Inserisci i km da percorrere: ");
		double inputKm = Double.parseDouble(scan.nextLine());
		System.out.print("Inserisci la tua età: ");
		int inputEtà = Integer.parseInt(scan.nextLine());

		// stampo a video l'importo da saldare
		Biglietto biglietto = new Biglietto(inputKm, inputEtà);
		System.out.println("Il prezzo del biglietto è di " + biglietto.importoFormattato());

		// chiudo lo scanner
		scan.close();
	}

}
