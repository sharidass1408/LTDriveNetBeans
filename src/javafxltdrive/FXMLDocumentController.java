/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxltdrive;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.stage.FileChooser;
import java.io.File;
import javafx.scene.control.ChoiceBox;

/**
 *
 * @author Sai
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Button browseCatalog;
    
    @FXML
    private ChoiceBox vehicleProgram = new ChoiceBox<>();


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
        constVehicleProgramDropDown();
    }

    private void constVehicleProgramDropDown() {
        vehicleProgram.getItems().add("- Select a Vehicle Program - ");
        vehicleProgram.getItems().add("2005 P131");
        vehicleProgram.getItems().add("2007 P356");
        vehicleProgram.getItems().add("2009 T1");
        vehicleProgram.getItems().add("E-series");
        vehicleProgram.getItems().add("P221 Prod");
        vehicleProgram.getItems().add("Reference");
        vehicleProgram.getItems().add("SUV");
        vehicleProgram.getItems().add("TRANSIT");
        vehicleProgram.setValue("- Select a Vehicle Program - ");
    }

}
