package aulaltp3.com.myrestaurant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import aulaltp3.com.myrestaurant.R;

public class Resultado1 extends AppCompatActivity {

    private TextView nome;
    private TextView quantidade;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_Resultado1);

        nome     = (TextView) findViewById(R.id.nome);
        quantidade = (TextView) findViewById(R.id.quantidade);


        String nome     = getIntent().getStringExtra("nome");
        String quantidade = getIntent().getStringExtra("quantidade");


        nome.setText(nome);
        quantidade.setText(quantidade);


        btfechar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }
}
