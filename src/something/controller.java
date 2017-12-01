/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package something;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeView;
import javafx.stage.Stage;

/**
 *
 * @author Main
 */
public class controller implements Initializable{
       /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @FXML
    private Label lblstatus;
    
    @FXML
    private TextField txtname;
    
    @FXML
    private Label isConnected;
    
    @FXML
    private TextField txtpass;
    
    @FXML
    private ProgressBar pbar;
    
    @FXML
    private ProgressBar pind;
    
    @FXML
    private Button out;
    
    @FXML
    private Button login;
    
    @FXML
    private Button signin;
    
    @FXML
    private Button guest;
    
    @FXML
    TreeView <String> treeView;
 
    private LoginModel loginmodel = new LoginModel();
    
    /*public void connectionCheck(){
        if(loginmodel.isDbConnected())isConnected.setText("connected");
        else isConnected.setText("Disconnected");
    }*/
    
    @FXML
    public void BTN(ActionEvent event) throws IOException{
        
        FileReader file = new FileReader("C:\\Users\\User\\Documents\\NetBeansProjects\\mySchoolLogin\\src\\something\\userData.txt");
        FileReader file1 = new FileReader("C:\\Users\\User\\Documents\\NetBeansProjects\\mySchoolLogin\\src\\something\\password.txt");
        Scanner scanner = new Scanner(file);
        Scanner scanner1 = new Scanner(file1);
        
        String lineFromFile = "";
        String lineFromFile1 = "";
        while (scanner.hasNextLine()) {
            lineFromFile = scanner.nextLine();
            if(lineFromFile.contains(txtname.getText())) { 
            // a match!
                break;
            }
        }
        while (scanner1.hasNextLine()) {
            lineFromFile1 = scanner1.nextLine();
            if(lineFromFile1.contains(txtpass.getText())) { 
            // a match!
                break;
            }
        }
        if((txtname.getText().equals(lineFromFile))&&(txtpass.getText().equals(lineFromFile1))){
            ((Node)(event.getSource())).getScene().getWindow().hide();
            Stage stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("/something/MainWindow.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            scene.getStylesheets().add(getClass().getResource("/something/login.css").toExternalForm());
            //scene.getStylesheets().add(getClass().getResource("/something/login.css").toExternalForm());
            stage.setTitle("Welcome To My School App");
            stage.show();
        }
    }
    
    @FXML
    public void BTN2(ActionEvent event) throws IOException{
        ((Node)(event.getSource())).getScene().getWindow().hide();
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/something/signinform.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        scene.getStylesheets().add(getClass().getResource("/something/signin.css").toExternalForm());//scene.getStylesheets().add(getClass().getResource("/something/login.css").toExternalForm());
        stage.setTitle("Welcome To My School App");
        stage.show();
    }
    
    @FXML
    public void BTN3(ActionEvent event) throws IOException{
        ((Node)(event.getSource())).getScene().getWindow().hide();
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/something/guestuser.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        scene.getStylesheets().add(getClass().getResource("/something/signin.css").toExternalForm());//scene.getStylesheets().add(getClass().getResource("/something/login.css").toExternalForm());
        stage.setTitle("Welcome To My School App");
        stage.show();
    }
    
    @FXML
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        if(loginmodel.isDbConnected())isConnected.setText("connected");
        /*number num = new number();
        num.setNumber(0);
        int i = 0;
        while(i<50){
            pbar.progressProperty().bind(num.numberProperty());
            pind.progressProperty().bind(num.numberProperty());
            num.setNumber(i);
            Stage primaryStage1 = new Stage();
            Parent root1 = null;
            try {
                root1 = FXMLLoader.load(getClass().getResource("/something/pbar.fxml"));
            } catch (IOException ex) {
                Logger.getLogger(controller.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            primaryStage1.setTitle("Welcome App");
            primaryStage1.setScene(new Scene(root1, 800, 800));
            primaryStage1.show();
            i*=5;
        }*/
        //((Node)getSource()).getScene().getWindow().hide();
    }
   
    public void Exit(){
        Platform.exit();
    }
}
