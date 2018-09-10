package com.example.confix.juegoxd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.LinkedList;
import java.util.List;

public class CambiarImagenActivity extends AppCompatActivity {

    Button imagen1;
    Button imagen2;
    Button imagen3;
    Button imagen4;
    Button imagen5;
    Button imagen6;
    Button imagen7;
    Button imagen8;
    List<Button> botons1 = new LinkedList<>();
    List<Button> botons2 = new LinkedList<>();
    Button cancel;
    Button acept;
    int temp;
    int fondotemp2;


    public void llenarListas(){
        botons1.add(imagen1);
        botons1.add(imagen2);
        botons1.add(imagen3);
        botons1.add(imagen4);
        botons2.add(imagen5);
        botons2.add(imagen6);
        botons2.add(imagen7);
        botons2.add(imagen8);
    }

    public void quitarAlfa(List<Button> listaBtns){
        for(int i=0; i<listaBtns.size();i++){
            if (listaBtns.get(i).getAlpha()== (float)0.4){
                listaBtns.get(i).setAlpha(1);
            }
        }
    }

    public Button getBotonConAlfa(List<Button> listaBtns){
        Button btn=null;
        for(int i=0; i<listaBtns.size();i++){
            if (listaBtns.get(i).getAlpha() == (float)0.4){
                btn = listaBtns.get(i);
            }
        }
        return btn;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cambiar_imagen);

        imagen1 =  (Button) findViewById(R.id.btnJug1Uno);
        imagen2 = (Button) findViewById(R.id.btnJug1Dos);
        imagen3 = (Button) findViewById(R.id.btnJug1Tres);
        imagen4 = (Button) findViewById(R.id.btnJug1Cuatro);
        imagen5 = (Button) findViewById(R.id.btnJug2Uno);
        imagen6 = (Button) findViewById(R.id.btnJug2Dos);
        imagen7 = (Button) findViewById(R.id.btnJug2Tres);
        imagen8 = (Button) findViewById(R.id.btnJug2Cuatro);
        cancel = (Button) findViewById(R.id.btnCancel);
        acept = (Button) findViewById(R.id.btnAceptar);

        llenarListas();

        imagen1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(imagen1.getAlpha()==1){
                    quitarAlfa(botons1);
                    temp = R.drawable.ic_lax2;
                    imagen1.setAlpha((float) 0.4);
                }
                else{
                    imagen1.setAlpha((float) 1);
                }

            }
        });

        imagen2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(imagen2.getAlpha()==1){
                    quitarAlfa(botons1);
                    temp = R.drawable.ic_chulo;
                    imagen2.setAlpha((float) 0.4);
                }
                else{
                    imagen2.setAlpha((float) 1);
                }
            }
        });

        imagen3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(imagen3.getAlpha()==1){
                    quitarAlfa(botons1);
                    temp = R.drawable.ic_homer;
                    imagen3.setAlpha((float) 0.4);
                }
                else{
                    imagen3.setAlpha((float) 1);
                }
            }
        });

        imagen4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(imagen4.getAlpha()==1){
                    quitarAlfa(botons1);
                    temp = R.drawable.ic_dragonball_goku;
                    imagen4.setAlpha((float) 0.4);
                }
                else{
                    imagen4.setAlpha((float) 1);
                }
            }
        });

        imagen5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(imagen5.getAlpha()==1){
                    quitarAlfa(botons2);
                    fondotemp2 = R.drawable.ic_pedro_picaiedra;
                    imagen5.setAlpha((float) 0.4);
                }
                else{
                    imagen5.setAlpha((float) 1);
                }
            }
        });

        imagen6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(imagen6.getAlpha()==1){
                    quitarAlfa(botons2);
                    fondotemp2 = R.drawable.ic_minion;
                    imagen6.setAlpha((float) 0.4);
                }
                else{
                    imagen6.setAlpha((float) 1);
                }
            }
        });

        imagen7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(imagen7.getAlpha()==1){
                    quitarAlfa(botons2);
                    fondotemp2 = R.drawable.ic_futbol;
                    imagen7.setAlpha((float) 0.4);
                }
                else{
                    imagen7.setAlpha((float) 1);
                }
            }
        });

        imagen8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(imagen8.getAlpha()==1){
                    quitarAlfa(botons2);
                    fondotemp2 = R.drawable.ic_basket;
                    imagen8.setAlpha((float) 0.4);
                }
                else{
                    imagen8.setAlpha((float) 1);
                }
            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();
            }
        });

        acept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button temp1;
                Button temp2;
                temp1 = getBotonConAlfa(botons1);
                if(temp1!=null){
                    TiKTakToe.imgJug1 = temp;
                }


                temp2 = getBotonConAlfa(botons2);
                if(temp2 != null){
                    TiKTakToe.imgJug2 = fondotemp2;
                }

                finish();


            }
        });
    }
}
