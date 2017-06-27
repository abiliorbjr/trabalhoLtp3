package aulaltp3.com.myrestaurant;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import aulalpt3.com.myrestaurant.R;

/**
 * Created by AbilioJunior on 30/05/2017.
 */

public class Menu extends AppCompatActivity {

    private ImageButton botaoHamburguer;
    private ImageButton botaoRefrigerante;
    private ImageButton botaoSobremesa;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2_menu);

        botaoHamburguer = (ImageButton) findViewById(R.id.iBtnMenuSanduiches);
        botaoHamburguer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Menu.this, Hamburguer.class);
                startActivity(i);
            }
        });

        botaoRefrigerante = (ImageButton) findViewById(R.id.iBtnRefrigerantes);
        botaoRefrigerante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Menu.this, Refrigerante.class);
                startActivity(i);
            }
        });

        botaoSobremesa = (ImageButton) findViewById(R.id.iBtnMenuSobremesas);
        botaoSobremesa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Menu.this, Sobremesa.class);
                startActivity(i);
            }
        });


    }
}
