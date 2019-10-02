package com.magnani.dispositivosmoveis.exerciciom1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class triangulo_tela extends AppCompatActivity {
    EditText valor_base;
    EditText valor_altura;
    double valor_b;
    double valor_a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangulo_tela);
        Button button_avancar_triangulo = findViewById(R.id.btn_avancar_triangulo);
        button_avancar_triangulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(triangulo_tela.this,tela_area_triangulo.class);
                valor_altura = findViewById(R.id.altura_triangulo);
                valor_base = findViewById(R.id.base_triangulo);
                valor_b = Double.parseDouble(valor_base.getText().toString());
                valor_a = Double.parseDouble(valor_altura.getText().toString());
                double area_triangulo = (valor_b * valor_a) / 2;
                intent.putExtra("valor", area_triangulo);
                startActivity(intent);
            }
        });
    }
}
