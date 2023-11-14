package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
	
		Random rnd = new Random();

		
		private int codice;
		private String nome;
		private String descrizione;
		private float prezzo;
		private int iva;
		
		Prodotto( String nome, String descrizione, float prezzo, int iva){
			
			setCodice(rnd.nextInt(9_999_999));
			setNome(nome);
			setDescrizione(descrizione);
			setPrezzo(prezzo);
			setIva(iva);
			
		}
		
		public int getCodice() {
			
			return this.codice;
		
		}
		
		
		// Setter post-correzione
		private  void setCodice(int codice) {
			
			this.codice = codice;
		
		}
		
		
//		**concettualmente corretto, formalmente scorretto		
//		private  void setCodice() {
//			
//			Random rnd = new Random();
//			
//			this.codice = rnd.nextInt(9_999_999);
//		
//		}
		
		public String getCodicePaddato() {
			
			
			String strCodice = String.valueOf(this.codice);
			String pad ="";
			for(int x =strCodice.length(); x<8; x++) {
				
				pad+="0";
				
			}
			
			String codicePaddato = pad + strCodice;
			
			return codicePaddato;
			
		}
		
		public String getNome() {
			
			return this.nome;
		}
		
		public void setNome(String nome) {
			
			this.nome = nome;
		}
	
		
		public String getDescrizione() {
			
			return this.descrizione;
		}
		
		public  void setDescrizione(String descrizione) {
			
			this.descrizione = descrizione;
		}
		
		public float getPrezzo() {
			
			return this.prezzo;
		}
		
		public  void setPrezzo(float prezzo) {
			
			this.prezzo = prezzo;
		}
		
		public int getIva() {
			
			return this.iva;
		}
		
		public  void setIva(int iva) {
			
			this.iva = iva;
		}
		
		public float getPrezzoIvato () {
			
			float prezzoIvato = this.prezzo + (this.prezzo * (this.iva / 100.0f));
			
			return prezzoIvato;
			
		}
		
		public String getCodiceENome() {
			
			String codiceENome = String.valueOf(this.codice) + "-" + this.nome;
			
			return codiceENome;
		}
		
		
	}
