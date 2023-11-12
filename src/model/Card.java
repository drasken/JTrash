package model;

public class Card {
	/**
	 * Una enum per i Segni delle carte
	 */
	public enum Segno {CUORI,QUADRI,FIORI,PICCHE}
	
	/**
        * Una enum  per i valori delle carte
        */
	public enum Valore{ASSO,DUE,TRE,QUATTRO,CINQUE,SEI,SETTE,OTTO,NOVE,DIECI,FANTE,DONNA,RE,JOLLY}
	
	private Segno segno;
	private Valore valore;
	
	/**
        * Costruttore per la classe Card, necessita i seguenti parametri
        * @param segno
        * @param valore
        */
	public Card(Segno segno, Valore valore) {
		this.segno = segno;
		this.valore = valore;
	}

	public Segno getSegno() {
		return segno;
	}

	public Valore getValore() {
		return valore;
	}
	
	// Override toString() method to print card details
        @Override
        public String toString() {
            if (valore == Valore.JOLLY) {
                return "Jolly";
            } else {
                return valore + " di " + segno;
            }
        }

}
