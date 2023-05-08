package ru.pevneko.javafx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Draw extends Application {

    public static void main(String[] args) {
        System.out.println("Запуск JavaFX приложения");
        launch(args);
    }


    @Override
    public void start(Stage stage) throws Exception {
        Group group1 = new Group();
        Scene scene1 = new Scene(group1, 400, 400);

        stage.setScene(scene1);
        stage.setTitle("Тестовок окно");
        stage.show();
    }
}
