package descomplica.praticamobile.aula6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    public static final String CURSO = "descomplica.praticamobile.aula6.CURSO";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Bundle extras = getIntent().getExtras();


        String value1 = extras.getString("Value1");
        Toast.makeText(getApplicationContext(),
                value1, Toast.LENGTH_LONG).show();


        Intent intentRecebida = getIntent();
        String nome = intentRecebida.getStringExtra(MainActivity.NOME);
        TextView tvMensagemRecebida = findViewById(R.id.mensagem_recebida);
        tvMensagemRecebida.setText("Olá, "+nome);
    }


    public void callThirdActivity(View view){
        Intent i = new Intent(getApplicationContext(), ThirdActivity.class);


        String curso = "ANÁLISE E DESENVOLVIMENTO DE SISTEMAS";
        i.putExtra(CURSO, curso);

        startActivity(i);
    }
}