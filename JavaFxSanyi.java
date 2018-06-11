/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxsanyi;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author SchaferAkos
 */
public class JavaFxSanyi extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        
        StageController.setRoot_stage(stage);
        StageController.addView("root", FXMLLoader.load(getClass().getResource("FXMLRoot.fxml")));
        StageController.addView("page1", FXMLLoader.load(getClass().getResource("FXMLPage1.fxml")));
        
        StageController.addScene("root", new Scene(StageController.getView("root")));
        StageController.addScene("page1", new Scene(StageController.getView("page1")));
        
        StageController.CreateView("root");
        
        
//        Scene scene = new Scene(root);
//        stage.setScene(scene);
//        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
        
        
    }

}
