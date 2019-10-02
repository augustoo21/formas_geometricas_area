package com.magnani.dispositivosmoveis.exerciciom1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class tela_area_quadrado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_area_quadrado);

        double resultado = this.getIntent().getDoubleExtra("valor",0);
        TextView texto = findViewById(R.id.label_area_quadrado);
        texto.setText(Double.toString(resultado));
        Button button_comecar_novamente_quadrado = findViewById(R.id.btn_comecar_novamente_quadrado);
        button_comecar_novamente_quadrado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(tela_area_quadrado.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
