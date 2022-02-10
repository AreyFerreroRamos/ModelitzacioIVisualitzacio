package cat.urv.deim.miv.laboratoris;

import java.util.ArrayList;

import cat.urv.deim.miv.Application;

public class Laboratori2 extends Application{

	public static final long serialVersionUID = 1L;
	
	public Laboratori2() {
		super("Laboratori 2");
	}

	public void paint() {
		int width = getPanelWidth();
		int height = getPanelHeight();

			//Polígon original.
		/*setColor(1.0f, 0.0f, 0.0f);
		fillPolygon(
				(int) (0.2f * width), (int) (0.6f * height),
				(int) (0.3f * width), (int) (0.1f * height),
				(int) (0.8f * width), (int) (0.4f * height),
				(int) (0.7f * width), (int) (0.7f * height),
				(int) (0.4f * width), (int) (0.9f * height),
				(int) (-1), (int) (-1));

		setColor(0.0f, 1.0f, 0.0f);
		drawPolygon(
				(int) (0.2f * width), (int) (0.6f * height),
				(int) (0.3f * width), (int) (0.1f * height),
				(int) (0.8f * width), (int) (0.4f * height),
				(int) (0.7f * width), (int) (0.7f * height),
				(int) (0.4f * width), (int) (0.9f * height),
				(int) (-1), (int) (-1));*/
		
			//Trapezoide.
		/*setColor(1.0f, 0.0f, 0.0f);
		fillPolygon(
				(int) (0.3f * width), (int) (0.5f * height),
				(int) (0.5f * width), (int) (0.2f * height),
				(int) (0.7f * width), (int) (0.5f * height),
				(int) (0.5f * width), (int) (0.8f * height),
				(int) (-1), (int) (-1));
		
		setColor(0.0f, 1.0f, 0.0f);
		drawPolygon(
				(int) (0.3f * width), (int) (0.5f * height),
				(int) (0.5f * width), (int) (0.2f * height),
				(int) (0.7f * width), (int) (0.5f * height),
				(int) (0.5f * width), (int) (0.8f * height),
				(int) (-1), (int) (-1));*/
		
			//Rectangle.
		/*setColor(1.0f, 0.0f, 0.0f);
		fillPolygon(
				(int) (0.2f * width), (int) (0.2f * height),
				(int) (0.6f * width), (int) (0.2f * height),
				(int) (0.6f * width), (int) (0.6f * height),
				(int) (0.2f * width), (int) (0.6f * height),
				(int) (-1), (int) (-1));
		
		setColor(0.0f, 1.0f, 0.0f);
		drawPolygon(
				(int) (0.2f * width), (int) (0.2f * height),
				(int) (0.6f * width), (int) (0.2f * height),
				(int) (0.6f * width), (int) (0.6f * height),
				(int) (0.2f * width), (int) (0.6f * height),
				(int) (-1), (int) (-1));*/
		
			//Triangle amb l'aresta superior horitzontal.
		/*setColor(1.0f, 0.0f, 0.0f);
		fillPolygon(
				(int) (0.2f * width), (int) (0.2f * height),
				(int) (0.8f * width), (int) (0.2f * height),
				(int) (0.5f * width), (int) (0.7f * height),
				(int) (-1), (int) (-1));
				
		setColor(0.0f, 1.0f, 0.0f);
		drawPolygon(
				(int) (0.2f * width), (int) (0.2f * height),
				(int) (0.8f * width), (int) (0.2f * height),
				(int) (0.5f * width), (int) (0.7f * height),
				(int) (-1), (int) (-1));*/
			
			//Triangle amb l'aresta inferior horitzontal.
		/*setColor(1.0f, 0.0f, 0.0f);
		fillPolygon(
				(int) (0.2f * width), (int) (0.7f * height),
				(int) (0.5f * width), (int) (0.2f * height),
				(int) (0.8f * width), (int) (0.7f * height),
				(int) (-1), (int) (-1));
			
		setColor(0.0f, 1.0f, 0.0f);
		drawPolygon(
				(int) (0.2f * width), (int) (0.7f * height),
				(int) (0.5f * width), (int) (0.2f * height),
				(int) (0.8f * width), (int) (0.7f * height),
				(int) (-1), (int) (-1));*/
		
			//Triangle amb una aresta vertical.
		/*setColor(1.0f, 0.0f, 0.0f);
		fillPolygon(
				(int) (0.2f * width), (int) (0.2f * height),
				(int) (0.6f * width), (int) (0.5f * height),
				(int) (0.2f * width), (int) (0.8f * height),
				(int) (-1), (int) (-1));
				
		setColor(0.0f, 1.0f, 0.0f);
		drawPolygon(
				(int) (0.2f * width), (int) (0.2f * height),
				(int) (0.6f * width), (int) (0.5f * height),
				(int) (0.2f * width), (int) (0.8f * height),
				(int) (-1), (int) (-1));*/
				
			//Poligon convex de set costats.
		/*setColor(1.0f, 0.0f, 0.0f);
		fillPolygon(
				(int) (0.2f * width), (int) (0.1f * height),
				(int) (0.5f * width), (int) (0.2f * height),
				(int) (0.7f * width), (int) (0.5f * height),
				(int) (0.7f * width), (int) (0.6f * height),
				(int) (0.6f * width), (int) (0.9f * height),
				(int) (0.4f * width), (int) (1.0f * height),
				(int) (0.2f * width), (int) (0.6f * height),
				(int) (-1), (int) (-1));
		
		setColor(0.0f, 1.0f, 0.0f);
		drawPolygon(
				(int) (0.2f * width), (int) (0.1f * height),
				(int) (0.5f * width), (int) (0.2f * height),
				(int) (0.7f * width), (int) (0.5f * height),
				(int) (0.7f * width), (int) (0.6f * height),
				(int) (0.6f * width), (int) (0.9f * height),
				(int) (0.4f * width), (int) (1.0f * height),
				(int) (0.2f * width), (int) (0.6f * height),
				(int) (-1), (int) (-1));*/
		
			//Poligon concau de vuit costats.
		/*setColor(1.0f, 0.0f, 0.0f);
		fillPolygon(
				(int) (0.1f * width), (int) (0.5f * height),
				(int) (0.3f * width), (int) (0.1f * height),
				(int) (0.5f * width), (int) (0.3f * height),
				(int) (0.7f * width), (int) (0.1f * height),
				(int) (0.9f * width), (int) (0.5f * height),
				(int) (0.7f * width), (int) (0.9f * height),
				(int) (0.5f * width), (int) (0.7f * height),
				(int) (0.3f * width), (int) (0.9f * height),
				(int) (-1), (int) (-1));
		
		setColor(0.0f, 1.0f, 0.0f);
		drawPolygon(
				(int) (0.1f * width), (int) (0.5f * height),
				(int) (0.3f * width), (int) (0.1f * height),
				(int) (0.5f * width), (int) (0.3f * height),
				(int) (0.7f * width), (int) (0.1f * height),
				(int) (0.9f * width), (int) (0.5f * height),
				(int) (0.7f * width), (int) (0.9f * height),
				(int) (0.5f * width), (int) (0.7f * height),
				(int) (0.3f * width), (int) (0.9f * height),
				(int) (-1), (int) (-1));*/
		
			//Poligon concau de dotze costats.
		/*setColor(1.0f, 0.0f, 0.0f);
		fillPolygon(
				(int) (0.0f * width), (int) (0.5f * height),
				(int) (0.15f * width), (int) (0.1f * height),
				(int) (0.3f * width), (int) (0.3f * height),
				(int) (0.45f * width), (int) (0.1f * height),
				(int) (0.6f * width), (int) (0.4f * height),
				(int) (0.75f * width), (int) (0.1f * height),
				(int) (0.9f * width), (int) (0.5f * height),
				(int) (0.75f * width), (int) (0.9f * height),
				(int) (0.6f * width), (int) (0.6f * height),
				(int) (0.45f * width), (int) (0.9f * height),
				(int) (0.3f * width), (int) (0.7f * height),
				(int) (0.15f * width), (int) (0.9f * height),
				(int) (-1), (int) (-1));
		
		setColor(0.0f, 1.0f, 0.0f);
		drawPolygon(
				(int) (0.0f * width), (int) (0.5f * height),
				(int) (0.15f * width), (int) (0.1f * height),
				(int) (0.3f * width), (int) (0.3f * height),
				(int) (0.45f * width), (int) (0.1f * height),
				(int) (0.6f * width), (int) (0.4f * height),
				(int) (0.75f * width), (int) (0.1f * height),
				(int) (0.9f * width), (int) (0.5f * height),
				(int) (0.75f * width), (int) (0.9f * height),
				(int) (0.6f * width), (int) (0.6f * height),
				(int) (0.45f * width), (int) (0.9f * height),
				(int) (0.3f * width), (int) (0.7f * height),
				(int) (0.15f * width), (int) (0.9f * height),
				(int) (-1), (int) (-1));*/
		
		setColor(1.0f, 0.0f, 0.0f);
		fillPolygon(
				(int) (0.1f * width), (int) (0.1f * height),
				(int) (0.3f * width), (int) (0.1f * height),
				(int) (0.5f * width), (int) (0.5f * height),
				(int) (0.7f * width), (int) (0.1f * height),
				(int) (0.9f * width), (int) (0.1f * height),
				(int) (0.9f * width), (int) (0.5f * height),
				(int) (0.7f * width), (int) (0.5f * height),
				(int) (0.7f * width), (int) (0.9f * height),
				(int) (0.5f * width), (int) (0.5f * height),
				(int) (0.3f * width), (int) (0.9f * height),
				(int) (0.3f * width), (int) (0.5f * height),
				(int) (0.1f * width), (int) (0.5f * height),
				(int) (-1), (int) (-1));
		
		setColor(0.0f, 1.0f, 0.0f);
		drawPolygon(
				(int) (0.1f * width), (int) (0.1f * height),
				(int) (0.3f * width), (int) (0.1f * height),
				(int) (0.5f * width), (int) (0.5f * height),
				(int) (0.7f * width), (int) (0.1f * height),
				(int) (0.9f * width), (int) (0.1f * height),
				(int) (0.9f * width), (int) (0.5f * height),
				(int) (0.7f * width), (int) (0.5f * height),
				(int) (0.7f * width), (int) (0.9f * height),
				(int) (0.5f * width), (int) (0.5f * height),
				(int) (0.3f * width), (int) (0.9f * height),
				(int) (0.3f * width), (int) (0.5f * height),
				(int) (0.1f * width), (int) (0.5f * height),
				(int) (-1), (int) (-1));
		
		
			//Poligon convex amb un forat.
		/*setColor(1.0f, 0.0f, 0.0f);
		fillPolygon(
				(int) (0.1f * width), (int) (0.1f * height),
				(int) (0.7f * width), (int) (0.1f * height),
				(int) (0.7f * width), (int) (0.7f * height),
				(int) (0.1f * width), (int) (0.7f * height),
				(int) (-1), (int) (-1),
				(int) (0.3f * width), (int) (0.3f * height),
				(int) (0.5f * width), (int) (0.3f * height),
				(int) (0.5f * width), (int) (0.5f * height),
				(int) (0.3f * width), (int) (0.5f * height),
				(int) (-1), (int) (-1));
		
		setColor(0.0f, 1.0f, 0.0f);
		drawPolygon(
				(int) (0.1f * width), (int) (0.1f * height),
				(int) (0.7f * width), (int) (0.1f * height),
				(int) (0.7f * width), (int) (0.7f * height),
				(int) (0.1f * width), (int) (0.7f * height),
				(int) (-1), (int) (-1),
				(int) (0.3f * width), (int) (0.3f * height),
				(int) (0.5f * width), (int) (0.3f * height),
				(int) (0.5f * width), (int) (0.5f * height),
				(int) (0.3f * width), (int) (0.5f * height),
				(int) (-1), (int) (-1));*/
		
			//Poligon concau amb dos forats.
		/*setColor(1.0f, 0.0f, 0.0f);
		fillPolygon(
				(int) (0.1f * width), (int) (0.5f * height),
				(int) (0.3f * width), (int) (0.1f * height),
				(int) (0.5f * width), (int) (0.3f * height),
				(int) (0.7f * width), (int) (0.1f * height),
				(int) (0.9f * width), (int) (0.5f * height),
				(int) (0.7f * width), (int) (0.9f * height),
				(int) (0.5f * width), (int) (0.7f * height),
				(int) (0.3f * width), (int) (0.9f * height),
				(int) (-1), (int) (-1),
				(int) (0.6f * width), (int) (0.5f * height),
				(int) (0.7f * width), (int) (0.4f * height),
				(int) (0.8f * width), (int) (0.5f * height),
				(int) (0.7f * width), (int) (0.6f * height),
				(int) (-1), (int) (-1),
				(int) (0.2f * width), (int) (0.3f * height),
				(int) (0.4f * width), (int) (0.3f * height),
				(int) (0.3f * width), (int) (0.5f * height),
				(int) (-1), (int) (-1));
		
		setColor(0.0f, 1.0f, 0.0f);
		drawPolygon(
				(int) (0.1f * width), (int) (0.5f * height),
				(int) (0.3f * width), (int) (0.1f * height),
				(int) (0.5f * width), (int) (0.3f * height),
				(int) (0.7f * width), (int) (0.1f * height),
				(int) (0.9f * width), (int) (0.5f * height),
				(int) (0.7f * width), (int) (0.9f * height),
				(int) (0.5f * width), (int) (0.7f * height),
				(int) (0.3f * width), (int) (0.9f * height),
				(int) (-1), (int) (-1),
				(int) (0.6f * width), (int) (0.5f * height),
				(int) (0.7f * width), (int) (0.4f * height),
				(int) (0.8f * width), (int) (0.5f * height),
				(int) (0.7f * width), (int) (0.6f * height),
				(int) (-1), (int) (-1),
				(int) (0.2f * width), (int) (0.3f * height),
				(int) (0.4f * width), (int) (0.3f * height),
				(int) (0.3f * width), (int) (0.5f * height),
				(int) (-1), (int) (-1));
				*/
	}


