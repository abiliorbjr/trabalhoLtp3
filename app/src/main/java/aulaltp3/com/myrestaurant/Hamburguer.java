package aulaltp3.com.myrestaurant;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import aulaltp3.com.myrestaurant.Hamburguer;



/**
 * Created by AbilioJunior on 30/05/2017.
 */

public class Hamburguer extends AppCompatActivity {

    private ImageButton hamburguerTriplo;
    private int qtpTripo;
    private TextView tvQtdtripo;
    private Button btnCadastrarHamburguer;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_hamburgue);

        hamburguerTriplo = (ImageButton) findViewById(R.id.hamburguerTriplo);
        tvQtdtripo       = (TextView) findViewById(R.id.qtdTripo);

        hamburguerTriplo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qtpTripo++;
                tvQtdtripo.setText("Total= "+qtpTripo);


         btnCadastrarHamburguer =(Button) findViewById(R.id.btnCadastrarHamburguer);
                btnCadastrarHamburguer.setOnClickListener (new View.OnClickListener(){
                    public void onClick(View v){
                        Integer qtdHamburgueres = Integer.parseInt(tvQtdtripo.getText().toString());
                    }
                }


        });







    }
}
