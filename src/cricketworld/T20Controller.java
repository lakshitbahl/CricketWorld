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
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

/**
 * FXML Controller class
 *
 * @author hp
 */
public class T20Controller implements Initializable {

    @FXML
    private TextField tPlayerId;
    @FXML
    private TextField tRuns;
    @FXML
    private TextField tInnings;
    @FXML
    private TextField tBallsFaced;
    @FXML
    private TextField tBestScore;
    @FXML
    private TextField tDucks;
    @FXML
    private TextField tWickets;
    @FXML
    private TextField tW5;
    @FXML
    private TextField tBestBowling;
    @FXML
    private TextField tManOfMatch;
    @FXML
    private TextField tCatches;
    @FXML
    private TextField tFours;
    @FXML
    private TextField tSixes;
    @FXML
    private TextField tMatches;
    @FXML
    private TableColumn<InformationT20,String> tcRuns;
    @FXML
    private TableColumn<InformationT20,String> tcInnings;
    @FXML
    private TableColumn<InformationT20,String> tcBallsFaced;
    @FXML
    private TableColumn<InformationT20,String> tcBestScore;
    @FXML
    private TableColumn<InformationT20,String> tcFifty;
    @FXML
    private TableColumn<InformationT20,String> tcWickets;
    @FXML
    private TableColumn<InformationT20,String> tcW5;
    @FXML
    private TableColumn<InformationT20,String> tcBestBowling;
    @FXML
    private TableColumn<InformationT20,String> tcCatches;
    @FXML
    private TableColumn<InformationT20,String> tcMatches;
    @FXML
    private TableColumn<InformationT20,String> tcSixes;
    @FXML
    private TableColumn<InformationT20,String> tcFours;
    @FXML
    private TableColumn<InformationT20,String> tcThirty;
    @FXML
    private TextField tThirty;
    @FXML
    private Button bAdd;
    @FXML
    private Button bLoad;
    @FXML
    private Button bUpdate;
    @FXML
    private Button bSearch;
    @FXML
    private Button bNew;
    @FXML
    private Button bDelete;
    @FXML
    private TextField tRunsGiven;
    @FXML
    private TableColumn<InformationT20,String> tcPlayerId;
    @FXML
    private TableColumn<InformationT20,String> tcDucks;
    @FXML
    private TableColumn<InformationT20,String> tcManOfMatch;
    @FXML
    private TableColumn<InformationT20,String> tcRunsGiven;
    @FXML
    private TextField tFifty;
    @FXML
    private TextField tBallsBowled;
    @FXML
    private TableColumn<InformationT20,String> tcBallsBowled;
    @FXML
    private TableView<InformationT20> tvT20;
    
