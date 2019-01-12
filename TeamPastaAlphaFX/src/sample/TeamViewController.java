package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class TeamViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button backButton;


    @FXML
    void exitStage(ActionEvent event) throws Exception{
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);
        Stage tableViewWindow = (Stage)((Node)event.getSource()).getScene().getWindow();

        tableViewWindow.setScene(tableViewScene);
        tableViewWindow.show();
    }

    private void printTeams() throws Exception{
        ImportJSON importJSON = new ImportJSON();
        importJSON.addTeamMembers(importJSON.getJsonArray());
        System.out.println(importJSON.printTeamMemberData());
        Text text = new Text();
        text.setText(importJSON.printTeamMemberData());
    }

    @FXML
    void initialize() {
        try {
            printTeams();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
