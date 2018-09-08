 package com.example.confix.juegoxd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.util.concurrent.ThreadLocalRandom;

import java.util.Random;

 public class RompecabezaActivity extends AppCompatActivity {

    Button btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rompecabeza);

        btn_1 = (Button)findViewById(R.id.btn_1);
        btn_2 = (Button)findViewById(R.id.btn_2);
        btn_3 = (Button)findViewById(R.id.btn_3);
        btn_4 = (Button)findViewById(R.id.btn_4);
        btn_5 = (Button)findViewById(R.id.btn_5);
        btn_6 = (Button)findViewById(R.id.btn_6);
        btn_7 = (Button)findViewById(R.id.btn_7);
        btn_8 = (Button)findViewById(R.id.btn_8);
        btn_9 = (Button)findViewById(R.id.btn_9);

        int[] randomArrayNum = new int[] {1,2,3,4,5,6,7,8,0};
        String[] randomArray = new String[9];
        shuffleArray(randomArrayNum);

        for(int i=0; i<randomArrayNum.length; i++){
            if(randomArrayNum[i] == 0){
                randomArray[i] = "";
            }else{
                randomArray[i] = String.valueOf(randomArrayNum[i]);
            }
        }

        btn_1.setText(String.valueOf(randomArray[1]));
        btn_2.setText(String.valueOf(randomArray[2]));
        btn_3.setText(String.valueOf(randomArray[3]));
        btn_4.setText(String.valueOf(randomArray[4]));
        btn_5.setText(String.valueOf(randomArray[5]));
        btn_6.setText(String.valueOf(randomArray[6]));
        btn_7.setText(String.valueOf(randomArray[7]));
        btn_8.setText(String.valueOf(randomArray[8]));
        btn_9.setText(String.valueOf(randomArray[0]));


        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String now = btn_1.getText().toString(),
                        move2= btn_2.getText().toString(),
                        move4 = btn_4.getText().toString();

                if(move2.equals("")){
                    btn_1.setText("");
                    btn_2.setText(now);
                }else if(move4.equals("")){
                    btn_1.setText("");
                    btn_4.setText(now);
                }

                String[] nowArray = new String[9];
                nowArray[0] = btn_1.getText().toString();
                nowArray[1] = btn_2.getText().toString();
                nowArray[2] = btn_3.getText().toString();
                nowArray[3] = btn_4.getText().toString();
                nowArray[4] = btn_5.getText().toString();
                nowArray[5] = btn_6.getText().toString();
                nowArray[6] = btn_7.getText().toString();
                nowArray[7] = btn_8.getText().toString();
                nowArray[8] = btn_9.getText().toString();

                if (comparador(nowArray)){
                    btn_9.setText("Ganaster!");
                }
            }
        });


        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String now = btn_2.getText().toString(),
                        move1= btn_1.getText().toString(),
                        move3 = btn_3.getText().toString(),
                        move5 = btn_5.getText().toString();

                if(move1.equals("")){
                    btn_2.setText("");
                    btn_1.setText(now);
                }else if(move3.equals("")){
                    btn_2.setText("");
                    btn_3.setText(now);
                }else if(move5.equals("")){
                    btn_2.setText("");
                    btn_5.setText(now);
                }

                String[] nowArray = new String[9];
                nowArray[0] = btn_1.getText().toString();
                nowArray[1] = btn_2.getText().toString();
                nowArray[2] = btn_3.getText().toString();
                nowArray[3] = btn_4.getText().toString();
                nowArray[4] = btn_5.getText().toString();
                nowArray[5] = btn_6.getText().toString();
                nowArray[6] = btn_7.getText().toString();
                nowArray[7] = btn_8.getText().toString();
                nowArray[8] = btn_9.getText().toString();

                if (comparador(nowArray)){
                    btn_9.setText("Ganaster!");
                }
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String now = btn_3.getText().toString(),
                        move2= btn_2.getText().toString(),
                        move6 = btn_6.getText().toString();

                if(move2.equals("")){
                    btn_3.setText("");
                    btn_2.setText(now);
                }else if(move6.equals("")){
                    btn_3.setText("");
                    btn_6.setText(now);
                }

                String[] nowArray = new String[9];
                nowArray[0] = btn_1.getText().toString();
                nowArray[1] = btn_2.getText().toString();
                nowArray[2] = btn_3.getText().toString();
                nowArray[3] = btn_4.getText().toString();
                nowArray[4] = btn_5.getText().toString();
                nowArray[5] = btn_6.getText().toString();
                nowArray[6] = btn_7.getText().toString();
                nowArray[7] = btn_8.getText().toString();
                nowArray[8] = btn_9.getText().toString();

                if (comparador(nowArray)){
                    btn_9.setText("Ganaster!");
                }
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String now = btn_4.getText().toString(),
                        move1= btn_1.getText().toString(),
                        move7 = btn_7.getText().toString(),
                        move5 = btn_5.getText().toString();

                if(move1.equals("")){
                    btn_4.setText("");
                    btn_1.setText(now);
                }else if(move7.equals("")){
                    btn_4.setText("");
                    btn_7.setText(now);
                }else if(move5.equals("")){
                    btn_4.setText("");
                    btn_5.setText(now);
                }

                String[] nowArray = new String[9];
                nowArray[0] = btn_1.getText().toString();
                nowArray[1] = btn_2.getText().toString();
                nowArray[2] = btn_3.getText().toString();
                nowArray[3] = btn_4.getText().toString();
                nowArray[4] = btn_5.getText().toString();
                nowArray[5] = btn_6.getText().toString();
                nowArray[6] = btn_7.getText().toString();
                nowArray[7] = btn_8.getText().toString();
                nowArray[8] = btn_9.getText().toString();

                if (comparador(nowArray)){
                    btn_9.setText("Ganaster!");
                }
            }
        });


        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String now = btn_5.getText().toString(),
                        move2= btn_2.getText().toString(),
                        move4 = btn_4.getText().toString(),
                        move6 = btn_6.getText().toString(),
                        move8 = btn_8.getText().toString();

                if(move2.equals("")){
                    btn_5.setText("");
                    btn_2.setText(now);
                }else if(move4.equals("")){
                    btn_5.setText("");
                    btn_4.setText(now);
                }else if(move6.equals("")){
                    btn_5.setText("");
                    btn_6.setText(now);
                }else if(move8.equals("")){
                    btn_5.setText("");
                    btn_8.setText(now);
                }

                String[] nowArray = new String[9];
                nowArray[0] = btn_1.getText().toString();
                nowArray[1] = btn_2.getText().toString();
                nowArray[2] = btn_3.getText().toString();
                nowArray[3] = btn_4.getText().toString();
                nowArray[4] = btn_5.getText().toString();
                nowArray[5] = btn_6.getText().toString();
                nowArray[6] = btn_7.getText().toString();
                nowArray[7] = btn_8.getText().toString();
                nowArray[8] = btn_9.getText().toString();

                if (comparador(nowArray)){
                    btn_9.setText("Ganaster!");
                }
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String now = btn_6.getText().toString(),
                        move9= btn_9.getText().toString(),
                        move3 = btn_3.getText().toString(),
                        move5 = btn_5.getText().toString();

                if(move9.equals("")){
                    btn_6.setText("");
                    btn_9.setText(now);
                }else if(move3.equals("")){
                    btn_6.setText("");
                    btn_3.setText(now);
                }else if(move5.equals("")){
                    btn_6.setText("");
                    btn_5.setText(now);
                }

                String[] nowArray = new String[9];
                nowArray[0] = btn_1.getText().toString();
                nowArray[1] = btn_2.getText().toString();
                nowArray[2] = btn_3.getText().toString();
                nowArray[3] = btn_4.getText().toString();
                nowArray[4] = btn_5.getText().toString();
                nowArray[5] = btn_6.getText().toString();
                nowArray[6] = btn_7.getText().toString();
                nowArray[7] = btn_8.getText().toString();
                nowArray[8] = btn_9.getText().toString();

                if (comparador(nowArray)){
                    btn_9.setText("Ganaster!");
                }
            }
        });

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String now = btn_7.getText().toString(),
                        move8= btn_8.getText().toString(),
                        move4 = btn_4.getText().toString();

                if(move8.equals("")){
                    btn_7.setText("");
                    btn_8.setText(now);
                }else if(move4.equals("")){
                    btn_7.setText("");
                    btn_4.setText(now);
                }

                String[] nowArray = new String[9];
                nowArray[0] = btn_1.getText().toString();
                nowArray[1] = btn_2.getText().toString();
                nowArray[2] = btn_3.getText().toString();
                nowArray[3] = btn_4.getText().toString();
                nowArray[4] = btn_5.getText().toString();
                nowArray[5] = btn_6.getText().toString();
                nowArray[6] = btn_7.getText().toString();
                nowArray[7] = btn_8.getText().toString();
                nowArray[8] = btn_9.getText().toString();

                if (comparador(nowArray)){
                    btn_9.setText("Ganaster!");
                }
            }
        });

        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String now = btn_8.getText().toString(),
                        move9= btn_9.getText().toString(),
                        move7 = btn_7.getText().toString(),
                        move5 = btn_5.getText().toString();

                if(move9.equals("")){
                    btn_8.setText("");
                    btn_9.setText(now);
                }else if(move7.equals("")){
                    btn_8.setText("");
                    btn_7.setText(now);
                }else if(move5.equals("")){
                    btn_8.setText("");
                    btn_5.setText(now);
                }

                String[] nowArray = new String[9];
                nowArray[0] = btn_1.getText().toString();
                nowArray[1] = btn_2.getText().toString();
                nowArray[2] = btn_3.getText().toString();
                nowArray[3] = btn_4.getText().toString();
                nowArray[4] = btn_5.getText().toString();
                nowArray[5] = btn_6.getText().toString();
                nowArray[6] = btn_7.getText().toString();
                nowArray[7] = btn_8.getText().toString();
                nowArray[8] = btn_9.getText().toString();

                if (comparador(nowArray)){
                    btn_9.setText("Ganaster!");
                }
            }
        });


        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String now = btn_9.getText().toString(),
                        move8= btn_8.getText().toString(),
                        move6 = btn_6.getText().toString();

                if(move8.equals("")){
                    btn_9.setText("");
                    btn_8.setText(now);
                }else if(move6.equals("")){
                    btn_9.setText("");
                    btn_6.setText(now);
                }

                String[] nowArray = new String[9];
                nowArray[0] = btn_1.getText().toString();
                nowArray[1] = btn_2.getText().toString();
                nowArray[2] = btn_3.getText().toString();
                nowArray[3] = btn_4.getText().toString();
                nowArray[4] = btn_5.getText().toString();
                nowArray[5] = btn_6.getText().toString();
                nowArray[6] = btn_7.getText().toString();
                nowArray[7] = btn_8.getText().toString();
                nowArray[8] = btn_9.getText().toString();

                if (comparador(nowArray)){
                    btn_9.setText("Ganaster!");
                }
            }
        });
    }

     public boolean comparador (String nowArray[]){

         int[] arrayNum = new int[] {1,2,3,4,5,6,7,8,0};

         for(int i=0; i<nowArray.length; i++){
             if(nowArray[i].equals("")){
                 nowArray[i] = "0";
             }
         }

         boolean respuesta = true;

         for(int i=0; i<arrayNum.length; i++){
             if (Integer.parseInt(nowArray[i]) != arrayNum[i]){
                 respuesta = false;
             }
         }
         return respuesta;
     }

     static void shuffleArray(int[] ar)
     {
         // If running on Java 6 or older, use `new Random()` on RHS here
         Random rnd = ThreadLocalRandom.current();
         for (int i = ar.length - 1; i > 0; i--)
         {
             int index = rnd.nextInt(i + 1);
             // Simple swap
             int a = ar[index];
             ar[index] = ar[i];
             ar[i] = a;
         }
     }
}
