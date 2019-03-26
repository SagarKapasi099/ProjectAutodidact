package SagarKapasi099.ProjectAutodidact;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Hello World");
        try {
            Parent root = FXMLLoader.load(getClass().getResource("View.fxml"));
            primaryStage.setScene(new Scene(root, 300, 275));
        } catch (Exception e) {
            System.err.println("Error Loading View");
            System.out.println(e.getMessage());
        }
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
