package cat.urv.deim.miv.laboratoris;

import cat.urv.deim.miv.Application;
import java.util.ArrayList;

public class Laboratori3 extends Application {

	public static final long serialVersionUID = 1L;
	
	private static final int MAX_FILES = 4;
	private static final int MAX_COLUMNES = 4;
	
	private static ArrayList<Vector> vertexs;
	private static Pila pilaModelVista = new Pila();
	private static Pila pilaProjeccio = new Pila();
	private static Matriu matriuModelVista;
	private static Matriu matriuProjeccio;
	private int modeMatriu;
	private int xIni;
	private int yIni;
	private int width;
	private int height;
	private int angle;
	
	public Laboratori3() {
		super("Laboratori 3");
	}

	private void drawRectangle() {
		glBeginPolygon();
		glVertex3f(-0.5f, -0.5f, 0.0f);
		glVertex3f(-0.5f,  0.5f, 0.0f);
		glVertex3f( 0.5f,  0.5f, 0.0f);
		glVertex3f( 0.5f, -0.5f, 0.0f);		
		glEndPolygon();
	}
	
	public void paint() {
		int width = getPanelWidth();
		int height = getPanelHeight();
		float aspect = width / (float) height;
	
		glViewport(0, 0, width, height);
		
		setColor(1.0f, 0.0f, 0.0f);
	
		glMatrixMode(GL_PROJECTION);
		glLoadIdentity();
		gluPerspective(60.0f, aspect, 0.1f, 1000.0f);
		
		glMatrixMode(GL_MODELVIEW);
		glLoadIdentity();
		glTranslatef(0.0f, 0.0f, -5.0f);
		
		glPushMatrix();
		int midAngle = angle % 200;
		if (midAngle > 100)
			midAngle = 200 - midAngle;
		glTranslatef(0.0f, 0.0f, midAngle * -0.1f);
		setColor(0.0f, 1.0f, 0.0f);
		drawRectangle();
		glPopMatrix();
		
		//glRotatef(angle, 0.0f, 1.0f, 0.0f);

		glPushMatrix();
		glRotatef(angle, 0.0f, 0.0f, 1.0f);
		glTranslatef(-2.0f, 0.0f, 0.0f);
		setColor(1.0f, 0.0f, 0.0f);
		drawRectangle();
		glPopMatrix();
		
		glPushMatrix();
		glRotatef(/*2.0f **/ angle, 0.0f, 0.0f, 1.0f);
		glTranslatef(1.0f, 0.0f, 0.0f);
		setColor(0.0f, 0.0f, 1.0f);
		drawRectangle();
		glPopMatrix();
		
		angle += 5.0f;
	}


	// Practica 3, implementa infraestructura de matrius OpenGL
	// Hint: Pots mirar l'API d'OpenGL

	// Inici codi de l'alumne
	
	public void defineGlMatrixMode(int model) {
		if (model == GL_MODELVIEW) {
			modeMatriu = GL_MODELVIEW;
		}
		else {
			modeMatriu = GL_PROJECTION;
		}
	}
	
	public void defineGlViewport(int x, int y, int width, int height) {
		xIni = x;
		yIni = y;
		this.width = width;
		this.height = height;
	}
	
	public void defineGluPerspective(float fovy, float aspect, float zNear, float zFar) {
		Matriu matriuPerspectiva = new Matriu(MAX_FILES, MAX_COLUMNES);
		float fov = (float)(1 / Math.tan(Math.toRadians(fovy) / 2));
		
		matriuPerspectiva.setElement(fov / aspect, 0, 0);
		matriuPerspectiva.setElement(fov, 1, 1);
		matriuPerspectiva.setElement((zFar + zNear) / (zNear - zFar), 2, 2);
		matriuPerspectiva.setElement((zFar + zNear) / (zNear - zFar) * 2, 2, 3);
		matriuPerspectiva.setElement(-1, 3, 2);
		
		matriuProjeccio = matriuPerspectiva.producteMatrius(matriuProjeccio);
	}
	
	public void defineGlLoadIdentity() {
		Matriu matriuIdentitat = new Matriu(MAX_FILES, MAX_COLUMNES);
		int fila, columna;
		
		for (fila = 0; fila < MAX_FILES; fila++) {
			for (columna = 0; columna < MAX_COLUMNES; columna++) {
				if (fila == columna) {
					matriuIdentitat.setElement(1, fila, columna);
				}
			}
		}
		if (modeMatriu == GL_MODELVIEW) {
			matriuModelVista = matriuIdentitat;
		}
		else {
			matriuProjeccio = matriuIdentitat;
		}
	}
	
	public void defineGlPushMatrix() {
		if (modeMatriu == GL_MODELVIEW) {
			pilaModelVista.apilar(matriuModelVista);
		}
		else {
			pilaProjeccio.apilar(matriuProjeccio);
		}
	}
	
