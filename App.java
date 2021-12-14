import Classes.ThinCrust;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class App extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Sauces");
        //Creating a new pizza
        ThinCrust pizza = new ThinCrust();

        //Using a grid pane
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(50);
        grid.setVgap(25);
        grid.getChildren();

        Scene crust = new Scene(grid, 250, 250);
        primaryStage.setScene(crust);

        //Adding text for the choosing sauce scene
        Text sauce = new Text("Choose Pizza Sauce");
        sauce.setFont(Font.font("Arial", FontWeight.NORMAL, 20));
        grid.add(sauce, 0, 0, 0, 5);

        //Adding buttons for the sauce choices
        HBox hBox = new HBox();
       hBox.setSpacing(10);
       hBox.setAlignment(Pos.CENTER);
       Button btEnlarge = new Button("Enlarge");
       Button btShrink = new Button("Shrink");
       hBox.getChildren().add(btEnlarge);
       hBox.getChildren().add(btShrink);
  
       BorderPane borderPane = new BorderPane();
       borderPane.setCenter(grid);
       borderPane.setBottom(hBox);
       BorderPane.setAlignment(hBox, Pos.CENTER);

        primaryStage.show();
    }
}
