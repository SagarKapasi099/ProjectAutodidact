package SagarKapasi099.ProjectAutodidact;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Project Autodidact");
        primaryStage.initStyle(StageStyle.TRANSPARENT);

        try {
            Parent root = FXMLLoader.load(getClass().getResource("/View.fxml"));

            Scene primaryScene = new Scene(root, 1200, 500);
            primaryScene.setUserAgentStylesheet("red.css");
            primaryScene.setFill(Color.TRANSPARENT);
            primaryStage.setScene(primaryScene);

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
