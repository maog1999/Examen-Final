package controller;

import model.Logic;
import processing.core.PApplet;

public class MainController {
	
	private Logic logic;
	private PApplet app;
	
	public MainController(PApplet app) {
		this.app = app;
		logic = new Logic(app);
	}

	public void drawFigu() {
		logic.drawFigu();
	}

}
