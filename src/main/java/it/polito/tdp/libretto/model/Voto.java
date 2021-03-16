package it.polito.tdp.libretto.model;

import java.time.LocalDate;

public class Voto {
	private String nomeCorso;
	private int voto;
	private LocalDate data;

	public Voto(String nomeCorso, int voto, LocalDate data) {
		
		this.nomeCorso = nomeCorso;
		this.voto = voto;
		this.data = data;
	}
	public int getVoto() {
		return voto;
	}
	public void setVoto(int voto) {
		this.voto = voto;
	}
	public String getNomeCorso() {
		return this.nomeCorso;
	}
	public void setNomeCorso(String nome) {
		this.nomeCorso = nome;
	}
	public LocalDate getData() {
		return this.data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return " [nomeCorso=" + nomeCorso + ", voto=" + voto + ", data=" + data + "]";
	}
	
}
