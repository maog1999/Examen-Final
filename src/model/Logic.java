package model;

import java.util.LinkedList;

import processing.core.PApplet;

public class Logic {

	private PApplet app;
	private LinkedList<Padre> figus;
	private String[] info;

	

	public Logic(PApplet app) {
		this.app = app;
		figus = new LinkedList<Padre>();
		cargaInfo();
		crearInfo();
	}
	public void cargaInfo(){
		
	}
	
		public void crearInfo() {
			
	}
		
	
	public void draw() {
		
		for(int i = 0 ; i<figus.size();i++) {
		Thread nuevoH = new Thread(figus.get(i));
		figus.get(i).draw();
		nuevoH.start();
		
	}
	}

}
