/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen;

import static Examen.Model.ecran;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author talhi
 */
public class Controller implements Initializable {

    @FXML
    private Label affiche1;
    @FXML
    private Label affiche;
    
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    
    
     private void clear( ) {
        affiche.setText("");
    }
    
    @FXML
    public void getNb(ActionEvent event) {
       Button button = (Button)event.getSource();
         String buttonText = button.getText();
        affiche.setText( buttonText);
       if (!buttonText.equals("(")) {
                  affiche.setText( buttonText);
      
        }
        if (buttonText.equals("(") ) {
       clear() ;
               Model.appeler(buttonText);
       affiche.setText(Double.toString(ecran));
        }
        if (buttonText != "C") {
            clear();
        }
        
 
        
    }
    
}
