package polinema.ac.id.starterchapter05.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import polinema.ac.id.starterchapter05.R;
import polinema.ac.id.starterchapter05.fragments.DipsFragment;
import polinema.ac.id.starterchapter05.fragments.HandstandFragment;
import polinema.ac.id.starterchapter05.fragments.PushupFragment;

public class TugasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tugas);
    }


    public void handstandOnClick(View view) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.contentFragment, new HandstandFragment())
                .addToBackStack(null)
                .commit();
    }

    public void dipsOnClick(View view) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.contentFragment, new DipsFragment())
                .addToBackStack(null)
                .commit();
    }

    public void pushupOnClick(View view) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.contentFragment, new PushupFragment())
                .addToBackStack(null)
                .commit();
    }
}
