package Esercitazione_15_04_2019;

public class Insegnante extends Persona  {
	private final int n=5;
	private static int numCorsi = 0;
	private String []Corsi = new String[n];
	public Insegnante(String name, String address) {
		this.name = name;
		this.address = address;
	}
	public boolean AggiungiCorso(String Corso) {
		for(int i=0;i<numCorsi;i++) {
			if(Corsi[i]==Corso||numCorsi>4) {
				System.out.println("Numero massimo raggiunto o Corso "+Corso+" già esistente");
				return false;	
			}
		}
		Corsi[numCorsi]=Corso;
		numCorsi++;
		return true;
	}
	public boolean RimuoviCorso(String Corso) {
		for(int i=0;i<numCorsi;i++) {
			if(Corsi[i]==Corso) {
				for(int m=i;m<numCorsi-1;m++) {
					Corsi[m]=Corsi[m+1];
				}
				i=numCorsi;
				numCorsi--;
				System.out.println("Dopo aver rimosso "+Corso+" il numero di corsi è: "+numCorsi);
				return true;
			}
		}
		return false;
	}
	public String toString() {
		return "Insegnante: "+super.toString();
	}
	public void stampacorsi() {
		int i=0;
		for(i=0;i<numCorsi;i++) {
			if (Corsi [i]!=null) {
			System.out.println(" Corso: "+Corsi[i]);
			}
		}
	}
}
   
