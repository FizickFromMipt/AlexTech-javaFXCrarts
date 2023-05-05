import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import lombok.SneakyThrows;
import javafx.application.Application;

public class Main extends Application{


    public static void main(String[] args) {
        Application.launch(args);
    }
    @SneakyThrows
    public void drawPieChart() {

    }

    @Override
    public void start(Stage stage) throws Exception {

        Group group = new Group();
        Scene scene = new Scene(group, 400, 400);

        stage.setTitle("hello world");
        //добавляем сцену
        stage.setScene(scene);
        //отображаем нашу сцену
        stage.show();
    }
}
