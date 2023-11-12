package model;

import java.util.ArrayList;

public class Player {
	
	// Idee per campi Player
	// Carte che hai in mano, punteggio, posizione(?)
	
	private String nome;
	private ArrayList<Card> mano = new ArrayList<Card>();
	private int punteggio = 0;
	
	//Costruttore non singleton ma generare nome casuale a seconda numero giocatori 
	public Player(String nome) {
		this.nome = nome;
	}
	
	
	
	@Override
	public String toString() {
		return "Player [il mio nome è =" + nome + "]";
	}

	

}
