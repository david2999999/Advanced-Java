package com.java.designpatterns.controller;

import com.java.designpatterns.model.Model;
import com.java.designpatterns.view.View;

public class Controller {
	
	private Model model;
	private View view;

	public Controller(Model model, View view) {
		super();
		this.model = model;
		this.view = view;
	}

}
