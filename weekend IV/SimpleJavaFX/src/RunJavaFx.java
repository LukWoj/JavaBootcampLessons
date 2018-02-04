import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class RunJavaFx extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = createSceneGraph();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private Parent createSceneGraph() {
        Label label = new Label("Hello World");
        label.setVisible(false);
        label.setEffect();
        label.setOnMousePressed();
        return label;
    }
}
