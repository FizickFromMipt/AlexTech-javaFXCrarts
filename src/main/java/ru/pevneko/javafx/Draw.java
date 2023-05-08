package ru.pevneko.javafx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.lang.annotation.ElementType;

public class Draw extends Application {

    public static void main(String[] args) {
        System.out.println("Запуск JavaFX приложения");
        launch(args);
    }


    @Override
    public void start(Stage stage) throws Exception {

        int length = 400;
        int width = 800;

        Group root = new Group();
        Scene scene1 = new Scene(root, width, length);

        //фигуры
        //Создание и настройка линий
        Line line1 = new Line (0,0, width,length);
        Line line2 = new Line(width, 0, 0, length );
        line1.setStroke(Color.GREEN);
        line2.setStroke(Color.BLUE);

        //Элипс (адаптируется под размеры поля )
        Ellipse ellipse = new Ellipse(width/2, length/2, width/10, length/10);
        ellipse.setStroke(Color.RED);
        ellipse.setFill(Color.YELLOW);

        //Квадрат
        Rectangle[] rectangles = new Rectangle[4];
        for (int i =0; i<=3; i++) {
            switch (i){
                case 0 :
                    rectangles[i] = new Rectangle(0, 0, width/10, length/10);
                    rectangles[i].setStroke(Color.GRAY);
                    rectangles[i].setFill(Color.MAGENTA);
                    break;
                case 1 :
                    rectangles[i] = new Rectangle(width - width/10, 0, width/10, length/10);
                    rectangles[i].setStroke(Color.GRAY);
                    rectangles[i].setFill(Color.MAGENTA);
                    break;
                case 2 :
                    rectangles[i] = new Rectangle(width - width/10, length - length/10, width/10, length/10);
                    rectangles[i].setStroke(Color.GRAY);
                    rectangles[i].setFill(Color.MAGENTA);
                    break;
                case 3 :
                    rectangles[i] = new Rectangle(0, length - length/10, width/10, length/10);                    rectangles[i].setStroke(Color.GRAY);
                    rectangles[i].setFill(Color.MAGENTA);
                    break;
            }
        }

        //Текст
        String str = "Тест javaFX";
        Text text = new Text(width/2 - str.length()*3,length/15,str);
        text.setFill(Color.BLACK);
        text.setFont(new Font(14));

        root.getChildren().add(text);
        root.getChildren().add(line1);
        root.getChildren().add(line2);
        root.getChildren().add(ellipse);
        for (Rectangle rectangle : rectangles) {
            root.getChildren().add(rectangle);
        }
        stage.setScene(scene1);


        stage.setTitle("Тестовое окно");
        stage.show();
    }
}
