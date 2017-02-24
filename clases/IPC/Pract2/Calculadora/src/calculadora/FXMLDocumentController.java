/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author alllico
 */
public class FXMLDocumentController implements Initializable {
    @FXML
    private TextField texto;    
    @FXML
    private Button button1;
    @FXML
    private Button button7;
    @FXML
    private Button buttonC;
    @FXML
    private Button button4;
    @FXML
    private Button buttonBarra;
    @FXML
    private Button buttonX;
    @FXML
    private Button buttonMenos;
    @FXML
    private Button button8;
    @FXML
    private Button button9;
    @FXML
    private Button button5;
    @FXML
    private Button button6;
    @FXML
    private Button buttonMas;
    @FXML
    private Button button0;
    @FXML
    private Button buttonPunto;
    @FXML
    private Button button2;
    @FXML
    private Button button3;
    @FXML
    private Button buttonIgual;

    /**
     * Initializes the controller class.
     */
    
    @FXML
    public void escribir(ActionEvent e){
        String text = ((Button)e.getSource()).getText();
        texto.setText(texto.getText() + text);    
    } 
    
    @FXML
    public void borrar(ActionEvent e){
        texto.setText("");
    }
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
