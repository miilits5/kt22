import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
/**
 Joonista 500x500 ekraanile ring. Kui hiir ringile vastu läheb, leiab ring omale
 uue koha. Ei pea animeerima ega midagi fäänsit. Lihtsalt ilmub uues kohas ja kõik.
 Ehk hiirega saab ringi taga ajada. Kordan - ring leiab uue koha juba hiire puudutusest,
 mitte klikist. Aga alustada võid muidugi klikist.
 */
/**
 * Created by tarvi.tihhanov on 03/02/2016.
 */
public class liikuvring extends Application {
    public void start(Stage primaryStage) throws Exception {
        Stage lava = new Stage();
        Pane pane = new Pane();

        Circle ring = new Circle(40);
        ring.setCursor(Cursor.DEFAULT);
        ring.setCenterY(50);
        ring.setCenterX(50);
        ring.setOnMouseEntered(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent me) {
                ring.setTranslateX(Math.random() * (550 - ring.getTranslateX()));
                ring.setTranslateY(Math.random() * (550 - ring.getTranslateY()));
            }
        });
        pane.getChildren().add(ring);
        Scene stseen = new Scene(pane,600,600);
        lava.setScene(stseen);
        lava.show();
        lava.setOnCloseRequest(event -> System.exit(0));;
    }
}
