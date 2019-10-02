package com.magnani.dispositivosmoveis.exerciciom1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class circulo_tela extends AppCompatActivity {

    EditText valor_raio;
    double valor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circulo_tela);

        Button button_avancar_circulo = findViewById(R.id.btn_avancar_circulo);
        button_avancar_circulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(circulo_tela.this,tela_area_circulo.class);
                valor_raio =  findViewById(R.id.raio_circulo);
                valor = Double.parseDouble(valor_raio.getText().toString());
                double area_circulo = (valor * valor) * Math.PI;
                intent.putExtra("valor", area_circulo);
                startActivity(intent);
            }
        });
    }


}
