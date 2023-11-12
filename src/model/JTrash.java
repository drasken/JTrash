package model;

import model.Card.Segno;
import model.Card.Valore;

public class JTrash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Il gioco va lanciato da qui
		
		// Qui scrivo i test. CANCELLARE DOPO!!
		
		//Create classe Carta
		Card c1 = new Card(Segno.CUORI, Valore.QUATTRO);
     	Card c2 = new Card(Segno.PICCHE, Valore.ASSO);
		Card c3 = new Card(Segno.QUADRI, Valore.RE);
		System.out.println(c1.getSegno()); //ok funziona

		
		//Create Deck class
		Deck d1 = new Deck();
		System.out.println(d1.toString()); // Print numero di carte --> 54
		d1.Scarta();
		System.out.println(d1.toString());// Funziona, print numero di carte 53
		
		//Create Player Class
		Player p1 = new Player("Rudy");
		System.out.println(p1.toString());


	}

}
