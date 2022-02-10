package cat.urv.deim.miv.laboratoris;

/**
 * La classe Vertex serveix per emmagatzemar les dues coordenades d'un vèrtex localitzat en un pla.
 * @author Arey Ferrero Ramos
 * @version 1.0
 */
public class Vertex {
	
	/**
	 * Atributs.
	 */
	private int x;
	private int y;
	
	/**
	 * El constructor de la classe vértex inicialitza les coordenades del vértex a partir de dos valors rebuts per paràmetre.
	 * @param x és el valor de la coordenada x del vértex.
	 * @param y és el valor de la coordenada y del vértex.
	 */
	public Vertex(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Aquest mètode serveix per obtenir el valor de la coordenada x del vértex.
	 * @return el valor de la coordenada x.
	 */
	public int getX() {
		return x;
	}
	
	/**
	 * Aquest mètode serveix per obtenir el valor de la coordenada y del vértex.
	 * @return el valor de la coordenada y.
	 */
	public int getY() {
		return y;
	}
	
	/**
	 * Aquest mètode serveix per modificar el valor de la coordenada x del vèrtex.
	 * @param x és el nou valor de la coordenada x.
	 */
	public void setX(int x) {
		this.x = x;
	}
	
	/**
	 * Aquest mètode serveix per modificar el valor de la coordenada y del vèrtex.
	 * @param y és el nou valor de la coordenada y.
	 */
	public void setY(int y) {
		this.y = y;
	}
	
	/**
	 * Aquest mètode serveix per comprovar si el vértex present és igual a un altre vértex que es pasa per paràmetre.
	 * @param vertex és el vertex amb el que es vol fer la comparació.
	 * @return si els dos vèrtexs son iguals o no.
	 */
	public boolean equals(Vertex vertex) {
		return ((this.x == vertex.x) && (this.y == vertex.y));
	}
}
