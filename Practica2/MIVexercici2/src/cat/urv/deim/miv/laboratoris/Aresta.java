package cat.urv.deim.miv.laboratoris;

/**
 * La classe Aresta serveix per emmagatzemar els dos v�rtexs entre els quals es construeix una aresta.
 * @author Arey Ferrero Ramos
 * @version 1.0
 */
public class Aresta implements Comparable<Aresta> {
	
	/**
	 * Atributs.
	 */
	private Vertex vertexInicial;
	private Vertex vertexFinal;
	private float pendent;
	private float ordenada;
	private boolean activa;
	
	/**
	 * El constructor de la classe aresta inicialitza els dos v�rtexs que determinen l'aresta a partir de dos valors rebuts per par�metre.
	 * @param primerVertex �s el primer vertex que determinar� l'aresta.
	 * @param segonVertex �s el segon v�rtex que determinar� l'aresta.
	 */
	public Aresta(Vertex primerVertex, Vertex segonVertex) {
		if (primerVertex.getY() <= segonVertex.getY()) {
			vertexInicial = primerVertex;
			vertexFinal = segonVertex;
		}
		else {
			vertexInicial = segonVertex;
			vertexFinal = primerVertex;
		}
		if (vertexInicial.getX() == vertexFinal.getX()) {
			pendent = 0;
		}
		else {
			pendent = ((float)(vertexFinal.getY() - vertexInicial.getY())) / ((float)(vertexFinal.getX() - vertexInicial.getX()));
		}
		ordenada = vertexInicial.getY() - pendent * vertexInicial.getX();
		activa = false;
	}
	
	/**
	 * Aquest m�tode serveix per obtenir el valor del v�rtex inicial de l'aresta.
	 * @return el valor del v�rtex inicial de l'aresta.
	 */
	public Vertex getVertexInicial() {
		return vertexInicial;
	}
	
	/**
	 * Aquest m�tode serveix per obtenir el valor del v�rtex final de l'aresta.
	 * @return el valor del v�rtex final de l'aresta.
	 */
	public Vertex getVertexFinal() {
		return vertexFinal;
	}
	
	/**
	 * Aquest m�tode serveix per obtenir el valor del pendent de l'aresta.
	 * @return el valor del pendent de l'aresta.
	 */
	public float getPendent() {
		return pendent;
	}
	
	/**
	 * Aquest m�tode serveix per obtenir el valor de l'ordenada a l'origen de l'aresta.
	 * @return el valor de l'ordenada a l'origen de l'aresta.
	 */
	public float getOrdenada() {
		return ordenada;
	}
	
	/**
	 * Aquest m�tode serveix per saber si una aresta est� activa.
	 * @return si l'aresta est� activa o no.
	 */
	public boolean estaActiva() {
		return activa;
	}
	
	/**
	 * Aquest m�tode serveix per canviar el valor del v�rtex inicial de l'aresta.
	 * @param vertexInicial �s el nou v�rtex inicial.
	 */
	public void setVertexInicial(Vertex vertexInicial) {
		this.vertexInicial.setX(vertexInicial.getX());
		this.vertexInicial.setY(vertexInicial.getY());
		if (this.vertexInicial.getX() == vertexFinal.getX()) {
			pendent = 0;
		}
		else {
			pendent = ((float)(vertexFinal.getY() - this.vertexInicial.getY())) / ((float)(vertexFinal.getX() - this.vertexInicial.getX()));
		}
		ordenada = this.vertexInicial.getY() - pendent * this.vertexInicial.getX();
	}
	
	/**
	 * Aquest m�tode serveix per canviar el valor del v�rtex final que determina l'aresta. 
	 * @param vertexFinal �s el nou v�rtex final.
	 */
	public void setVertexFinal(Vertex vertexFinal) {
		this.vertexFinal.setX(vertexFinal.getX());
		this.vertexFinal.setY(vertexFinal.getY());
		if (vertexInicial.getX() == this.vertexFinal.getX()) {
			pendent = 0;
		}
		else {
			pendent = ((float)(this.vertexFinal.getY() - vertexInicial.getY())) / ((float)(this.vertexFinal.getX() - vertexInicial.getX()));
		}
		ordenada = vertexInicial.getY() - pendent * vertexInicial.getX();
	}
	
	/**
	 * Aquest m�tode serveix per activar una aresta.
	 */
	public void activar() {
		activa = true;
	}
	
	/**
	 * Aquest m�tode serveix per desactivar una aresta.
	 */
	public void desactivar() {
		activa = false;
	}
	
	/**
	 * Aquest m�tode serveix per calcular la coordenada x d'un v�rtex qualsevol que pertany a l'aresta a partir de la seva coordenada y.
	 * @param y �s la coordenada y del v�rtex.
	 * @return el valor de la coordenada x.
	 */
	public int calcularXPuntRecta(int y) {
		if (pendent == 0) {
			return vertexInicial.getX();
		}
		else {
			return (Math.round((y - ordenada) / pendent));

		}
	}
	
	/**
	 * Aquest m�tode serveix per calcular la coordenada y d'un v�rtex qualsevol que pertany a l'aresta a partir de la seva coordenada x.
	 * @param x �s la coordenada x del v�rtex.
	 * @return el valor de la coordenada y.
	 */
	public int calcularYPuntRecta(int x) {
		if (pendent == 0) {
			return vertexInicial.getY();
		}
		else {
			return (Math.round(pendent * x + ordenada));
		}
	}

	@Override
	public int compareTo(Aresta aresta) {
		if (this.vertexInicial.getX() > aresta.vertexInicial.getX()) {
			return 1;
		}
		else {
			if (this.vertexInicial.getX() < aresta.vertexInicial.getX()) {
				return -1;
			}
			else {
				if (this.vertexFinal.getX() > aresta.vertexFinal.getX()) {
					return 1;
				}
				else {
					if (this.vertexFinal.getX() < aresta.vertexFinal.getX()) {
						return -1;
					}
					else {
						return 0;
					}
				}
			}
		}
	}
}