	// Practica 2, implementa defineDrawPolygon i defineFillPolygon
	// Hint: Pots utilitzar l'algorisme Scan line fill polygon
	
	// Inici codi de l'alumne

	public void defineDrawPolygon(Integer... p) {
		int i, ini;
		
		ini = i = 0;
		while (i < p.length - 2) {
			if (p[i + 2] != -1) {
				drawLine(p[i], p[i + 1], p[i + 2], p[i + 3]);
				i = i + 2;
			}
			else {
				drawLine( p[i], p[i + 1], p[ini], p[ini + 1]);
				i = i + 4;
				ini = i;
			}
		}
	}
	
	/**
	 * Aquest mètode s'encarrega d'ordenar les arestes en funció de les coordenades x dels seus vèrtexs.
	 * @param arestes és la llista d'arestes.
	 */
	public void ordenarArestes(ArrayList<Aresta> arestes) {
		int i, j;
		boolean ordenat;
		
		ordenat = false;
		i = 1;
		while ((!ordenat) && (i < arestes.size())) {
			ordenat = true;
			for (j = 0; j < arestes.size() - i; j++) {
				if (arestes.get(j).compareTo(arestes.get(j + 1)) == 1) {
					arestes.add(j, arestes.remove(j + 1));
					ordenat = false;
				}
			}
			i++;
		}
	}

