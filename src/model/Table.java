package model;

import java.util.ArrayList;

public class Table {
	
	private ArrayList<Deck> carteTavolo = new ArrayList();
	// In base al numero di giocatori crea numero carteTavolo
	
	private ArrayList<Player> giocatoriAlTavolo = new ArrayList();
	
	//Implementare Logica per inizializzare numero giocatori in schermata principale
	// poi l'input arriverà da controller
		
	
	//Crea numero di mazzi in base a quanti giocatori, creati in Main
	public Table(int numeroGiocatori) {
		for (int i = 0; i < numeroGiocatori; i++) {
			this.giocatoriAlTavolo.add(new Player("Giocatore " + i)); //per ora Type Mismatch tipo in ma usare per metodo
		}
		createPublicDeck();
	}
	
	//implementa metodo che moltiplica numero di mazzi in base a quanti sono, in classe deck
	private void createPublicDeck() {
		this.carteTavolo.clear();
		if (giocatoriAlTavolo.size() < 3) {
			this.carteTavolo.add(new Deck());
		}
		if (giocatoriAlTavolo.size() > 4) {
			for (int i = 0; i < 3; i++) {
				this.carteTavolo.add(new Deck());
			}
		}
		else {
			this.carteTavolo.add(new Deck());
			this.carteTavolo.add(new Deck());
		}
	}

	@Override
	public String toString() {
		return "Table [carteTavolo=" + carteTavolo.size() + ", giocatoriAlTavolo=" + giocatoriAlTavolo + "]";
	}

	public int getCarteTavolo() {
		return carteTavolo.size();
	}


}
