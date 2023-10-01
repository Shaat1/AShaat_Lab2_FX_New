package com.example.ashaat_lab2_fx_new;


import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventTarget;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 * This panel is the basic panel, inside which other panels are placed.
 * Before beginning to implement, design the structure of your GUI in order to
 * understand what panels go inside which ones, and what buttons or other components
 * go in which panels.
 *
 * @author ralexander
 */
//make the main panel's layout be a VBox
public class FXMainPane extends VBox {
    private Button buttonHello;
    private Button buttonHowdy;
    private Button buttonChinese;
    private Button buttonClear;
    private Button buttonExit;
    private Label label;
    private TextField textField;
    private HBox hBox1;
    private HBox hBox2;
    private DataManager dataManager;

    //student Task #2:
    //  declare five buttons, a label, and a textfield
    //  declare two HBoxes

    //student Task #4:
    //  declare an instance of DataManager

    /**
     * The MainPanel constructor sets up the entire GUI in this approach.  Remember to
     * wait to add a component to its containing component until the container has
     * been created.  This is the only constraint on the order in which the following
     * statements appear.
     */
    FXMainPane() {
        //student Task #2:
        //  instantiate the buttons, label, and textfield
        //  instantiate the HBoxes
        ButtonHandler handler = new ButtonHandler();
        buttonHello = new Button("Hello");
        buttonHello.setOnAction(handler);
        buttonHowdy = new Button("Howdy");
        buttonHowdy.setOnAction(handler);
        buttonChinese = new Button("Chinese");
        buttonChinese.setOnAction(handler);
        buttonClear = new Button("Clear");
        buttonClear.setOnAction(handler);
        buttonExit = new Button("Exit");
        buttonExit.setOnAction(new ButtonHandler());
        label = new Label("Feedback");
        textField = new TextField();
        hBox1 = new HBox();
        hBox2 = new HBox();

        //student Task #4:
        //  instantiate the DataManager instance
        //  set margins and set alignment of the components
        dataManager = new DataManager();
        //student Task #3:
        //  add the label and textfield to one of the HBoxes
        //  add the buttons to the other HBox
        //  add the HBoxes to this FXMainPanel (a VBox)
        hBox1.getChildren().addAll(buttonHello, buttonHowdy, buttonChinese, buttonClear, buttonExit);
        hBox2.getChildren().addAll(label, textField);
        getChildren().addAll(hBox1, hBox2);

    }

    //Task #4:
    //  create a private inner class to handle the button clicks
    public class ButtonHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent actionEvent) {
            EventTarget clickedButton = actionEvent.getTarget();
            if (clickedButton == buttonHello) {
                textField.setText(dataManager.getHello());
            } else if (clickedButton == buttonHowdy) {
                textField.setText(dataManager.getHowdy());
            } else if (clickedButton == buttonChinese) {
                textField.setText(dataManager.getChinese());
            } else if (clickedButton == buttonClear) {
                textField.setText("");
            } else if (clickedButton == buttonExit) {
                Platform.exit();
                System.exit(0);
            }
        }
    }
}

	
