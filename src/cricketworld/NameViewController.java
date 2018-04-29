/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cricketworld;

import java.io.File;
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
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

/**
 * FXML Controller class
 *
 * @author hp
 */
public class NameViewController implements Initializable {

    @FXML
    private Button bBack;
    @FXML
    private TextField tName;
    @FXML
    private TableColumn<Information, String> tcPlayerId;
    @FXML
    private TableColumn<Information, String> tcName;
    @FXML
    private TableColumn<Information, String> tcCountry;
    @FXML
    private TableColumn<Information, String> tcGender;
    @FXML
    private TableColumn<Information, String> tcHeight;
    @FXML
    private TableColumn<Information, String> tcWeight;
    @FXML
    private TableColumn<Information, String> tcBloodGroup;
    @FXML
    private TableColumn<Information, String> tcDOB;
    @FXML
    private TableColumn<Information, String> tcBatsman;
    @FXML
    private TableColumn<Information, String> tcBowler;
    @FXML
    private TableColumn<Information, String> tcWicketKeeper;
    @FXML
    private TextField tTtMatch;
    @FXML
    private TextField tTtRunsScored;
    @FXML
    private TextField tTtInnings;
    @FXML
    private TextField tTtBallsFaced;
    @FXML
    private TextField tTtCentury;
    @FXML
    private TextField tTtFifty;
    @FXML
    private TextField tTtBestScore;
    @FXML
    private TextField tTtDucks;
    @FXML
    private TextField tTtBallsBowled;
    @FXML
    private TextField tTtRunsGiven;
    @FXML
    private TextField tTtWickets;
    @FXML
    private TextField tTtW5;
    @FXML
    private TextField tTtW10;
    @FXML
    private TextField tTtBestBowling;
    @FXML
    private TextField tTtMOM;
    @FXML
    private TextField tTtCatches;
    @FXML
    private TextField tTtFours;
    @FXML
    private TextField tTtSixes;
    @FXML
    private TextField tOMatches;
    @FXML
    private TextField tORunsScored;
    @FXML
    private TextField tOInnings;
    @FXML
    private TextField tOBallsFaced;
    @FXML
    private TextField tOCentury;
    @FXML
    private TextField tOFifty;
    @FXML
    private TextField tOBestScore;
    @FXML
    private TextField tODucks;
    @FXML
    private TextField tOBallsBowled;
    @FXML
    private TextField tORunsGiven;
    @FXML
    private TextField tOWickets;
    @FXML
    private TextField tOW5;
    @FXML
    private TextField tOBestBowling;
    @FXML
    private TextField tOMOM;
    @FXML
    private TextField tOCatches;
    @FXML
    private TextField tOFours;
    @FXML
    private TextField tOSixes;
    @FXML
    private TextField tT20Matches;
    @FXML
    private TextField tT20RunsScored;
    @FXML
    private TextField tT20Innings;
    @FXML
    private TextField tT20BallsFaced;
    @FXML
    private TextField tT20Fifty;
    @FXML
    private TextField tT20Thirty;
    @FXML
    private TextField tT20BestScore;
    @FXML
    private TextField tT20Ducks;
    @FXML
    private TextField tT20BallsBowled;
    @FXML
    private TextField tT20RunsGiven;
    @FXML
    private TextField tT20Wickets;
    @FXML
    private TextField tT20W5;
    @FXML
    private TextField tT20BestBowling;
    @FXML
    private TextField tT20MOM;
    @FXML
    private TextField tT20Catches;
    @FXML
    private TextField tT20Fours;
    @FXML
    private TextField tT20Sixes;
    @FXML
    private TableView<Information> tvPTable;
    ObservableList<Information> data;
    @FXML
    private ListView<String> lvCountry;
    @FXML
    private AnchorPane apNameView;
    @FXML
    private TableView<Information> tvCountry;
    @FXML
    private TableColumn<Information, String> tcCPlayerId;
    @FXML
    private TableColumn<Information, String> tcCName;
    @FXML
    private TableColumn<Information, String> tcCCountry;
    @FXML
    private TableColumn<Information, String> tcCGender;
    @FXML
    private TableColumn<Information, String> tcCHeight;
    @FXML
    private TableColumn<Information, String> tcCWeight;
    @FXML
    private TableColumn<Information, String> tcCBloodGroup;
    @FXML
    private TableColumn<Information, String> tcCDOB;
    @FXML
    private TableColumn<Information, String> tcCBowler;
    @FXML
    private TableColumn<Information, String> tcCWicketKeeper;
    @FXML
    private TableColumn<Information, String> tcCBatsman;
    @FXML
    private Button bCBack;

