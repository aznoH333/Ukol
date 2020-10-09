
public class Octahedron {
	
	private double strana;
	private String name;
	private String jednotka;
	
	Octahedron(String name,double strana){
		this.strana = strana;
		this.name = name;
	}
	
	void objem() {
		System.out.println("Objem "+ this.name + " je " + ((1.0/3.0)*Math.sqrt(2)*(this.strana*this.strana*this.strana)));
	}
	void povrch() {
		System.out.println("Obsah "+ this.name + " je " + (2*Math.sqrt(3)*(this.strana*this.strana)));
	}
}
