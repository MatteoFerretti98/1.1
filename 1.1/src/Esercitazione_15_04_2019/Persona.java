package Esercitazione_15_04_2019;

public class Persona {
	protected String name;
	protected String address;
	public Persona() {};
	public Persona(String name, String address){
		this.name = name;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String toString() {
		return "'"+name+"("+address+")'";
	}
}
