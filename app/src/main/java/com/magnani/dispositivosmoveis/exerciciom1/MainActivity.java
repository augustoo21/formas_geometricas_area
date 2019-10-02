package com.magnani.dispositivosmoveis.exerciciom1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton radioButton;
    String selecao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button_avancar = findViewById(R.id.btn_avancar);
        radioGroup = findViewById(R.id.radio_group);
        button_avancar.setOnClickListener(btnAvancar);
    }

    private View.OnClickListener btnAvancar = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int radioId = radioGroup.getCheckedRadioButtonId();
            radioButton = findViewById(radioId);
            selecao = (String) radioButton.getText();

            if(selecao.equals("Círculo")){
                Intent intent = new Intent(MainActivity.this, circulo_tela.class);
                startActivity(intent);
            }else if (selecao.equals("Quadrado")){
                Intent intent = new Intent(MainActivity.this, quadrado_tela.class);
                startActivity(intent);
            }else if(selecao.equals("Triângulo")){
                Intent intent = new Intent(MainActivity.this, triangulo_tela.class);
                startActivity(intent);
            }

        }
    };

}
