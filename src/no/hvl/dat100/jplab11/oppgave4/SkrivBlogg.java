package no.hvl.dat100.jplab11.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn ) {
	
		


		
		boolean skrevet = true;
		PrintWriter skriver =null;
		
		try {
			skriver = new PrintWriter(mappe+filnavn); 
			
			 
			String innlegg = samling.toString(); // 
			skriver.println(innlegg); //skriver teksten inn i filen
				
		
		}
			catch (FileNotFoundException e) { // om filen ikke blir funnet
				skrevet = false;
		}
	
	
		finally {
			if (skriver != null)
			skriver.close();
			}
		return skrevet;
//	throw new UnsupportedOperationException(TODO.method());
}
}
	

