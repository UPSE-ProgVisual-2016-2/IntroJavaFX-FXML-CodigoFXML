package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
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
					
			//Agregar un TextField
			TextField txtFldNombre = new TextField();
			txtFldNombre.setFont(new Font("Papyrus", 80));
			//Agregando un Label
			Label lblNombre = new Label("Nombre: ");
			
			GridPane grid = new GridPane();
			grid.add(lblNombre, 0, 0);
			grid.add(txtFldNombre, 1, 0);
			grid.add(btn, 1, 1);
			
			//Para ver las lineas guias de la grilla
			grid.setGridLinesVisible(true);
			//Para espaciar los elementos
			grid.setHgap(20);
			
			//Agregamos todos los elementos al VBox
			boxVertical.getChildren().addAll(texto, grid);
			
			//Agregar Metodo manejador de Eventos
			btn.setOnAction(evt -> System.out.printf("Te esta encamando... %s!%n", 
					txtFldNombre.getText()));
			
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
