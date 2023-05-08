package ru.pevneko.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Buttons extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Тест Кнопок");

        Label label = new Label("Not clicked");

        Button button1 = new Button("Кнопка 1");
        Button button2 = new Button("_Кнопка 2");
        Button button3 = new Button("_Кнопка 3");
        Button button4 = new Button("Кнопка 4");

        //обработка событий описывается с помощью лямбд
        button1.setOnAction( value -> {
            label.setText("Clicked!");
        });

        button1.setStyle("-fx-border-color: #ff0000; -fx-border-width: 5px;");
        button2.setStyle("-fx-background-color: #00ff00");
        button3.setStyle("-fx-font-size: 2em; ");
        button4.setStyle("-fx-text-fill: #0000ff");

        HBox box = new HBox(button1, label, button2, button3, button4);

        Scene scene = new Scene(box, 500, 500);

        stage.setScene(scene);
        stage.show();
    }
}