	public void defineFillPolygon(Integer... p) {
		ArrayList<Vertex> vertexs = new ArrayList<Vertex>();
		ArrayList<Aresta> arestes = new ArrayList<Aresta>();
		int i, j, ini, y, ymax;
		boolean trobat;
		
		ini = j = 0;
		for (i = 0; i < p.length; i = i + 2) {
				//Creació i emmagatzemament dels vèrtexs que delimiten un poligon.
			if (p[i] != -1) {
				vertexs.add(new Vertex(p[i], p[i + 1]));
			}
			else {
					//Creació i emmagatzemament de les arestes que delimiten un poligon.
				while (j < vertexs.size() - 1) {
					arestes.add(new Aresta(vertexs.get(j), vertexs.get(j + 1)));
					j++;
				}
				arestes.add(new Aresta(vertexs.get(j), vertexs.get(ini)));
				j++;
				ini = j;
			}
		}
		ordenarArestes(arestes);
		
			//Selecció del valor inicial y del valor final de la coordenada y.
		y = ymax = vertexs.get(0).getY();
		for (i = 1; i < vertexs.size(); i++) {
			if (vertexs.get(i).getY() < y) {
				y = vertexs.get(i).getY();
			}
			if (vertexs.get(i).getY() > ymax) {
				ymax = vertexs.get(i).getY();
			}
		}
			//Activat de les arestes incials.
		for (i = 0; i < arestes.size(); i++) {
			if ((arestes.get(i).getVertexInicial().getY() == y) && (arestes.get(i).getVertexInicial().getY() != arestes.get(i).getVertexFinal().getY())) {
				arestes.get(i).activar();
			}
		}
			//Bucle principal de pintat del poligon.
		j = 0;
		while (y < ymax) {
			trobat = false;
			for (i = 0; i < arestes.size(); i++) {
				if (arestes.get(i).estaActiva()) {
					if (!trobat) {
						j = i;
					}
					else {
						drawLine(arestes.get(j).calcularXPuntRecta(y), y, arestes.get(i).calcularXPuntRecta(y), y);
					}
					trobat = !trobat;
				}
			}
			y++;
			for (i = 0; i < arestes.size(); i++) {
				if ((arestes.get(i).estaActiva()) && (arestes.get(i).getVertexFinal().getY() <= y)) {
					arestes.get(i).desactivar();
				}
				if ((arestes.get(i).getVertexInicial().getY() == y) && (arestes.get(i).getVertexInicial().getY() != arestes.get(i).getVertexFinal().getY())) {
					arestes.get(i).activar();
				}
			}
		}
	}

	// Fi codi de l'alumne
	
	public static void main(String[] args) {
		Laboratori2 example = new Laboratori2();
		example.run();
	}

}
