package co.uniquindio.concesionario.application;

import co.uniquindio.concesionario.controller.ModelFactoryController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Aplicacion extends Application {
	// inicializo el singleton
	static ModelFactoryController singleton = ModelFactoryController.getInstance();

	public void start(Stage primaryStage) throws Exception {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/PrincipalView.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Login");
        primaryStage.show();

    }


	  public static void main(String[] args) {
	    launch(args);
	}


}
