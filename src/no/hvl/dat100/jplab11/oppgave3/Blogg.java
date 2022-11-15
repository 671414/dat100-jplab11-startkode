package no.hvl.dat100.jplab11.oppgave3;

import java.util.Arrays;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

	// TODO: objektvariabler

	private Innlegg[] innleggtabell;
	private int nesteLedige;

	public Blogg() {
		this.innleggtabell = new Innlegg[20];
		this.nesteLedige = 0;

//		throw new UnsupportedOperationException(TODO.constructor("Blogg"));
	}

	public Blogg(int lengde) {
		this.innleggtabell = new Innlegg[lengde];
		this.nesteLedige = 0;

//		throw new UnsupportedOperationException(TODO.constructor("Blogg"));
	}
	
	public int getAntall() {
		int antall=0;
		for (int i = 0; i < innleggtabell.length; i++) {
			if (innleggtabell[i] != null) 
				antall++;
				
			}
		return antall;
		}
		
	
//ortedOperationException(TODO.method());
	

	
	public Innlegg[] getSamling() {
	Innlegg [] tabell = new Innlegg [0];
	tabell = innleggtabell;

	return tabell;

//		throw new UnsupportedOperationException(TODO.method());

	}

	// finner posisjonen til gitt objekt
	public int finnInnlegg(Innlegg innlegg) {
		int pos = 0;
		boolean funnet = false;
		while (pos < nesteLedige && !funnet) {
			if (innleggtabell[pos].erLik(innlegg)) {
				funnet = true;
			}else 
					pos++;
		}	
		if (funnet)
			return pos;
		else
			return -1;
		}
//		throw new UnsupportedOperationException(TODO.method());
	

	public boolean finnes(Innlegg innlegg) {

		int pos = finnInnlegg(innlegg);
		if (pos >= 0) // funnet!
			return true;
		else
			return false;
//		throw new UnsupportedOperationException(TODO.method());
	}

	public boolean ledigPlass() {
		boolean ledig = false;

		if (nesteLedige < innleggtabell.length) {
			ledig = true;
		}
		return ledig;
	}

//		throw new UnsupportedOperationException(TODO.method());


	public boolean leggTil(Innlegg innlegg) {
		// TODO - START
		
		boolean finnes = finnInnlegg(innlegg) == -1; // sjekker at ID ikke finnes fra før. 
		if (finnes && nesteLedige < innleggtabell.length) { // sjekker at det er ledig plass
			innleggtabell[nesteLedige] = innlegg; // setter inn innlegget på neste ledige plass...
			nesteLedige++;
			return true;
		} else
			return false;
	}
	
	public String toString() {
		
		String str="";
		String hjelp="";
		int i = 0;
		while(i< innleggtabell.length && innleggtabell[i] != null) { // gjør at den er innenfor lengden og at den ikke er lenger en logisk tabell.
		 hjelp	 = innleggtabell[i].toString();
		 str += hjelp;
		 i++;
		}
		str= getAntall()+ "\n" + str;
		
		return str;
		
		
//		throw new UnsupportedOperationException(TODO.method());
	}

	// valgfrie oppgaver nedenfor

	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}

	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());

	}

	public boolean slett(Innlegg innlegg) {
		int pos = finnInnlegg(innlegg);
		if (pos >= 0) {
			innleggtabell[pos] = innleggtabell[nesteLedige - 1];
			innleggtabell[nesteLedige -1] = null;
			nesteLedige--;
			return true;
		} else { 
			return false;
		}

//		throw new UnsupportedOperationException(TODO.method());
	}

	public int[] search(String keyword) {

		throw new UnsupportedOperationException(TODO.method());

	}
}