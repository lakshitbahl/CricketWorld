/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cricketworld;

import java.net.URL;
import java.sql.PreparedStatement;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import java.sql.*;
import java.time.LocalDate;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
/**
 *
 * @author hp
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private Button bPersonal;
    @FXML
    private Button bTest;
    @FXML
    private Button bT20;
    @FXML
    private ToggleGroup wicketkeeper;
    @FXML
    private ToggleGroup gender;
    @FXML
    private ToggleGroup batsman;
    @FXML
    private ToggleGroup bowler;
    @FXML
    private TextField tPlayerId;
    @FXML
    private TextField tName;
    @FXML
    private TextField tHeight;
    @FXML
    private TextField tWeight;
    @FXML
    private TextField tBloodGroup;
    @FXML
    private RadioButton rMale;
    @FXML
    private RadioButton rFemale;
    @FXML
    private RadioButton rBatYes;
    @FXML
    private RadioButton rBatNo;
    @FXML
    private RadioButton rBowlYes;
    @FXML
    private RadioButton rBowlNo;
    @FXML
    private ComboBox<String> cbCountry;
    @FXML
    private RadioButton rWicketKeeperYes;
    @FXML
    private RadioButton rWicketKeeperNo;
    @FXML
    private TableColumn<Information, String> tcPlayerId;
    @FXML
    private TableColumn<Information, String> tcName;
    @FXML
    private TableColumn<Information, String> tcDOB;
    @FXML
    private TableColumn<Information, String> tcHeight;
    @FXML
    private TableColumn<Information, String> tcWeight;
    @FXML
    private TableColumn<Information, String> tcCountry;
    @FXML
    private TableColumn<Information, String> tcBloodGroup;
    @FXML
    private TableColumn<Information, String> tcGender;
    @FXML
    private TableColumn<Information, String> tcBatsman;
    @FXML
    private TableColumn<Information, String> tcBowler;
    @FXML
    private TableColumn<Information, String> tcWicketKeeper;
    @FXML
    private Button bUpdate;
    @FXML
    private Button bAdd;
    @FXML
    private Button bLoad;
    @FXML
    private Button bNew;
    @FXML
    private Button bDelete;
    @FXML
    private TableView<Information> tvPersonalInfo;
    @FXML
    private DatePicker dDOB;
    
    ObservableList<Information> data;
    @FXML
    private Button bODI;
    @FXML
    private AnchorPane apPersonal;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cbCountry.getItems().addAll("India", "New Zealand", "South Africa", "Australia", "England", "Windies", "Pakistan", "Bangladesh", "Sri Lanka");
        
        data = FXCollections.observableArrayList();
        
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
        // TODO
    }    
    
    @FXML
    private void updateData(ActionEvent event) {
        try {
            Connection con = Data.getConnection();
            PreparedStatement ps = con.prepareStatement("update personalinfo set name=?,gender=?,dob=?,bloodgroup=?,height=?,weight=?,country=?,batsman=?,bowler=?,wicketkeeper=? where playerid=?");
            ps.setString(1, tName.getText());
            ps.setString(3, dDOB.getValue().format(DateTimeFormatter.ISO_LOCAL_DATE));
            if (rMale.isSelected()) {
                ps.setString(2, "Male");
            } else {
                ps.setString(2, "Female");
            }
            ps.setString(4, tBloodGroup.getText());
            ps.setString(5, tHeight.getText());
            ps.setString(6, tWeight.getText());
            ps.setString(7, cbCountry.getValue());
            if (rBatYes.isSelected()) {
                ps.setString(8, "Yes");
            } else {
                ps.setString(8, "No");
            }
            if (rBowlYes.isSelected()) {
                ps.setString(9, "Yes");
            } else {
                ps.setString(9, "No");
            }
            if (rWicketKeeperYes.isSelected()) {
                ps.setString(10, "Yes");
            } else {
                ps.setString(10, "No");
            }
            ps.setString(11, tPlayerId.getText());
            int count = ps.executeUpdate();
            if (count > 0) {
                Alert a = new Alert(Alert.AlertType.INFORMATION);
                a.setTitle("Cricket");
                a.setContentText("Updated");
                a.show();
            }
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
    private void addData(ActionEvent event) {
        try {
            Connection con = Data.getConnection();
            PreparedStatement ps = con.prepareStatement("insert into personalinfo values(?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, tPlayerId.getText());
            ps.setString(2, tName.getText());
            if (rMale.isSelected()) {
                ps.setString(3, "Male");
            } else {
                ps.setString(3, "Female");
            }
            ps.setString(4, dDOB.getValue().format(DateTimeFormatter.ISO_LOCAL_DATE));
            ps.setString(5, tBloodGroup.getText());
            ps.setString(6, tHeight.getText());
            ps.setString(7, tWeight.getText());
            ps.setString(8, cbCountry.getValue());
            if (rBatYes.isSelected()) {
                ps.setString(9, "Yes");
            } else {
                ps.setString(9, "No");
            }
            if (rBowlYes.isSelected()) {
                ps.setString(10, "Yes");
            } else {
                ps.setString(10, "No");
            }
            if (rWicketKeeperYes.isSelected()) {
                ps.setString(11, "Yes");
            } else {
                ps.setString(11, "No");
            }
            int count = ps.executeUpdate();
            if (count > 0) {
                Alert a = new Alert(Alert.AlertType.INFORMATION);
                a.setTitle("Cricket");
                a.setContentText("Saved");
                a.show();
            }
            con.close();
        } catch (Exception ex) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setTitle("Error in project Cricket");
            a.setContentText(ex.toString());
            a.show();
            System.out.println(ex);
        }
    }
    
    @FXML
    private void loadData(ActionEvent event) {
        try {
            data.clear();
            Connection con = Data.getConnection();
            PreparedStatement ps = con.prepareStatement("Select * from personalinfo");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                data.add(new Information(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11)));
            }
            tvPersonalInfo.setItems(data);
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    
    @FXML
    private void newData(ActionEvent event) {
        try {
            Connection con = Data.getConnection();
            PreparedStatement ps = con.prepareStatement("Select Max(playerid) from personalinfo");
            ResultSet rs = ps.executeQuery();
            int pid = 0;
            if (rs.next()) {
                pid = rs.getInt(1);
            }
            pid++;
            tPlayerId.setText(String.valueOf(pid));
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
    private void deleteData(ActionEvent event) {
        try {
            Connection con = Data.getConnection();
            PreparedStatement ps = con.prepareStatement("delete from personalinfo where playerid=?");
            ps.setString(1, tPlayerId.getText());
            int count = ps.executeUpdate();
            if (count > 0) {
                Alert a = new Alert(Alert.AlertType.INFORMATION);
                a.setTitle("");
                a.setContentText("Deleted");
                a.show();
            }
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
    private void uploadData(MouseEvent event) {
        Information s = tvPersonalInfo.getSelectionModel().getSelectedItem();
        tPlayerId.setText(s.getPlayerId());
        tName.setText(s.getName());
        if (s.getGender().equals("Male")) {
            rMale.setSelected(true);
        } else {
            rFemale.setSelected(true);
        }
        dDOB.setValue(LocalDate.parse(s.getDOB(), DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        tBloodGroup.setText(s.getBloodGroup());
        tHeight.setText(s.getHeight());
        tWeight.setText(s.getWeight());
        cbCountry.getSelectionModel().select(s.getCountry());
        if (s.getBatsman().equals("Yes")) {
            rBatYes.setSelected(true);
        } else {
            rBatNo.setSelected(true);
        }
        if (s.getBowler().equals("Yes")) {
            rBowlYes.setSelected(true);
        } else {
            rBowlNo.setSelected(true);
        }
        if (s.getWicketKeeper().equals("Yes")) {
            rWicketKeeperYes.setSelected(true);
        } else {
            rWicketKeeperNo.setSelected(true);
        }
    }
    
    @FXML
    private void showPersonal(ActionEvent event) throws Exception {
             try{
            Pane pane=(AnchorPane)FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
            apPersonal.getChildren().setAll(pane);
        }
            catch(Exception e){
                    System.out.println(e.toString());
        }
    }
    
    @FXML
    private void showTest(ActionEvent event) throws Exception {
             try{
            Pane pane=(AnchorPane)FXMLLoader.load(getClass().getResource("Test.fxml"));
            apPersonal.getChildren().setAll(pane);
        }
            catch(Exception e){
                    System.out.println(e.toString());
        }
    }
    
    @FXML
    private void showODI(ActionEvent event) {
             try{
            Pane pane=(AnchorPane)FXMLLoader.load(getClass().getResource("ODI.fxml"));
            apPersonal.getChildren().setAll(pane);
        }
            catch(Exception e){
                    System.out.println(e.toString());
        }
    }
    @FXML
    private void showT20(ActionEvent event) {
        try{
            Pane pane=(AnchorPane)FXMLLoader.load(getClass().getResource("T20.fxml"));
            apPersonal.getChildren().setAll(pane);
        }
            catch(Exception e){
                    System.out.println(e.toString());
        }
    }

    @FXML
    private void back(ActionEvent event) {
        try {
            Pane pane = (AnchorPane) FXMLLoader.load(getClass().getResource("StartCricket.fxml"));
            apPersonal.getChildren().setAll(pane);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    
}
