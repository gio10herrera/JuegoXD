package com.example.confix.juegoxd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class TiKTakToe extends AppCompatActivity {

    private int M[][] = new int[3][3]; //se llenara con los digitos 1 y 2 cada vez que un jugador marque
    private Drawable imagenInicial;
    Boolean sw = false;
    static int imgJug1;
    static int imgJug2;
    TextView turno;
    Button reanud;
    Button imgPorDefecto;
    Button cmbImgagen;
    Boolean comenzar = false;

    //para controlar el turno de los jugadores
    private int jug1 = 1;
    private int jug2 = 0;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    List<Button> botones = new LinkedList<>();

    public void verificarComienzoDelJuego(){
        for (int i=0; i < 3; i++){
            for (int j=0; j < 3; j++){
                if(M[i][j] != 0){
                    comenzar = true;
                    cmbImgagen.setEnabled(false);
                    imgPorDefecto.setEnabled(false);
                    break;
                }
            }
        }
    }

    public void setImgJug1(int img){
        imgJug1 = img;
    }

    public void setImgJug2(int img){
        imgJug2 = img;
    }

    public void reanudar(){
        comenzar=false;
        cmbImgagen.setEnabled(true);
        imgPorDefecto.setEnabled(true);
        sw=false;
        llenarCerosMatriz();
        jug1 = 1;
        jug2 = 0;
        turno.setText("TURNO JUG 1");
        activarBotones();
        imagenInicial = btn1.getBackground();
    }

    public void llenarLista(){
        botones.add(btn1);
        botones.add(btn2);
        botones.add(btn3);
        botones.add(btn4);
        botones.add(btn5);
        botones.add(btn6);
        botones.add(btn7);
        botones.add(btn8);
        botones.add(btn9);
    }

    public void marcarCasilla(int i, int j, Button b){
        if(M[i][j]==0){
            if(jug1==1){
                turno.setText("TURNO JUG 2");
                b.setBackgroundResource(imgJug1);
                M[i][j]=1;
                jug1=0;
                jug2=1;
            }
            else{
                turno.setText("TURNO JUG 1");
                b.setBackgroundResource(imgJug2);
                M[i][j]=2;
                jug2=0;
                jug1=1;
            }
            verificarGanador();
            if(sw){
                Toast.makeText(TiKTakToe.this,"Ganaste!!",Toast.LENGTH_LONG).show();
                turno.setText("FIN DEL JUEGO");
                desactivarBotones();
            }
        }
        else{
            Toast.makeText(TiKTakToe.this,"Marca otra casilla",Toast.LENGTH_LONG).show();
        }
    }


    public void verificarGanador(){
        for(int i = 0; i<3; i++){
            if(M[i][0]==M[i][1] && M[i][0]==M[i][2]){
                if(M[i][0]==1 || M[i][0]==2){
                    sw=true;
                    break;
                }
            }
            if(M[0][i]==M[1][i] && M[0][i]==M[2][i]){
                if(M[0][i]==1 || M[0][i]==2){
                    sw=true;
                    break;
                }
            }
        }
        if(!sw){
            if(M[0][0]==M[1][1] && M[0][0]==M[2][2]){
                if(M[0][0]==1 || M[0][0]==2){
                    sw=true;
                }
            }
            else{
                if (M[2][0]==M[1][1] && M[2][0]==M[0][2]){
                    if(M[2][0]==1 || M[2][0]==2){
                        sw=true;
                    }
                }
            }
        }
    }

    public void llenarCerosMatriz(){
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                M[i][j] = 0;
            }
        }
    }

    public void desactivarBotones(){
        for(int i=0; i < botones.size(); i++){
            botones.get(i).setEnabled(false);
        }
    }

    public void activarBotones(){
        for(int i=0; i < botones.size();i++){
            botones.get(i).setEnabled(true);
            botones.get(i).setBackground(imagenInicial);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ti_ktak_toe);

        llenarCerosMatriz();
        reanud = (Button) findViewById(R.id.btnReanudar);
        turno = (TextView) findViewById(R.id.txtTurno);
        imgPorDefecto = (Button) findViewById(R.id.btnImgPorDefct);
        btn1 = (Button) findViewById(R.id.btn00);
        btn2 = (Button) findViewById(R.id.btn01);
        btn3 = (Button) findViewById(R.id.btn02);
        btn4 = (Button) findViewById(R.id.btn10);
        btn5 = (Button) findViewById(R.id.btn11);
        btn6 = (Button) findViewById(R.id.btn12);
        btn7 = (Button) findViewById(R.id.btn20);
        btn8 = (Button) findViewById(R.id.btn21);
        btn9 = (Button) findViewById(R.id.btn22);
        cmbImgagen = (Button) findViewById(R.id.btnCambiarImg);
        llenarLista();
        imagenInicial = (Drawable) btn1.getBackground();
        imgJug1 = R.drawable.ic_action_x;
        imgJug2 = R.drawable.ic_action_o;


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                marcarCasilla(0,0,btn1);
                if(!comenzar)
                    verificarComienzoDelJuego();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                marcarCasilla(0,1,btn2);
                if(!comenzar)
                    verificarComienzoDelJuego();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                marcarCasilla(0,2,btn3);
                if(!comenzar)
                    verificarComienzoDelJuego();
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                marcarCasilla(1,0,btn4);
                if(!comenzar)
                    verificarComienzoDelJuego();
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                marcarCasilla(1,1,btn5);
                if(!comenzar)
                    verificarComienzoDelJuego();
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                marcarCasilla(1,2,btn6);
                if(!comenzar)
                    verificarComienzoDelJuego();
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                marcarCasilla(2,0,btn7);
                if(!comenzar)
                    verificarComienzoDelJuego();
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                marcarCasilla(2,1,btn8);
                if(!comenzar)
                    verificarComienzoDelJuego();
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                marcarCasilla(2,2,btn9);
                if(!comenzar)
                    verificarComienzoDelJuego();
            }
        });

        reanud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reanudar();
            }
        });

        imgPorDefecto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(imgJug1 != R.drawable.ic_action_x || imgJug2 != R.drawable.ic_action_o){
                    imgJug1 = R.drawable.ic_action_x;
                    imgJug2 = R.drawable.ic_action_o;
                    Toast.makeText(TiKTakToe.this,"Listo!",Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(TiKTakToe.this,"Ya estan establecidas",Toast.LENGTH_LONG).show();
                }

            }
        });

        cmbImgagen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(TiKTakToe.this,CambiarImagenActivity.class);
                startActivity(i);

            }
        });
    }
}
