package it.polito.tdp.libretto.model;

import java.time.LocalDate;

public class TestLibretto {

	public static void main(String[] args) {

		Libretto libretto = new Libretto();
		Libretto librettoVotiUguali = new Libretto();

		Voto voto1 = new Voto("Analisi 1", 25, LocalDate.of(2018, 2, 16));
		libretto.add(voto1);
		
		Voto voto2 = new Voto("Informatica", 27, LocalDate.of(2018, 9, 7));
		libretto.add(voto2);

		Voto voto3 = new Voto("Chimica", 25, LocalDate.of(2020, 9, 2));
		libretto.add(voto3);
		
		Voto voto4 = new Voto("Fisica 1 ", 19, LocalDate.of(2018, 9, 12));
		libretto.add(voto4);
		
		Voto voto5 = new Voto("Algebra Lineare", 25, LocalDate.of(2018, 7, 15));
		libretto.add(voto5);
		
		Voto voto6 = new Voto("Etica delle tecniche", 29, LocalDate.of(2018, 7, 1));
		libretto.add(voto6);
		
		for(Voto v : libretto.voti) {
			librettoVotiUguali.add(v, 25);
		}
		
		
			System.out.print(libretto.Elenco());
			System.out.println("\n------Esami superati con 25------");
			System.out.print(librettoVotiUguali.ElencoVotiUguali());
		
	}

}
