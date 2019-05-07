package Esercitazione_15_04_2019;

public class Studente extends Persona {
	private final int n=30;
	private static int numCorsi = 0;
	private String[] Corsi = new String[n];
	private int [] Voti = new int [n];
	public Studente (String name, String address) {
		this.name = name;
		this.address = address;
	}
	public void AggiungiEsame(String corso, int voto) {
		int i;
		if(numCorsi < n) {
			for(i=0;i<=numCorsi;i++) {
				if(Corsi[i]==corso) {
					i=numCorsi+1;
					System.out.println("Il corso"+corso+" è già presente");
				}
			}
			
			if(--i==numCorsi) {
				
				Corsi[numCorsi] = corso;
				Voti[numCorsi] = voto;
				numCorsi++;
			}
		}
		else
		{
			System.out.println("Numero massimo raggiunto");
		}
		}
	public void StampaVoti() {
		int i=0;
		for(i=0;i<numCorsi;i++) {
			if (!(Corsi [i].isEmpty())) {
					System.out.println(" Corso: "+Corsi[i]+" Voto: "+Voti[i]);
		}
	}
	}
	public String toString() {
		return "Studente: "+super.toString();
	}
	public double Media() {
		int i=0;
		double somma = 0;
		for(i=0;i<numCorsi;i++) {
			somma += Voti[i];	
		}
		return somma/i;
	}

}

