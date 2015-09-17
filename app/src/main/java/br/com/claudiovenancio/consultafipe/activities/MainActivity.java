package br.com.claudiovenancio.consultafipe.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import br.com.claudiovenancio.consultafipe.R;
import br.com.claudiovenancio.consultafipe.fragments.MarcasFragment;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    getSupportFragmentManager().beginTransaction()
        .add(MarcasFragment.newInstance(), MarcasFragment.class.getSimpleName()).commit();

  }
}
