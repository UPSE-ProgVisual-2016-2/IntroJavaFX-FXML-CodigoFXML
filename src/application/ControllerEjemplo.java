package application;

import java.util.Random;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class ControllerEjemplo {

	@FXML private TextField txtFieldNombre; 
	
	public void generarCedula()
	{
		Random r = new Random();
		String nombre = txtFieldNombre.getText();
		System.out.println(nombre + " su cedula es: " + r.nextInt(999999999));
	}
}
