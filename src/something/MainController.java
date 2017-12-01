package something;

 
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

public class MainController implements Initializable{
    @FXML
    private TextArea txtstage;
    
    @FXML
    private TextArea txtshow;

    public void Setpost(ActionEvent event) {
        txtshow.setText(txtstage.getText());
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }
}