package it.polito.tdp.libretto.model;

import java.util.*;

public class Libretto {
	LinkedList <Voto> voti;


	public Libretto() {
		voti = new LinkedList <Voto>();

	}

	public void add(Voto v) {

		voti.add(v);
	}
	public void add(Voto v, int esito) {
		if(v.getVoto()==esito)
			voti.add(v);

	}

	public String Elenco() {
		String risultato = "";
		for(Voto v : this.voti) {
			risultato+= "Esame: "+v.getNomeCorso()+" - Voto: "+v.getVoto()+" - Data:"+v.getData()+"\n";
		}
		return risultato;
	}
	/*public String ElencoVotiUguali() {
		String risultato = "";
		for(Voto v : this.voti) {
			risultato+= "Esame: "+v.getNomeCorso()+" - Data:"+v.getData()+"\n";
		}
		return risultato;
	}*/
	public String cercaEsame(String esame) {
		Voto v = null;
		for(Voto vv: voti) {
			if(vv.getNomeCorso().equals(esame))
				v = vv;
		}
		if(v==null) 
			return "ESAME NON TROVATO";
		else
		return v.toString();
	}
	
	public String esameEsistente(Voto esame) {
		boolean esiste = false;
		for(Voto v : voti) {
			if(v.getNomeCorso().equals(esame.getNomeCorso()) && v.getVoto()==esame.getVoto())
				esiste = true;
			
		}
		if(esiste == true)
			return "ESAME ESISTENTE CON STESSO VOTO";
		else
			return "ESAME NON TROVATO";
	}
	public String stampati(Voto voto) {
		return voto.toString();
	}
}
