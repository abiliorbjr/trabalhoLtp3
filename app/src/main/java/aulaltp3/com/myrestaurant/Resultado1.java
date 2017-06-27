package aulaltp3.com.myrestaurant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.*;
import android.widget.*;

public class Resultado1 extends AppCompatActivity {

    private TextView nome;
    private TextView quantidade;
    private Button btnFechar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_Resultado1);

        nome     = (EditText) findViewById(R.id.nome);
        quantidade = (EditText) findViewById(R.id.quantidade);


        String nome     = getIntent().getStringExtra("nome");
        String quantidade = getIntent().getStringExtra("quantidade");




        btnFechar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }
}
