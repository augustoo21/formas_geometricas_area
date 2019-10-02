package com.magnani.dispositivosmoveis.exerciciom1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class quadrado_tela extends AppCompatActivity {
    EditText valor_base;
    EditText valor_altura;
    double valor_b;
    double valor_a;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quadrado_tela);
        Button button_avancar_quadrado = findViewById(R.id.btn_avancar_quadrado);
        button_avancar_quadrado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(quadrado_tela.this,tela_area_quadrado.class);
                valor_altura = findViewById(R.id.altura_quadrado);
                valor_base = findViewById(R.id.base_quadrado);
                valor_b = Double.parseDouble(valor_base.getText().toString());
                valor_a = Double.parseDouble(valor_altura.getText().toString());
                double area_quadrado = valor_b * valor_a;
                intent.putExtra("valor", area_quadrado);
                startActivity(intent);
            }
        });
    }
}