    ObservableList<InformationTest> testData;
    @FXML
    private ImageView imageView;
    @FXML
    private TextField tfOMatches;
    @FXML
    private TextField tfORunsScored;
    @FXML
    private TextField tfOInnings;
    @FXML
    private TextField tfOBallsFaced;
    @FXML
    private TextField tfOCentury;
    @FXML
    private TextField tfOFifty;
    @FXML
    private TextField tfOBestScore;
    @FXML
    private TextField tfODucks;
    @FXML
    private TextField tfOBallsBowled;
    @FXML
    private TextField tfOWickets;
    @FXML
    private TextField tfOW5;
    @FXML
    private TextField tfOBestBowling;
    @FXML
    private TextField tfOMom;
    @FXML
    private TextField tfOCatches;
    @FXML
    private TextField tfOFours;
    @FXML
    private TextField tfOSixes;
    @FXML
    private TextField tfTMatches;
    @FXML
    private TextField tfTRunsScored;
    @FXML
    private TextField tfTInnings;
    @FXML
    private TextField tfTBallsFaced;
    @FXML
    private TextField tfTFifty;
    @FXML
    private TextField tfTThirty;
    @FXML
    private TextField tfTBestScore;
    @FXML
    private TextField tfTDucks;
    @FXML
    private TextField tfTBallsBowled;
    @FXML
    private TextField tfTRunsGiven;
    @FXML
    private TextField tfTWickets;
    @FXML
    private TextField tfTW5;
    @FXML
    private TextField tfTBestBowling;
    @FXML
    private TextField tfTMom;
    @FXML
    private TextField tfTCatches;
    @FXML
    private TextField tfTFours;
    @FXML
    private TextField tfTSixes;
    @FXML
    private TextField tfMatches;
    @FXML
    private TextField tfInnings;
    @FXML
    private TextField tfBallsFaced;
    @FXML
    private TextField tfCentury;
    @FXML
    private TextField tfFifty;
    @FXML
    private TextField tfDucks;
    @FXML
    private TextField tfBallsBowled;
    @FXML
    private TextField tfRunsGiven;
    @FXML
    private TextField tfWickets;
    @FXML
    private TextField tfW5;
    @FXML
    private TextField tfW10;
    @FXML
    private TextField tfBestBowling;
    @FXML
    private TextField tfMom;
    @FXML
    private TextField tfCatches;
    @FXML
    private TextField tfFours;
    @FXML
    private TextField tfSixes;
    @FXML
    private TextField tfRunsScored;
    @FXML
    private TextField tfORunsGiven;
    @FXML
    private TextField tfBestScore;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        lvCountry.getItems().addAll("India", "New Zealand", "South Africa", "Australia", "England", "Windies", "Pakistan", "Bangladesh", "Sri Lanka");

        data = FXCollections.observableArrayList();
        testData = FXCollections.observableArrayList();

        tcPlayerId.setCellValueFactory(new PropertyValueFactory<>("PlayerId"));
        tcName.setCellValueFactory(new PropertyValueFactory<>("Name"));
        tcDOB.setCellValueFactory(new PropertyValueFactory<>("DOB"));
        tcGender.setCellValueFactory(new PropertyValueFactory<>("Gender"));
        tcBloodGroup.setCellValueFactory(new PropertyValueFactory<>("BloodGroup"));
        tcHeight.setCellValueFactory(new PropertyValueFactory<>("Height"));
        tcWeight.setCellValueFactory(new PropertyValueFactory<>("Weight"));
        tcCountry.setCellValueFactory(new PropertyValueFactory<>("Country"));
        tcBatsman.setCellValueFactory(new PropertyValueFactory<>("Batsman"));
        tcBowler.setCellValueFactory(new PropertyValueFactory<>("Bowler"));
        tcWicketKeeper.setCellValueFactory(new PropertyValueFactory<>("WicketKeeper"));

