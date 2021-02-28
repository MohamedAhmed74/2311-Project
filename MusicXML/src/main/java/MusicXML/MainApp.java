package MusicXML;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
 
public class MainApp extends Application {
    public static void main(String[] args) {
        launch(args);									// this starts the application
    }
    
    @Override
    public void start(Stage primaryStage) {
        
//    	Parent root = null;
		try {
		Parent	root = FXMLLoader.load(getClass().getResource("musicXML.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);					// add a scene to the Stage
        primaryStage.show();							// show the Stage (a blank window)
		} catch (IOException e) {
			e.printStackTrace();
		}

    }
}
