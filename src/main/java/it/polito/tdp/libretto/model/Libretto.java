package it.polito.tdp.libretto.model;

import java.util.*;

public class Libretto {
	LinkedList <Voto> voti;
	List<Voto>votiUguali;
	
	public Libretto() {
		voti = new LinkedList <Voto>();
		votiUguali = new LinkedList<Voto>();
	}
	
	public void add(Voto v) {
		
		voti.add(v);
	}
	public void add(Voto v, int esito) {
		if(v.getVoto()==esito)
			votiUguali.add(v);
			
	}
	
	public String Elenco() {
		 String risultato = "";
		 for(Voto v : this.voti) {
			 risultato+= "Esame: "+v.getNomeCorso()+" - Voto: "+v.getVoto()+" - Data:"+v.getData()+"\n";
		 }
		 return risultato;
	}
	public String ElencoVotiUguali() {
		 String risultato = "";
		 for(Voto v : this.votiUguali) {
			 risultato+= "Esame: "+v.getNomeCorso()+" - Data:"+v.getData()+"\n";
		 }
		 return risultato;
	}
}
