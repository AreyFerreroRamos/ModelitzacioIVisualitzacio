package cat.urv.deim.miv.laboratoris;

/**
 * La classe Vector serveix per emmagatzemar tota la informaci� que defineix un vector i que permet aplicar-li operacions contra una matriu.  
 * @author Arey Ferrero Ramos
 * @version 1.0
 */
public class Vector {
	/**
	 * Atributs.
	 */
	private int dimensio;
	private float[] vector;
	
	/**
	 * El constructor de la classe Vector crea un vector de zeros amb una dimensi� especificada per par�metre.
	 * @param dimensio es la dimensi� que tindr� el vector.
	 */
	public Vector(int dimensio) {
		this.dimensio = dimensio;
		vector = new float[this.dimensio];
	}
	
	/**
	 * Aquest m�tode permet obtenir la dimensi� del vector.
	 * @return la dimensi� del vector.
	 */
	public int getDimensio() {
		return dimensio;
	}
	
	/**
	 * Aquest m�tode permet obtenir un element del vector a partir d'una posici� especificada per par�metre.
	 * @param posicio �s la posici� en la que es troba l'element que es vol obtenir.
	 * @return l'element que es troba en la posici� especificada.
	 */
	public float getElement(int posicio) {
		return vector[posicio];
	}
	
	/**
	 * Aquest m�tode permet afegir un nou element a una posici� del vector especificada per par�metre. Si ja hi havia un element emmagatzemat en aquella mateixa posici�, aquest es sobreescriu.
	 * @param element �s el nou element que es vol afegir al vector.
	 * @param posicio �s la posici� en la que es vol afegir l'element.
	 */
	public void setElement(float element, int posicio) {
		vector[posicio] = element;
	}
	
	/**
	 * Aquest m�tode permet realitzar el producte entre el vector actual i una matriu que es passa per par�metre. Com que el producte de matrius no �s commutatiu, es considera, per conveni, que la matriu ser� el multiplicant i el vector ser� el multiplicador.
	 * @param matriu �s la matriu que actuar� com a multiplicant de l'operaci�.
	 * @return el vector resultant de multiplicar la matriu que es pasa per par�metre pel vector actual.
	 */
	public Vector producteMatriuVector(Matriu matriu) {
		Vector vectorResultant = null;
		float acum;
		int i, k;
		
		if (matriu.getNumColumnes() == this.getDimensio()) {
			vectorResultant = new Vector(matriu.getNumFiles());
			for (i = 0; i < matriu.getNumFiles(); i++) {
				acum = 0;
				for (k = 0; k < this.getDimensio(); k++) {
					acum += matriu.getElement(i, k) * this.getElement(k);
				}
				vectorResultant.setElement(acum, i);
			}
		}
		return vectorResultant;
	}
}
