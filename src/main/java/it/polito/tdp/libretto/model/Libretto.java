package it.polito.tdp.libretto.model;

import java.util.LinkedList;

public class Libretto {
	LinkedList <Voto> voti;
	
	public Libretto() {
		voti = new LinkedList <Voto>();
	}
	
	public void add(Voto v) {
		voti.add(v);
	}
	
	public String Elenco() {
		 String risultato = "";
		 for(Voto v : this.voti) {
			 risultato+= "Esame: "+v.getNomeCorso()+" - Voto: "+v.getVoto()+" - Data:"+v.getData()+"\n";
		 }
		 return risultato;
	}
}
