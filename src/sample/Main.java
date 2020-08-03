package sample;

import java.lang.*;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import static jdk.nashorn.internal.runtime.regexp.joni.Syntax.Java;

public class Main extends Application {

    //logic of a calculator

    Double num = 0.0;
    Double num2 = 0.0;
    Double result = 0.0;
    String operator = " ";

    // label field which displays the input numbers and the results
    Label label = new Label("                   ");

    @Override
    public void start(Stage primaryStage) throws Exception{

        //Title of program
        primaryStage.setTitle("Calculator Project");

        // label field which displays the input numbers and the results
        label.setAlignment(Pos.CENTER_RIGHT);

        //All about Buttons
        //function button(s)
        Button addBtn = new Button(" + ");
        Button subBtn = new Button(" - ");
        Button multiBtn = new Button(" * ");
        Button divBtn = new Button(" log ");
        Button clrBtn = new Button(" C ");
        Button equalBtn = new Button(" = ");
        Button dotBtn = new Button(" . ");

        //number button(s)
        Button zeroBtn = new Button(" 0 ");
        Button oneBtn = new Button(" 1 ");
        Button twoBtn = new Button(" 2 ");
        Button threeBtn = new Button(" 3 ");
        Button fourBtn = new Button(" 4 ");
        Button fiveBtn = new Button(" 5 ");
        Button sixBtn = new Button(" 6 ");
        Button sevenBtn = new Button(" 7 ");
        Button eightBtn = new Button(" 8 ");
        Button nineBtn = new Button(" 9 ");

        //Button Event

        zeroBtn.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                //num = 0;
                label.setText(label.getText() + "0");
            }
        });
        oneBtn.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                //num = 1;
                label.setText(label.getText() + "1");
            }
        });
        twoBtn.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                //num = 2;
                label.setText(label.getText() + "2");
            }
        });
        threeBtn.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                //num = 3;
                label.setText(label.getText() + "3");
            }
        });
        fourBtn.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                //num = 4;
                label.setText(label.getText() + "4");
            }
        });
        fiveBtn.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                //num = 5;
                label.setText(label.getText() + "5");
            }
        });
        sixBtn.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                //num = 6;
                label.setText(label.getText() + "6");
            }
        });
        sevenBtn.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                //num = 7;
                label.setText(label.getText() + "7");
            }
        });
        eightBtn.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                //num = 8;
                label.setText(label.getText() + "8");
            }
        });
        nineBtn.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                //num = 9;
                label.setText(label.getText() + "9");
            }
        });
        dotBtn.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                label.setText(label.getText() + ".");
            }
        });
        clrBtn.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                //num = 0;
                operator="";
                result = 0.0;
                label.setText("");
            }
        });
        addBtn.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                operator = "+";
                num = Double.parseDouble(label.getText());
                // num = "";
                label.setText(operator);
            }
        });
        subBtn.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                operator = "-";
                num = Double.parseDouble(label.getText());
                //calculate();
                label.setText(operator);
                //num = "";
            }
        });
        divBtn.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                operator = "log";
                num = Double.parseDouble(label.getText());
                label.setText(operator);
                // num = "";
            }
        });
        multiBtn.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                operator = "*";
                num = Double.parseDouble(label.getText());
                //calculate();
                label.setText(operator);
                //num = "";
            }
        });
        equalBtn.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                num2 = Double.parseDouble(label.getText());
                calculate(operator, num, num2);
            }
        });
/*

        switch (operator) {
            int num1 = Integer.parseInt(num);

            case "+":
                result += num1;
                label.setText(result+"");
                break;
            case "-":
                operator = "-";

                break;
            case "*":
                operator = "*";
                calculate();
                break;
            case "/":
                operator = "/";
                calculate();
                break;
        }
*/
        // operations
        // All about the grid of buttons
        GridPane gridPane = new GridPane();
        gridPane.setVgap(5);
        gridPane.setHgap(5);

        //row 1
        gridPane.add(clrBtn, 3, 1, 1, 1);

        //row 2
        gridPane.add(sevenBtn, 0, 2, 1, 1);
        gridPane.add(eightBtn, 1, 2, 1, 1);
        gridPane.add(nineBtn, 2, 2, 1, 1);
        gridPane.add(divBtn, 3, 2, 1, 1);

        //row 2
        gridPane.add(fourBtn, 0, 3, 1, 1);
        gridPane.add(fiveBtn, 1, 3, 1, 1);
        gridPane.add(sixBtn, 2, 3, 1, 1);
        gridPane.add(multiBtn, 3, 3, 1, 1);

        //row 4
        gridPane.add(oneBtn, 0, 4, 1, 1);
        gridPane.add(twoBtn, 1, 4, 1, 1);
        gridPane.add(threeBtn, 2, 4, 1, 1);
        gridPane.add(subBtn, 3, 4, 1, 1);

        //row 5
        gridPane.add(zeroBtn, 0, 5, 1, 1);
        gridPane.add(dotBtn, 1, 5, 1, 1);
        gridPane.add(equalBtn, 2, 5, 1, 1);
        gridPane.add(addBtn, 3, 5, 1, 1);

        //primaryStage.setScene(new Scene(gridPane, 125, 125));

        //Calcultor UI setup
        BorderPane bp = new BorderPane();

        bp.setTop(label);
        bp.setCenter(gridPane);

        primaryStage.setScene(new Scene(bp, 150, 175));

        primaryStage.show();
    };

    private void calculate(String operator, double num, double num2){
        double result = 0.0;
        if (operator == "+"){
            result = num2 + num;
            label.setText(result + "");
        }
        if (operator == "-"){
            result = num2 + num;
            label.setText(result + "");
        }
        if (operator == "*"){
            result = num2 * num;
            label.setText(result + "");
        }
        if (operator == "log"){
            result = Math.log(num);
            label.setText(result + "");
            //num = " ";
        }
        if (operator == ""){
            result = 0.0;
            label.setText(result + "");
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}

