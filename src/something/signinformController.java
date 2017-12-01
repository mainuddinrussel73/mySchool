/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package something;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Main
 */
public class signinformController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private TextField user;
    
    @FXML
    private TextField pass;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    public void SaveData(ActionEvent event) throws IOException{
        ((Node)(event.getSource())).getScene().getWindow().hide();
        File myfile = new File("C:\\Users\\User\\Documents\\NetBeansProjects\\mySchoolLogin\\src\\something\\userData.txt");
        FileWriter filewriter = new FileWriter(myfile,true);
        BufferedWriter buffer = new BufferedWriter(filewriter);
        PrintWriter printwriter = new PrintWriter(buffer);
        printwriter.println(user.getText());
        printwriter.close();
        
        File pass1 = new File("C:\\Users\\User\\Documents\\NetBeansProjects\\mySchoolLogin\\src\\something\\password.txt");
        FileWriter filewriter1 = new FileWriter(pass1,true);
        BufferedWriter buffer1 = new BufferedWriter(filewriter1);
        PrintWriter printwriter1 = new PrintWriter(buffer1);
        printwriter1.println(pass.getText());
        printwriter1.close();
        
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/something/Login.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        scene.getStylesheets().add(getClass().getResource("/something/signin.css").toExternalForm());
        //scene.getStylesheets().add(getClass().getResource("/something/login.css").toExternalForm());
        stage.setTitle("Welcome To My School App");
        stage.show();
    }
    
    
}
