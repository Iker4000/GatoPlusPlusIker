package com.example.myconecta4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    boolean cambiar;
    boolean ganador;
    boolean jugadaA1;
    boolean jugadaA2;
    boolean jugadaA3;
    boolean jugadaA4;
    boolean jugadaA5;
    boolean jugadaA6;
    boolean jugadaB1;
    boolean jugadaB2;
    boolean jugadaB3;
    boolean jugadaB4;
    boolean jugadaB5;
    boolean jugadaB6;
    boolean jugadaC1;
    boolean jugadaC2;
    boolean jugadaC3;
    boolean jugadaC4;
    boolean jugadaC5;
    boolean jugadaC6;
    boolean jugadaD1;
    boolean jugadaD2;
    boolean jugadaD3;
    boolean jugadaD4;
    boolean jugadaD5;
    boolean jugadaD6;
    boolean jugadaE1;
    boolean jugadaE2;
    boolean jugadaE3;
    boolean jugadaE4;
    boolean jugadaE5;
    boolean jugadaE6;
    boolean jugadaF1;
    boolean jugadaF2;
    boolean jugadaF3;
    boolean jugadaF4;
    boolean jugadaF5;
    boolean jugadaF6;
    String movimientoA1 = "";
    String movimientoA2 = "";
    String movimientoA3 = "";
    String movimientoA4 = "";
    String movimientoA5 = "";
    String movimientoA6 = "";
    String movimientoB1 = "";
    String movimientoB2 = "";
    String movimientoB3 = "";
    String movimientoB4 = "";
    String movimientoB5 = "";
    String movimientoB6 = "";
    String movimientoC1 = "";
    String movimientoC2 = "";
    String movimientoC3 = "";
    String movimientoC4 = "";
    String movimientoC5 = "";
    String movimientoC6 = "";
    String movimientoD1 = "";
    String movimientoD2 = "";
    String movimientoD3 = "";
    String movimientoD4 = "";
    String movimientoD5 = "";
    String movimientoD6 = "";
    String movimientoE1 = "";
    String movimientoE2 = "";
    String movimientoE3 = "";
    String movimientoE4 = "";
    String movimientoE5 = "";
    String movimientoE6 = "";
    String movimientoF1 = "";
    String movimientoF2 = "";
    String movimientoF3 = "";
    String movimientoF4 = "";
    String movimientoF5 = "";
    String movimientoF6 = "";
    Button botonA1;
    Button botonA2;
    Button botonA3;
    Button botonA4;
    Button botonA5;
    Button botonA6;
    Button botonB1;
    Button botonB2;
    Button botonB3;
    Button botonB4;
    Button botonB5;
    Button botonB6;
    Button botonC1;
    Button botonC2;
    Button botonC3;
    Button botonC4;
    Button botonC5;
    Button botonC6;
    Button botonD1;
    Button botonD2;
    Button botonD3;
    Button botonD4;
    Button botonD5;
    Button botonD6;
    Button botonE1;
    Button botonE2;
    Button botonE3;
    Button botonE4;
    Button botonE5;
    Button botonE6;
    Button botonF1;
    Button botonF2;
    Button botonF3;
    Button botonF4;
    Button botonF5;
    Button botonF6;
    Button boton10;
    TextView Texto1;
    TextView Texto2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ganador = false;
        jugadaA1 = true;
        jugadaA2 = true;
        jugadaA3 = true;
        jugadaA4 = true;
        jugadaA5 = true;
        jugadaA6 = true;
        jugadaB1 = true;
        jugadaB2 = true;
        jugadaB3 = true;
        jugadaB4 = true;
        jugadaB5 = true;
        jugadaB6 = true;
        jugadaC1 = true;
        jugadaC2 = true;
        jugadaC3 = true;
        jugadaC4 = true;
        jugadaC5 = true;
        jugadaC6 = true;
        jugadaD1 = true;
        jugadaD2 = true;
        jugadaD3 = true;
        jugadaD4 = true;
        jugadaD5 = true;
        jugadaD6 = true;
        jugadaE1 = true;
        jugadaE2 = true;
        jugadaE3 = true;
        jugadaE4 = true;
        jugadaE5 = true;
        jugadaE6 = true;
        jugadaF1 = true;
        jugadaF2 = true;
        jugadaF3 = true;
        jugadaF4 = true;
        jugadaF5 = true;
        jugadaF6 = true;
        botonA1 = findViewById(R.id.buttonA1);
        botonA2 = findViewById(R.id.buttonA2);
        botonA3 = findViewById(R.id.buttonA3);
        botonA4 = findViewById(R.id.buttonA4);
        botonA5 = findViewById(R.id.buttonA5);
        botonA6 = findViewById(R.id.buttonA6);
        botonB1 = findViewById(R.id.buttonB1);
        botonB2 = findViewById(R.id.buttonB2);
        botonB3 = findViewById(R.id.buttonB3);
        botonB4 = findViewById(R.id.buttonB4);
        botonB5 = findViewById(R.id.buttonB5);
        botonB6 = findViewById(R.id.buttonB6);
        botonC1 = findViewById(R.id.buttonC1);
        botonC2 = findViewById(R.id.buttonC2);
        botonC3 = findViewById(R.id.buttonC3);
        botonC4 = findViewById(R.id.buttonC4);
        botonC5 = findViewById(R.id.buttonC5);
        botonC6 = findViewById(R.id.buttonC6);
        botonD1 = findViewById(R.id.buttonD1);
        botonD2 = findViewById(R.id.buttonD2);
        botonD3 = findViewById(R.id.buttonD3);
        botonD4 = findViewById(R.id.buttonD4);
        botonD5 = findViewById(R.id.buttonD5);
        botonD6 = findViewById(R.id.buttonD6);
        botonE1 = findViewById(R.id.buttonE1);
        botonE2 = findViewById(R.id.buttonE2);
        botonE3 = findViewById(R.id.buttonE3);
        botonE4 = findViewById(R.id.buttonE4);
        botonE5 = findViewById(R.id.buttonE5);
        botonE6 = findViewById(R.id.buttonE6);
        botonF1 = findViewById(R.id.buttonF1);
        botonF2 = findViewById(R.id.buttonF2);
        botonF3 = findViewById(R.id.buttonF3);
        botonF4 = findViewById(R.id.buttonF4);
        botonF5 = findViewById(R.id.buttonF5);
        botonF6 = findViewById(R.id.buttonF6);
        boton10 = findViewById(R.id.buttonM);
        Texto1 = findViewById(R.id.textView1);
        Texto2 = findViewById(R.id.textView2);
    }

    public void pulsarBoton1(View v) {
        if (!ganador){
            if (jugadaA1){
                if (cambiar) {
                    botonA1.setText("X");
                    Texto1.setText("GATO Turno: O");
                    movimientoA1 = "X";
                    cambiar = false;
                    jugadaA1 = false;
                } else {
                    botonA1.setText("O");
                    Texto1.setText("GATO Turno: X");
                    movimientoA1 = "O";
                    cambiar = true;
                    jugadaA1 = false;
                }
            } else{
                if (jugadaB1){
                    if (cambiar) {
                        botonB1.setText("X");
                        Texto1.setText("GATO Turno: O");
                        movimientoB1 ="X";
                        cambiar = false;
                        jugadaB1 =false;
                    } else {
                        botonB1.setText("O");
                        Texto1.setText("GATO Turno: X");
                        movimientoB1 ="O";
                        cambiar = true;
                        jugadaB1 =false;
                    }
                }else{
                    if (jugadaC1){
                        if (cambiar) {
                            botonC1.setText("X");
                            Texto1.setText("GATO Turno: O");
                            movimientoC1 ="X";
                            cambiar = false;
                            jugadaC1 =false;
                        } else {
                            botonC1.setText("O");
                            Texto1.setText("GATO Turno: X");
                            movimientoC1 ="O";
                            cambiar = true;
                            jugadaC1 =false;
                        }
                    }else{
                        if (jugadaD1){
                            if (cambiar) {
                                botonD1.setText("X");
                                Texto1.setText("GATO Turno: O");
                                movimientoD1 ="X";
                                cambiar = false;
                                jugadaD1 =false;
                            } else {
                                botonD1.setText("O");
                                Texto1.setText("GATO Turno: X");
                                movimientoD1 ="O";
                                cambiar = true;
                                jugadaD1 =false;
                            }
                        }else{
                            if (jugadaE1){
                                if (cambiar) {
                                    botonE1.setText("X");
                                    Texto1.setText("GATO Turno: O");
                                    movimientoE1 ="X";
                                    cambiar = false;
                                    jugadaE1 =false;
                                } else {
                                    botonE1.setText("O");
                                    Texto1.setText("GATO Turno: X");
                                    movimientoE1 ="O";
                                    cambiar = true;
                                    jugadaE1 =false;
                                }
                            }else{
                                if (jugadaF1){
                                    if (cambiar) {
                                        botonF1.setText("X");
                                        Texto1.setText("GATO Turno: O");
                                        movimientoF1 ="X";
                                        cambiar = false;
                                        jugadaF1 =false;
                                    } else {
                                        botonF1.setText("O");
                                        Texto1.setText("GATO Turno: X");
                                        movimientoF1 ="O";
                                        cambiar = true;
                                        jugadaF1 =false;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if(movimientoA1 == "X" & movimientoA2 == "X" & movimientoA3 == "X" & movimientoA4 == "X" || movimientoA2 == "X" & movimientoA3 == "X" & movimientoA4 == "X" & movimientoA5 == "X" || movimientoA3 == "X" & movimientoA4 == "X" & movimientoA5 == "X" & movimientoA6 == "X" || movimientoB1 == "X" & movimientoB2 == "X" & movimientoB3 == "X" & movimientoB4 == "X" || movimientoB2 == "X" & movimientoB3 == "X" & movimientoB4 == "X" & movimientoB5 == "X" || movimientoB3 == "X" & movimientoB4 == "X" & movimientoB5 == "X" & movimientoB6 == "X" || movimientoC1 == "X" & movimientoC2 == "X" & movimientoC3 == "X" & movimientoC4 == "X" || movimientoC2 == "X" & movimientoC3 == "X" & movimientoC4 == "X" & movimientoC5 == "X" || movimientoC3 == "X" & movimientoC4 == "X" & movimientoC5 == "X" & movimientoC6 == "X" || movimientoD1 == "X" & movimientoD2 == "X" & movimientoD3 == "X" & movimientoD4 == "X" || movimientoD2 == "X" & movimientoD3 == "X" & movimientoD4 == "X" & movimientoD5 == "X" || movimientoD3 == "X" & movimientoD4 == "X" & movimientoD5 == "X" & movimientoD6 == "X" || movimientoE1 == "X" & movimientoE2 == "X" & movimientoE3 == "X" & movimientoE4 == "X" || movimientoE2 == "X" & movimientoE3 == "X" & movimientoE4 == "X" & movimientoE5 == "X" || movimientoE3 == "X" & movimientoE4 == "X" & movimientoE5 == "X" & movimientoE6 == "X" || movimientoF1 == "X" & movimientoF2 == "X" & movimientoF3 == "X" & movimientoF4 == "X" || movimientoF2 == "X" & movimientoF3 == "X" & movimientoF4 == "X" & movimientoF5 == "X" || movimientoF3 == "X" & movimientoF4 == "X" & movimientoF5 == "X" & movimientoF6 == "X" || movimientoA1 == "X" & movimientoB1 == "X" & movimientoC1 == "X" & movimientoD1 == "X" || movimientoB1 == "X" & movimientoC1 == "X" & movimientoD1 == "X" & movimientoE1 == "X" || movimientoC1 == "X" & movimientoD1 == "X" & movimientoE1 == "X" & movimientoF1 == "X" || movimientoA2 == "X" & movimientoB2 == "X" & movimientoC2 == "X" & movimientoD2 == "X" || movimientoB2 == "X" & movimientoC2 == "X" & movimientoD2 == "X" & movimientoE2 == "X" || movimientoC2 == "X" & movimientoD2 == "X" & movimientoE2 == "X" & movimientoF2 == "X" || movimientoA3 == "X" & movimientoB3 == "X" & movimientoC3 == "X" & movimientoD3 == "X" || movimientoB3 == "X" & movimientoC3 == "X" & movimientoD3 == "X" & movimientoE3 == "X" || movimientoC3 == "X" & movimientoD3 == "X" & movimientoE3 == "X" & movimientoF3 == "X" || movimientoA4 == "X" & movimientoB4 == "X" & movimientoC4 == "X" & movimientoD4 == "X" || movimientoB4 == "X" & movimientoC4 == "X" & movimientoD4 == "X" & movimientoE4 == "X" || movimientoC4 == "X" & movimientoD4 == "X" & movimientoE4 == "X" & movimientoF4 == "X" || movimientoA5 == "X" & movimientoB5 == "X" & movimientoC5 == "X" & movimientoD5 == "X" || movimientoB5 == "X" & movimientoC5 == "X" & movimientoD5 == "X" & movimientoE5 == "X" || movimientoC5 == "X" & movimientoD5 == "X" & movimientoE5 == "X" & movimientoF5 == "X" || movimientoA6 == "X" & movimientoB6 == "X" & movimientoC6 == "X" & movimientoD6 == "X" || movimientoB6 == "X" & movimientoC6 == "X" & movimientoD6 == "X" & movimientoE6 == "X" || movimientoC6 == "X" & movimientoD6 == "X" & movimientoE6 == "X" & movimientoF6 == "X" || movimientoA1 == "X" & movimientoB2 == "X" & movimientoC3 == "X" & movimientoD4 == "X" || movimientoB1 == "X" & movimientoC2 == "X" & movimientoD3 == "X" & movimientoE4 == "X" || movimientoC1 == "X" & movimientoD2 == "X" & movimientoE3 == "X" & movimientoF4 == "X" || movimientoA2 == "X" & movimientoB3 == "X" & movimientoC4 == "X" & movimientoD5 == "X" || movimientoB2 == "X" & movimientoC3 == "X" & movimientoD4 == "X" & movimientoE5 == "X" || movimientoC2 == "X" & movimientoD3 == "X" & movimientoE4 == "X" & movimientoF5 == "X" || movimientoA3 == "X" & movimientoB4 == "X" & movimientoC5 == "X" & movimientoD6 == "X" || movimientoB3 == "X" & movimientoC4 == "X" & movimientoD5 == "X" & movimientoE6 == "X" || movimientoC3 == "X" & movimientoD4 == "X" & movimientoE5 == "X" & movimientoF6 == "X" || movimientoF1 == "X" & movimientoE2 == "X" & movimientoD3 == "X" & movimientoC4 == "X" || movimientoE1 == "X" & movimientoD2 == "X" & movimientoC3 == "X" & movimientoB4 == "X" || movimientoD1 == "X" & movimientoC2 == "X" & movimientoB3 == "X" & movimientoA4 == "X" || movimientoF2 == "X" & movimientoE3 == "X" & movimientoD4 == "X" & movimientoC5 == "X" || movimientoE2 == "X" & movimientoD3 == "X" & movimientoC4 == "X" & movimientoB5 == "X" || movimientoD2 == "X" & movimientoC3 == "X" & movimientoB4 == "X" & movimientoA5 == "X" || movimientoF3 == "X" & movimientoE4 == "X" & movimientoD5 == "X" & movimientoC6 == "X" || movimientoE3 == "X" & movimientoD4 == "X" & movimientoC5 == "X" & movimientoB6 == "X" || movimientoD3 == "X" & movimientoC4 == "X" & movimientoB5 == "X" & movimientoA6 == "X"){
                ganador = true;
                Texto2.setText("Ganador X");

            }else{
                if(movimientoA1 == "O" & movimientoA2 == "O" & movimientoA3 == "O" & movimientoA4 == "O" || movimientoA2 == "O" & movimientoA3 == "O" & movimientoA4 == "O" & movimientoA5 == "O" || movimientoA3 == "O" & movimientoA4 == "O" & movimientoA5 == "O" & movimientoA6 == "O" || movimientoB1 == "O" & movimientoB2 == "O" & movimientoB3 == "O" & movimientoB4 == "O" || movimientoB2 == "O" & movimientoB3 == "O" & movimientoB4 == "O" & movimientoB5 == "O" || movimientoB3 == "O" & movimientoB4 == "O" & movimientoB5 == "O" & movimientoB6 == "O" || movimientoC1 == "O" & movimientoC2 == "O" & movimientoC3 == "O" & movimientoC4 == "O" || movimientoC2 == "O" & movimientoC3 == "O" & movimientoC4 == "O" & movimientoC5 == "O" || movimientoC3 == "O" & movimientoC4 == "O" & movimientoC5 == "O" & movimientoC6 == "O" || movimientoD1 == "O" & movimientoD2 == "O" & movimientoD3 == "O" & movimientoD4 == "O" || movimientoD2 == "O" & movimientoD3 == "O" & movimientoD4 == "O" & movimientoD5 == "O" || movimientoD3 == "O" & movimientoD4 == "O" & movimientoD5 == "O" & movimientoD6 == "O" || movimientoE1 == "O" & movimientoE2 == "O" & movimientoE3 == "O" & movimientoE4 == "O" || movimientoE2 == "O" & movimientoE3 == "O" & movimientoE4 == "O" & movimientoE5 == "O" || movimientoE3 == "O" & movimientoE4 == "O" & movimientoE5 == "O" & movimientoE6 == "O" || movimientoF1 == "O" & movimientoF2 == "O" & movimientoF3 == "O" & movimientoF4 == "O" || movimientoF2 == "O" & movimientoF3 == "O" & movimientoF4 == "O" & movimientoF5 == "O" || movimientoF3 == "O" & movimientoF4 == "O" & movimientoF5 == "O" & movimientoF6 == "O" || movimientoA1 == "O" & movimientoB1 == "O" & movimientoC1 == "O" & movimientoD1 == "O" || movimientoB1 == "O" & movimientoC1 == "O" & movimientoD1 == "O" & movimientoE1 == "O" || movimientoC1 == "O" & movimientoD1 == "O" & movimientoE1 == "O" & movimientoF1 == "O" || movimientoA2 == "O" & movimientoB2 == "O" & movimientoC2 == "O" & movimientoD2 == "O" || movimientoB2 == "O" & movimientoC2 == "O" & movimientoD2 == "O" & movimientoE2 == "O" || movimientoC2 == "O" & movimientoD2 == "O" & movimientoE2 == "O" & movimientoF2 == "O" || movimientoA3 == "O" & movimientoB3 == "O" & movimientoC3 == "O" & movimientoD3 == "O" || movimientoB3 == "O" & movimientoC3 == "O" & movimientoD3 == "O" & movimientoE3 == "O" || movimientoC3 == "O" & movimientoD3 == "O" & movimientoE3 == "O" & movimientoF3 == "O" || movimientoA4 == "O" & movimientoB4 == "O" & movimientoC4 == "O" & movimientoD4 == "O" || movimientoB4 == "O" & movimientoC4 == "O" & movimientoD4 == "O" & movimientoE4 == "O" || movimientoC4 == "O" & movimientoD4 == "O" & movimientoE4 == "O" & movimientoF4 == "O" || movimientoA5 == "O" & movimientoB5 == "O" & movimientoC5 == "O" & movimientoD5 == "O" || movimientoB5 == "O" & movimientoC5 == "O" & movimientoD5 == "O" & movimientoE5 == "O" || movimientoC5 == "O" & movimientoD5 == "O" & movimientoE5 == "O" & movimientoF5 == "O" || movimientoA6 == "O" & movimientoB6 == "O" & movimientoC6 == "O" & movimientoD6 == "O" || movimientoB6 == "O" & movimientoC6 == "O" & movimientoD6 == "O" & movimientoE6 == "O" || movimientoC6 == "O" & movimientoD6 == "O" & movimientoE6 == "O" & movimientoF6 == "O" || movimientoA1 == "O" & movimientoB2 == "O" & movimientoC3 == "O" & movimientoD4 == "O" || movimientoB1 == "O" & movimientoC2 == "O" & movimientoD3 == "O" & movimientoE4 == "O" || movimientoC1 == "O" & movimientoD2 == "O" & movimientoE3 == "O" & movimientoF4 == "O" || movimientoA2 == "O" & movimientoB3 == "O" & movimientoC4 == "O" & movimientoD5 == "O" || movimientoB2 == "O" & movimientoC3 == "O" & movimientoD4 == "O" & movimientoE5 == "O" || movimientoC2 == "O" & movimientoD3 == "O" & movimientoE4 == "O" & movimientoF5 == "O" || movimientoA3 == "O" & movimientoB4 == "O" & movimientoC5 == "O" & movimientoD6 == "O" || movimientoB3 == "O" & movimientoC4 == "O" & movimientoD5 == "O" & movimientoE6 == "O" || movimientoC3 == "O" & movimientoD4 == "O" & movimientoE5 == "O" & movimientoF6 == "O" || movimientoF1 == "O" & movimientoE2 == "O" & movimientoD3 == "O" & movimientoC4 == "O" || movimientoE1 == "O" & movimientoD2 == "O" & movimientoC3 == "O" & movimientoB4 == "O" || movimientoD1 == "O" & movimientoC2 == "O" & movimientoB3 == "O" & movimientoA4 == "O" || movimientoF2 == "O" & movimientoE3 == "O" & movimientoD4 == "O" & movimientoC5 == "O" || movimientoE2 == "O" & movimientoD3 == "O" & movimientoC4 == "O" & movimientoB5 == "O" || movimientoD2 == "O" & movimientoC3 == "O" & movimientoB4 == "O" & movimientoA5 == "O" || movimientoF3 == "O" & movimientoE4 == "O" & movimientoD5 == "O" & movimientoC6 == "O" || movimientoE3 == "O" & movimientoD4 == "O" & movimientoC5 == "O" & movimientoB6 == "O" || movimientoD3 == "O" & movimientoC4 == "O" & movimientoB5 == "O" & movimientoA6 == "O"){
                    ganador = true;
                    Texto2.setText("Ganador O");
                }else{
                    if(!jugadaA1 & !jugadaA2 & !jugadaA3 & !jugadaA4 & !jugadaA5 & !jugadaA6 & !jugadaB1 & !jugadaB2 & !jugadaB3 & !jugadaB4 & !jugadaB5 & !jugadaB6 & !jugadaC1 & !jugadaC2 & !jugadaC3 & !jugadaC4 & !jugadaC5 & !jugadaC6 & !jugadaD1 & !jugadaD2 & !jugadaD3 & !jugadaD4 & !jugadaD5 & !jugadaD6 & !jugadaE1 & !jugadaE2 & !jugadaE3 & !jugadaE4 & !jugadaE5 & !jugadaE6 & !jugadaF1 & !jugadaF2 & !jugadaF3 & !jugadaF4 & !jugadaF5 & !jugadaF6){
                        ganador = true;
                        Texto2.setText("Ganador Gato");
                    }
                }
            }
        }
    }

    public void pulsarBoton2(View v) {
        if (!ganador){
            if (jugadaA2){
                if (cambiar) {
                    botonA2.setText("X");
                    Texto1.setText("GATO Turno: O");
                    movimientoA2 = "X";
                    cambiar = false;
                    jugadaA2 = false;
                } else {
                    botonA2.setText("O");
                    Texto1.setText("GATO Turno: X");
                    movimientoA2 = "O";
                    cambiar = true;
                    jugadaA2 = false;
                }
            } else{
                if (jugadaB2){
                    if (cambiar) {
                        botonB2.setText("X");
                        Texto1.setText("GATO Turno: O");
                        movimientoB2 ="X";
                        cambiar = false;
                        jugadaB2 =false;
                    } else {
                        botonB2.setText("O");
                        Texto1.setText("GATO Turno: X");
                        movimientoB2 ="O";
                        cambiar = true;
                        jugadaB2 =false;
                    }
                }else{
                    if (jugadaC2){
                        if (cambiar) {
                            botonC2.setText("X");
                            Texto1.setText("GATO Turno: O");
                            movimientoC2 ="X";
                            cambiar = false;
                            jugadaC2 =false;
                        } else {
                            botonC2.setText("O");
                            Texto1.setText("GATO Turno: X");
                            movimientoC2 ="O";
                            cambiar = true;
                            jugadaC2 =false;
                        }
                    }else{
                        if (jugadaD2){
                            if (cambiar) {
                                botonD2.setText("X");
                                Texto1.setText("GATO Turno: O");
                                movimientoD2 ="X";
                                cambiar = false;
                                jugadaD2 =false;
                            } else {
                                botonD2.setText("O");
                                Texto1.setText("GATO Turno: X");
                                movimientoD2 ="O";
                                cambiar = true;
                                jugadaD2 =false;
                            }
                        }else{
                            if (jugadaE2){
                                if (cambiar) {
                                    botonE2.setText("X");
                                    Texto1.setText("GATO Turno: O");
                                    movimientoE2 ="X";
                                    cambiar = false;
                                    jugadaE2 =false;
                                } else {
                                    botonE2.setText("O");
                                    Texto1.setText("GATO Turno: X");
                                    movimientoE2 ="O";
                                    cambiar = true;
                                    jugadaE2 =false;
                                }
                            }else{
                                if (jugadaF2){
                                    if (cambiar) {
                                        botonF2.setText("X");
                                        Texto1.setText("GATO Turno: O");
                                        movimientoF2 ="X";
                                        cambiar = false;
                                        jugadaF2 =false;
                                    } else {
                                        botonF2.setText("O");
                                        Texto1.setText("GATO Turno: X");
                                        movimientoF2 ="O";
                                        cambiar = true;
                                        jugadaF2 =false;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if(movimientoA1 == "X" & movimientoA2 == "X" & movimientoA3 == "X" & movimientoA4 == "X" || movimientoA2 == "X" & movimientoA3 == "X" & movimientoA4 == "X" & movimientoA5 == "X" || movimientoA3 == "X" & movimientoA4 == "X" & movimientoA5 == "X" & movimientoA6 == "X" || movimientoB1 == "X" & movimientoB2 == "X" & movimientoB3 == "X" & movimientoB4 == "X" || movimientoB2 == "X" & movimientoB3 == "X" & movimientoB4 == "X" & movimientoB5 == "X" || movimientoB3 == "X" & movimientoB4 == "X" & movimientoB5 == "X" & movimientoB6 == "X" || movimientoC1 == "X" & movimientoC2 == "X" & movimientoC3 == "X" & movimientoC4 == "X" || movimientoC2 == "X" & movimientoC3 == "X" & movimientoC4 == "X" & movimientoC5 == "X" || movimientoC3 == "X" & movimientoC4 == "X" & movimientoC5 == "X" & movimientoC6 == "X" || movimientoD1 == "X" & movimientoD2 == "X" & movimientoD3 == "X" & movimientoD4 == "X" || movimientoD2 == "X" & movimientoD3 == "X" & movimientoD4 == "X" & movimientoD5 == "X" || movimientoD3 == "X" & movimientoD4 == "X" & movimientoD5 == "X" & movimientoD6 == "X" || movimientoE1 == "X" & movimientoE2 == "X" & movimientoE3 == "X" & movimientoE4 == "X" || movimientoE2 == "X" & movimientoE3 == "X" & movimientoE4 == "X" & movimientoE5 == "X" || movimientoE3 == "X" & movimientoE4 == "X" & movimientoE5 == "X" & movimientoE6 == "X" || movimientoF1 == "X" & movimientoF2 == "X" & movimientoF3 == "X" & movimientoF4 == "X" || movimientoF2 == "X" & movimientoF3 == "X" & movimientoF4 == "X" & movimientoF5 == "X" || movimientoF3 == "X" & movimientoF4 == "X" & movimientoF5 == "X" & movimientoF6 == "X" || movimientoA1 == "X" & movimientoB1 == "X" & movimientoC1 == "X" & movimientoD1 == "X" || movimientoB1 == "X" & movimientoC1 == "X" & movimientoD1 == "X" & movimientoE1 == "X" || movimientoC1 == "X" & movimientoD1 == "X" & movimientoE1 == "X" & movimientoF1 == "X" || movimientoA2 == "X" & movimientoB2 == "X" & movimientoC2 == "X" & movimientoD2 == "X" || movimientoB2 == "X" & movimientoC2 == "X" & movimientoD2 == "X" & movimientoE2 == "X" || movimientoC2 == "X" & movimientoD2 == "X" & movimientoE2 == "X" & movimientoF2 == "X" || movimientoA3 == "X" & movimientoB3 == "X" & movimientoC3 == "X" & movimientoD3 == "X" || movimientoB3 == "X" & movimientoC3 == "X" & movimientoD3 == "X" & movimientoE3 == "X" || movimientoC3 == "X" & movimientoD3 == "X" & movimientoE3 == "X" & movimientoF3 == "X" || movimientoA4 == "X" & movimientoB4 == "X" & movimientoC4 == "X" & movimientoD4 == "X" || movimientoB4 == "X" & movimientoC4 == "X" & movimientoD4 == "X" & movimientoE4 == "X" || movimientoC4 == "X" & movimientoD4 == "X" & movimientoE4 == "X" & movimientoF4 == "X" || movimientoA5 == "X" & movimientoB5 == "X" & movimientoC5 == "X" & movimientoD5 == "X" || movimientoB5 == "X" & movimientoC5 == "X" & movimientoD5 == "X" & movimientoE5 == "X" || movimientoC5 == "X" & movimientoD5 == "X" & movimientoE5 == "X" & movimientoF5 == "X" || movimientoA6 == "X" & movimientoB6 == "X" & movimientoC6 == "X" & movimientoD6 == "X" || movimientoB6 == "X" & movimientoC6 == "X" & movimientoD6 == "X" & movimientoE6 == "X" || movimientoC6 == "X" & movimientoD6 == "X" & movimientoE6 == "X" & movimientoF6 == "X" || movimientoA1 == "X" & movimientoB2 == "X" & movimientoC3 == "X" & movimientoD4 == "X" || movimientoB1 == "X" & movimientoC2 == "X" & movimientoD3 == "X" & movimientoE4 == "X" || movimientoC1 == "X" & movimientoD2 == "X" & movimientoE3 == "X" & movimientoF4 == "X" || movimientoA2 == "X" & movimientoB3 == "X" & movimientoC4 == "X" & movimientoD5 == "X" || movimientoB2 == "X" & movimientoC3 == "X" & movimientoD4 == "X" & movimientoE5 == "X" || movimientoC2 == "X" & movimientoD3 == "X" & movimientoE4 == "X" & movimientoF5 == "X" || movimientoA3 == "X" & movimientoB4 == "X" & movimientoC5 == "X" & movimientoD6 == "X" || movimientoB3 == "X" & movimientoC4 == "X" & movimientoD5 == "X" & movimientoE6 == "X" || movimientoC3 == "X" & movimientoD4 == "X" & movimientoE5 == "X" & movimientoF6 == "X" || movimientoF1 == "X" & movimientoE2 == "X" & movimientoD3 == "X" & movimientoC4 == "X" || movimientoE1 == "X" & movimientoD2 == "X" & movimientoC3 == "X" & movimientoB4 == "X" || movimientoD1 == "X" & movimientoC2 == "X" & movimientoB3 == "X" & movimientoA4 == "X" || movimientoF2 == "X" & movimientoE3 == "X" & movimientoD4 == "X" & movimientoC5 == "X" || movimientoE2 == "X" & movimientoD3 == "X" & movimientoC4 == "X" & movimientoB5 == "X" || movimientoD2 == "X" & movimientoC3 == "X" & movimientoB4 == "X" & movimientoA5 == "X" || movimientoF3 == "X" & movimientoE4 == "X" & movimientoD5 == "X" & movimientoC6 == "X" || movimientoE3 == "X" & movimientoD4 == "X" & movimientoC5 == "X" & movimientoB6 == "X" || movimientoD3 == "X" & movimientoC4 == "X" & movimientoB5 == "X" & movimientoA6 == "X"){
                ganador = true;
                Texto2.setText("Ganador X");

            }else{
                if(movimientoA1 == "O" & movimientoA2 == "O" & movimientoA3 == "O" & movimientoA4 == "O" || movimientoA2 == "O" & movimientoA3 == "O" & movimientoA4 == "O" & movimientoA5 == "O" || movimientoA3 == "O" & movimientoA4 == "O" & movimientoA5 == "O" & movimientoA6 == "O" || movimientoB1 == "O" & movimientoB2 == "O" & movimientoB3 == "O" & movimientoB4 == "O" || movimientoB2 == "O" & movimientoB3 == "O" & movimientoB4 == "O" & movimientoB5 == "O" || movimientoB3 == "O" & movimientoB4 == "O" & movimientoB5 == "O" & movimientoB6 == "O" || movimientoC1 == "O" & movimientoC2 == "O" & movimientoC3 == "O" & movimientoC4 == "O" || movimientoC2 == "O" & movimientoC3 == "O" & movimientoC4 == "O" & movimientoC5 == "O" || movimientoC3 == "O" & movimientoC4 == "O" & movimientoC5 == "O" & movimientoC6 == "O" || movimientoD1 == "O" & movimientoD2 == "O" & movimientoD3 == "O" & movimientoD4 == "O" || movimientoD2 == "O" & movimientoD3 == "O" & movimientoD4 == "O" & movimientoD5 == "O" || movimientoD3 == "O" & movimientoD4 == "O" & movimientoD5 == "O" & movimientoD6 == "O" || movimientoE1 == "O" & movimientoE2 == "O" & movimientoE3 == "O" & movimientoE4 == "O" || movimientoE2 == "O" & movimientoE3 == "O" & movimientoE4 == "O" & movimientoE5 == "O" || movimientoE3 == "O" & movimientoE4 == "O" & movimientoE5 == "O" & movimientoE6 == "O" || movimientoF1 == "O" & movimientoF2 == "O" & movimientoF3 == "O" & movimientoF4 == "O" || movimientoF2 == "O" & movimientoF3 == "O" & movimientoF4 == "O" & movimientoF5 == "O" || movimientoF3 == "O" & movimientoF4 == "O" & movimientoF5 == "O" & movimientoF6 == "O" || movimientoA1 == "O" & movimientoB1 == "O" & movimientoC1 == "O" & movimientoD1 == "O" || movimientoB1 == "O" & movimientoC1 == "O" & movimientoD1 == "O" & movimientoE1 == "O" || movimientoC1 == "O" & movimientoD1 == "O" & movimientoE1 == "O" & movimientoF1 == "O" || movimientoA2 == "O" & movimientoB2 == "O" & movimientoC2 == "O" & movimientoD2 == "O" || movimientoB2 == "O" & movimientoC2 == "O" & movimientoD2 == "O" & movimientoE2 == "O" || movimientoC2 == "O" & movimientoD2 == "O" & movimientoE2 == "O" & movimientoF2 == "O" || movimientoA3 == "O" & movimientoB3 == "O" & movimientoC3 == "O" & movimientoD3 == "O" || movimientoB3 == "O" & movimientoC3 == "O" & movimientoD3 == "O" & movimientoE3 == "O" || movimientoC3 == "O" & movimientoD3 == "O" & movimientoE3 == "O" & movimientoF3 == "O" || movimientoA4 == "O" & movimientoB4 == "O" & movimientoC4 == "O" & movimientoD4 == "O" || movimientoB4 == "O" & movimientoC4 == "O" & movimientoD4 == "O" & movimientoE4 == "O" || movimientoC4 == "O" & movimientoD4 == "O" & movimientoE4 == "O" & movimientoF4 == "O" || movimientoA5 == "O" & movimientoB5 == "O" & movimientoC5 == "O" & movimientoD5 == "O" || movimientoB5 == "O" & movimientoC5 == "O" & movimientoD5 == "O" & movimientoE5 == "O" || movimientoC5 == "O" & movimientoD5 == "O" & movimientoE5 == "O" & movimientoF5 == "O" || movimientoA6 == "O" & movimientoB6 == "O" & movimientoC6 == "O" & movimientoD6 == "O" || movimientoB6 == "O" & movimientoC6 == "O" & movimientoD6 == "O" & movimientoE6 == "O" || movimientoC6 == "O" & movimientoD6 == "O" & movimientoE6 == "O" & movimientoF6 == "O" || movimientoA1 == "O" & movimientoB2 == "O" & movimientoC3 == "O" & movimientoD4 == "O" || movimientoB1 == "O" & movimientoC2 == "O" & movimientoD3 == "O" & movimientoE4 == "O" || movimientoC1 == "O" & movimientoD2 == "O" & movimientoE3 == "O" & movimientoF4 == "O" || movimientoA2 == "O" & movimientoB3 == "O" & movimientoC4 == "O" & movimientoD5 == "O" || movimientoB2 == "O" & movimientoC3 == "O" & movimientoD4 == "O" & movimientoE5 == "O" || movimientoC2 == "O" & movimientoD3 == "O" & movimientoE4 == "O" & movimientoF5 == "O" || movimientoA3 == "O" & movimientoB4 == "O" & movimientoC5 == "O" & movimientoD6 == "O" || movimientoB3 == "O" & movimientoC4 == "O" & movimientoD5 == "O" & movimientoE6 == "O" || movimientoC3 == "O" & movimientoD4 == "O" & movimientoE5 == "O" & movimientoF6 == "O" || movimientoF1 == "O" & movimientoE2 == "O" & movimientoD3 == "O" & movimientoC4 == "O" || movimientoE1 == "O" & movimientoD2 == "O" & movimientoC3 == "O" & movimientoB4 == "O" || movimientoD1 == "O" & movimientoC2 == "O" & movimientoB3 == "O" & movimientoA4 == "O" || movimientoF2 == "O" & movimientoE3 == "O" & movimientoD4 == "O" & movimientoC5 == "O" || movimientoE2 == "O" & movimientoD3 == "O" & movimientoC4 == "O" & movimientoB5 == "O" || movimientoD2 == "O" & movimientoC3 == "O" & movimientoB4 == "O" & movimientoA5 == "O" || movimientoF3 == "O" & movimientoE4 == "O" & movimientoD5 == "O" & movimientoC6 == "O" || movimientoE3 == "O" & movimientoD4 == "O" & movimientoC5 == "O" & movimientoB6 == "O" || movimientoD3 == "O" & movimientoC4 == "O" & movimientoB5 == "O" & movimientoA6 == "O"){
                    ganador = true;
                    Texto2.setText("Ganador O");
                }else{
                    if(!jugadaA1 & !jugadaA2 & !jugadaA3 & !jugadaA4 & !jugadaA5 & !jugadaA6 & !jugadaB1 & !jugadaB2 & !jugadaB3 & !jugadaB4 & !jugadaB5 & !jugadaB6 & !jugadaC1 & !jugadaC2 & !jugadaC3 & !jugadaC4 & !jugadaC5 & !jugadaC6 & !jugadaD1 & !jugadaD2 & !jugadaD3 & !jugadaD4 & !jugadaD5 & !jugadaD6 & !jugadaE1 & !jugadaE2 & !jugadaE3 & !jugadaE4 & !jugadaE5 & !jugadaE6 & !jugadaF1 & !jugadaF2 & !jugadaF3 & !jugadaF4 & !jugadaF5 & !jugadaF6){
                        ganador = true;
                        Texto2.setText("Ganador Gato");
                    }
                }
            }
        }
    }

    public void pulsarBoton3(View v) {
        if (!ganador){
            if (jugadaA3){
                if (cambiar) {
                    botonA3.setText("X");
                    Texto1.setText("GATO Turno: O");
                    movimientoA3 = "X";
                    cambiar = false;
                    jugadaA3 = false;
                } else {
                    botonA3.setText("O");
                    Texto1.setText("GATO Turno: X");
                    movimientoA3 = "O";
                    cambiar = true;
                    jugadaA3 = false;
                }
            } else{
                if (jugadaB3){
                    if (cambiar) {
                        botonB3.setText("X");
                        Texto1.setText("GATO Turno: O");
                        movimientoB3 ="X";
                        cambiar = false;
                        jugadaB3 =false;
                    } else {
                        botonB3.setText("O");
                        Texto1.setText("GATO Turno: X");
                        movimientoB3 ="O";
                        cambiar = true;
                        jugadaB3 =false;
                    }
                }else{
                    if (jugadaC3){
                        if (cambiar) {
                            botonC3.setText("X");
                            Texto1.setText("GATO Turno: O");
                            movimientoC3 ="X";
                            cambiar = false;
                            jugadaC3 =false;
                        } else {
                            botonC3.setText("O");
                            Texto1.setText("GATO Turno: X");
                            movimientoC3 ="O";
                            cambiar = true;
                            jugadaC3 =false;
                        }
                    }else{
                        if (jugadaD3){
                            if (cambiar) {
                                botonD3.setText("X");
                                Texto1.setText("GATO Turno: O");
                                movimientoD3 ="X";
                                cambiar = false;
                                jugadaD3 =false;
                            } else {
                                botonD3.setText("O");
                                Texto1.setText("GATO Turno: X");
                                movimientoD3 ="O";
                                cambiar = true;
                                jugadaD3 =false;
                            }
                        }else{
                            if (jugadaE3){
                                if (cambiar) {
                                    botonE3.setText("X");
                                    Texto1.setText("GATO Turno: O");
                                    movimientoE3 ="X";
                                    cambiar = false;
                                    jugadaE3 =false;
                                } else {
                                    botonE3.setText("O");
                                    Texto1.setText("GATO Turno: X");
                                    movimientoE3 ="O";
                                    cambiar = true;
                                    jugadaE3 =false;
                                }
                            }else{
                                if (jugadaF3){
                                    if (cambiar) {
                                        botonF3.setText("X");
                                        Texto1.setText("GATO Turno: O");
                                        movimientoF3 ="X";
                                        cambiar = false;
                                        jugadaF3 =false;
                                    } else {
                                        botonF3.setText("O");
                                        Texto1.setText("GATO Turno: X");
                                        movimientoF3 ="O";
                                        cambiar = true;
                                        jugadaF3 =false;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if(movimientoA1 == "X" & movimientoA2 == "X" & movimientoA3 == "X" & movimientoA4 == "X" || movimientoA2 == "X" & movimientoA3 == "X" & movimientoA4 == "X" & movimientoA5 == "X" || movimientoA3 == "X" & movimientoA4 == "X" & movimientoA5 == "X" & movimientoA6 == "X" || movimientoB1 == "X" & movimientoB2 == "X" & movimientoB3 == "X" & movimientoB4 == "X" || movimientoB2 == "X" & movimientoB3 == "X" & movimientoB4 == "X" & movimientoB5 == "X" || movimientoB3 == "X" & movimientoB4 == "X" & movimientoB5 == "X" & movimientoB6 == "X" || movimientoC1 == "X" & movimientoC2 == "X" & movimientoC3 == "X" & movimientoC4 == "X" || movimientoC2 == "X" & movimientoC3 == "X" & movimientoC4 == "X" & movimientoC5 == "X" || movimientoC3 == "X" & movimientoC4 == "X" & movimientoC5 == "X" & movimientoC6 == "X" || movimientoD1 == "X" & movimientoD2 == "X" & movimientoD3 == "X" & movimientoD4 == "X" || movimientoD2 == "X" & movimientoD3 == "X" & movimientoD4 == "X" & movimientoD5 == "X" || movimientoD3 == "X" & movimientoD4 == "X" & movimientoD5 == "X" & movimientoD6 == "X" || movimientoE1 == "X" & movimientoE2 == "X" & movimientoE3 == "X" & movimientoE4 == "X" || movimientoE2 == "X" & movimientoE3 == "X" & movimientoE4 == "X" & movimientoE5 == "X" || movimientoE3 == "X" & movimientoE4 == "X" & movimientoE5 == "X" & movimientoE6 == "X" || movimientoF1 == "X" & movimientoF2 == "X" & movimientoF3 == "X" & movimientoF4 == "X" || movimientoF2 == "X" & movimientoF3 == "X" & movimientoF4 == "X" & movimientoF5 == "X" || movimientoF3 == "X" & movimientoF4 == "X" & movimientoF5 == "X" & movimientoF6 == "X" || movimientoA1 == "X" & movimientoB1 == "X" & movimientoC1 == "X" & movimientoD1 == "X" || movimientoB1 == "X" & movimientoC1 == "X" & movimientoD1 == "X" & movimientoE1 == "X" || movimientoC1 == "X" & movimientoD1 == "X" & movimientoE1 == "X" & movimientoF1 == "X" || movimientoA2 == "X" & movimientoB2 == "X" & movimientoC2 == "X" & movimientoD2 == "X" || movimientoB2 == "X" & movimientoC2 == "X" & movimientoD2 == "X" & movimientoE2 == "X" || movimientoC2 == "X" & movimientoD2 == "X" & movimientoE2 == "X" & movimientoF2 == "X" || movimientoA3 == "X" & movimientoB3 == "X" & movimientoC3 == "X" & movimientoD3 == "X" || movimientoB3 == "X" & movimientoC3 == "X" & movimientoD3 == "X" & movimientoE3 == "X" || movimientoC3 == "X" & movimientoD3 == "X" & movimientoE3 == "X" & movimientoF3 == "X" || movimientoA4 == "X" & movimientoB4 == "X" & movimientoC4 == "X" & movimientoD4 == "X" || movimientoB4 == "X" & movimientoC4 == "X" & movimientoD4 == "X" & movimientoE4 == "X" || movimientoC4 == "X" & movimientoD4 == "X" & movimientoE4 == "X" & movimientoF4 == "X" || movimientoA5 == "X" & movimientoB5 == "X" & movimientoC5 == "X" & movimientoD5 == "X" || movimientoB5 == "X" & movimientoC5 == "X" & movimientoD5 == "X" & movimientoE5 == "X" || movimientoC5 == "X" & movimientoD5 == "X" & movimientoE5 == "X" & movimientoF5 == "X" || movimientoA6 == "X" & movimientoB6 == "X" & movimientoC6 == "X" & movimientoD6 == "X" || movimientoB6 == "X" & movimientoC6 == "X" & movimientoD6 == "X" & movimientoE6 == "X" || movimientoC6 == "X" & movimientoD6 == "X" & movimientoE6 == "X" & movimientoF6 == "X" || movimientoA1 == "X" & movimientoB2 == "X" & movimientoC3 == "X" & movimientoD4 == "X" || movimientoB1 == "X" & movimientoC2 == "X" & movimientoD3 == "X" & movimientoE4 == "X" || movimientoC1 == "X" & movimientoD2 == "X" & movimientoE3 == "X" & movimientoF4 == "X" || movimientoA2 == "X" & movimientoB3 == "X" & movimientoC4 == "X" & movimientoD5 == "X" || movimientoB2 == "X" & movimientoC3 == "X" & movimientoD4 == "X" & movimientoE5 == "X" || movimientoC2 == "X" & movimientoD3 == "X" & movimientoE4 == "X" & movimientoF5 == "X" || movimientoA3 == "X" & movimientoB4 == "X" & movimientoC5 == "X" & movimientoD6 == "X" || movimientoB3 == "X" & movimientoC4 == "X" & movimientoD5 == "X" & movimientoE6 == "X" || movimientoC3 == "X" & movimientoD4 == "X" & movimientoE5 == "X" & movimientoF6 == "X" || movimientoF1 == "X" & movimientoE2 == "X" & movimientoD3 == "X" & movimientoC4 == "X" || movimientoE1 == "X" & movimientoD2 == "X" & movimientoC3 == "X" & movimientoB4 == "X" || movimientoD1 == "X" & movimientoC2 == "X" & movimientoB3 == "X" & movimientoA4 == "X" || movimientoF2 == "X" & movimientoE3 == "X" & movimientoD4 == "X" & movimientoC5 == "X" || movimientoE2 == "X" & movimientoD3 == "X" & movimientoC4 == "X" & movimientoB5 == "X" || movimientoD2 == "X" & movimientoC3 == "X" & movimientoB4 == "X" & movimientoA5 == "X" || movimientoF3 == "X" & movimientoE4 == "X" & movimientoD5 == "X" & movimientoC6 == "X" || movimientoE3 == "X" & movimientoD4 == "X" & movimientoC5 == "X" & movimientoB6 == "X" || movimientoD3 == "X" & movimientoC4 == "X" & movimientoB5 == "X" & movimientoA6 == "X"){
                ganador = true;
                Texto2.setText("Ganador X");

            }else{
                if(movimientoA1 == "O" & movimientoA2 == "O" & movimientoA3 == "O" & movimientoA4 == "O" || movimientoA2 == "O" & movimientoA3 == "O" & movimientoA4 == "O" & movimientoA5 == "O" || movimientoA3 == "O" & movimientoA4 == "O" & movimientoA5 == "O" & movimientoA6 == "O" || movimientoB1 == "O" & movimientoB2 == "O" & movimientoB3 == "O" & movimientoB4 == "O" || movimientoB2 == "O" & movimientoB3 == "O" & movimientoB4 == "O" & movimientoB5 == "O" || movimientoB3 == "O" & movimientoB4 == "O" & movimientoB5 == "O" & movimientoB6 == "O" || movimientoC1 == "O" & movimientoC2 == "O" & movimientoC3 == "O" & movimientoC4 == "O" || movimientoC2 == "O" & movimientoC3 == "O" & movimientoC4 == "O" & movimientoC5 == "O" || movimientoC3 == "O" & movimientoC4 == "O" & movimientoC5 == "O" & movimientoC6 == "O" || movimientoD1 == "O" & movimientoD2 == "O" & movimientoD3 == "O" & movimientoD4 == "O" || movimientoD2 == "O" & movimientoD3 == "O" & movimientoD4 == "O" & movimientoD5 == "O" || movimientoD3 == "O" & movimientoD4 == "O" & movimientoD5 == "O" & movimientoD6 == "O" || movimientoE1 == "O" & movimientoE2 == "O" & movimientoE3 == "O" & movimientoE4 == "O" || movimientoE2 == "O" & movimientoE3 == "O" & movimientoE4 == "O" & movimientoE5 == "O" || movimientoE3 == "O" & movimientoE4 == "O" & movimientoE5 == "O" & movimientoE6 == "O" || movimientoF1 == "O" & movimientoF2 == "O" & movimientoF3 == "O" & movimientoF4 == "O" || movimientoF2 == "O" & movimientoF3 == "O" & movimientoF4 == "O" & movimientoF5 == "O" || movimientoF3 == "O" & movimientoF4 == "O" & movimientoF5 == "O" & movimientoF6 == "O" || movimientoA1 == "O" & movimientoB1 == "O" & movimientoC1 == "O" & movimientoD1 == "O" || movimientoB1 == "O" & movimientoC1 == "O" & movimientoD1 == "O" & movimientoE1 == "O" || movimientoC1 == "O" & movimientoD1 == "O" & movimientoE1 == "O" & movimientoF1 == "O" || movimientoA2 == "O" & movimientoB2 == "O" & movimientoC2 == "O" & movimientoD2 == "O" || movimientoB2 == "O" & movimientoC2 == "O" & movimientoD2 == "O" & movimientoE2 == "O" || movimientoC2 == "O" & movimientoD2 == "O" & movimientoE2 == "O" & movimientoF2 == "O" || movimientoA3 == "O" & movimientoB3 == "O" & movimientoC3 == "O" & movimientoD3 == "O" || movimientoB3 == "O" & movimientoC3 == "O" & movimientoD3 == "O" & movimientoE3 == "O" || movimientoC3 == "O" & movimientoD3 == "O" & movimientoE3 == "O" & movimientoF3 == "O" || movimientoA4 == "O" & movimientoB4 == "O" & movimientoC4 == "O" & movimientoD4 == "O" || movimientoB4 == "O" & movimientoC4 == "O" & movimientoD4 == "O" & movimientoE4 == "O" || movimientoC4 == "O" & movimientoD4 == "O" & movimientoE4 == "O" & movimientoF4 == "O" || movimientoA5 == "O" & movimientoB5 == "O" & movimientoC5 == "O" & movimientoD5 == "O" || movimientoB5 == "O" & movimientoC5 == "O" & movimientoD5 == "O" & movimientoE5 == "O" || movimientoC5 == "O" & movimientoD5 == "O" & movimientoE5 == "O" & movimientoF5 == "O" || movimientoA6 == "O" & movimientoB6 == "O" & movimientoC6 == "O" & movimientoD6 == "O" || movimientoB6 == "O" & movimientoC6 == "O" & movimientoD6 == "O" & movimientoE6 == "O" || movimientoC6 == "O" & movimientoD6 == "O" & movimientoE6 == "O" & movimientoF6 == "O" || movimientoA1 == "O" & movimientoB2 == "O" & movimientoC3 == "O" & movimientoD4 == "O" || movimientoB1 == "O" & movimientoC2 == "O" & movimientoD3 == "O" & movimientoE4 == "O" || movimientoC1 == "O" & movimientoD2 == "O" & movimientoE3 == "O" & movimientoF4 == "O" || movimientoA2 == "O" & movimientoB3 == "O" & movimientoC4 == "O" & movimientoD5 == "O" || movimientoB2 == "O" & movimientoC3 == "O" & movimientoD4 == "O" & movimientoE5 == "O" || movimientoC2 == "O" & movimientoD3 == "O" & movimientoE4 == "O" & movimientoF5 == "O" || movimientoA3 == "O" & movimientoB4 == "O" & movimientoC5 == "O" & movimientoD6 == "O" || movimientoB3 == "O" & movimientoC4 == "O" & movimientoD5 == "O" & movimientoE6 == "O" || movimientoC3 == "O" & movimientoD4 == "O" & movimientoE5 == "O" & movimientoF6 == "O" || movimientoF1 == "O" & movimientoE2 == "O" & movimientoD3 == "O" & movimientoC4 == "O" || movimientoE1 == "O" & movimientoD2 == "O" & movimientoC3 == "O" & movimientoB4 == "O" || movimientoD1 == "O" & movimientoC2 == "O" & movimientoB3 == "O" & movimientoA4 == "O" || movimientoF2 == "O" & movimientoE3 == "O" & movimientoD4 == "O" & movimientoC5 == "O" || movimientoE2 == "O" & movimientoD3 == "O" & movimientoC4 == "O" & movimientoB5 == "O" || movimientoD2 == "O" & movimientoC3 == "O" & movimientoB4 == "O" & movimientoA5 == "O" || movimientoF3 == "O" & movimientoE4 == "O" & movimientoD5 == "O" & movimientoC6 == "O" || movimientoE3 == "O" & movimientoD4 == "O" & movimientoC5 == "O" & movimientoB6 == "O" || movimientoD3 == "O" & movimientoC4 == "O" & movimientoB5 == "O" & movimientoA6 == "O"){
                    ganador = true;
                    Texto2.setText("Ganador O");
                }else{
                    if(!jugadaA1 & !jugadaA2 & !jugadaA3 & !jugadaA4 & !jugadaA5 & !jugadaA6 & !jugadaB1 & !jugadaB2 & !jugadaB3 & !jugadaB4 & !jugadaB5 & !jugadaB6 & !jugadaC1 & !jugadaC2 & !jugadaC3 & !jugadaC4 & !jugadaC5 & !jugadaC6 & !jugadaD1 & !jugadaD2 & !jugadaD3 & !jugadaD4 & !jugadaD5 & !jugadaD6 & !jugadaE1 & !jugadaE2 & !jugadaE3 & !jugadaE4 & !jugadaE5 & !jugadaE6 & !jugadaF1 & !jugadaF2 & !jugadaF3 & !jugadaF4 & !jugadaF5 & !jugadaF6){
                        ganador = true;
                        Texto2.setText("Ganador Gato");
                    }
                }
            }
        }
    }

    public void pulsarBoton4(View v) {
        if (!ganador){
            if (jugadaA4){
                if (cambiar) {
                    botonA4.setText("X");
                    Texto1.setText("GATO Turno: O");
                    movimientoA4 = "X";
                    cambiar = false;
                    jugadaA4 = false;
                } else {
                    botonA4.setText("O");
                    Texto1.setText("GATO Turno: X");
                    movimientoA4 = "O";
                    cambiar = true;
                    jugadaA4 = false;
                }
            } else{
                if (jugadaB4){
                    if (cambiar) {
                        botonB4.setText("X");
                        Texto1.setText("GATO Turno: O");
                        movimientoB4 ="X";
                        cambiar = false;
                        jugadaB4 =false;
                    } else {
                        botonB4.setText("O");
                        Texto1.setText("GATO Turno: X");
                        movimientoB4 ="O";
                        cambiar = true;
                        jugadaB4 =false;
                    }
                }else{
                    if (jugadaC4){
                        if (cambiar) {
                            botonC4.setText("X");
                            Texto1.setText("GATO Turno: O");
                            movimientoC4 ="X";
                            cambiar = false;
                            jugadaC4 =false;
                        } else {
                            botonC4.setText("O");
                            Texto1.setText("GATO Turno: X");
                            movimientoC4 ="O";
                            cambiar = true;
                            jugadaC4 =false;
                        }
                    }else{
                        if (jugadaD4){
                            if (cambiar) {
                                botonD4.setText("X");
                                Texto1.setText("GATO Turno: O");
                                movimientoD4 ="X";
                                cambiar = false;
                                jugadaD4 =false;
                            } else {
                                botonD4.setText("O");
                                Texto1.setText("GATO Turno: X");
                                movimientoD4 ="O";
                                cambiar = true;
                                jugadaD4 =false;
                            }
                        }else{
                            if (jugadaE4){
                                if (cambiar) {
                                    botonE4.setText("X");
                                    Texto1.setText("GATO Turno: O");
                                    movimientoE4 ="X";
                                    cambiar = false;
                                    jugadaE4 =false;
                                } else {
                                    botonE4.setText("O");
                                    Texto1.setText("GATO Turno: X");
                                    movimientoE4 ="O";
                                    cambiar = true;
                                    jugadaE4 =false;
                                }
                            }else{
                                if (jugadaF4){
                                    if (cambiar) {
                                        botonF4.setText("X");
                                        Texto1.setText("GATO Turno: O");
                                        movimientoF4 ="X";
                                        cambiar = false;
                                        jugadaF4 =false;
                                    } else {
                                        botonF4.setText("O");
                                        Texto1.setText("GATO Turno: X");
                                        movimientoF4 ="O";
                                        cambiar = true;
                                        jugadaF4 =false;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if(movimientoA1 == "X" & movimientoA2 == "X" & movimientoA3 == "X" & movimientoA4 == "X" || movimientoA2 == "X" & movimientoA3 == "X" & movimientoA4 == "X" & movimientoA5 == "X" || movimientoA3 == "X" & movimientoA4 == "X" & movimientoA5 == "X" & movimientoA6 == "X" || movimientoB1 == "X" & movimientoB2 == "X" & movimientoB3 == "X" & movimientoB4 == "X" || movimientoB2 == "X" & movimientoB3 == "X" & movimientoB4 == "X" & movimientoB5 == "X" || movimientoB3 == "X" & movimientoB4 == "X" & movimientoB5 == "X" & movimientoB6 == "X" || movimientoC1 == "X" & movimientoC2 == "X" & movimientoC3 == "X" & movimientoC4 == "X" || movimientoC2 == "X" & movimientoC3 == "X" & movimientoC4 == "X" & movimientoC5 == "X" || movimientoC3 == "X" & movimientoC4 == "X" & movimientoC5 == "X" & movimientoC6 == "X" || movimientoD1 == "X" & movimientoD2 == "X" & movimientoD3 == "X" & movimientoD4 == "X" || movimientoD2 == "X" & movimientoD3 == "X" & movimientoD4 == "X" & movimientoD5 == "X" || movimientoD3 == "X" & movimientoD4 == "X" & movimientoD5 == "X" & movimientoD6 == "X" || movimientoE1 == "X" & movimientoE2 == "X" & movimientoE3 == "X" & movimientoE4 == "X" || movimientoE2 == "X" & movimientoE3 == "X" & movimientoE4 == "X" & movimientoE5 == "X" || movimientoE3 == "X" & movimientoE4 == "X" & movimientoE5 == "X" & movimientoE6 == "X" || movimientoF1 == "X" & movimientoF2 == "X" & movimientoF3 == "X" & movimientoF4 == "X" || movimientoF2 == "X" & movimientoF3 == "X" & movimientoF4 == "X" & movimientoF5 == "X" || movimientoF3 == "X" & movimientoF4 == "X" & movimientoF5 == "X" & movimientoF6 == "X" || movimientoA1 == "X" & movimientoB1 == "X" & movimientoC1 == "X" & movimientoD1 == "X" || movimientoB1 == "X" & movimientoC1 == "X" & movimientoD1 == "X" & movimientoE1 == "X" || movimientoC1 == "X" & movimientoD1 == "X" & movimientoE1 == "X" & movimientoF1 == "X" || movimientoA2 == "X" & movimientoB2 == "X" & movimientoC2 == "X" & movimientoD2 == "X" || movimientoB2 == "X" & movimientoC2 == "X" & movimientoD2 == "X" & movimientoE2 == "X" || movimientoC2 == "X" & movimientoD2 == "X" & movimientoE2 == "X" & movimientoF2 == "X" || movimientoA3 == "X" & movimientoB3 == "X" & movimientoC3 == "X" & movimientoD3 == "X" || movimientoB3 == "X" & movimientoC3 == "X" & movimientoD3 == "X" & movimientoE3 == "X" || movimientoC3 == "X" & movimientoD3 == "X" & movimientoE3 == "X" & movimientoF3 == "X" || movimientoA4 == "X" & movimientoB4 == "X" & movimientoC4 == "X" & movimientoD4 == "X" || movimientoB4 == "X" & movimientoC4 == "X" & movimientoD4 == "X" & movimientoE4 == "X" || movimientoC4 == "X" & movimientoD4 == "X" & movimientoE4 == "X" & movimientoF4 == "X" || movimientoA5 == "X" & movimientoB5 == "X" & movimientoC5 == "X" & movimientoD5 == "X" || movimientoB5 == "X" & movimientoC5 == "X" & movimientoD5 == "X" & movimientoE5 == "X" || movimientoC5 == "X" & movimientoD5 == "X" & movimientoE5 == "X" & movimientoF5 == "X" || movimientoA6 == "X" & movimientoB6 == "X" & movimientoC6 == "X" & movimientoD6 == "X" || movimientoB6 == "X" & movimientoC6 == "X" & movimientoD6 == "X" & movimientoE6 == "X" || movimientoC6 == "X" & movimientoD6 == "X" & movimientoE6 == "X" & movimientoF6 == "X" || movimientoA1 == "X" & movimientoB2 == "X" & movimientoC3 == "X" & movimientoD4 == "X" || movimientoB1 == "X" & movimientoC2 == "X" & movimientoD3 == "X" & movimientoE4 == "X" || movimientoC1 == "X" & movimientoD2 == "X" & movimientoE3 == "X" & movimientoF4 == "X" || movimientoA2 == "X" & movimientoB3 == "X" & movimientoC4 == "X" & movimientoD5 == "X" || movimientoB2 == "X" & movimientoC3 == "X" & movimientoD4 == "X" & movimientoE5 == "X" || movimientoC2 == "X" & movimientoD3 == "X" & movimientoE4 == "X" & movimientoF5 == "X" || movimientoA3 == "X" & movimientoB4 == "X" & movimientoC5 == "X" & movimientoD6 == "X" || movimientoB3 == "X" & movimientoC4 == "X" & movimientoD5 == "X" & movimientoE6 == "X" || movimientoC3 == "X" & movimientoD4 == "X" & movimientoE5 == "X" & movimientoF6 == "X" || movimientoF1 == "X" & movimientoE2 == "X" & movimientoD3 == "X" & movimientoC4 == "X" || movimientoE1 == "X" & movimientoD2 == "X" & movimientoC3 == "X" & movimientoB4 == "X" || movimientoD1 == "X" & movimientoC2 == "X" & movimientoB3 == "X" & movimientoA4 == "X" || movimientoF2 == "X" & movimientoE3 == "X" & movimientoD4 == "X" & movimientoC5 == "X" || movimientoE2 == "X" & movimientoD3 == "X" & movimientoC4 == "X" & movimientoB5 == "X" || movimientoD2 == "X" & movimientoC3 == "X" & movimientoB4 == "X" & movimientoA5 == "X" || movimientoF3 == "X" & movimientoE4 == "X" & movimientoD5 == "X" & movimientoC6 == "X" || movimientoE3 == "X" & movimientoD4 == "X" & movimientoC5 == "X" & movimientoB6 == "X" || movimientoD3 == "X" & movimientoC4 == "X" & movimientoB5 == "X" & movimientoA6 == "X"){
                ganador = true;
                Texto2.setText("Ganador X");

            }else{
                if(movimientoA1 == "O" & movimientoA2 == "O" & movimientoA3 == "O" & movimientoA4 == "O" || movimientoA2 == "O" & movimientoA3 == "O" & movimientoA4 == "O" & movimientoA5 == "O" || movimientoA3 == "O" & movimientoA4 == "O" & movimientoA5 == "O" & movimientoA6 == "O" || movimientoB1 == "O" & movimientoB2 == "O" & movimientoB3 == "O" & movimientoB4 == "O" || movimientoB2 == "O" & movimientoB3 == "O" & movimientoB4 == "O" & movimientoB5 == "O" || movimientoB3 == "O" & movimientoB4 == "O" & movimientoB5 == "O" & movimientoB6 == "O" || movimientoC1 == "O" & movimientoC2 == "O" & movimientoC3 == "O" & movimientoC4 == "O" || movimientoC2 == "O" & movimientoC3 == "O" & movimientoC4 == "O" & movimientoC5 == "O" || movimientoC3 == "O" & movimientoC4 == "O" & movimientoC5 == "O" & movimientoC6 == "O" || movimientoD1 == "O" & movimientoD2 == "O" & movimientoD3 == "O" & movimientoD4 == "O" || movimientoD2 == "O" & movimientoD3 == "O" & movimientoD4 == "O" & movimientoD5 == "O" || movimientoD3 == "O" & movimientoD4 == "O" & movimientoD5 == "O" & movimientoD6 == "O" || movimientoE1 == "O" & movimientoE2 == "O" & movimientoE3 == "O" & movimientoE4 == "O" || movimientoE2 == "O" & movimientoE3 == "O" & movimientoE4 == "O" & movimientoE5 == "O" || movimientoE3 == "O" & movimientoE4 == "O" & movimientoE5 == "O" & movimientoE6 == "O" || movimientoF1 == "O" & movimientoF2 == "O" & movimientoF3 == "O" & movimientoF4 == "O" || movimientoF2 == "O" & movimientoF3 == "O" & movimientoF4 == "O" & movimientoF5 == "O" || movimientoF3 == "O" & movimientoF4 == "O" & movimientoF5 == "O" & movimientoF6 == "O" || movimientoA1 == "O" & movimientoB1 == "O" & movimientoC1 == "O" & movimientoD1 == "O" || movimientoB1 == "O" & movimientoC1 == "O" & movimientoD1 == "O" & movimientoE1 == "O" || movimientoC1 == "O" & movimientoD1 == "O" & movimientoE1 == "O" & movimientoF1 == "O" || movimientoA2 == "O" & movimientoB2 == "O" & movimientoC2 == "O" & movimientoD2 == "O" || movimientoB2 == "O" & movimientoC2 == "O" & movimientoD2 == "O" & movimientoE2 == "O" || movimientoC2 == "O" & movimientoD2 == "O" & movimientoE2 == "O" & movimientoF2 == "O" || movimientoA3 == "O" & movimientoB3 == "O" & movimientoC3 == "O" & movimientoD3 == "O" || movimientoB3 == "O" & movimientoC3 == "O" & movimientoD3 == "O" & movimientoE3 == "O" || movimientoC3 == "O" & movimientoD3 == "O" & movimientoE3 == "O" & movimientoF3 == "O" || movimientoA4 == "O" & movimientoB4 == "O" & movimientoC4 == "O" & movimientoD4 == "O" || movimientoB4 == "O" & movimientoC4 == "O" & movimientoD4 == "O" & movimientoE4 == "O" || movimientoC4 == "O" & movimientoD4 == "O" & movimientoE4 == "O" & movimientoF4 == "O" || movimientoA5 == "O" & movimientoB5 == "O" & movimientoC5 == "O" & movimientoD5 == "O" || movimientoB5 == "O" & movimientoC5 == "O" & movimientoD5 == "O" & movimientoE5 == "O" || movimientoC5 == "O" & movimientoD5 == "O" & movimientoE5 == "O" & movimientoF5 == "O" || movimientoA6 == "O" & movimientoB6 == "O" & movimientoC6 == "O" & movimientoD6 == "O" || movimientoB6 == "O" & movimientoC6 == "O" & movimientoD6 == "O" & movimientoE6 == "O" || movimientoC6 == "O" & movimientoD6 == "O" & movimientoE6 == "O" & movimientoF6 == "O" || movimientoA1 == "O" & movimientoB2 == "O" & movimientoC3 == "O" & movimientoD4 == "O" || movimientoB1 == "O" & movimientoC2 == "O" & movimientoD3 == "O" & movimientoE4 == "O" || movimientoC1 == "O" & movimientoD2 == "O" & movimientoE3 == "O" & movimientoF4 == "O" || movimientoA2 == "O" & movimientoB3 == "O" & movimientoC4 == "O" & movimientoD5 == "O" || movimientoB2 == "O" & movimientoC3 == "O" & movimientoD4 == "O" & movimientoE5 == "O" || movimientoC2 == "O" & movimientoD3 == "O" & movimientoE4 == "O" & movimientoF5 == "O" || movimientoA3 == "O" & movimientoB4 == "O" & movimientoC5 == "O" & movimientoD6 == "O" || movimientoB3 == "O" & movimientoC4 == "O" & movimientoD5 == "O" & movimientoE6 == "O" || movimientoC3 == "O" & movimientoD4 == "O" & movimientoE5 == "O" & movimientoF6 == "O" || movimientoF1 == "O" & movimientoE2 == "O" & movimientoD3 == "O" & movimientoC4 == "O" || movimientoE1 == "O" & movimientoD2 == "O" & movimientoC3 == "O" & movimientoB4 == "O" || movimientoD1 == "O" & movimientoC2 == "O" & movimientoB3 == "O" & movimientoA4 == "O" || movimientoF2 == "O" & movimientoE3 == "O" & movimientoD4 == "O" & movimientoC5 == "O" || movimientoE2 == "O" & movimientoD3 == "O" & movimientoC4 == "O" & movimientoB5 == "O" || movimientoD2 == "O" & movimientoC3 == "O" & movimientoB4 == "O" & movimientoA5 == "O" || movimientoF3 == "O" & movimientoE4 == "O" & movimientoD5 == "O" & movimientoC6 == "O" || movimientoE3 == "O" & movimientoD4 == "O" & movimientoC5 == "O" & movimientoB6 == "O" || movimientoD3 == "O" & movimientoC4 == "O" & movimientoB5 == "O" & movimientoA6 == "O"){
                    ganador = true;
                    Texto2.setText("Ganador O");
                }else{
                    if(!jugadaA1 & !jugadaA2 & !jugadaA3 & !jugadaA4 & !jugadaA5 & !jugadaA6 & !jugadaB1 & !jugadaB2 & !jugadaB3 & !jugadaB4 & !jugadaB5 & !jugadaB6 & !jugadaC1 & !jugadaC2 & !jugadaC3 & !jugadaC4 & !jugadaC5 & !jugadaC6 & !jugadaD1 & !jugadaD2 & !jugadaD3 & !jugadaD4 & !jugadaD5 & !jugadaD6 & !jugadaE1 & !jugadaE2 & !jugadaE3 & !jugadaE4 & !jugadaE5 & !jugadaE6 & !jugadaF1 & !jugadaF2 & !jugadaF3 & !jugadaF4 & !jugadaF5 & !jugadaF6){
                        ganador = true;
                        Texto2.setText("Ganador Gato");
                    }
                }
            }
        }
    }

    public void pulsarBoton5(View v) {
        if (!ganador){
            if (jugadaA5){
                if (cambiar) {
                    botonA5.setText("X");
                    Texto1.setText("GATO Turno: O");
                    movimientoA5 = "X";
                    cambiar = false;
                    jugadaA5 = false;
                } else {
                    botonA5.setText("O");
                    Texto1.setText("GATO Turno: X");
                    movimientoA5 = "O";
                    cambiar = true;
                    jugadaA5 = false;
                }
            } else{
                if (jugadaB5){
                    if (cambiar) {
                        botonB5.setText("X");
                        Texto1.setText("GATO Turno: O");
                        movimientoB5 ="X";
                        cambiar = false;
                        jugadaB5 =false;
                    } else {
                        botonB5.setText("O");
                        Texto1.setText("GATO Turno: X");
                        movimientoB5 ="O";
                        cambiar = true;
                        jugadaB5 =false;
                    }
                }else{
                    if (jugadaC5){
                        if (cambiar) {
                            botonC5.setText("X");
                            Texto1.setText("GATO Turno: O");
                            movimientoC5 ="X";
                            cambiar = false;
                            jugadaC5 =false;
                        } else {
                            botonC5.setText("O");
                            Texto1.setText("GATO Turno: X");
                            movimientoC5 ="O";
                            cambiar = true;
                            jugadaC5 =false;
                        }
                    }else{
                        if (jugadaD5){
                            if (cambiar) {
                                botonD5.setText("X");
                                Texto1.setText("GATO Turno: O");
                                movimientoD5 ="X";
                                cambiar = false;
                                jugadaD5 =false;
                            } else {
                                botonD5.setText("O");
                                Texto1.setText("GATO Turno: X");
                                movimientoD5 ="O";
                                cambiar = true;
                                jugadaD5 =false;
                            }
                        }else{
                            if (jugadaE5){
                                if (cambiar) {
                                    botonE5.setText("X");
                                    Texto1.setText("GATO Turno: O");
                                    movimientoE5 ="X";
                                    cambiar = false;
                                    jugadaE5 =false;
                                } else {
                                    botonE5.setText("O");
                                    Texto1.setText("GATO Turno: X");
                                    movimientoE5 ="O";
                                    cambiar = true;
                                    jugadaE5 =false;
                                }
                            }else{
                                if (jugadaF5){
                                    if (cambiar) {
                                        botonF5.setText("X");
                                        Texto1.setText("GATO Turno: O");
                                        movimientoF5 ="X";
                                        cambiar = false;
                                        jugadaF5 =false;
                                    } else {
                                        botonF5.setText("O");
                                        Texto1.setText("GATO Turno: X");
                                        movimientoF5 ="O";
                                        cambiar = true;
                                        jugadaF5 =false;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if(movimientoA1 == "X" & movimientoA2 == "X" & movimientoA3 == "X" & movimientoA4 == "X" || movimientoA2 == "X" & movimientoA3 == "X" & movimientoA4 == "X" & movimientoA5 == "X" || movimientoA3 == "X" & movimientoA4 == "X" & movimientoA5 == "X" & movimientoA6 == "X" || movimientoB1 == "X" & movimientoB2 == "X" & movimientoB3 == "X" & movimientoB4 == "X" || movimientoB2 == "X" & movimientoB3 == "X" & movimientoB4 == "X" & movimientoB5 == "X" || movimientoB3 == "X" & movimientoB4 == "X" & movimientoB5 == "X" & movimientoB6 == "X" || movimientoC1 == "X" & movimientoC2 == "X" & movimientoC3 == "X" & movimientoC4 == "X" || movimientoC2 == "X" & movimientoC3 == "X" & movimientoC4 == "X" & movimientoC5 == "X" || movimientoC3 == "X" & movimientoC4 == "X" & movimientoC5 == "X" & movimientoC6 == "X" || movimientoD1 == "X" & movimientoD2 == "X" & movimientoD3 == "X" & movimientoD4 == "X" || movimientoD2 == "X" & movimientoD3 == "X" & movimientoD4 == "X" & movimientoD5 == "X" || movimientoD3 == "X" & movimientoD4 == "X" & movimientoD5 == "X" & movimientoD6 == "X" || movimientoE1 == "X" & movimientoE2 == "X" & movimientoE3 == "X" & movimientoE4 == "X" || movimientoE2 == "X" & movimientoE3 == "X" & movimientoE4 == "X" & movimientoE5 == "X" || movimientoE3 == "X" & movimientoE4 == "X" & movimientoE5 == "X" & movimientoE6 == "X" || movimientoF1 == "X" & movimientoF2 == "X" & movimientoF3 == "X" & movimientoF4 == "X" || movimientoF2 == "X" & movimientoF3 == "X" & movimientoF4 == "X" & movimientoF5 == "X" || movimientoF3 == "X" & movimientoF4 == "X" & movimientoF5 == "X" & movimientoF6 == "X" || movimientoA1 == "X" & movimientoB1 == "X" & movimientoC1 == "X" & movimientoD1 == "X" || movimientoB1 == "X" & movimientoC1 == "X" & movimientoD1 == "X" & movimientoE1 == "X" || movimientoC1 == "X" & movimientoD1 == "X" & movimientoE1 == "X" & movimientoF1 == "X" || movimientoA2 == "X" & movimientoB2 == "X" & movimientoC2 == "X" & movimientoD2 == "X" || movimientoB2 == "X" & movimientoC2 == "X" & movimientoD2 == "X" & movimientoE2 == "X" || movimientoC2 == "X" & movimientoD2 == "X" & movimientoE2 == "X" & movimientoF2 == "X" || movimientoA3 == "X" & movimientoB3 == "X" & movimientoC3 == "X" & movimientoD3 == "X" || movimientoB3 == "X" & movimientoC3 == "X" & movimientoD3 == "X" & movimientoE3 == "X" || movimientoC3 == "X" & movimientoD3 == "X" & movimientoE3 == "X" & movimientoF3 == "X" || movimientoA4 == "X" & movimientoB4 == "X" & movimientoC4 == "X" & movimientoD4 == "X" || movimientoB4 == "X" & movimientoC4 == "X" & movimientoD4 == "X" & movimientoE4 == "X" || movimientoC4 == "X" & movimientoD4 == "X" & movimientoE4 == "X" & movimientoF4 == "X" || movimientoA5 == "X" & movimientoB5 == "X" & movimientoC5 == "X" & movimientoD5 == "X" || movimientoB5 == "X" & movimientoC5 == "X" & movimientoD5 == "X" & movimientoE5 == "X" || movimientoC5 == "X" & movimientoD5 == "X" & movimientoE5 == "X" & movimientoF5 == "X" || movimientoA6 == "X" & movimientoB6 == "X" & movimientoC6 == "X" & movimientoD6 == "X" || movimientoB6 == "X" & movimientoC6 == "X" & movimientoD6 == "X" & movimientoE6 == "X" || movimientoC6 == "X" & movimientoD6 == "X" & movimientoE6 == "X" & movimientoF6 == "X" || movimientoA1 == "X" & movimientoB2 == "X" & movimientoC3 == "X" & movimientoD4 == "X" || movimientoB1 == "X" & movimientoC2 == "X" & movimientoD3 == "X" & movimientoE4 == "X" || movimientoC1 == "X" & movimientoD2 == "X" & movimientoE3 == "X" & movimientoF4 == "X" || movimientoA2 == "X" & movimientoB3 == "X" & movimientoC4 == "X" & movimientoD5 == "X" || movimientoB2 == "X" & movimientoC3 == "X" & movimientoD4 == "X" & movimientoE5 == "X" || movimientoC2 == "X" & movimientoD3 == "X" & movimientoE4 == "X" & movimientoF5 == "X" || movimientoA3 == "X" & movimientoB4 == "X" & movimientoC5 == "X" & movimientoD6 == "X" || movimientoB3 == "X" & movimientoC4 == "X" & movimientoD5 == "X" & movimientoE6 == "X" || movimientoC3 == "X" & movimientoD4 == "X" & movimientoE5 == "X" & movimientoF6 == "X" || movimientoF1 == "X" & movimientoE2 == "X" & movimientoD3 == "X" & movimientoC4 == "X" || movimientoE1 == "X" & movimientoD2 == "X" & movimientoC3 == "X" & movimientoB4 == "X" || movimientoD1 == "X" & movimientoC2 == "X" & movimientoB3 == "X" & movimientoA4 == "X" || movimientoF2 == "X" & movimientoE3 == "X" & movimientoD4 == "X" & movimientoC5 == "X" || movimientoE2 == "X" & movimientoD3 == "X" & movimientoC4 == "X" & movimientoB5 == "X" || movimientoD2 == "X" & movimientoC3 == "X" & movimientoB4 == "X" & movimientoA5 == "X" || movimientoF3 == "X" & movimientoE4 == "X" & movimientoD5 == "X" & movimientoC6 == "X" || movimientoE3 == "X" & movimientoD4 == "X" & movimientoC5 == "X" & movimientoB6 == "X" || movimientoD3 == "X" & movimientoC4 == "X" & movimientoB5 == "X" & movimientoA6 == "X"){
                ganador = true;
                Texto2.setText("Ganador X");

            }else{
                if(movimientoA1 == "O" & movimientoA2 == "O" & movimientoA3 == "O" & movimientoA4 == "O" || movimientoA2 == "O" & movimientoA3 == "O" & movimientoA4 == "O" & movimientoA5 == "O" || movimientoA3 == "O" & movimientoA4 == "O" & movimientoA5 == "O" & movimientoA6 == "O" || movimientoB1 == "O" & movimientoB2 == "O" & movimientoB3 == "O" & movimientoB4 == "O" || movimientoB2 == "O" & movimientoB3 == "O" & movimientoB4 == "O" & movimientoB5 == "O" || movimientoB3 == "O" & movimientoB4 == "O" & movimientoB5 == "O" & movimientoB6 == "O" || movimientoC1 == "O" & movimientoC2 == "O" & movimientoC3 == "O" & movimientoC4 == "O" || movimientoC2 == "O" & movimientoC3 == "O" & movimientoC4 == "O" & movimientoC5 == "O" || movimientoC3 == "O" & movimientoC4 == "O" & movimientoC5 == "O" & movimientoC6 == "O" || movimientoD1 == "O" & movimientoD2 == "O" & movimientoD3 == "O" & movimientoD4 == "O" || movimientoD2 == "O" & movimientoD3 == "O" & movimientoD4 == "O" & movimientoD5 == "O" || movimientoD3 == "O" & movimientoD4 == "O" & movimientoD5 == "O" & movimientoD6 == "O" || movimientoE1 == "O" & movimientoE2 == "O" & movimientoE3 == "O" & movimientoE4 == "O" || movimientoE2 == "O" & movimientoE3 == "O" & movimientoE4 == "O" & movimientoE5 == "O" || movimientoE3 == "O" & movimientoE4 == "O" & movimientoE5 == "O" & movimientoE6 == "O" || movimientoF1 == "O" & movimientoF2 == "O" & movimientoF3 == "O" & movimientoF4 == "O" || movimientoF2 == "O" & movimientoF3 == "O" & movimientoF4 == "O" & movimientoF5 == "O" || movimientoF3 == "O" & movimientoF4 == "O" & movimientoF5 == "O" & movimientoF6 == "O" || movimientoA1 == "O" & movimientoB1 == "O" & movimientoC1 == "O" & movimientoD1 == "O" || movimientoB1 == "O" & movimientoC1 == "O" & movimientoD1 == "O" & movimientoE1 == "O" || movimientoC1 == "O" & movimientoD1 == "O" & movimientoE1 == "O" & movimientoF1 == "O" || movimientoA2 == "O" & movimientoB2 == "O" & movimientoC2 == "O" & movimientoD2 == "O" || movimientoB2 == "O" & movimientoC2 == "O" & movimientoD2 == "O" & movimientoE2 == "O" || movimientoC2 == "O" & movimientoD2 == "O" & movimientoE2 == "O" & movimientoF2 == "O" || movimientoA3 == "O" & movimientoB3 == "O" & movimientoC3 == "O" & movimientoD3 == "O" || movimientoB3 == "O" & movimientoC3 == "O" & movimientoD3 == "O" & movimientoE3 == "O" || movimientoC3 == "O" & movimientoD3 == "O" & movimientoE3 == "O" & movimientoF3 == "O" || movimientoA4 == "O" & movimientoB4 == "O" & movimientoC4 == "O" & movimientoD4 == "O" || movimientoB4 == "O" & movimientoC4 == "O" & movimientoD4 == "O" & movimientoE4 == "O" || movimientoC4 == "O" & movimientoD4 == "O" & movimientoE4 == "O" & movimientoF4 == "O" || movimientoA5 == "O" & movimientoB5 == "O" & movimientoC5 == "O" & movimientoD5 == "O" || movimientoB5 == "O" & movimientoC5 == "O" & movimientoD5 == "O" & movimientoE5 == "O" || movimientoC5 == "O" & movimientoD5 == "O" & movimientoE5 == "O" & movimientoF5 == "O" || movimientoA6 == "O" & movimientoB6 == "O" & movimientoC6 == "O" & movimientoD6 == "O" || movimientoB6 == "O" & movimientoC6 == "O" & movimientoD6 == "O" & movimientoE6 == "O" || movimientoC6 == "O" & movimientoD6 == "O" & movimientoE6 == "O" & movimientoF6 == "O" || movimientoA1 == "O" & movimientoB2 == "O" & movimientoC3 == "O" & movimientoD4 == "O" || movimientoB1 == "O" & movimientoC2 == "O" & movimientoD3 == "O" & movimientoE4 == "O" || movimientoC1 == "O" & movimientoD2 == "O" & movimientoE3 == "O" & movimientoF4 == "O" || movimientoA2 == "O" & movimientoB3 == "O" & movimientoC4 == "O" & movimientoD5 == "O" || movimientoB2 == "O" & movimientoC3 == "O" & movimientoD4 == "O" & movimientoE5 == "O" || movimientoC2 == "O" & movimientoD3 == "O" & movimientoE4 == "O" & movimientoF5 == "O" || movimientoA3 == "O" & movimientoB4 == "O" & movimientoC5 == "O" & movimientoD6 == "O" || movimientoB3 == "O" & movimientoC4 == "O" & movimientoD5 == "O" & movimientoE6 == "O" || movimientoC3 == "O" & movimientoD4 == "O" & movimientoE5 == "O" & movimientoF6 == "O" || movimientoF1 == "O" & movimientoE2 == "O" & movimientoD3 == "O" & movimientoC4 == "O" || movimientoE1 == "O" & movimientoD2 == "O" & movimientoC3 == "O" & movimientoB4 == "O" || movimientoD1 == "O" & movimientoC2 == "O" & movimientoB3 == "O" & movimientoA4 == "O" || movimientoF2 == "O" & movimientoE3 == "O" & movimientoD4 == "O" & movimientoC5 == "O" || movimientoE2 == "O" & movimientoD3 == "O" & movimientoC4 == "O" & movimientoB5 == "O" || movimientoD2 == "O" & movimientoC3 == "O" & movimientoB4 == "O" & movimientoA5 == "O" || movimientoF3 == "O" & movimientoE4 == "O" & movimientoD5 == "O" & movimientoC6 == "O" || movimientoE3 == "O" & movimientoD4 == "O" & movimientoC5 == "O" & movimientoB6 == "O" || movimientoD3 == "O" & movimientoC4 == "O" & movimientoB5 == "O" & movimientoA6 == "O"){
                    ganador = true;
                    Texto2.setText("Ganador O");
                }else{
                    if(!jugadaA1 & !jugadaA2 & !jugadaA3 & !jugadaA4 & !jugadaA5 & !jugadaA6 & !jugadaB1 & !jugadaB2 & !jugadaB3 & !jugadaB4 & !jugadaB5 & !jugadaB6 & !jugadaC1 & !jugadaC2 & !jugadaC3 & !jugadaC4 & !jugadaC5 & !jugadaC6 & !jugadaD1 & !jugadaD2 & !jugadaD3 & !jugadaD4 & !jugadaD5 & !jugadaD6 & !jugadaE1 & !jugadaE2 & !jugadaE3 & !jugadaE4 & !jugadaE5 & !jugadaE6 & !jugadaF1 & !jugadaF2 & !jugadaF3 & !jugadaF4 & !jugadaF5 & !jugadaF6){
                        ganador = true;
                        Texto2.setText("Ganador Gato");
                    }
                }
            }
        }
    }

    public void pulsarBoton6(View v) {
        if (!ganador){
            if (jugadaA6){
                if (cambiar) {
                    botonA6.setText("X");
                    Texto1.setText("GATO Turno: O");
                    movimientoA6 = "X";
                    cambiar = false;
                    jugadaA6 = false;
                } else {
                    botonA6.setText("O");
                    Texto1.setText("GATO Turno: X");
                    movimientoA6 = "O";
                    cambiar = true;
                    jugadaA6 = false;
                }
            } else{
                if (jugadaB6){
                    if (cambiar) {
                        botonB6.setText("X");
                        Texto1.setText("GATO Turno: O");
                        movimientoB6 ="X";
                        cambiar = false;
                        jugadaB6 =false;
                    } else {
                        botonB6.setText("O");
                        Texto1.setText("GATO Turno: X");
                        movimientoB6 ="O";
                        cambiar = true;
                        jugadaB6 =false;
                    }
                }else{
                    if (jugadaC6){
                        if (cambiar) {
                            botonC6.setText("X");
                            Texto1.setText("GATO Turno: O");
                            movimientoC6 ="X";
                            cambiar = false;
                            jugadaC6 =false;
                        } else {
                            botonC6.setText("O");
                            Texto1.setText("GATO Turno: X");
                            movimientoC6 ="O";
                            cambiar = true;
                            jugadaC6 =false;
                        }
                    }else{
                        if (jugadaD6){
                            if (cambiar) {
                                botonD6.setText("X");
                                Texto1.setText("GATO Turno: O");
                                movimientoD6 ="X";
                                cambiar = false;
                                jugadaD6 =false;
                            } else {
                                botonD6.setText("O");
                                Texto1.setText("GATO Turno: X");
                                movimientoD6 ="O";
                                cambiar = true;
                                jugadaD6 =false;
                            }
                        }else{
                            if (jugadaE6){
                                if (cambiar) {
                                    botonE6.setText("X");
                                    Texto1.setText("GATO Turno: O");
                                    movimientoE6 ="X";
                                    cambiar = false;
                                    jugadaE6 =false;
                                } else {
                                    botonE6.setText("O");
                                    Texto1.setText("GATO Turno: X");
                                    movimientoE6 ="O";
                                    cambiar = true;
                                    jugadaE6 =false;
                                }
                            }else{
                                if (jugadaF6){
                                    if (cambiar) {
                                        botonF6.setText("X");
                                        Texto1.setText("GATO Turno: O");
                                        movimientoF6 ="X";
                                        cambiar = false;
                                        jugadaF6 =false;
                                    } else {
                                        botonF6.setText("O");
                                        Texto1.setText("GATO Turno: X");
                                        movimientoF6 ="O";
                                        cambiar = true;
                                        jugadaF6 =false;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if(movimientoA1 == "X" & movimientoA2 == "X" & movimientoA3 == "X" & movimientoA4 == "X" || movimientoA2 == "X" & movimientoA3 == "X" & movimientoA4 == "X" & movimientoA5 == "X" || movimientoA3 == "X" & movimientoA4 == "X" & movimientoA5 == "X" & movimientoA6 == "X" || movimientoB1 == "X" & movimientoB2 == "X" & movimientoB3 == "X" & movimientoB4 == "X" || movimientoB2 == "X" & movimientoB3 == "X" & movimientoB4 == "X" & movimientoB5 == "X" || movimientoB3 == "X" & movimientoB4 == "X" & movimientoB5 == "X" & movimientoB6 == "X" || movimientoC1 == "X" & movimientoC2 == "X" & movimientoC3 == "X" & movimientoC4 == "X" || movimientoC2 == "X" & movimientoC3 == "X" & movimientoC4 == "X" & movimientoC5 == "X" || movimientoC3 == "X" & movimientoC4 == "X" & movimientoC5 == "X" & movimientoC6 == "X" || movimientoD1 == "X" & movimientoD2 == "X" & movimientoD3 == "X" & movimientoD4 == "X" || movimientoD2 == "X" & movimientoD3 == "X" & movimientoD4 == "X" & movimientoD5 == "X" || movimientoD3 == "X" & movimientoD4 == "X" & movimientoD5 == "X" & movimientoD6 == "X" || movimientoE1 == "X" & movimientoE2 == "X" & movimientoE3 == "X" & movimientoE4 == "X" || movimientoE2 == "X" & movimientoE3 == "X" & movimientoE4 == "X" & movimientoE5 == "X" || movimientoE3 == "X" & movimientoE4 == "X" & movimientoE5 == "X" & movimientoE6 == "X" || movimientoF1 == "X" & movimientoF2 == "X" & movimientoF3 == "X" & movimientoF4 == "X" || movimientoF2 == "X" & movimientoF3 == "X" & movimientoF4 == "X" & movimientoF5 == "X" || movimientoF3 == "X" & movimientoF4 == "X" & movimientoF5 == "X" & movimientoF6 == "X" || movimientoA1 == "X" & movimientoB1 == "X" & movimientoC1 == "X" & movimientoD1 == "X" || movimientoB1 == "X" & movimientoC1 == "X" & movimientoD1 == "X" & movimientoE1 == "X" || movimientoC1 == "X" & movimientoD1 == "X" & movimientoE1 == "X" & movimientoF1 == "X" || movimientoA2 == "X" & movimientoB2 == "X" & movimientoC2 == "X" & movimientoD2 == "X" || movimientoB2 == "X" & movimientoC2 == "X" & movimientoD2 == "X" & movimientoE2 == "X" || movimientoC2 == "X" & movimientoD2 == "X" & movimientoE2 == "X" & movimientoF2 == "X" || movimientoA3 == "X" & movimientoB3 == "X" & movimientoC3 == "X" & movimientoD3 == "X" || movimientoB3 == "X" & movimientoC3 == "X" & movimientoD3 == "X" & movimientoE3 == "X" || movimientoC3 == "X" & movimientoD3 == "X" & movimientoE3 == "X" & movimientoF3 == "X" || movimientoA4 == "X" & movimientoB4 == "X" & movimientoC4 == "X" & movimientoD4 == "X" || movimientoB4 == "X" & movimientoC4 == "X" & movimientoD4 == "X" & movimientoE4 == "X" || movimientoC4 == "X" & movimientoD4 == "X" & movimientoE4 == "X" & movimientoF4 == "X" || movimientoA5 == "X" & movimientoB5 == "X" & movimientoC5 == "X" & movimientoD5 == "X" || movimientoB5 == "X" & movimientoC5 == "X" & movimientoD5 == "X" & movimientoE5 == "X" || movimientoC5 == "X" & movimientoD5 == "X" & movimientoE5 == "X" & movimientoF5 == "X" || movimientoA6 == "X" & movimientoB6 == "X" & movimientoC6 == "X" & movimientoD6 == "X" || movimientoB6 == "X" & movimientoC6 == "X" & movimientoD6 == "X" & movimientoE6 == "X" || movimientoC6 == "X" & movimientoD6 == "X" & movimientoE6 == "X" & movimientoF6 == "X" || movimientoA1 == "X" & movimientoB2 == "X" & movimientoC3 == "X" & movimientoD4 == "X" || movimientoB1 == "X" & movimientoC2 == "X" & movimientoD3 == "X" & movimientoE4 == "X" || movimientoC1 == "X" & movimientoD2 == "X" & movimientoE3 == "X" & movimientoF4 == "X" || movimientoA2 == "X" & movimientoB3 == "X" & movimientoC4 == "X" & movimientoD5 == "X" || movimientoB2 == "X" & movimientoC3 == "X" & movimientoD4 == "X" & movimientoE5 == "X" || movimientoC2 == "X" & movimientoD3 == "X" & movimientoE4 == "X" & movimientoF5 == "X" || movimientoA3 == "X" & movimientoB4 == "X" & movimientoC5 == "X" & movimientoD6 == "X" || movimientoB3 == "X" & movimientoC4 == "X" & movimientoD5 == "X" & movimientoE6 == "X" || movimientoC3 == "X" & movimientoD4 == "X" & movimientoE5 == "X" & movimientoF6 == "X" || movimientoF1 == "X" & movimientoE2 == "X" & movimientoD3 == "X" & movimientoC4 == "X" || movimientoE1 == "X" & movimientoD2 == "X" & movimientoC3 == "X" & movimientoB4 == "X" || movimientoD1 == "X" & movimientoC2 == "X" & movimientoB3 == "X" & movimientoA4 == "X" || movimientoF2 == "X" & movimientoE3 == "X" & movimientoD4 == "X" & movimientoC5 == "X" || movimientoE2 == "X" & movimientoD3 == "X" & movimientoC4 == "X" & movimientoB5 == "X" || movimientoD2 == "X" & movimientoC3 == "X" & movimientoB4 == "X" & movimientoA5 == "X" || movimientoF3 == "X" & movimientoE4 == "X" & movimientoD5 == "X" & movimientoC6 == "X" || movimientoE3 == "X" & movimientoD4 == "X" & movimientoC5 == "X" & movimientoB6 == "X" || movimientoD3 == "X" & movimientoC4 == "X" & movimientoB5 == "X" & movimientoA6 == "X"){
                ganador = true;
                Texto2.setText("Ganador X");

            }else{
                if(movimientoA1 == "O" & movimientoA2 == "O" & movimientoA3 == "O" & movimientoA4 == "O" || movimientoA2 == "O" & movimientoA3 == "O" & movimientoA4 == "O" & movimientoA5 == "O" || movimientoA3 == "O" & movimientoA4 == "O" & movimientoA5 == "O" & movimientoA6 == "O" || movimientoB1 == "O" & movimientoB2 == "O" & movimientoB3 == "O" & movimientoB4 == "O" || movimientoB2 == "O" & movimientoB3 == "O" & movimientoB4 == "O" & movimientoB5 == "O" || movimientoB3 == "O" & movimientoB4 == "O" & movimientoB5 == "O" & movimientoB6 == "O" || movimientoC1 == "O" & movimientoC2 == "O" & movimientoC3 == "O" & movimientoC4 == "O" || movimientoC2 == "O" & movimientoC3 == "O" & movimientoC4 == "O" & movimientoC5 == "O" || movimientoC3 == "O" & movimientoC4 == "O" & movimientoC5 == "O" & movimientoC6 == "O" || movimientoD1 == "O" & movimientoD2 == "O" & movimientoD3 == "O" & movimientoD4 == "O" || movimientoD2 == "O" & movimientoD3 == "O" & movimientoD4 == "O" & movimientoD5 == "O" || movimientoD3 == "O" & movimientoD4 == "O" & movimientoD5 == "O" & movimientoD6 == "O" || movimientoE1 == "O" & movimientoE2 == "O" & movimientoE3 == "O" & movimientoE4 == "O" || movimientoE2 == "O" & movimientoE3 == "O" & movimientoE4 == "O" & movimientoE5 == "O" || movimientoE3 == "O" & movimientoE4 == "O" & movimientoE5 == "O" & movimientoE6 == "O" || movimientoF1 == "O" & movimientoF2 == "O" & movimientoF3 == "O" & movimientoF4 == "O" || movimientoF2 == "O" & movimientoF3 == "O" & movimientoF4 == "O" & movimientoF5 == "O" || movimientoF3 == "O" & movimientoF4 == "O" & movimientoF5 == "O" & movimientoF6 == "O" || movimientoA1 == "O" & movimientoB1 == "O" & movimientoC1 == "O" & movimientoD1 == "O" || movimientoB1 == "O" & movimientoC1 == "O" & movimientoD1 == "O" & movimientoE1 == "O" || movimientoC1 == "O" & movimientoD1 == "O" & movimientoE1 == "O" & movimientoF1 == "O" || movimientoA2 == "O" & movimientoB2 == "O" & movimientoC2 == "O" & movimientoD2 == "O" || movimientoB2 == "O" & movimientoC2 == "O" & movimientoD2 == "O" & movimientoE2 == "O" || movimientoC2 == "O" & movimientoD2 == "O" & movimientoE2 == "O" & movimientoF2 == "O" || movimientoA3 == "O" & movimientoB3 == "O" & movimientoC3 == "O" & movimientoD3 == "O" || movimientoB3 == "O" & movimientoC3 == "O" & movimientoD3 == "O" & movimientoE3 == "O" || movimientoC3 == "O" & movimientoD3 == "O" & movimientoE3 == "O" & movimientoF3 == "O" || movimientoA4 == "O" & movimientoB4 == "O" & movimientoC4 == "O" & movimientoD4 == "O" || movimientoB4 == "O" & movimientoC4 == "O" & movimientoD4 == "O" & movimientoE4 == "O" || movimientoC4 == "O" & movimientoD4 == "O" & movimientoE4 == "O" & movimientoF4 == "O" || movimientoA5 == "O" & movimientoB5 == "O" & movimientoC5 == "O" & movimientoD5 == "O" || movimientoB5 == "O" & movimientoC5 == "O" & movimientoD5 == "O" & movimientoE5 == "O" || movimientoC5 == "O" & movimientoD5 == "O" & movimientoE5 == "O" & movimientoF5 == "O" || movimientoA6 == "O" & movimientoB6 == "O" & movimientoC6 == "O" & movimientoD6 == "O" || movimientoB6 == "O" & movimientoC6 == "O" & movimientoD6 == "O" & movimientoE6 == "O" || movimientoC6 == "O" & movimientoD6 == "O" & movimientoE6 == "O" & movimientoF6 == "O" || movimientoA1 == "O" & movimientoB2 == "O" & movimientoC3 == "O" & movimientoD4 == "O" || movimientoB1 == "O" & movimientoC2 == "O" & movimientoD3 == "O" & movimientoE4 == "O" || movimientoC1 == "O" & movimientoD2 == "O" & movimientoE3 == "O" & movimientoF4 == "O" || movimientoA2 == "O" & movimientoB3 == "O" & movimientoC4 == "O" & movimientoD5 == "O" || movimientoB2 == "O" & movimientoC3 == "O" & movimientoD4 == "O" & movimientoE5 == "O" || movimientoC2 == "O" & movimientoD3 == "O" & movimientoE4 == "O" & movimientoF5 == "O" || movimientoA3 == "O" & movimientoB4 == "O" & movimientoC5 == "O" & movimientoD6 == "O" || movimientoB3 == "O" & movimientoC4 == "O" & movimientoD5 == "O" & movimientoE6 == "O" || movimientoC3 == "O" & movimientoD4 == "O" & movimientoE5 == "O" & movimientoF6 == "O" || movimientoF1 == "O" & movimientoE2 == "O" & movimientoD3 == "O" & movimientoC4 == "O" || movimientoE1 == "O" & movimientoD2 == "O" & movimientoC3 == "O" & movimientoB4 == "O" || movimientoD1 == "O" & movimientoC2 == "O" & movimientoB3 == "O" & movimientoA4 == "O" || movimientoF2 == "O" & movimientoE3 == "O" & movimientoD4 == "O" & movimientoC5 == "O" || movimientoE2 == "O" & movimientoD3 == "O" & movimientoC4 == "O" & movimientoB5 == "O" || movimientoD2 == "O" & movimientoC3 == "O" & movimientoB4 == "O" & movimientoA5 == "O" || movimientoF3 == "O" & movimientoE4 == "O" & movimientoD5 == "O" & movimientoC6 == "O" || movimientoE3 == "O" & movimientoD4 == "O" & movimientoC5 == "O" & movimientoB6 == "O" || movimientoD3 == "O" & movimientoC4 == "O" & movimientoB5 == "O" & movimientoA6 == "O"){
                    ganador = true;
                    Texto2.setText("Ganador O");
                }else{
                    if(!jugadaA1 & !jugadaA2 & !jugadaA3 & !jugadaA4 & !jugadaA5 & !jugadaA6 & !jugadaB1 & !jugadaB2 & !jugadaB3 & !jugadaB4 & !jugadaB5 & !jugadaB6 & !jugadaC1 & !jugadaC2 & !jugadaC3 & !jugadaC4 & !jugadaC5 & !jugadaC6 & !jugadaD1 & !jugadaD2 & !jugadaD3 & !jugadaD4 & !jugadaD5 & !jugadaD6 & !jugadaE1 & !jugadaE2 & !jugadaE3 & !jugadaE4 & !jugadaE5 & !jugadaE6 & !jugadaF1 & !jugadaF2 & !jugadaF3 & !jugadaF4 & !jugadaF5 & !jugadaF6){
                        ganador = true;
                        Texto2.setText("Ganador Gato");
                    }
                }
            }
        }
    }

    public void pulsarBotonM(View v) {
        ganador = false;
        jugadaA1 = true;
        jugadaA2 = true;
        jugadaA3 = true;
        jugadaA4 = true;
        jugadaA5 = true;
        jugadaA6 = true;
        jugadaB1 = true;
        jugadaB2 = true;
        jugadaB3 = true;
        jugadaB4 = true;
        jugadaB5 = true;
        jugadaB6 = true;
        jugadaC1 = true;
        jugadaC2 = true;
        jugadaC3 = true;
        jugadaC4 = true;
        jugadaC5 = true;
        jugadaC6 = true;
        jugadaD1 = true;
        jugadaD2 = true;
        jugadaD3 = true;
        jugadaD4 = true;
        jugadaD5 = true;
        jugadaD6 = true;
        jugadaE1 = true;
        jugadaE2 = true;
        jugadaE3 = true;
        jugadaE4 = true;
        jugadaE5 = true;
        jugadaE6 = true;
        jugadaF1 = true;
        jugadaF2 = true;
        jugadaF3 = true;
        jugadaF4 = true;
        jugadaF5 = true;
        jugadaF6 = true;
        movimientoA1 = "";
        movimientoA2 = "";
        movimientoA3 = "";
        movimientoA4 = "";
        movimientoA5 = "";
        movimientoA6 = "";
        movimientoB1 = "";
        movimientoB2 = "";
        movimientoB3 = "";
        movimientoB4 = "";
        movimientoB5 = "";
        movimientoB6 = "";
        movimientoC1 = "";
        movimientoC2 = "";
        movimientoC3 = "";
        movimientoC4 = "";
        movimientoC5 = "";
        movimientoC6 = "";
        movimientoD1 = "";
        movimientoD2 = "";
        movimientoD3 = "";
        movimientoD4 = "";
        movimientoD5 = "";
        movimientoD6 = "";
        movimientoE1 = "";
        movimientoE2 = "";
        movimientoE3 = "";
        movimientoE4 = "";
        movimientoE5 = "";
        movimientoE6 = "";
        movimientoF1 = "";
        movimientoF2 = "";
        movimientoF3 = "";
        movimientoF4 = "";
        movimientoF5 = "";
        movimientoF6 = "";
        botonA1.setText("");
        botonA2.setText("");
        botonA3.setText("");
        botonA4.setText("");
        botonA5.setText("");
        botonA6.setText("");
        botonB1.setText("");
        botonB2.setText("");
        botonB3.setText("");
        botonB4.setText("");
        botonB5.setText("");
        botonB6.setText("");
        botonC1.setText("");
        botonC2.setText("");
        botonC3.setText("");
        botonC4.setText("");
        botonC5.setText("");
        botonC6.setText("");
        botonD1.setText("");
        botonD2.setText("");
        botonD3.setText("");
        botonD4.setText("");
        botonD5.setText("");
        botonD6.setText("");
        botonE1.setText("");
        botonE2.setText("");
        botonE3.setText("");
        botonE4.setText("");
        botonE5.setText("");
        botonE6.setText("");
        botonF1.setText("");
        botonF2.setText("");
        botonF3.setText("");
        botonF4.setText("");
        botonF5.setText("");
        botonF6.setText("");
        Texto1.setText("GATO Turno: X");
        Texto2.setText("Esperando ganador");
    }
}