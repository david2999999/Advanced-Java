package com.java.designpatterns;

import javax.swing.SwingUtilities;

import com.java.designpatterns.controller.Controller;
import com.java.designpatterns.model.Model;
import com.java.designpatterns.view.View;

public class Application {
	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				runApp();
				
			}
		});
	}
	
	public static void runApp() {
		Model model = new Model();
		
		View view = new View(model);
		
		Controller controller = new Controller(model, view);
		
	}
}









