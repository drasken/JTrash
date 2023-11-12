package model;

import java.util.ArrayList;

public class Deck {
	
	public ArrayList <Card> cards = new ArrayList<Card>();
	
	public Deck() {
		for (Card.Segno segno : Card.Segno.values()) {
			for (Card.Valore valore : Card.Valore.values()) {
				if (valore != Card.Valore.JOLLY) {
					cards.add(new Card(segno, valore));
				}
			}
		}
		cards.add(new Card(null, Card.Valore.JOLLY));
		cards.add(new Card(null, Card.Valore.JOLLY));
		
		
	}

	@Override
	public String toString() {
		return "Deck [cards= nel mazzo ci sono " + cards.size() + " carte]";
	}
	
	public void Scarta(){
		cards.remove(0);
	 }


}
