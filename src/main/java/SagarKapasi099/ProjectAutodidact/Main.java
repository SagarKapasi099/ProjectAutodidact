package SagarKapasi099.ProjectAutodidact;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Project Autodidact");
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/View.fxml"));
            primaryStage.setScene(new Scene(root, 1200, 500));
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
