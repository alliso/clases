/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumaslide;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Alex
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label resultado;
    @FXML
    private Button uno;
    @FXML
    private Button cinco;
    @FXML
    private Button diez;
    @FXML
    private CheckBox restar;
    @FXML
    private TextField valor;
    @FXML
    private Button botonValor;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    public void sumar(int x){
        int y = Integer.valueOf(resultado.getText());
        y += x;
        resultado.setText("" + y);
    }
    
    @FXML
    public void restar(int x){
        int y = Integer.valueOf(resultado.getText());
        y -= x;
        resultado.setText("" + y);
    }
    
    @FXML
    public void uno(){
        if(restar.isSelected()) restar(1);       
        else sumar(1);
    }
    
    @FXML
    public void cinco(){
        if(restar.isSelected()) restar(5);
        else sumar(5);
    }
    
    @FXML
    public void diez(){
        if(restar.isSelected()) restar(10);
        else sumar(10);
    }
    
    @FXML
    public void numero(){
        int x = Integer.valueOf(valor.getText());
        if(restar.isSelected()) restar(x);
        else sumar(x);
    }
    
}
