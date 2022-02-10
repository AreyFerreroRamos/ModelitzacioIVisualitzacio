package cat.urv.deim.miv.laboratoris;

/**
 * La classe Vertex serveix per emmagatzemar les dues coordenades d'un v�rtex localitzat en un pla.
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
	 * El constructor de la classe v�rtex inicialitza les coordenades del v�rtex a partir de dos valors rebuts per par�metre.
	 * @param x �s el valor de la coordenada x del v�rtex.
	 * @param y �s el valor de la coordenada y del v�rtex.
	 */
	public Vertex(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Aquest m�tode serveix per obtenir el valor de la coordenada x del v�rtex.
	 * @return el valor de la coordenada x.
	 */
	public int getX() {
		return x;
	}
	
	/**
	 * Aquest m�tode serveix per obtenir el valor de la coordenada y del v�rtex.
	 * @return el valor de la coordenada y.
	 */
	public int getY() {
		return y;
	}
	
	/**
	 * Aquest m�tode serveix per modificar el valor de la coordenada x del v�rtex.
	 * @param x �s el nou valor de la coordenada x.
	 */
	public void setX(int x) {
		this.x = x;
	}
	
	/**
	 * Aquest m�tode serveix per modificar el valor de la coordenada y del v�rtex.
	 * @param y �s el nou valor de la coordenada y.
	 */
	public void setY(int y) {
		this.y = y;
	}
	
	/**
	 * Aquest m�tode serveix per comprovar si el v�rtex present �s igual a un altre v�rtex que es pasa per par�metre.
	 * @param vertex �s el vertex amb el que es vol fer la comparaci�.
	 * @return si els dos v�rtexs son iguals o no.
	 */
	public boolean equals(Vertex vertex) {
		return ((this.x == vertex.x) && (this.y == vertex.y));
	}
}
