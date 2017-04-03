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
    @FXML
    private Label aviso;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
    }

    @FXML
    public void sumar(double x) {
        double y = Double.valueOf(resultado.getText());
        y += x;
        resultado.setText("" + y);
    } //Metodo general para sumar

    @FXML
    public void restar(double x) {
        double y = Double.valueOf(resultado.getText());
        y -= x;
        resultado.setText("" + y);
    } //Metodo general para restar

    @FXML
    public void uno() {
        if (restar.isSelected()) {
            restar(1);
        } else {
            sumar(1);
        }
    } //Codigo del boton uno

    @FXML
    public void cinco() {
        if (restar.isSelected()) {
            restar(5);
        } else {
            sumar(5);
        }
    } //Codigo del boton cinco

    @FXML
    public void diez() {
        if (restar.isSelected()) {
            restar(10);
        } else {
            sumar(10);
        }
    } //Codigo del boton diez

    @FXML
    public void numero() {
        int x = Integer.valueOf(valor.getText());
        if (restar.isSelected()) {
            restar(x);
        } else {
            sumar(x);
        }
    } //Codigo del boton sumar
    
    @FXML
    public void aviso(){
        if(aviso.isVisible()) aviso.setVisible(false);
        else aviso.setVisible(true);
    }

}
