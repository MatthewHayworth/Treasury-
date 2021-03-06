package treasury.view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.AudioClip;
import treasury.Main;
import treasury.util.Utility;

public class WelcomeToTreasuryController {
    
    private Main main;
    
    @FXML
    private Label name;
    @FXML
    private AnchorPane anchorPane;
    @FXML
    private Button okButton;

    public void setMain(Main main) {
        this.main = main;
        name.setText(main.getName());
    }
    
    public void initialize() {
         /*
           Accepting changes by clicking Enter button
        */
        anchorPane.setOnKeyPressed(event -> {
            if(event.getCode() == KeyCode.ENTER){
              okButton.fire();
             }
        }); 
    }
    
    @FXML
    private void handleOkButton() {
        Utility.playClickSound();
        main.showSetInitialGoal();
    }
    
}