	public void defineGlPopMatrix() {
		if (modeMatriu == GL_MODELVIEW) {
			matriuModelVista = pilaModelVista.desapilar();
		}
		else {
			matriuProjeccio = pilaProjeccio.desapilar();
		}
	}
	
	public void defineGlTranslatef(float x, float y, float z) {
		Matriu matriuTranslacio = new Matriu(MAX_FILES, MAX_COLUMNES);
		
		matriuTranslacio.setElement(1, 0, 0);
		matriuTranslacio.setElement(x, 0, 3);
		matriuTranslacio.setElement(1, 1, 1);
		matriuTranslacio.setElement(y, 1, 3);
		matriuTranslacio.setElement(1, 2, 2);
		matriuTranslacio.setElement(z, 2, 3);
		matriuTranslacio.setElement(1, 3, 3);
		
		matriuModelVista = matriuTranslacio.producteMatrius(matriuModelVista);
	}
	
	public void defineGlScalef(float x, float y, float z) {
		Matriu matriuEscalat = new Matriu(MAX_FILES, MAX_COLUMNES);
		
		matriuEscalat.setElement(x, 0, 0);
		matriuEscalat.setElement(y, 1, 1);
		matriuEscalat.setElement(z, 2, 2);
		matriuEscalat.setElement(1, 3, 3);
		
		matriuModelVista = matriuEscalat.producteMatrius(matriuModelVista);
	}
	
	public void defineGlRotatef(float angle, float x, float y, float z) {
		Matriu matriuRotacio = new Matriu(MAX_FILES, MAX_COLUMNES);
		double cosAngle = Math.cos(Math.toRadians(angle));
		double sinAngle = Math.sin(Math.toRadians(angle));
		
		matriuRotacio.setElement((float)(x * x * (1 - cosAngle) + cosAngle), 0, 0);
		matriuRotacio.setElement((float)(x * y * (1 - cosAngle) - z * sinAngle), 0, 1);
		matriuRotacio.setElement((float)(x * z * (1 - cosAngle) + y * sinAngle), 0, 2);
		matriuRotacio.setElement((float)(y * x * (1 - cosAngle) + z * sinAngle), 1, 0);
		matriuRotacio.setElement((float)(y * y * (1 - cosAngle) + cosAngle), 1, 1);
		matriuRotacio.setElement((float)(y * z * (1 - cosAngle) - x * sinAngle), 1, 2);
		matriuRotacio.setElement((float)(z * x * (1 - cosAngle) - y * sinAngle), 2, 0);
		matriuRotacio.setElement((float)(z * y * (1 - cosAngle) + x * sinAngle), 2, 1);
		matriuRotacio.setElement((float)(z * z * (1 - cosAngle) + cosAngle), 2, 2);
		matriuRotacio.setElement(1, 3, 3);
		
		matriuModelVista = matriuRotacio.producteMatrius(matriuModelVista);
	}
	
	public void defineGlBeginPolygon() {
		vertexs = new ArrayList<Vector>();
	}
	
	public void defineGlVertex3f(float x, float y, float z) {
		Vector vertexInicial = new Vector(4);
		Vector vertexTransformat = new Vector(2);
		
		vertexInicial.setElement(x, 0);
		vertexInicial.setElement(y, 1);
		vertexInicial.setElement(z, 2);
		vertexInicial.setElement(1, 3);
		
		vertexInicial = vertexInicial.producteMatriuVector(matriuModelVista);
		
		vertexInicial = vertexInicial.producteMatriuVector(matriuProjeccio);
		
		vertexTransformat.setElement(vertexInicial.getElement(0) / vertexInicial.getElement(3), 0);
		vertexTransformat.setElement(vertexInicial.getElement(1) / vertexInicial.getElement(3), 1);
		
		vertexTransformat.setElement(xIni + ((vertexTransformat.getElement(0) + 1) / 2) * width, 0);
		vertexTransformat.setElement(yIni + ((-vertexTransformat.getElement(1) + 1) / 2) * height, 1);
		
		vertexs.add(vertexTransformat);		
	}
	
	public void defineGlEndPolygon() {
		Integer[] coordenadesVertexs = new Integer[vertexs.size() * 2];
		Vector vertex;
		int index;
		
		for (index = 0; index < vertexs.size(); index++) {
			vertex = vertexs.get(index);
			coordenadesVertexs[index * 2] = (int) vertex.getElement(0);
			coordenadesVertexs[index * 2 + 1] = (int) vertex.getElement(1);
		}
		fillPolygon(coordenadesVertexs);
	}
	
	// Fi codi de l'alumne
	
	public static void main(String[] args) {
		Laboratori3 example = new Laboratori3();
		example.run();
	}
}
