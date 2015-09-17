package br.com.claudiovenancio.consultafipe.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.google.gson.reflect.TypeToken;
import com.koushikdutta.async.future.FutureCallback;
import com.koushikdutta.ion.Ion;

import java.util.List;

import br.com.claudiovenancio.consultafipe.R;
import br.com.claudiovenancio.consultafipe.adapters.MarcaAdapter;
import br.com.claudiovenancio.consultafipe.entities.Marca;
import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by joaoclaudio on 16/09/15.
 */
public class MarcasFragment extends Fragment {

  @Bind(R.id.list_marca)
  ListView listMarca;

  public static MarcasFragment newInstance() {

    Bundle args = new Bundle();

    MarcasFragment fragment = new MarcasFragment();
    fragment.setArguments(args);
    return fragment;
  }

  @Nullable
  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    View view = inflater.inflate(R.layout.fragment_marca, container, false);
    ButterKnife.bind(this, view);
    return view;
  }

  @Override
  public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);

    Ion.with(getActivity())
        .load("http://fipeapi.appspot.com/api/1/carros/marcas.json")
        .as(new TypeToken<List<Marca>>(){})
        .setCallback(new FutureCallback<List<Marca>>() {
          @Override
          public void onCompleted(Exception e, List<Marca> result) {
            for (Marca marca: result) {
              Log.d("MarcaFragment", marca.getName() + ", "
                  + marca.getKey());
            }
            listMarca.setAdapter(new MarcaAdapter(getActivity(),
                R.layout.item_marca, result));
          }
        });

  }
}
