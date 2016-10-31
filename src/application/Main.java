package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Group root = new Group();
			Text texto = new Text("Cual montas?");
			Button btn = new Button();
			btn.setText("Encamar");
			
			//Agregar elementos en un VBox para que no se superpongan
			VBox boxVertical = new VBox();
			
			//Agregamos todos los elementos al VBox
			boxVertical.getChildren().addAll(texto, btn);
			
			//Agregar Metodo manejador de Eventos
			btn.setOnAction(evt -> System.out.println("Encame en proceso..."));
			
			root.getChildren().add(boxVertical);
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
