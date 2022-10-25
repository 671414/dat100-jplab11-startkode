package no.hvl.dat100.jplab11.oppgave1;

import no.hvl.dat100.jplab11.common.TODO;

public abstract class Innlegg {
	
		protected int id;
		protected String bruker;
		protected String dato;
		protected int likes;
	
	public Innlegg() {
		
	}
	
	public Innlegg(int id, String bruker, String dato) {

		this.id=id;
		this.bruker=bruker;
		this.dato=dato;
		this.likes=0;
//		throw new UnsupportedOperationException(TODO.constructor("Innlegg"));
	}

	public Innlegg(int id, String bruker, String dato, int likes) {

		this.id=id;
		this.bruker=bruker;
		this.dato=dato;
		this.likes=likes;
		
//		throw new UnsupportedOperationException(TODO.constructor("Innlegg"));
	}
	
	public String getBruker() {
		return this.bruker;
//		throw new UnsupportedOperationException(TODO.method());

	}

	public void setBruker(String bruker) {
		this.bruker=bruker;
		
//		throw new UnsupportedOperationException(TODO.method());
	}

	public String getDato() {
		return this.dato;
//		throw new UnsupportedOperationException(TODO.method());
		
	}

	public void setDato(String dato) {
		this.dato=dato;
//		throw new UnsupportedOperationException(TODO.method());
	}

	public int getId() {
		return this.id;
//		throw new UnsupportedOperationException(TODO.method());

	}

	public int getLikes() {
		return this.likes;
//		throw new UnsupportedOperationException(TODO.method());

	}
	
	public void doLike () {
		this.likes+=1;
//		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean erLik(Innlegg innlegg) {
		boolean lik=false; // utgangspunktet er at id ikke samsvarer med innlegg id
		
		if (getId() == innlegg.getId()) {
			lik = true;
		}
		return lik;
		
		
//		throw new UnsupportedOperationException(TODO.method());

	}
	
	@Override
	public String toString() {
		String str;
		
		str= this.id + "\n" + this.bruker + "\n" + this.dato + "\n" + this.likes + "\n";
		
		return str;
//		throw new UnsupportedOperationException(TODO.method());
				
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
