package no.hvl.dat100.jplab11.oppgave2;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Tekst extends Innlegg {

	protected String tekst; 
	
	public Tekst () {
		
	}
	
	public Tekst(int id, String bruker, String dato, String tekst) {
		this.id=id;
		this.bruker=bruker;
		this.dato=dato;
		this.likes=0;
		this.tekst=tekst;
//		throw new UnsupportedOperationException(TODO.constructor("Tekst"));
	}
	
	public Tekst(int id, String bruker, String dato, int likes, String tekst) {
		this.id=id;
		this.bruker=bruker;
		this.dato=dato;
		this.likes=likes;
		this.tekst=tekst;
//		throw new UnsupportedOperationException(TODO.constructor("Tekst"));
	}
	
	public String getTekst() {
		return this.tekst;
//		throw new UnsupportedOperationException(TODO.method());

	}

	public void setTekst(String tekst) {
		this.tekst=tekst;
//		throw new UnsupportedOperationException(TODO.method());
	}

	@Override
	public String toString() {
		// Denne funker, men jeg ønsker egentlig å bruke metoden fra Innlegg.
		String str = "TEKST" + "\n" + this.id + "\n" + this.bruker + "\n" + this.dato + "\n" + this.likes + "\n" +  tekst + "\n" ;
	return str;
//		throw new UnsupportedOperationException(TODO.method());

	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
			
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
