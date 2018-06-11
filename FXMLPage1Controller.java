/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxsanyi;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author SchaferAkos
 */
public class FXMLPage1Controller implements Initializable {

   
     @FXML
    private void btnVissza(ActionEvent event) {
        System.out.println("Vissza");
        StageController.CreateView("root");
    } 
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
