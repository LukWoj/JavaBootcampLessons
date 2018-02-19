import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.effect.Glow;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class Controller {

    @FXML
    private ImageView logoButton;

    @FXML
    private ImageView background;

    @FXML
    private TextField userField;

    @FXML
    private PasswordField passField;

    @FXML
    private Button LoginButton;

    @FXML
    private Button LogoutButton;


    @FXML
    void abortLogin(ActionEvent event) {
        System.out.println("User logout");

    }

    @FXML
    void confirmLogin(ActionEvent event) {
        String user = userField.getText();
        String pass = passField.getText();
        System.out.printf("User logged in: %s ,pass: %s%n", user, pass);
    }


    @FXML
    void addEffect(MouseEvent event) {
        logoButton.setEffect(new Glow(0.9));
    }

    @FXML
    void removeEffect(MouseEvent event) {
        logoButton.setEffect(null);
    }


    @FXML
    void prettyBackGround(MouseEvent event) {
        ColorAdjust colorAdjust = new ColorAdjust();
        background.setEffect(colorAdjust);

        Timeline timeline = new Timeline();
        timeline.setCycleCount(3);
//        timeline.setAutoReverse(true);
        javafx.util.Duration duration = javafx.util.Duration.seconds(5);

        KeyValue keyBrightness = new KeyValue(colorAdjust.brightnessProperty(), -0.5);
        KeyFrame keyFrameBrightness = new KeyFrame(duration, keyBrightness);
        KeyValue keyContrast = new KeyValue(colorAdjust.contrastProperty(), 0.3);
        KeyFrame keyFrameContrast = new KeyFrame(duration, keyContrast);
        KeyValue keyHue = new KeyValue(colorAdjust.hueProperty(), 0.48);
        KeyFrame keyFrameHue = new KeyFrame(duration, keyHue);
        KeyValue keySaturation = new KeyValue(colorAdjust.saturationProperty(), -0.24);
        KeyFrame keyFrameSaturation = new KeyFrame(duration, keySaturation);

        timeline.getKeyFrames().addAll(
                keyFrameBrightness, keyFrameContrast, keyFrameHue, keyFrameSaturation);
        timeline.play();

    }


}


