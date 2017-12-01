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
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Main
 */
public class MainWindowController implements Initializable {

    /**
     * Initializes the controller class.
     */
      @FXML
    TreeView <String> treeView;
      
    Image icon = new Image(getClass().getResourceAsStream("/image/blue.png"));
       
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
         TreeItem<String> root1 = new TreeItem<>("MySchool_root",new ImageView(icon));
        
                    TreeItem<String> country = new TreeItem<>("Country",new ImageView(icon));
       
                    root1.getChildren().addAll(country);
        
                    TreeItem<String> ban = new TreeItem<>("Bangladesh",new ImageView(icon));
                    TreeItem<String> usa = new TreeItem<>("USA",new ImageView(icon));
                    TreeItem<String> can = new TreeItem<>("Canada",new ImageView(icon));
       
                    country.getChildren().addAll(ban,usa,can);
        
                    TreeItem<String> buet = new TreeItem<>("B.U.E.T",new ImageView(icon));
                    TreeItem<String> du = new TreeItem<>("D.U",new ImageView(icon));
                    TreeItem<String> sust = new TreeItem<>("S.U.S.T",new ImageView(icon));
        
                    ban.getChildren().addAll(buet,du,sust);
        
                    TreeItem<String> mit = new TreeItem<>("M.I.T",new ImageView(icon));
                    TreeItem<String> cal = new TreeItem<>("Caltec",new ImageView(icon));
                    TreeItem<String> har = new TreeItem<>("Harvard university",new ImageView(icon));
        
                    usa.getChildren().addAll(mit,cal,har);
        
                    TreeItem<String> tor = new TreeItem<>("University of Torronto",new ImageView(icon));
                    TreeItem<String> sta = new TreeItem<>("Stanford University",new ImageView(icon));
                    TreeItem<String> ox = new TreeItem<>("oxford university",new ImageView(icon));
        
                    can.getChildren().addAll(tor,sta,ox);
        
                    treeView.setRoot(root1);
    }    
    public void LogOut(ActionEvent event) throws IOException{
        ((Node)(event.getSource())).getScene().getWindow().hide();
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/something/Login.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        scene.getStylesheets().add(getClass().getResource("/something/login.css").toExternalForm());
        //scene.getStylesheets().add(getClass().getResource("/something/login.css").toExternalForm());
        stage.setTitle("Welcome To My School App");
        stage.show();
    }
    
    public void mouseClick(MouseEvent mouse) throws IOException{
        if(mouse.getClickCount()==2){
            TreeItem<String>item = treeView.getSelectionModel().getSelectedItem();
            if("B.U.E.T".equals(item.getValue())){
                ((Node)(mouse.getSource())).getScene().getWindow().hide();
                Stage stage = new Stage();
                Parent root = FXMLLoader.load(getClass().getResource("/something/BUETHome.fxml"));
                Scene scene = new Scene(root);
                stage.setScene(scene);
                scene.getStylesheets().add(getClass().getResource("/something/signin.css").toExternalForm());
                //scene.getStylesheets().add(getClass().getResource("/something/login.css").toExternalForm());
                stage.setTitle("Welcome To My School App");
                stage.show();
            }
            else if("M.I.T".equals(item.getValue())){
                ((Node)(mouse.getSource())).getScene().getWindow().hide();
                Stage stage = new Stage();
                Parent root = FXMLLoader.load(getClass().getResource("/something/MITHome.fxml"));
                Scene scene = new Scene(root);
                stage.setScene(scene);
                scene.getStylesheets().add(getClass().getResource("/something/signin.css").toExternalForm());
                //scene.getStylesheets().add(getClass().getResource("/something/login.css").toExternalForm());
                stage.setTitle("Welcome To My School App");
                stage.show();
            }
            else if("oxford university".equals(item.getValue())){
                ((Node)(mouse.getSource())).getScene().getWindow().hide();
                Stage stage = new Stage();
                Parent root = FXMLLoader.load(getClass().getResource("/something/OXHome.fxml"));
                Scene scene = new Scene(root);
                stage.setScene(scene);
                scene.getStylesheets().add(getClass().getResource("/something/signin.css").toExternalForm());
                //scene.getStylesheets().add(getClass().getResource("/something/login.css").toExternalForm());
                stage.setTitle("Welcome To My School App");
                stage.show();
            }
        }
    }
    
}