    ObservableList<InformationT20>data;
    @FXML
    private AnchorPane apT20;
    @FXML
    private Button bPersonal;
    @FXML
    private Button bTest;
    @FXML
    private Button bODI;
    @FXML
    private Button bT20;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         data=FXCollections.observableArrayList();
        tcPlayerId.setCellValueFactory(new PropertyValueFactory<>("PlayerId"));
        tcMatches.setCellValueFactory(new PropertyValueFactory<>("Matches"));
        tcRuns.setCellValueFactory(new PropertyValueFactory<>("Runs"));
        tcInnings.setCellValueFactory(new PropertyValueFactory<>("Innings"));
        tcBallsFaced.setCellValueFactory(new PropertyValueFactory<>("BallsFaced"));
        tcThirty.setCellValueFactory(new PropertyValueFactory<>("Thirty"));
        tcFifty.setCellValueFactory(new PropertyValueFactory<>("Fifty"));
        tcBestScore.setCellValueFactory(new PropertyValueFactory<>("BestScore"));
        tcDucks.setCellValueFactory(new PropertyValueFactory<>("Ducks"));
        tcBallsBowled.setCellValueFactory(new PropertyValueFactory<>("BallsBowled"));
        tcRunsGiven.setCellValueFactory(new PropertyValueFactory<>("RunsGiven")); 
        tcWickets.setCellValueFactory(new PropertyValueFactory<>("Wickets"));
        tcW5.setCellValueFactory(new PropertyValueFactory<>("W5"));
        tcBestBowling.setCellValueFactory(new PropertyValueFactory<>("BestBowling"));
        tcManOfMatch.setCellValueFactory(new PropertyValueFactory<>("Mom"));
        tcCatches.setCellValueFactory(new PropertyValueFactory<>("Catches"));
        tcFours.setCellValueFactory(new PropertyValueFactory<>("Fours"));
        tcSixes.setCellValueFactory(new PropertyValueFactory<>("Sixes"));
        // TODO
    }    

    @FXML
    private void addData(ActionEvent event) {
          try{
        Connection con=Data.getConnection();
        PreparedStatement ps=con.prepareStatement("insert into t20 values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        ps.setString(1,tPlayerId.getText());
        ps.setString(2, tMatches.getText());
        ps.setString(3, tRuns.getText());
        ps.setString(4, tInnings.getText());
        ps.setString(5, tBallsFaced.getText());
        ps.setString(6, tFifty.getText());
        ps.setString(7, tThirty.getText());
        ps.setString(8, tBestScore.getText());
        ps.setString(9, tDucks.getText());
        ps.setString(10, tBallsBowled.getText());
        ps.setString(11, tRunsGiven.getText());
        ps.setString(12, tWickets.getText());
        ps.setString(13, tW5.getText());
        ps.setString(14, tBestBowling.getText());
        ps.setString(15, tManOfMatch.getText());
        ps.setString(16, tCatches.getText());
        ps.setString(17, tFours.getText());
        ps.setString(18, tSixes.getText());
     
        int count=ps.executeUpdate();
        if(count>0){
                Alert a=new Alert(Alert.AlertType.INFORMATION);
                a.setTitle("Cricket");
                a.setContentText("Saved");
                a.show();
            }
        con.close();
        }
        catch(Exception ex){
            Alert a=new Alert(Alert.AlertType.ERROR);
           a.setTitle("Error in project Cricket");
           a.setContentText(ex.toString());
           a.show();
           System.out.println(ex);
        }

    }

    @FXML
    private void loadData(ActionEvent event) {
          try{
            data.clear();
            Connection con=Data.getConnection();
            PreparedStatement ps=con.prepareStatement("Select * from t20");
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                data.add(new InformationT20(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getString(14),rs.getString(15),rs.getString(16),rs.getString(17),rs.getString(18)));
            }
            tvT20.setItems(data);
            con.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }


    @FXML
    private void searchData(ActionEvent event) {
    }

    @FXML
    private void newData(ActionEvent event) {
          try{
            Connection con=Data.getConnection();
            PreparedStatement ps=con.prepareStatement("Select Max(playerid) from t20");
            ResultSet rs=ps.executeQuery();
            int pid=0;
            if(rs.next()){
                pid=rs.getInt(1);
            }
            pid++;
            tPlayerId.setText(String.valueOf(pid));
            con.close();
          }
        catch(Exception e){
           Alert a=new Alert(Alert.AlertType.ERROR);
           a.setTitle("Error in project Cricket");
           a.setContentText(e.toString());
           a.show();
           System.out.println(e);
        }
    }

    @FXML
    private void deleteData(ActionEvent event) {
                try{
            Connection con=Data.getConnection();
            PreparedStatement ps=con.prepareStatement("delete from t20 where playerid=?");
            ps.setString(1,tPlayerId.getText());
            int count=ps.executeUpdate();
            if(count>0){
                Alert a=new Alert(Alert.AlertType.INFORMATION);
                a.setTitle("");
                a.setContentText("Deleted");
                a.show();
            }
            con.close();
          }
        catch(Exception e){
           Alert a=new Alert(Alert.AlertType.ERROR);
           a.setTitle("Error in project Cricket");
           a.setContentText(e.toString());
           a.show();
           System.out.println(e);
        }
    }

    @FXML
    private void updataData(ActionEvent event) {
          try{
            Connection con=Data.getConnection();
            PreparedStatement ps=con.prepareStatement("update t20 set matches=?,runsscored=?,innings=?,ballsfaced=?,fifty=?,thirty=?,bestscore=?,ducks=?,ballsbowled=?,runsgiven=?,wickets=?,w5=?,bestbowling=?,mom=?,catches=?,fours=?,sixes=? where playerid=?");
            ps.setString(1,tMatches.getText());
            ps.setString(2,tRuns.getText());
            ps.setString(3,tInnings.getText());
            ps.setString(4,tBallsFaced.getText());
            ps.setString(6,tThirty.getText());
            ps.setString(5,tFifty.getText());
            ps.setString(7,tBestScore.getText());
            ps.setString(8,tDucks.getText());
            ps.setString(9,tBallsBowled.getText());
            ps.setString(10,tRunsGiven.getText());
            ps.setString(11,tWickets.getText());
            ps.setString(12,tW5.getText());
            ps.setString(13,tBestBowling.getText());
            ps.setString(14,tManOfMatch.getText());
            ps.setString(15,tCatches.getText());
            ps.setString(16, tFours.getText());
            ps.setString(17,tSixes.getText());
            ps.setString(18,tPlayerId.getText());
            int count=ps.executeUpdate();
            if(count>0){
                Alert a=new Alert(Alert.AlertType.INFORMATION);
                a.setTitle("Cricket");
                a.setContentText("Updated");
                a.show();
            }
            con.close();
          }
        catch(Exception e){
           Alert a=new Alert(Alert.AlertType.ERROR);
           a.setTitle("Error in project Cricket");
           a.setContentText(e.toString());
           a.show();
           System.out.println(e);
        }
    }

    @FXML
    private void showPersonal(ActionEvent event) {
             try{
            Pane pane=(AnchorPane)FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
            apT20.getChildren().setAll(pane);
        }
            catch(Exception e){
                    System.out.println(e.toString());
        }
    }

    @FXML
    private void showTest(ActionEvent event) {
             try{
            Pane pane=(AnchorPane)FXMLLoader.load(getClass().getResource("Test.fxml"));
            apT20.getChildren().setAll(pane);
        }
            catch(Exception e){
                    System.out.println(e.toString());
        }
    }

    @FXML
    private void showODI(ActionEvent event) {
             try{
            Pane pane=(AnchorPane)FXMLLoader.load(getClass().getResource("ODI.fxml"));
            apT20.getChildren().setAll(pane);
        }
            catch(Exception e){
                    System.out.println(e.toString());
        }
    }

    @FXML
    private void showT20(ActionEvent event) {
             try{
            Pane pane=(AnchorPane)FXMLLoader.load(getClass().getResource("T20.fxml"));
            apT20.getChildren().setAll(pane);
        }
            catch(Exception e){
                    System.out.println(e.toString());
        }
    }
    
}


