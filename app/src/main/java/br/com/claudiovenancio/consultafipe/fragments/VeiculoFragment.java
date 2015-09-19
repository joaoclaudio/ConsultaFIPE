package br.com.claudiovenancio.consultafipe.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.com.claudiovenancio.consultafipe.R;

/**
 * Created by joaoclaudio on 19/09/15.
 */
public class VeiculoFragment extends Fragment {

  public static VeiculoFragment newInstance() {

    Bundle args = new Bundle();

    VeiculoFragment fragment = new VeiculoFragment();
    fragment.setArguments(args);
    return fragment;
  }

  @Nullable
  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    View view = inflater.inflate(R.layout.fragment_veiculo, container, false);
    return view;
  }
}
