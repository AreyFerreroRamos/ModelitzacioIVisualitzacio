package cat.urv.deim.miv.laboratoris;

import cat.urv.deim.miv.Application;

public class Laboratori1 extends Application {

	public static final long serialVersionUID = 1L;
	
	public Laboratori1() {
		super("Laboratori 1");
	}

	public void paint() {
		int width = getPanelWidth();
		int height = getPanelHeight();
		
		int nlines = 10;
		int curWidth = 0;
		int curHeight = 0;

		for(int i = 0; i < nlines; i++) {
			setColor((float) i / nlines, 1.0f - (float) i / nlines, 0.0f);
			drawLine(0, curHeight, width - curWidth, 0);
			curWidth = width * i / nlines;
			curHeight = height * i / nlines;
		}
	}

	// Practica 1, implementa defineDrawLine
	// Hint: Pots utilitzar l'algorisme de Bresenham
	// Hint: Per dibuixar un punt a la pantalla utilitza el metode drawPoint(x, y);
	
	// Inici codi de l'alumne
	
	public void drawLineMidst(int x1, int y1, int x2, int y2) {
		int x, y, xi, yi;
		
		if (x2 > x1) {
			xi = 1;
		}
		else {
			xi = -1;
		}
		if (y2 > y1) {
			yi = 1;
		}
		else {
			yi = -1;
		}
		
		y = y1;
		for (x = x1; x != x2; x = x + xi) {
			drawPoint(x, y);
			y = y + yi;
		}
	}
	
	public void drawLineLow(int x1, int y1, int x2, int y2) {
		int dX, dY, yi, D, x, y;
		
		dX = x2 - x1;
		dY = y2 - y1;
		yi = 1;
		
		if (dY < 0) {
			yi = -1;
			dY = -dY;
		}
		D = (2 * dY) - dX;
		y = y1;
		
		for (x = x1; x < x2; x++) {
			drawPoint(x, y);
			if (D > 0) {
				y = y + yi;
				D = D + (2 * (dY - dX));
			}
			else {
				D = D + 2*dY;
			}
		}
	}
	
	public void drawLineHigh(int x1, int y1, int x2, int y2) {
		int dX, dY, xi, D, x, y;
		
		dX = x2 - x1;
		dY = y2 - y1;
		xi = 1;
		
		if (dX < 0) {
			xi = -1;
			dX = -dX;
		}
		D = (2 * dX) - dY;
		x = x1;

		for (y = y1; y < y2; y++) {
			drawPoint(x, y);
			if (D > 0) {
				x = x + xi;
				D = D + (2 * (dX - dY));
			}
			else {
				D = D + 2 * dX;
			}
		}
	}
               
	public void defineDrawLine(int x1, int y1, int x2, int y2) {
		int x, y;
		
		if (Math.abs(y2 - y1) == Math.abs(x2 - x1)) {		
			drawLineMidst(x1, y1, x2, y2);		//Traçat d'una línia de pendent 1.
		}
		else {
			if (Math.abs(y2 - y1) < Math.abs(x2 - x1)) {
				if (x1 == x2) {		//Traçat d'una línia horitzontal.
					for (y = y1; y < y2; y++) {
						drawPoint(x1, y);
					}
				}
				else {		//Traçat d'una línia de pendent inferior a 1.
					if (x1 > x2) {
						drawLineLow(x2, y2, x1, y1);
					}
					else {
						drawLineLow(x1, y1, x2, y2);
					}
				}
			}
			else {
				if (y1 == y2) {		//Traçat d'una línia vertical.
					for (x = x1; x < x2; x++) {
						drawPoint(x, y1);
					}
				}
				else {		//Traçat d'una línia de pendent superior a 1.
					if (y1 > y2) {
						drawLineHigh(x2, y2, x1, y1);
					}
					else {
						drawLineHigh(x1, y1, x2, y2);
					}
				}
			}
		}
	}

	// Fi codi de l'alumne
	
	public static void main(String[] args) {
		Laboratori1 example = new Laboratori1();
		example.run();
	}

}
