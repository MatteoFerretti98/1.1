
public class testBook {
public static void main(String[] args) {
	Author ah1 = new Author ("Mat","nonsogiocare@noob.it",'m');
	Book libro = new Book ("C'era una volta il 3° hokage, ora non piu", 50, ah1, 3);
	System.out.println(libro);
	System.out.println(ah1);
	}
}
