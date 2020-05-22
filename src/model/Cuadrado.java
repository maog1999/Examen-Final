package model;

import processing.core.PApplet;

public class Cuadrado extends Padre {

	PApplet app;
	
	public Cuadrado(PApplet app) {
		super( app);
	}

	public void draw() {
		app.fill(getColore());
		app.rect(getPosX(), getPosY(), getTama(), getTama());
	}
}
