package Esercitazione_15_04_2019;

public class Test {
	public static void main(String[] args) {
		Studente ah = new Studente("Angelo","Via degli angeli");
		Insegnante bh = new Insegnante("Emanuele","Via della nullafacenza");
		ah.AggiungiEsame("Analisi1", 21);
		ah.AggiungiEsame("Analisi2", 21);
		ah.AggiungiEsame("Analisi3", 21);
		ah.AggiungiEsame("Analisi4", 21);
		ah.AggiungiEsame("Analisi5", 21);
		ah.AggiungiEsame("Analis6i", 21);
		ah.AggiungiEsame("Analisi7", 21);
		ah.AggiungiEsame("Ana8lisi", 21);
		ah.AggiungiEsame("Anal9isi", 21);
		ah.AggiungiEsame("Anali5si", 21);
		ah.AggiungiEsame("Analis3i", 21);
		ah.AggiungiEsame("4Analisi", 21);
		ah.AggiungiEsame("A5nalisi", 21);
		ah.AggiungiEsame("An6alisi", 21);
		ah.AggiungiEsame("Ana7lisi", 21);
		ah.AggiungiEsame("Anal67isi", 21);
		ah.AggiungiEsame("Analis34i", 21);
		ah.AggiungiEsame("Analisi", 21);
		ah.AggiungiEsame("36Analisi", 21);
		ah.AggiungiEsame("A465nalisi", 21);
		ah.AggiungiEsame("Ana64lisi", 21);
		ah.AggiungiEsame("Ana456lisi", 21);
		ah.AggiungiEsame("A646nalisi", 21);
		ah.AggiungiEsame("Ana6546lisi", 21);
		ah.AggiungiEsame("Anali45645si", 21);
		ah.AggiungiEsame("Ana65468lisi", 21);
		ah.AggiungiEsame("elettrotecnica", 30);
		ah.AggiungiEsame("elettrota", 30);
		ah.AggiungiEsame("elettroecnica", 30);
		ah.AggiungiEsame("eletttecnica", 30);
		ah.AggiungiEsame("elrotecnica", 30);
		ah.StampaVoti();
		System.out.println("La media è: "+ah.Media());
		System.out.println(ah.toString());
		bh.AggiungiCorso("Meccanica razionale");
		bh.AggiungiCorso("Meccanica razionalde");
		bh.AggiungiCorso("Meccanica razionasdle");
		bh.AggiungiCorso("Meccanica razi45onale");
		bh.AggiungiCorso("Automatica");
		bh.AggiungiCorso("Meccanica razionale");
		bh.AggiungiCorso("fisica");
		bh.RimuoviCorso("Automatica");
		bh.stampacorsi();
		System.out.println(bh.toString());
	}
}
