package aulaltp3.com.myrestaurant;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * Created by AbilioJunior on 30/05/2017.
 */

public class Refrigerante  extends AppCompatActivity {

    private ImageButton coca;
    private int qtdCoca;
    private TextView tvQtdCoca;

    private ImageButton cocaLata;
    private int qtdCocaLata;
    private TextView tvQtdCocaLata;

    private ImageButton cocaLataZero;
    private int qtdCocaLataZero;
    private TextView tvQtdCocaLataZero;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_refrigerante);

        coca      = (ImageButton) findViewById(R.id.coca);
        tvQtdCoca = (TextView) findViewById(R.id.tvQtdCoca);

        coca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qtdCoca++;
                tvQtdCoca.setText("Total= "+ qtdCoca);
            }




        });


        cocaLata      = (ImageButton) findViewById(R.id.cocaLata);
        tvQtdCocaLata = (TextView) findViewById(R.id.tvQtdCocaLata);

        cocaLata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                qtdCocaLata++;
                tvQtdCocaLata.setText("Total= " + qtdCocaLata);
            }



    });

       cocaLataZero      = (ImageButton) findViewById(R.id.cocaLataZero);
        tvQtdCocaLataZero = (TextView) findViewById(R.id.tvQtdCocaLataZero);

        cocaLataZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qtdCocaLataZero++;
                tvQtdCocaLataZero.setText("Total= " + qtdCocaLataZero);
            }

        });

        private EditText nome;
        private EditText quantidade;
        private Button btenviar;


            nome = (EditText) findViewById(R.id.cocaLata);
            quantidade = (EditText) findViewById(R.id.fanta600);
            btenviar = (Button) findViewById(R.id.btenviar);

             btenviar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }

            String nome = nome.getText().toString();
            String quantidade = quantidade.getText().toString();

            Intent enviar = new Intent(getBaseContext(),
                    Refrigerante.class);

                enviar.putExtra("nome", nome);
                enviar.putExtra("quantidade",quantidade);
            startActivity(enviar);


        }