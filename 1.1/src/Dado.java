
public class Dado {
	public int lancio() {
		return 1+(int)(Math.random()*6);
	}
	public String toString() {
		
		return "E' uscito "+lancio();
	}
}
