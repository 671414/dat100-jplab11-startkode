package no.hvl.dat100.jplab11.oppgave3;

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
//		TODO returnerer antall lagrede innlegg i tabellen, alt som ikke har verdi 0
		int i = 0;
		while (nesteLedige !=0) {
			i++;
			}
			System.out.print(i);
			return i;
		}
		
//		throw new UnsupportedOperationException(TODO.method());
	

	// kommer tilbake til den
	public Innlegg[] getSamling() {
		Innlegg[] tabell = innleggtabell;

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

// vet ikke hvorfor det ikke funker, legger bare ikke inn innlegget...
	public boolean leggTil(Innlegg innlegg) {
		// TODO - START
		
		boolean finnes = finnInnlegg(innlegg) == -1; // sjekker at ID ikke finnes fra før. Har også en versjon som bruker finnes
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
		
		for(int i = 0; i< innleggtabell.length;i++) {
		 hjelp	 = innleggtabell[i].toString();
		 str += hjelp;
		
		}
		str= getAntall()+ "\n" + str;
		return str;
		// get antall blir printet ut mellom hver innlegg
		
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

		throw new UnsupportedOperationException(TODO.method());
	}

	public int[] search(String keyword) {

		throw new UnsupportedOperationException(TODO.method());

	}
}