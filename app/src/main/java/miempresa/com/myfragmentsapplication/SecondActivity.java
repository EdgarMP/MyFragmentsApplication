package miempresa.com.myfragmentsapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView myTextView;
    private TextView secondTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        myTextView = findViewById(R.id.miTexto);

        String miTexto = getIntent().getStringExtra("miTexto");

        myTextView.setText(miTexto);

    }
}
