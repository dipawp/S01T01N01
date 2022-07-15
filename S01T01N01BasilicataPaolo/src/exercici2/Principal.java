package exercici2;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Aquest metode es estatic i pertany a la classe,es pot invocar sense instanciar un objecte
		Cotxe.frenar();
		
		
		Cotxe cotxe = new Cotxe();
		//Aquest metode pertany a l'objecte que l'invoca i per aixó necesitem instanciar un objecte de la classe cotxe
		cotxe.accelerar();

	}

}
