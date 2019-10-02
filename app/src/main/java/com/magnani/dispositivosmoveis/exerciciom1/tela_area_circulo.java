package com.magnani.dispositivosmoveis.exerciciom1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class tela_area_circulo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_area_circulo_);

        double resultado = this.getIntent().getDoubleExtra("valor",0);
        TextView texto = findViewById(R.id.label_area_circulo);
        texto.setText(Double.toString(resultado));
        Button button_comecar_novamente_circulo = findViewById(R.id.btn_comecar_novamente_circulo);
        button_comecar_novamente_circulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(tela_area_circulo.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
