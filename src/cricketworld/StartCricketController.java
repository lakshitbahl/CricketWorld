/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cricketworld;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

/**
 * FXML Controller class
 *
 * @author hp
 */
public class StartCricketController implements Initializable {

    @FXML
    private AnchorPane apStart;
    @FXML
    private ImageView imageView;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            File file=new File("images/2.jpg");
            Image img=new Image(file.toURI().toString());
            imageView.setImage(img);
            
        } catch (Exception e) {
        }
    }    

    @FXML
    private void showData(ActionEvent event) {
           try{
            Pane pane=(AnchorPane)FXMLLoader.load(getClass().getResource("ViewerOption.fxml"));
            apStart.getChildren().setAll(pane);
        }
            catch(Exception e){
                    System.out.println(e.toString());
        }
    }

    @FXML
    private void insertData(ActionEvent event) {
         try{
            Pane pane=(AnchorPane)FXMLLoader.load(getClass().getResource("Username.fxml"));
            apStart.getChildren().setAll(pane);
        }
            catch(Exception e){
                    System.out.println(e.toString());
        }
    }
    
}
