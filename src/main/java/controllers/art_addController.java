package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import services.ProductService;


public class art_addController {

    @FXML
    private BorderPane DescriptionPane;

    @FXML
    private Button addart;

    @FXML
    private TextField pricetextfield;

    @FXML
    private TextField sizetextfield;

    @FXML
    private TextField materialstextfield;

    @FXML
    private TextField descriptiontextfield;

    @FXML
    private TextField categoryTextField;

    @FXML
    void addartAction(){
        ProductService.addPRODUCT(sizetextfield.getText(),materialstextfield.getText(),categoryTextField.getText(),pricetextfield.getText(),descriptiontextfield.getText());

        Stage stage = (Stage)addart.getScene().getWindow();
        stage.close();


    }

}
