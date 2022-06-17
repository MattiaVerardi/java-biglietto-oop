package jana60;

import java.util.Scanner;

/*BONUS: Quando si manda in esecuzione la classe Biglietteria, dopo un messaggio di benvenuto appare un menu in cui l’utente 
* può scegliere se inserire un nuovo biglietto o se terminare il programma. 
* Se l’utente sceglie di inserire un biglietto, 
* il programma chiede i dati del biglietto e stampa il prezzo. 
* Dopo di che ripresenta la scelta se inserire un biglietto o terminare il programma. Il programma termina solo se l’utente sceglie di terminare.
* 
* BONUS: riepilogo il cliente ha comprato tot biglietto, tot euro e tot km
*/

public class BiglietteriaBonus {

	public static void main(String[] args) {

		// apro lo scanner
		Scanner scan = new Scanner(System.in);

		// chiedo all'utente se vuole nuovamente acquistare
		String risposta;
		boolean esito = false;
		System.out.println("Benvenuto, se desideri acquistare un biglietto, inserisci i dati");
		do {
			System.out.print("Inserisci i km da percorrere: ");
			double inputKm = Double.parseDouble(scan.nextLine());
			System.out.print("Inserisci la tua età: ");
			int inputEtà = Integer.parseInt(scan.nextLine());
			Biglietto biglietto = new Biglietto(inputKm, inputEtà);
			System.out.println("Il prezzo del biglietto è di " + biglietto.importoFormattato());
			System.out.println("Desideri acquistare un nuovo biglietto?");
			risposta = scan.nextLine();
			if (risposta.equalsIgnoreCase("si")) {
				esito = true;
			} else if (risposta.equalsIgnoreCase("no")) {
				esito = false;
			}
		} while (esito == true);

		// chiudo lo scanner
		scan.close();

	}

}
