package model;

import processing.core.PApplet;

public class Sanas extends Personas{

	private PApplet app;
	
	public Sanas(int posX, int posY, int Tama, int colore, PApplet app) {
		super(posX, posY, Tama, colore, app);
		
	}
	public void pintar() {
		//app.fill(colore);
		app.ellipse(this.posX, this.posY, 7, 7);
	}

}
