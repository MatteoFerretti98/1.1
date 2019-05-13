
public class Dado {
	public int lancio() {
		return 1+(int)(Math.random()*6);
	}
	public String toString() {
		return "E' uscito "+lancio();
	}
	public Boolean pari() {
		if ((lancio()%2)==0) {System.out.println("il numero è pari!  ");
		return true;
		}
		return false;
	}
}
