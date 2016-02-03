import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Joonista ring, mille värvi saab kasutaja muuta
 */
public class javaFX2 extends Application {
    public void start(Stage primaryStage) throws Exception {
        StackPane stack = new StackPane();
        Scene scene = new Scene(stack, 150, 150);
        primaryStage.setScene(scene);

        Circle ring = new Circle(40);
        stack.getChildren().add(ring);

        primaryStage.show();

        ring.setOnMouseClicked(event -> {
            int r = (int) (Math.random() * 256);
            int g = (int) (Math.random() * 256);
            int b = (int) (Math.random() * 256);
            ring.setFill(Color.rgb(r,g,b));

            System.out.println(r + " " + g + " " + b);
        });

    }
}