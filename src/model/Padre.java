package model;

import processing.core.PApplet;

public abstract class Padre implements Runnable{

	private int posX, posY, Tama, colore, r , g , b, direc1, direc2;
	private PApplet app;
	
	
	public Padre(PApplet app) {
		this.posX = (int) (app.random(100,500));
		this.posY = (int) (app.random(100,500));
		this.Tama = (int) (app.random(20,60));
		r = (int) (app.random(0,255));
		g = (int) (app.random(0,255));
		b = (int) (app.random(0,255));
		this.colore = app.color(r , g, b);
		direc1 = (int) (app.random(-2,2));
		direc2 = (int) (app.random(-2,2));

		
	}
	
	public void draw() {
		
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

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public int getG() {
		return g;
	}

	public void setG(int g) {
		this.g = g;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
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
