package model;

import processing.core.PApplet;

public class Infectados extends Personas {

	private PApplet app;

	public Infectados(int posX, int posY, int Tama, int colore, PApplet app) {
		super(posX, posY, Tama, colore, app);
	
	}

	public void pintar() {
		//app.fill(colore);
		app.ellipse(this.posX, this.posY, 7, 7);
	}
}
