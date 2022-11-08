package descomplica.praticamobile.aula6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Intent intentTres = getIntent();
        String curso = intentTres.getStringExtra(SecondActivity.CURSO);
        TextView tvTerceira = findViewById(R.id.terceira);
        tvTerceira.setText(curso + "\n\n terceiro período");
    }

}