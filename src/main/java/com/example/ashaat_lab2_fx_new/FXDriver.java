package com.example.ashaat_lab2_fx_new;


import java.io.IOException;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class FXDriver extends Application {
	   
	/**
	 * The main method for the GUI example program JavaFX version
	 * @param args not used
	 * @throws IOException
	 */
	public static void main(String[] args) {
		launch(args);   
	}
		   
	@Override
	public void start(Stage stage) throws IOException {

		FXMainPane root = new FXMainPane();
		//student Task #1:
		//  instantiate the FXMainPane, name it root
		//  set the scene to hold root
		//set stage title
		stage.setScene(new Scene(root,500,500));
		stage.setTitle("Hello World GUI");
		//display the stage
		stage.show();

	}
}