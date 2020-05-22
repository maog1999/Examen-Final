package model;

import java.util.LinkedList;

import processing.core.PApplet;

public class Logic {

	private PApplet app;
	private LinkedList<Figuras> figus;
	

	public Logic(PApplet app) {
		this.app = app;
		figus = new LinkedList<Figuras>();
		cargaInfo();
		crearInfo();
	}
	public void cargaInfo(){
		
	}
	
		public void crearInfo() {
			
	}
		
	
	public void drawFigu() {
		
		for(int i = 0 ; i<figus.size();i++) {
		Thread nuevoH = new Thread(figus.get(i));
		figus.get(i).draw();
		nuevoH.start();
		
	}
	}

}
