package org.lessons.java.shop;

public class Prodotto {
	
	private int codice;
	private String nome;
	private String descrizione;
	private int prezzo;
	private int iva;
	
	public Prodotto(int codice, String nome, String descrizione, int prezzo,  int iva) {
		
		setCodice(codice);
		setNome(nome);
		setDescrizione(descrizione);
		setPrezzo(prezzo);
		setIva(iva);
	}
	
	public int getCodice() {
		return codice;
	}
	
	public void setCodice(int codice) {
		this.codice = codice;
	}
	
	
	public int getNome() {
		return nome;
	}
	
	public void setNome(int nome) {
		this.nome = nome;
	}
}
