import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class FxSimpleForm extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {//wywołanie "primaryStage" gdy system dostarczy okno główne
        //obsługa okna
        Parent sceneGraph = createSceneGraph();
        Scene scene = new Scene(sceneGraph);

        primaryStage.initStyle(StageStyle.UTILITY);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    //tworzenie sceneGraph
    private Parent createSceneGraph() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("simpleForm.fxml"));
        Parent root = loader.load();
        return root;
    }
}


