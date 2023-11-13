package org.lessons.java.shop;

public class Main {

	public static void main(String[] args) {
		
		
		Prodotto prodotto = new Prodotto("tappeto", "un bel tappeto", 10.00f, 25);
		
		System.out.println("codice:"+ prodotto.getCodice() + "\n--------");
		
		System.out.println("prezzo ivato " + String.format("%.02f", prodotto.getPrezzoIvato())+ "\n--------"); 

		System.out.println("codice + nome " + prodotto.getCodiceENome() + "\n--------");
		
		
		System.out.println("nome prodotto prima " + prodotto.getNome());
		prodotto.setNome("pallone");
		System.out.println("nome prodotto dopo " + prodotto.getNome() + "\n--------");
		
		System.out.println("Descrizione prodotto prima " + prodotto.getDescrizione());
		prodotto.setDescrizione("un brutto pallone");
		System.out.println("Descrizione prodotto dopo " + prodotto.getDescrizione() + "\n--------");
		
		System.out.println("Prezzo prodotto prima " + prodotto.getPrezzo());
		prodotto.setPrezzo(7.00f);
		System.out.println("Prezzo prodotto dopo " + prodotto.getPrezzo() + "\n--------");
		
		System.out.println("Iva prodotto prima " + prodotto.getIva());
		prodotto.setIva(10);
		System.out.println("Iva prodotto dopo " + prodotto.getIva() + "\n--------");
		
		System.out.println("prezzo ivato dopo " + String.format("%.02f", prodotto.getPrezzoIvato()) + "\n--------"); 
		
		System.out.println("codice + nome dopo " + prodotto.getCodiceENome() + "\n--------");
		
		System.out.println("--------BONUS--------");
		
		System.out.println("codice:"+ prodotto.getCodice() );
		
		System.out.println("codice paddato:"+ prodotto.getCodicePaddato() + "\n--------");

		

		
	}

}
