package annotations.N1E1;

/*
Crea una jerarquia d’objectes amb tres classes:  Treballador, TreballadorOnline i TreballadorPresencial.

Des del main() de la classe Principal, fes les invocacions necessàries per demostrar el funcionament 
de l’anotació @Override.

*/
public class N1E1 {

	public static void main(String[] args) {
		
		// Sinó existís el mètode de nom calcularSou d'un paràmetre en la classe pare, el compilador ens 
		// hagués donat un error gràcies a @Override sobre els mètodes calcularSou en les classes filles.
		// @Override ens obliga a implementar i sobrescriure correctament un mètode de la classe pare,
		// o el compilador donarà error. 
		
		Treballador t1 = new Treballador("Toni", "Ferraté", 60);
		t1.calcularSou(160);
		
		Treballador t2 = new TreballadorOnline("Pere", "Casal", 60);
		t2.calcularSou(160);
		
		Treballador t3 = new TreballadorPresencial("Cristina", "Oms", 60);
		t3.calcularSou(160);
	}
	
}
