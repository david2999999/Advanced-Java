package com.java.designpatterns.view;

import java.awt.HeadlessException;

import javax.swing.JFrame;

import com.java.designpatterns.model.Model;

public class View extends JFrame {
	
	private Model model;

	
	// HeadlessException is Thrown when code that is dependent 
	// on a keyboard, display, or mouse is called in an 
	// environment that does not support a keyboard, display, or mouse.
	public View(Model model) throws HeadlessException {
		super("MVC Demo");
		this.model = model;
	}

}
