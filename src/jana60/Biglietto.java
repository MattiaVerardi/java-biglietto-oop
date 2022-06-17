package jana60;

import java.text.DecimalFormat;

/*
 * Consegna: Creare una classe Biglietto con due attributi: chilometri ed et‡ del passeggero.
 * Utilizzare i modificatori dei livelli di accesso per proteggere il funzionamento interno della classe 
 * ed esporre solo uníinterfaccia fatta di metodi public, come abbiamo visto in classe e nelle slide. 
 * La classe deve esporre un metodo che calcola il prezzo del biglietto secondo la logica: 
 * - il prezzo del biglietto Ë definito in base ai km (0.21 Ä al km); 
 * - va applicato uno sconto del 20% per i minorenni; 
 * - va applicato uno sconto del 40% per gli over 65.
 * Aggiungere una classe Biglietteria, eseguibile con metodo main, in cui si chiede allíutente di inserire 
 * il numero di km e líet‡ del passeggero e stampa il prezzo del biglietto calcolato.
 * 
 * IMPORTANTE: il calcolo del prezzo lo deve fare il Biglietto non il main
 */

public class Biglietto {

	// attributi
	private double chilometri;
	private int etaPasseggero;
	private double prezzo = 0.21;
	private DecimalFormat df = new DecimalFormat("0.00 euro");

	// costruttori
	public Biglietto(double chilometri, int etaPasseggero) {
		super();
		this.chilometri = chilometri;
		this.etaPasseggero = etaPasseggero;
	}

	// metodi getter e setter
	public double getChilometri() {
		return chilometri;
	}

	public void setChilometri(double chilometri) {
		this.chilometri = chilometri;
	}

	public int getEt‡Passeggero() {
		return etaPasseggero;
	}

	public void setEt‡Passeggero(int et‡Passeggero) {
		this.etaPasseggero = et‡Passeggero;
	}

	// metodi
	private double calcolaBiglietto() {
		return chilometri * prezzo;
	}

	public double importo() {
		if (etaPasseggero < 18) {
			return (1 - 0.20) * calcolaBiglietto();
		} else if (etaPasseggero > 65) {
			return (1 - 0.40) * calcolaBiglietto();
		} else {
			return calcolaBiglietto();
		}
	}

	public String importoFormattato() {
		return df.format(importo());
	}

}
