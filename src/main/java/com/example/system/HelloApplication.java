package com.example.system;

import DataBase.DatabaseInitializer;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.input.MouseEvent;
import java.io.IOException;

public class HelloApplication extends Application {
    private double x = 0 ;
    private double y = 0;

    @Override
    public void start(Stage stage) {
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource("fxmlDocument.fxml"));
            root.setOnMousePressed((MouseEvent event) ->{
                x = event.getSceneX();
                y = event.getSceneY();
            });


            root.setOnMouseDragged((MouseEvent event) ->{
                stage.setX(event.getScreenX() - x);
                stage.setY(event.getScreenY() - y);

                stage.setOpacity(.8);
            });

            root.setOnMouseReleased((MouseEvent event) ->{
                stage.setOpacity(1);
            });

            Scene scene = new Scene(root);
            stage.initStyle(StageStyle.TRANSPARENT);
            stage.setScene(scene);
            stage.show();
        } catch (IOException ex) {

        }


    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DatabaseInitializer.createStudentsTable();
        launch(args);
    }
}