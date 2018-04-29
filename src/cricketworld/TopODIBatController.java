/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cricketworld;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author hp
 */
public class TopODIBatController implements Initializable {

    @FXML
    private TableView<InformationOdi> tvTopODIBat;
    @FXML
    private TableColumn<InformationOdi,String> tcName;
    @FXML
    private TableColumn<InformationOdi,String> tcRuns;
    @FXML
    private TableColumn<InformationOdi,String> tcMatches;
    @FXML
    private TableColumn<InformationOdi,String> tcFifty;
    @FXML
    private TableColumn<InformationOdi,String> tcBestScore;
    @FXML
    ObservableList<InformationOdi>data;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        data=FXCollections.observableArrayList();
        tcName.setCellValueFactory(new PropertyValueFactory<>("Name"));
        tcRuns.setCellValueFactory(new PropertyValueFactory<>("RunsScored"));
        tcMatches.setCellValueFactory(new PropertyValueFactory<>("Matches"));
        tcFifty.setCellValueFactory(new PropertyValueFactory<>("Fifty"));
        tcBestScore.setCellValueFactory(new PropertyValueFactory<>("BestScore"));
        
        
    
    try{
            data.clear();
            Connection con=Data.getConnection();
            PreparedStatement ps=con.prepareStatement("Select * from t20 order by runsscored desc ");
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                data.add(new InformationOdi(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getString(14),rs.getString(15),rs.getString(16),rs.getString(17),rs.getString(18)));
            }
            tvTopODIBat.setItems(data);
            con.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }    
    
}
