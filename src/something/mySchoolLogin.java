package something;

import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class mySchoolLogin extends Application {
    private static String Username = new String();
    public static String getUserName(){return Username;}
    public static void setUserName(String s){Username = s;}
    
    @Override
    public void start(Stage stage) throws IOException{
            Parent root = FXMLLoader.load(getClass().getResource("/something/Login.fxml"));
            Scene scene = new Scene(root);
            scene.getStylesheets().add(getClass().getResource("/something/login.css").toExternalForm());
            stage.setScene(scene);
            stage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
