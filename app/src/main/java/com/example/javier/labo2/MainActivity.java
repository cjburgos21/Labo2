package com.example.javier.labo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView palabra, word;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
        public void changeText(View v){
        String aux;
        palabra = findViewById(R.id.palabra);
        word = findViewById(R.id.word);

        aux= palabra.getText().toString();
        palabra.setText(word.getText());
        word.setText(aux);


    }

}
