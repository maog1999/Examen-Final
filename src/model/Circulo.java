package model;

import processing.core.PApplet;

public class Circulo extends Figuras{

	private PApplet app;
	
	public Circulo( PApplet app) {
		super(app);
		
	}
	public void draw() {
		app.fill(getColore());
		app.ellipse(getPosX(), getPosY(), getTama(), getTama());
	}

}
