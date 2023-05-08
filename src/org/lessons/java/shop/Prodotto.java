package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
	
	private int codice;
	private String nome;
	private String descrizione;
	private int prezzo;
	private int iva;
	
	Random r = new Random();
	
	public Prodotto(String nome, String descrizione, int prezzo,  int iva) {
		
		codice = r.nextInt(999999999);
		setNome(nome);
		setDescrizione(descrizione);
		setPrezzo(prezzo);
		setIva(iva);

	}
	
//	-------------------------------
	
	public String getFullName() {
		return codice + "-" + nome;
	}
	
	public int getCodice() {
		return codice;
	}
	
//	-------------------------------
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
//	-------------------------------
	public String getDescrizione() {
		return descrizione;
	}
	
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
//	-------------------------------
	public int getPrezzo() {
		return prezzo;
	}
	
	public void setPrezzo(int prezzo) {
		this.prezzo = prezzo;
	}
	
//	-------------------------------
	
	public int getIvaPrice() {
		
		return (int) (getPrezzo() * (1 + getIva() / 100f));
	}
	
//	-------------------------------
	
	public int getIva() {
		return iva;
	}
	
	public void setIva(int iva) {
		this.iva = iva;
	}
	
//	-------------------------------
	
	@Override
	public String toString() {

		return "[" + getCodice() + "] " + getNome()
			+ " - \"" + getFullName() + "\""
			+ "\n" + getDescrizione()
			+ "\n" + getPrezzo()  + "$ (" + getIva() + "%)"
			+ " --> " + getIvaPrice() + "$";
	}
	
}
