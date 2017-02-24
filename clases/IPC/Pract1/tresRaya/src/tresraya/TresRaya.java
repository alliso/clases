/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tresraya;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Alex
 */
public class TresRaya extends Application {


    private int[][] cuadros = new int[3][3];
    private int jugador = 1;
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    public void cambiarJugador() {
        if(jugador == 1) 
            jugador = 2;
        else 
            jugador = 1;
    }
    
    public void insertar(int x, int y){
        cuadros[x][y] = jugador;
    }
    
    public void reiniciar(int x, int y){
        cuadros[x][y] = 0;
    }
    
    public int getJugador() {return this.jugador;}
    
    public boolean comprobar(int x){
        return (cuadros[0][0] == x && cuadros[0][1] == x && cuadros[0][2] == x)||
                (cuadros[0][0] == x && cuadros[1][1] == x && cuadros[2][2] == x)||
                (cuadros[0][0] == x && cuadros[1][0] == x && cuadros[2][0] == x)||
                (cuadros[1][0] == x && cuadros[1][1] == x && cuadros[1][2] == x)||
                (cuadros[0][1] == x && cuadros[1][1] == x && cuadros[2][1] == x)||
                (cuadros[2][0] == x && cuadros[2][1] == x && cuadros[2][2] == x)||
                (cuadros[0][2] == x && cuadros[1][1] == x && cuadros[2][0] == x)||
                (cuadros[0][2] == x && cuadros[1][2] == x && cuadros[2][2] == x);
    }
    
}






