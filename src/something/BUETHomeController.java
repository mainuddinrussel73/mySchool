/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package something;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Main
 */
public class BUETHomeController implements Initializable {

    /**
     * Initializes the controller class.
     * @param event
     * @throws java.io.IOException
     */
    @FXML
    TreeView <String> treeView1;
    Image icon = new Image(getClass().getResourceAsStream("/image/blue.png"));
     
    public void logout(ActionEvent event) throws IOException{
        ((Node)(event.getSource())).getScene().getWindow().hide();
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/something/Login.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        scene.getStylesheets().add(getClass().getResource("/something/signin.css").toExternalForm());
        //scene.getStylesheets().add(getClass().getResource("/something/login.css").toExternalForm());
        stage.setTitle("Welcome To My School App");
        stage.show();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        TreeItem<String> root1 = new TreeItem<>("Faculty",new ImageView(icon));
        
                    TreeItem<String> cse = new TreeItem<>("CSE",new ImageView(icon));
                    root1.getChildren().addAll(cse);
                    
                    TreeItem<String> eee = new TreeItem<>("EEE",new ImageView(icon));
                    root1.getChildren().addAll(eee);
                    
                    TreeItem<String> teacher = new TreeItem<>("Teachers",new ImageView(icon));
                    cse.getChildren().addAll(teacher);
                    
                    TreeItem<String> teacher1 = new TreeItem<>("Teachers",new ImageView(icon));
                    eee.getChildren().addAll(teacher1);
                    
                    TreeItem<String> student = new TreeItem<>("Students",new ImageView(icon));
                    cse.getChildren().addAll(student);
                    
                    TreeItem<String> students1 = new TreeItem<>("Students",new ImageView(icon));
                    eee.getChildren().addAll(students1);
                    
                    treeView1.setRoot(root1);
    }    
    
}
