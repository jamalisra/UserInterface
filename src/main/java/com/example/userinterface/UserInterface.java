package com.example.userinterface;



import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class UserInterface extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("user-view.fxml"));


        Scene scene = new Scene(root, 800, 600);


        scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());


        primaryStage.setScene(scene);


        primaryStage.setTitle("FSC CSC325");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