        tcCPlayerId.setCellValueFactory(new PropertyValueFactory<>("PlayerId"));
        tcCName.setCellValueFactory(new PropertyValueFactory<>("Name"));
        tcCDOB.setCellValueFactory(new PropertyValueFactory<>("DOB"));
        tcCGender.setCellValueFactory(new PropertyValueFactory<>("Gender"));
        tcCBloodGroup.setCellValueFactory(new PropertyValueFactory<>("BloodGroup"));
        tcCHeight.setCellValueFactory(new PropertyValueFactory<>("Height"));
        tcCWeight.setCellValueFactory(new PropertyValueFactory<>("Weight"));
        tcCCountry.setCellValueFactory(new PropertyValueFactory<>("Country"));
        tcCBatsman.setCellValueFactory(new PropertyValueFactory<>("Batsman"));
        tcCBowler.setCellValueFactory(new PropertyValueFactory<>("Bowler"));
        tcCWicketKeeper.setCellValueFactory(new PropertyValueFactory<>("WicketKeeper"));
        // TODO
    }

    @FXML
    private void goBack(ActionEvent event) {
        try {
            Pane pane = (AnchorPane) FXMLLoader.load(getClass().getResource("StartCricket.fxml"));
            apNameView.getChildren().setAll(pane);
        } catch (Exception e) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setTitle("Error in project Cricket");
            a.setContentText(e.toString());
            a.show();
            System.out.println(e);
        }
    }

    @FXML
    private void searchName(KeyEvent event) {
        try {
            data.clear();
            Connection con = Data.getConnection();
            PreparedStatement ps = con.prepareStatement("Select * from personalinfo where name like ?");
            ps.setString(1, tName.getText() + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                data.add(new Information(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11)));
            }
            tvPTable.setItems(data);
            con.close();
        } catch (Exception e) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setTitle("Error in project Cricket");
            a.setContentText(e.toString());
            a.show();
            System.out.println(e);
        }
    }

    @FXML
    private void loadData(MouseEvent event) {
        
        try {
            Information s = tvPTable.getSelectionModel().getSelectedItem();
            Connection con = Data.getConnection();
            PreparedStatement ps = con.prepareStatement("Select * from test where playerid=?");
            ps.setString(1, s.getPlayerId());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                tTtMatch.setText(rs.getString(3));
                tTtRunsScored.setText(rs.getString(2));
                tTtInnings.setText(rs.getString(4));
                tTtBallsFaced.setText(rs.getString(5));
                tTtCentury.setText(rs.getString(6));
                tTtFifty.setText(rs.getString(7));
                tTtBestScore.setText(rs.getString(8));
                tTtDucks.setText(rs.getString(9));
                tTtFours.setText(rs.getString(10));
                tTtSixes.setText(rs.getString(11));
                tTtBallsBowled.setText(rs.getString(12));
                tTtRunsGiven.setText(rs.getString(13));
                tTtWickets.setText(rs.getString(14));
                tTtW5.setText(rs.getString(15));
                tTtW10.setText(rs.getString(16));
                tTtBestBowling.setText(rs.getString(17));
                tTtMOM.setText(rs.getString(18));
                tTtCatches.setText(rs.getString(19));
            }
            PreparedStatement ps1 = con.prepareStatement("Select * from odi where playerid=?");
            ps1.setString(1, s.getPlayerId());
            ResultSet rs1=ps1.executeQuery();
            if(rs1.next()){
                tOMatches.setText(rs1.getString(2));
                tORunsScored.setText(rs1.getString(3));
                tOInnings.setText(rs1.getString(4));
                tOBallsFaced.setText(rs1.getString(5));
                tOCentury.setText(rs1.getString(6));
                tOFifty.setText(rs1.getString(7));
                tOBestScore.setText(rs1.getString(8));
                tODucks.setText(rs1.getString(9));
                tOBallsBowled.setText(rs1.getString(10));
                tORunsGiven.setText(rs1.getString(11));
                tOWickets.setText(rs1.getString(12));
                tOW5.setText(rs1.getString(13));
                tOBestBowling.setText(rs1.getString(14));
                tOMOM.setText(rs1.getString(15));
                tOCatches.setText(rs1.getString(16));
                tOFours.setText(rs1.getString(17));
                tOSixes.setText(rs1.getString(18));
            }
            PreparedStatement ps2 = con.prepareStatement("Select * from t20 where playerid=?");
            ps2.setString(1, s.getPlayerId());
            ResultSet rs2=ps2.executeQuery();
            if(rs2.next()){
                tT20Matches.setText(rs2.getString(2));
                tT20RunsScored.setText(rs2.getString(3));
                tT20Innings.setText(rs2.getString(4));
                tT20BallsFaced.setText(rs2.getString(5));
                tT20Fifty.setText(rs2.getString(6));
                tT20Thirty.setText(rs2.getString(7));
                tT20BestScore.setText(rs2.getString(8));
                tT20Ducks.setText(rs2.getString(9));
                tT20BallsBowled.setText(rs2.getString(10));
                tT20RunsGiven.setText(rs2.getString(11));
                tT20Wickets.setText(rs2.getString(12));
                tT20W5.setText(rs2.getString(13));
                tT20BestBowling.setText(rs2.getString(14));
                tT20MOM.setText(rs2.getString(15));
                tT20Catches.setText(rs2.getString(16));
                tT20Fours.setText(rs2.getString(17));
                tT20Sixes.setText(rs2.getString(18));
            }
            con.close();
            File file=new File("images/"+s.getPlayerId()+".jpg");
            Image img=new Image(file.toURI().toString());
            imageView.setImage(img);
            
        } catch (Exception e) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setTitle("Error in project Cricket");
            a.setContentText(e.toString());
            a.show();
        }
    }

    @FXML
    private void searchCountry(MouseEvent event) {
        try {
            data.clear();
            Connection con = Data.getConnection();
            PreparedStatement ps = con.prepareStatement("Select * from personalinfo where country like ?");
            ps.setString(1, lvCountry.getSelectionModel().getSelectedItem());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                data.add(new Information(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11)));
            }
            tvCountry.setItems(data);
            con.close();
        } catch (Exception e) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setTitle("Error in project Cricket");
            a.setContentText(e.toString());
            a.show();
            System.out.println(e);
        }
    }

    @FXML
    private void loadCdata(MouseEvent event) {
        try{
            Information s=tvCountry.getSelectionModel().getSelectedItem();
            Connection con=Data.getConnection();
            PreparedStatement ps3=con.prepareStatement("Select * from test where playerid=?");
            ps3.setString(1,s.getPlayerId());
            ResultSet rs3=ps3.executeQuery();
            if(rs3.next()){
             tfMatches.setText(rs3.getString(3));
             tfMom.setText(rs3.getString(18));
             tfW5.setText(rs3.getString(15));
             tfW10.setText(rs3.getString(16));
             tfWickets.setText(rs3.getString(14));
             tfBestBowling.setText(rs3.getString(17));
             tfRunsScored.setText(rs3.getString(2));
             tfFours.setText(rs3.getString(10));
             tfSixes.setText(rs3.getString(11));
             tfBallsFaced.setText(rs3.getString(5));
             tfFifty.setText(rs3.getString(7));
             tfCentury.setText(rs3.getString(6));
             tfDucks.setText(rs3.getString(9));
             tfCatches.setText(rs3.getString(18));
             tfRunsGiven.setText(rs3.getString(13));
             tfInnings.setText(rs3.getString(4));
             tfBallsBowled.setText(rs3.getString(12));
             tfBestScore.setText(rs3.getString(8));
            }
            PreparedStatement ps4 = con.prepareStatement("Select * from odi where playerid=?");
            ps4.setString(1, s.getPlayerId());
            ResultSet rs4=ps4.executeQuery();
            if(rs4.next()){
                tfOMatches.setText(rs4.getString(2));
                tfORunsScored.setText(rs4.getString(3));
                tfOInnings.setText(rs4.getString(4));
                tfOBallsFaced.setText(rs4.getString(5));
                tfOCentury.setText(rs4.getString(6));
                tfOFifty.setText(rs4.getString(7));
                tfOBestScore.setText(rs4.getString(8));
                tfODucks.setText(rs4.getString(9));
                tfOBallsBowled.setText(rs4.getString(10));
                tfORunsGiven.setText(rs4.getString(11));
                tfOWickets.setText(rs4.getString(12));
                tfOW5.setText(rs4.getString(13));
                tfOBestBowling.setText(rs4.getString(14));
                tfOMom.setText(rs4.getString(15));
                tfOCatches.setText(rs4.getString(16));
                tfOFours.setText(rs4.getString(17));
                tfOSixes.setText(rs4.getString(18));
            }
            PreparedStatement ps5 = con.prepareStatement("Select * from t20 where playerid=?");
            ps5.setString(1, s.getPlayerId());
            ResultSet rs5=ps5.executeQuery();
            if(rs5.next()){
                tfTMatches.setText(rs5.getString(2));
                tfTRunsScored.setText(rs5.getString(3));
                tfTInnings.setText(rs5.getString(4));
                tfTBallsFaced.setText(rs5.getString(5));
                tfTFifty.setText(rs5.getString(6));
                tfTThirty.setText(rs5.getString(7));
                tfTBestScore.setText(rs5.getString(8));
                tfTDucks.setText(rs5.getString(9));
                tfTBallsBowled.setText(rs5.getString(10));
                tfTRunsGiven.setText(rs5.getString(11));
                tfTWickets.setText(rs5.getString(12));
                tfTW5.setText(rs5.getString(13));
                tfTBestBowling.setText(rs5.getString(14));
                tfTMom.setText(rs5.getString(15));
                tfTCatches.setText(rs5.getString(16));
                tfTFours.setText(rs5.getString(17));
                tfTSixes.setText(rs5.getString(18));
            }
        }
        catch(Exception e)
        {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setTitle("Error in project Cricket");
            a.setContentText(e.toString());
            a.show();
            System.out.println(e);
        }
    }
    
}
