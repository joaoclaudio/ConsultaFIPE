package br.com.claudiovenancio.consultafipe.activities;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;

import br.com.claudiovenancio.consultafipe.R;

/**
 * Created by joaoclaudio on 18/09/15.
 */
public class VeiculoActivity extends AppCompatActivity {

  @Override
  public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
    super.onCreate(savedInstanceState, persistentState);
    setContentView(R.layout.activity_veiculo);
  }
}
