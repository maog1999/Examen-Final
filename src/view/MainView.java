package view;

import controller.MainController;
import processing.core.PApplet;

public class MainView extends PApplet {
	private MainController mainController;
		
	public static void main(String[] args) {
		PApplet.main("view.MainView");
	}
	
	public void settings() {
		size(600,600);
	}
	
	public void setup() {
		mainController = new MainController(this);
	}
	
	public void draw() {
		background(255);
		mainController.draw();
	}
	
	public void mousePressed() {
		
	}

}
