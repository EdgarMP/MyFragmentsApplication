package miempresa.com.myfragmentsapplication;


import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.content.Intent;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openSecondActivity(View view) {
        Intent i = new Intent(this, SecondActivity.class);
        i.putExtra("miTexto", "Valor de texto que quiero pasar");
        startActivity(i);
    }

    public void openDialogFragment(View view) {

        FragmentManager fragmentManager = getSupportFragmentManager();

        FragmentTransaction ft = fragmentManager.beginTransaction();

        DialogFragment newFragment = MyDialogFragment.newInstance("textototototo");

        newFragment.show(ft, "mydialog");

    }


}
