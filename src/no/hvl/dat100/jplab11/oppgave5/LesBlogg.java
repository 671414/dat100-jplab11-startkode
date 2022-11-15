package no.hvl.dat100.jplab11.oppgave5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;
import no.hvl.dat100.jplab11.oppgave2.*;
import no.hvl.dat100.jplab11.oppgave3.*;

import javax.swing.JOptionPane;

public class LesBlogg {

	private static String TEKST = "TEKST";
	private static String BILDE = "BILDE";

	public static Blogg les(String mappe, String filnavn) {
		// IKKE FULLFØRT
		
		
		Blogg nyBlogg;
		BufferedReader reader;
		//for å lagre info jeg leser 
		String str;
		
			try {
				reader = new BufferedReader(new FileReader(mappe+filnavn));
				int lengde = Integer.parseInt(reader.readLine()); // dette er antall innlegg lagret, altså første linje
				String [] blogg = new String [lengde];
		
				while (reader.readLine() != null) {
					// Identifiserer innleggstype
					if (reader.readLine() == TEKST) {
						int i=0;
						while ( reader.readLine() != BILDE) {
							
							blogg[i] =  reader.readLine();
							i++;
						}
						// lagrer linjen som String midlertidig.
						
					
						
						// eller skal jeg hente tekst og sette det i tabellen?
						
					} else { 
						if (reader.readLine()== BILDE) {
							str = reader.readLine();
							System.out.println(str);
							
							
						}
					}
		
				}
			}	catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return nyBlogg;
			
			
			// pauser dette og gjør noe annet. 
					
		// skjønner ikke hvorfor det ikke skal leses inn likt...og i så fall hvordan skal jeg skille det?
		
//		throw new UnsupportedOperationException(TODO.method());

	} 
	
		}
	
	