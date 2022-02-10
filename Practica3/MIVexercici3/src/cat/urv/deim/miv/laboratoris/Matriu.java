package cat.urv.deim.miv.laboratoris;

/**
 * La classe Matriu serveix per emmagatzemar tota la informaci� que defineix una matriu i per a poder aplicarli operacions contra altres matrius.
 * @author Arey Ferrero Ramos
 * @version 1.0
 */
public class Matriu {
	/**
	 * Atributs.
	 */
	private int numFiles;
	private int numColumnes;
	private float[][] matriu;
	
	/**
	 * El constructor de la classe Matriu crea una matriu de zeros amb unes dimensions especificades per par�metre.
	 * @param numFiles �s el n�mero de files que ha de tenir la matriu.
	 * @param numColumnes �s el n�mero de columnes que ha de tenir la matriu.
	 */
	public Matriu(int numFiles, int numColumnes) {
		this.numFiles = numFiles;
		this.numColumnes = numColumnes;
		matriu = new float[this.numFiles][this.numColumnes];
	}
	
	/**
	 * Aquest m�tode serveix per obtenir el nombre de files de la matriu.
	 * @return el nombre de files de la matriu.
	 */
	public int getNumFiles() {
		return numFiles;
	}
	
	/**
	 * Aquest m�tode serveix per obtenir el nombre de columnes de la matriu.
	 * @return el nombre de columnes de la matriu.
	 */
	public int getNumColumnes() {
		return numColumnes;
	}
	
	/**
	 * Aquest m�tode serveix per obtenir un element de la matriu a partir d'una posici� especificada per par�metre.
	 * @param fila �s la fila en la que es troba l'element que es vol obtenir.
	 * @param columna �s la columna en la que es troba l'element que es vol obtenir.
	 * @return l'element que es troba en la posici� especificada.
	 */
	public float getElement(int fila, int columna) {
		return matriu[fila][columna];
	}
	
	/**
	 * Aquest m�tode permet afegir un nou element a una posici� de la matriu especificada per par�metre. Si ja hi havia un element emmagatzemat en aquella mateixa posici�, aquest es sobreescriu.
	 * @param element �s el nou element que es vol afegir a la matriu.
	 * @param fila �s la fila en la que es trobar� l'element que es vol afegir.
	 * @param columna �s la columna en la que es trobar� l'element que es vol afegir.
	 */
	public void setElement(float element, int fila, int columna) {
		matriu[fila][columna] = element;
	}
	
	/**
	 * Aquest m�tode serveix per crear una copia de la matriu actual.
	 */
	public Matriu clone() {
		Matriu matriu = new Matriu(numFiles, numColumnes);
		int fila, columna;
		
		for (fila = 0; fila < numFiles; fila++) {
			for (columna = 0; columna < numColumnes; columna++) {
				matriu.setElement(this.getElement(fila, columna), fila, columna);
			}
		}
		return matriu;
	}
	
	/**
	 * Aquest m�tode permet realitzar el producte entre la matriu actual i una matriu que es passa per par�metre. Com que el producte de matrius no �s commutatiu, es considera, per conveni, que la matriu que es passa per par�metre ser� el multiplicant i que la matriu actual ser� el multiplicador.
	 * @param matriu �s la matriu que actuar� com multiplicant de la operaci�.
	 * @return la matriu resultant de multiplicar la matriu actual per la matriu que es pasa per par�metre.
	 */
	public Matriu producteMatrius(Matriu matriu) {
		Matriu matriuResultant = null;
		float acum;
		int i, j, k;
		
		if (matriu.getNumColumnes() == this.getNumFiles()) {
			matriuResultant = new Matriu(matriu.getNumFiles(), this.getNumColumnes());
			for (i = 0; i < matriu.getNumFiles(); i++) {
				for (j = 0; j < this.getNumColumnes(); j++) {
					acum = 0;
					for (k = 0; k < matriu.getNumColumnes(); k++) {
						acum += matriu.getElement(i, k) * this.getElement(k, j);
					}
					matriuResultant.setElement(acum, i, j);
				}
			}
		}
		return matriuResultant;
	}
}
