package cat.urv.deim.miv.laboratoris;

/**
 * La classe Vector serveix per emmagatzemar tota la informació que defineix un vector i que permet aplicar-li operacions contra una matriu.  
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
	 * El constructor de la classe Vector crea un vector de zeros amb una dimensió especificada per paràmetre.
	 * @param dimensio es la dimensió que tindrà el vector.
	 */
	public Vector(int dimensio) {
		this.dimensio = dimensio;
		vector = new float[this.dimensio];
	}
	
	/**
	 * Aquest mètode permet obtenir la dimensió del vector.
	 * @return la dimensió del vector.
	 */
	public int getDimensio() {
		return dimensio;
	}
	
	/**
	 * Aquest mètode permet obtenir un element del vector a partir d'una posició especificada per paràmetre.
	 * @param posicio és la posició en la que es troba l'element que es vol obtenir.
	 * @return l'element que es troba en la posició especificada.
	 */
	public float getElement(int posicio) {
		return vector[posicio];
	}
	
	/**
	 * Aquest mètode permet afegir un nou element a una posició del vector especificada per paràmetre. Si ja hi havia un element emmagatzemat en aquella mateixa posició, aquest es sobreescriu.
	 * @param element és el nou element que es vol afegir al vector.
	 * @param posicio és la posició en la que es vol afegir l'element.
	 */
	public void setElement(float element, int posicio) {
		vector[posicio] = element;
	}
	
	/**
	 * Aquest mètode permet realitzar el producte entre el vector actual i una matriu que es passa per paràmetre. Com que el producte de matrius no és commutatiu, es considera, per conveni, que la matriu serà el multiplicant i el vector serà el multiplicador.
	 * @param matriu és la matriu que actuarà com a multiplicant de l'operació.
	 * @return el vector resultant de multiplicar la matriu que es pasa per paràmetre pel vector actual.
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
