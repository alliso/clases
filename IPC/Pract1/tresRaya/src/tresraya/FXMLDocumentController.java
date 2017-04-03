/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tresraya;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author Alex
 */
public class FXMLDocumentController implements Initializable {

    TresRaya prueba = new TresRaya();

    @FXML
    private Label titulo;

    @FXML
    private Button button00;

    @FXML
    private Button button01;

    @FXML
    private Button button02;

    @FXML
    private Button button10;

    @FXML
    private Button button11;

    @FXML
    private Button button12;

    @FXML
    private Button button20;

    @FXML
    private Button button21;

    @FXML
    private Button button22;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        // label.setText("Hello World!");
    }

    @FXML
    private void empezar(ActionEvent event) {
        titulo.setText("Juego nuevo, turno de X");
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                prueba.reiniciar(x, y);
            }
        }
        button00.setText("");
        button01.setText("");
        button02.setText("");
        button10.setText("");
        button11.setText("");
        button12.setText("");
        button20.setText("");
        button21.setText("");
        button22.setText("");

    }

    @FXML
    private void insertar00(ActionEvent event) {
        Button aux = (Button) event.getSource();
        if (aux.getText().equals("")) {
            prueba.insertar(0, 0);
            if (prueba.getJugador() == 1) {
                aux.setText("X");
                titulo.setText("Turno del jugador O");
            } else {
                aux.setText("O");
                titulo.setText("Turno del jugador X");
            }
            if (prueba.comprobar(prueba.getJugador()) == true) {
                if (prueba.getJugador() == 1) {
                    titulo.setText("Gana el jugador X");
                } else {
                    titulo.setText("Gana el jugador 0");
                }

            }

            prueba.cambiarJugador();
        } else {
            titulo.setText("Esta casilla ya esta ocupada");
        }

    }

    @FXML
    private void insertar(ActionEvent event) {
        Button aux = (Button) event.getSource();
        if (aux.getText().equals("")) {
            prueba.insertar(0, 0);
            if (prueba.getJugador() == 1) {
                aux.setText("X");
                titulo.setText("Turno del jugador O");
            } else {
                aux.setText("O");
                titulo.setText("Turno del jugador X");
            }
            if (prueba.comprobar(prueba.getJugador()) == true) {
                if (prueba.getJugador() == 1) {
                    titulo.setText("Gana el jugador X");
                } else {
                    titulo.setText("Gana el jugador 0");
                }

            }

            prueba.cambiarJugador();
        } else {
            titulo.setText("Esta casilla ya esta ocupada");
        }

    }

    @FXML
    private void insertar01(ActionEvent event) {
        if (button01.getText().equals("")) {
            prueba.insertar(0, 1);
            if (prueba.getJugador() == 1) {
                button01.setText("X");
                titulo.setText("Turno del jugador O");
            } else {
                button01.setText("O");
                titulo.setText("Turno del jugador X");
            }
            if (prueba.comprobar(prueba.getJugador()) == true) {
                if (prueba.getJugador() == 1) {
                    titulo.setText("Gana el jugador X");
                } else {
                    titulo.setText("Gana el jugador 0");
                }

            }

            prueba.cambiarJugador();
        } else {
            titulo.setText("Esta casilla ya esta ocupada");
        }

    }

    @FXML
    private void insertar02(ActionEvent event) {
        if (button02.getText().equals("")) {
            prueba.insertar(0, 2);
            if (prueba.getJugador() == 1) {
                button02.setText("X");
                titulo.setText("Turno del jugador O");
            } else {
                button02.setText("O");
                titulo.setText("Turno del jugador X");
            }
            if (prueba.comprobar(prueba.getJugador()) == true) {
                if (prueba.getJugador() == 1) {
                    titulo.setText("Gana el jugador X");
                } else {
                    titulo.setText("Gana el jugador 0");
                }

            }

            prueba.cambiarJugador();
        } else {
            titulo.setText("Esta casilla ya esta ocupada");
        }

    }

    @FXML
    private void insertar10(ActionEvent event) {
        if (button10.getText().equals("")) {
            prueba.insertar(1, 0);
            if (prueba.getJugador() == 1) {
                button10.setText("X");
                titulo.setText("Turno del jugador O");
            } else {
                button10.setText("O");
                titulo.setText("Turno del jugador X");
            }
            if (prueba.comprobar(prueba.getJugador()) == true) {
                if (prueba.getJugador() == 1) {
                    titulo.setText("Gana el jugador X");
                } else {
                    titulo.setText("Gana el jugador 0");
                }

            }

            prueba.cambiarJugador();
        } else {
            titulo.setText("Esta casilla ya esta ocupada");
        }

    }

    @FXML
    private void insertar11(ActionEvent event) {
        if (button11.getText().equals("")) {
            prueba.insertar(1, 1);
            if (prueba.getJugador() == 1) {
                button11.setText("X");
                titulo.setText("Turno del jugador O");
            } else {
                button11.setText("O");
                titulo.setText("Turno del jugador X");
            }
            if (prueba.comprobar(prueba.getJugador()) == true) {
                if (prueba.getJugador() == 1) {
                    titulo.setText("Gana el jugador X");
                } else {
                    titulo.setText("Gana el jugador 0");
                }

            }

            prueba.cambiarJugador();
        } else {
            titulo.setText("Esta casilla ya esta ocupada");
        }

    }

    @FXML
    private void insertar12(ActionEvent event) {
        if (button12.getText().equals("")) {
            prueba.insertar(1, 2);
            if (prueba.getJugador() == 1) {
                button12.setText("X");
                titulo.setText("Turno del jugador O");
            } else {
                button12.setText("O");
                titulo.setText("Turno del jugador X");
            }
            if (prueba.comprobar(prueba.getJugador()) == true) {
                if (prueba.getJugador() == 1) {
                    titulo.setText("Gana el jugador X");
                } else {
                    titulo.setText("Gana el jugador 0");
                }

            }

            prueba.cambiarJugador();
        } else {
            titulo.setText("Esta casilla ya esta ocupada");
        }

    }

    @FXML
    private void insertar20(ActionEvent event) {
        if (button20.getText().equals("")) {
            prueba.insertar(2, 0);
            if (prueba.getJugador() == 1) {
                button20.setText("X");
                titulo.setText("Turno del jugador O");
            } else {
                button20.setText("O");
                titulo.setText("Turno del jugador X");
            }
            if (prueba.comprobar(prueba.getJugador()) == true) {
                if (prueba.getJugador() == 1) {
                    titulo.setText("Gana el jugador X");
                } else {
                    titulo.setText("Gana el jugador 0");
                }

            }

            prueba.cambiarJugador();
        } else {
            titulo.setText("Esta casilla ya esta ocupada");
        }

    }

    @FXML
    private void insertar21(ActionEvent event) {
        if (button21.getText().equals("")) {
            prueba.insertar(2, 1);
            if (prueba.getJugador() == 1) {
                button21.setText("X");
                titulo.setText("Turno del jugador O");
            } else {
                button21.setText("O");
                titulo.setText("Turno del jugador X");
            }
            if (prueba.comprobar(prueba.getJugador()) == true) {
                if (prueba.getJugador() == 1) {
                    titulo.setText("Gana el jugador X");
                } else {
                    titulo.setText("Gana el jugador 0");
                }

            }

            prueba.cambiarJugador();
        } else {
            titulo.setText("Esta casilla ya esta ocupada");
        }

    }

    @FXML
    private void insertar22(ActionEvent event) {
        if (button22.getText().equals("")) {
            prueba.insertar(2, 2);
            if (prueba.getJugador() == 1) {
                button22.setText("X");
                titulo.setText("Turno del jugador O");
            } else {
                button22.setText("O");
                titulo.setText("Turno del jugador X");
            }
            if (prueba.comprobar(prueba.getJugador()) == true) {
                if (prueba.getJugador() == 1) {
                    titulo.setText("Gana el jugador X");
                } else {
                    titulo.setText("Gana el jugador 0");
                }

            }

            prueba.cambiarJugador();
        } else {
            titulo.setText("Esta casilla ya esta ocupada");
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
