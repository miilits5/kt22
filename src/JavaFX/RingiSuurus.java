import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
/**
 * Created by tarvi.tihhanov on 03/02/2016.
 */
public class RingiSuurus extends Application {
    public void start(Stage primaryStage) throws Exception {
        StackPane stack = new StackPane();
        Scene scene = new Scene(stack, 550, 550);
        primaryStage.setScene(scene);

        Circle ring = new Circle(40);
        stack.getChildren().add(ring);
        Slider slider = new Slider(0, 0, 0);
        GridPane.setHgrow(slider, Priority.ALWAYS);
        stack.getChildren().add(slider);
        slider.setMin(0);
        slider.setMax(500);
        slider.setValue(40);
        slider.setMajorTickUnit(50);
        slider.setMinorTickCount(5);
        slider.setBlockIncrement(10);
        slider.setTranslateY(-250);
        slider.valueProperty().addListener((observable, oldValue, newValue) -> {
            ring.setRadius(newValue.intValue());
        });
        primaryStage.show();

    }


}