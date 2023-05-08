module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens groupId.AlexTech-javaFXCrarts to javafx.fxml;
    exports groupId.AlexTech-javaFXCrarts;
}