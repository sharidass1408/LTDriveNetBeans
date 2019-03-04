/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxltdrive;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.stage.FileChooser;
import java.io.File;

/**
 *
 * @author Sai
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Button browseCatalog;
    
    
    
    public void handleBrowseCatalogClick(){
        FileChooser fc = new FileChooser();
        File selectedFile = fc.showOpenDialog(null);
        
        if(selectedFile != null){
            System.out.println("Valid file");
        }else{
            System.out.println("File not valid");
        }
        
    }
     
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
