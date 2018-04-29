
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


public class TopODIBowlController implements Initializable {

    @FXML
    private TableView<InformationOdi> tvTopODIBowl;
    @FXML
    private TableColumn<InformationOdi,String> tcODIName;
    @FXML
    private TableColumn<InformationOdi,String> tcODIMatches;
    @FXML
    private TableColumn<InformationOdi,String> tcODIWickets;
    @FXML
    private TableColumn<InformationOdi,String> tcODIw5;
    @FXML
    private TableColumn<InformationOdi,String> tcODIBestBowling;

   ObservableList<InformationOdi>data;
    @FXML
    private TableColumn<InformationTopOdi,String> tcRunsGiven;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        data=FXCollections.observableArrayList();
        tcODIName.setCellValueFactory(new PropertyValueFactory<>("Name"));
        tcODIMatches.setCellValueFactory(new PropertyValueFactory<>("Matches"));
        tcODIWickets.setCellValueFactory(new PropertyValueFactory<>("Wickets"));
        tcODIw5.setCellValueFactory(new PropertyValueFactory<>("w5"));
        tcODIBestBowling.setCellValueFactory(new PropertyValueFactory<>("BestBowling"));
        
        try{
            data.clear();
            Connection con=Data.getConnection();
            PreparedStatement ps=con.prepareStatement("Select * from odi order by wickets desc ");
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                data.add(new InformationOdi(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getString(14),rs.getString(15),rs.getString(16),rs.getString(17),rs.getString(18)));
            }
            tvTopODIBowl.setItems(data);
            con.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }    
    
}
