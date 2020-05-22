package model;

import java.util.LinkedList;

import processing.core.PApplet;

public class Logic {

	private PApplet app;
	private LinkedList<Personas> persos;
	private String[] Infoperso;

	public Logic(PApplet app) {
		this.app = app;
		persos = new LinkedList<Personas>();
		cargaInfo();
		crearInfo();
	}

	public void cargaInfo() {
		Infoperso = app.loadStrings("./datos.txt");

	}

	public void crearInfo() {
		System.out.println("entreo y creo");
		
		for (int i = 0; i < Infoperso.length; i++) {
			String[] infoP = Infoperso[i].split(":");
			System.out.println(infoP[1]);
			int cantidad = Integer.parseInt(infoP[1]);

			if (infoP[0].contentEquals("sanas")) {
				System.out.println("JGJG");
				int colore = app.color(0, 255, 0);

				for (int j = 0; j < cantidad; j++) {
					int posx = (int) (app.random(0, 500));
					int posy = (int) (app.random(0, 500));
					persos.add(new Sanas(posx,posy,7,colore,app));

				}
			} 

			else if (infoP[0].contentEquals("infectadas")) {
				System.out.println("HP");
				int colore = app.color(255, 0, 0);

					int posx = (int) (app.random(0, 500));
					int posy = (int) (app.random(0, 500));
					persos.add(new Infectados(posx,posy,7,colore,app));

				}else {
					System.out.println("mk");
					int colore = app.color(0, 0, 255);

					int posx = (int) (app.random(0, 500));
					int posy = (int) (app.random(0, 500));
					persos.add(new Recuperadas(posx, posy, 7,colore,app));
				}
			

		
			
			//System.out.println(persos.get(98));
		} 
	}
	
		
	

	public void draw() {

		for (int i = 0; i < persos.size(); i++) {
			//System.out.println(persos.get(99)); 
			// profe mira la verdad no se que pasa, en el syso de arriba crompuebo que me cree el obj
			//pero cuando lo pinto, no me pinta y ya llevo varado aqui intentado mirar que es y no por que me salta
			//un null si está lleno
			persos.get(i).pintar();
		}

	}
}
