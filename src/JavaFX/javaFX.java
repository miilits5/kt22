import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
/**
 * Created by tarvi.tihhanov on 03/02/2016.
 */
public class javaFX extends Application {
    Label l;
    TextField sisestusVali;
    @Override
    public void start(Stage stage) throws Exception {
        sisestusVali = new TextField();
        l = new Label("Ahjuõun");
        Button nupp = new Button("Muuda");


        nupp.setOnAction(event -> {
            String input = sisestusVali.getText();
            System.out.println(input);
            l.setText(input);
        });

        Stage lava = new Stage();
        Pane pane = new Pane();
        l.setTranslateY(10);
        l.setTranslateX(20);
        sisestusVali.setTranslateX(20);
        sisestusVali.setTranslateY(30);
        nupp.setTranslateX(20);
        nupp.setTranslateY(60);
        pane.getChildren().addAll(l, sisestusVali, nupp);
        Scene stseen = new Scene(pane,200,100);
        lava.setScene(stseen);
        lava.show();
        lava.setOnCloseRequest(event -> System.exit(0));



    }


}