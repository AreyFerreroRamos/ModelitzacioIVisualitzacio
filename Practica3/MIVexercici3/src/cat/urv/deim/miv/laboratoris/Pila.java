package cat.urv.deim.miv.laboratoris;

import java.util.Stack;

/**
 * La classe Pila serveix per a construir una estructura de dades anomenada pila per emmagatzemar matrius de la que, en cada acc�s, nom�s es podr� recuperar l'�ltima matriu emmagatzemada.
 * @author Arey Ferrero Ramos
 * @version 1.0
 */
public class Pila {
	/**
	 * Atribut.
	 */
	private Stack<Matriu> pila;
	
	/**
	 * El constructor de la classe Pila crea una estructura de dades tipus pila utilitzant la classe Stack que Java t� per defecte.
	 */
	public Pila() {
		pila = new Stack<Matriu>();
	}
	
	/**
	 * Aquest m�tode serveix per apilar una matriu en la pila.
	 * @param matriu �s la matriu que es vol apilar.
	 */
	public void apilar(Matriu matriu) {
		pila.add(matriu);
	}
	
	/**
	 * Aquest m�tode serveix per desapilar una matriu de la pila.
	 * @return la matriu que s'ha desapilat.
	 */
	public Matriu desapilar() {
		Matriu matriu = null;
		
		if (!pila.isEmpty()) {
			matriu = pila.pop();
		}
		return matriu;
	}
}
