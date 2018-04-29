/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cricketworld;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

/**
 * FXML Controller class
 *
 * @author hp
 */
public class TopChartController implements Initializable {

    @FXML
    private AnchorPane apTable;
    @FXML
    private Button bBatsman;
    @FXML
    private Button bBowler;
    @FXML
    private Button bBack;
    @FXML
    private AnchorPane apTopChart;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
    }    

    @FXML
    private void topBatTest(ActionEvent event) {
        try {
            Pane pane = (AnchorPane) FXMLLoader.load(getClass().getResource("TopTestBat.fxml"));
            apTable.getChildren().setAll(pane);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        
    }

    @FXML
    private void topBowlerTest(ActionEvent event) {
       try {
            Pane pane = (AnchorPane) FXMLLoader.load(getClass().getResource("TopTestBowl.fxml"));
            apTable.getChildren().setAll(pane);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        
    }

    @FXML
    private void back(ActionEvent event) {
        try {
            Pane pane = (AnchorPane) FXMLLoader.load(getClass().getResource("StartCricket.fxml"));
            apTopChart.getChildren().setAll(pane);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        
    }

    @FXML
    private void topODIBat(ActionEvent event) {
        try {
            Pane pane = (AnchorPane) FXMLLoader.load(getClass().getResource("TopODIBat.fxml"));
            apTable.getChildren().setAll(pane);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    @FXML
    private void topODIBowl(ActionEvent event) {
        try {
            Pane pane = (AnchorPane) FXMLLoader.load(getClass().getResource("TopODIBowl.fxml"));
            apTable.getChildren().setAll(pane);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    @FXML
    private void topT20Bat(ActionEvent event) {
        try {
            Pane pane = (AnchorPane) FXMLLoader.load(getClass().getResource("TopT20Bat.fxml"));
            apTable.getChildren().setAll(pane);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    @FXML
    private void TopT20Bowl(ActionEvent event) {
        try {
            Pane pane = (AnchorPane) FXMLLoader.load(getClass().getResource("TopT20Bowl.fxml"));
            apTable.getChildren().setAll(pane);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    
    
}
