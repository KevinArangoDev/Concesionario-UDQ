package co.uniquindio.concesionario.application;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import co.uniquindio.concesionario.controller.ModelFactoryController;
import co.uniquindio.concesionario.model.Concesionario;
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

        Concesionario concesionario = new Concesionario();

        // Serializar el objeto y guardarlo en un archivo
        try {
            FileOutputStream fileOut = new FileOutputStream("concesionario.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(concesionario);
            out.close();
            fileOut.close();
            System.out.println("El objeto Concesionario ha sido serializado y guardado en moto.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Leer el objeto serializado desde el archivo
        try {
            FileInputStream fileIn = new FileInputStream("concesionario.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Concesionario concesionarioDeserializada = (Concesionario) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("El objeto Concesionario ha sido deserializado desde concesionario.ser");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


	  public static void main(String[] args) {
	    launch(args);
	}


}
