package br.com.claudiovenancio.consultafipe.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import br.com.claudiovenancio.consultafipe.R;
import br.com.claudiovenancio.consultafipe.entities.Marca;

/**
 * Created by joaoclaudio on 16/09/15.
 */
public class MarcaAdapter extends ArrayAdapter<Marca> {

  private final Context context;
  private final int resource;
  private final List<Marca> listMarcas;

  public MarcaAdapter(Context context, int resource, List<Marca> listMarcas) {
    super(context, resource, listMarcas);
    this.context = context;
    this.resource = resource;
    this.listMarcas = listMarcas;
  }

  static class ViewHolder{
    public TextView name;
    public TextView key;
  }

  @Override
  public View getView(int position, View convertView, ViewGroup parent) {

    Marca marca = listMarcas.get(position);

    View linha = convertView;

    if (linha == null){
      LayoutInflater inflater = (LayoutInflater) context
          .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
      linha = inflater.inflate(resource, parent, false);
      ViewHolder viewHolder = new ViewHolder();
      viewHolder.name = (TextView) linha.findViewById(R.id.marca_name);
      viewHolder.key = (TextView) linha.findViewById(R.id.marca_key);
      linha.setTag(viewHolder);
    }
    ViewHolder holder = (ViewHolder) linha.getTag();
    holder.name.setText(marca.getName());
    holder.key.setText(marca.getKey());

    return linha;

  }
}
