package empresaficticia.android.projetos.com.caraoucoroa;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;

public class DetalheActivity extends AppCompatActivity {
    private ImageButton botaoVoltar;
    private ImageView moeda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe);


        moeda = (ImageView) findViewById(R.id.moedaId);
        botaoVoltar = (ImageButton) findViewById(R.id.botaoVoltarId);
Bundle extra = getIntent().getExtras();
        if(extra != null){
            String opcaoResultado = extra.getString("opcao");
            if(opcaoResultado.equals("cara")){
                moeda.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.moeda_cara));
            }else{
                moeda.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.moeda_coroa));
            }

        }
        botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity( new Intent(DetalheActivity.this, MainActivity.class));

            }
        });



    }
}
