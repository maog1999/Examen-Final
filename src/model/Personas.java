package model;

import processing.core.PApplet;

public abstract class Personas implements Runnable{

	protected int posX;
	protected int posY;
	protected int Tama;
	protected int colore;
	private int direc1;
	private int direc2;
	private PApplet app;
	
	
	public Personas(int posX, int posY, int Tama, int colore, PApplet app) {
		this.app = app;
		this.posX = posX;
		this.posY = posY;
		this.Tama = 7;
		this.colore = colore;
		direc1 = (int) (app.random(-2,2));
		direc2 = (int) (app.random(-2,2));

		
	}
	
	public void pintar() {
	} 
	
	public void run() {
		
		move();
	}
	
	public void move() {
		this.posX += direc1;
		this.posY += direc2;
		
		if(this.posX <30 || this.posX >570) {
			this.direc1 *= -1;
			this.direc2 *= -1;
		}
		if(this.posY <30 || this.posY >570 ) {
			this.direc1 *= -1;
			this.direc2 *= -1;
		}
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public int getTama() {
		return Tama;
	}

	public void setTama(int tama) {
		Tama = tama;
	}

	public int getColore() {
		return colore;
	}

	public void setColore(int colore) {
		this.colore = colore;
	}



	public int getDirec1() {
		return direc1;
	}

	public void setDirec1(int direc1) {
		this.direc1 = direc1;
	}

	public int getDirec2() {
		return direc2;
	}

	public void setDirec2(int direc2) {
		this.direc2 = direc2;
	}

}
