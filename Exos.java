public class Exos{
	
	public static void main(String[]args){

			Entier n1 = new Entier(2);
			System.out.print("n1 = " ); n1.affiche();

			Entier n2 = new Entier(5);
			System.out.print(" n2 = "); n2.affiche();
			n1.incr(3); 
			System.out.print("n1 = "); n1.affiche();
			System.out.println("n1 == n2 est "+ (n1 == n2));// l'operateur == compare les références quand il s'agit d'objet et non leur valeur

			n1 = n2; 
			 n2.incr(12);
			System.out.print(" n2 = "); n2.affiche();
			System.out.print("n1 = "); n1.affiche();
			System.out.println("n1 == n2 est "+ (n1 == n2));


	}
}

class Entier{
	private int n;

	public Entier(int nn){
		n =nn;
	}
	public void incr(int dn){
		n += dn;
	}
	public void affiche(){
		System.out.println(n);
	}
}

class Points{
	
}