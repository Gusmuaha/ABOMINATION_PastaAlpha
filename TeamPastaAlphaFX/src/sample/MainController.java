package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainController {
    ImportJSON importJSON;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;


    public void ImportJSON() throws Exception{
    }


    public void showTeamMembers(ActionEvent event) throws Exception{
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("teamViewScene.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);
        Stage tableViewWindow = (Stage)((Node)event.getSource()).getScene().getWindow();

        tableViewWindow.setScene(tableViewScene);
        tableViewWindow.show();

    }

    @FXML
    void initialize() {



    }

}