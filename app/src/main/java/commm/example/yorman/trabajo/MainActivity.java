package commm.example.yorman.trabajo;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.preference.DialogPreference;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements ListView.OnItemClickListener {
    ListView lista;
    Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //son los nombres de las lista
        comunas comunas_data[] = new comunas[]{
                new comunas(R.drawable.descargapro, "comunas"),
                new comunas(R.drawable.descargapro, "comuna1"),
                new comunas(R.drawable.descargapro, "comuna2"),
                new comunas(R.drawable.descargapro, "comuna3"),
                new comunas(R.drawable.descargapro, "comuna4"),
                new comunas(R.drawable.descargapro, "comuna5"),
                new comunas(R.drawable.descargapro, "comuna6"),
                new comunas(R.drawable.descargapro, "comuna7"),
                new comunas(R.drawable.descargapro, "comuna8"),
                new comunas(R.drawable.descargapro, "comuna9"),
                new comunas(R.drawable.descargapro, "comuna10"),
                new comunas(R.drawable.descargapro, "comuna11"),
                new comunas(R.drawable.descargapro, "comuna12"),
                new comunas(R.drawable.descargapro, "comuna13"),
                new comunas(R.drawable.descargapro, "comuna14"),
                new comunas(R.drawable.descargapro, "comuna15"),
                new comunas(R.drawable.descargapro, "comuna16")
            //
        };
        //es adaptar la clase de activity con los botones
        ComunasAdapter adapter = new ComunasAdapter(this, R.layout.listview_item_row, comunas_data);

        lista = (ListView) findViewById(R.id.lista);
        lista.setOnItemClickListener(this);

        //cuando le de click aparece dialogo
        //lista.setOnClickListener(new View.OnClickListener() {
            //@Override
            //public void onClick(View view) {
                //AlertDialog.Builder alerDialogBuilder = new AlertDialog.Builder(context);
                //alerDialogBuilder.setMessage("Eliga Informacion deseada")
                  //      .setCancelable(false)
                    //    .setPositiveButton("Administrativo", new DialogInterface.OnClickListener() {
                        //    @Override
                          //  public void onClick(DialogInterface dialogInterface, int i) {
                                //esperemos
                      //      }
                       // })
                      //  .setNegativeButton("Usuarios", new DialogInterface.OnClickListener() {
                          //  @Override
                           // public void onClick(DialogInterface dialogInterface, int i) {
                                //
                      //      }
                    //    });
               // AlertDialog alertDialog = alerDialogBuilder.create();
               // alertDialog.show();

            //}
        //});


        //la programacion de la lista
        View header = (View) getLayoutInflater().inflate(R.layout.list_header_row, null);

        lista.addHeaderView(header);
        lista.setAdapter(adapter);
        //para que funcione cuando le de click a la lista
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            //@Override
            //public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            //  TextView v = (TextView)view.findViewById(R.id.texto);


            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int posicion, long l) {
                //que funcione cuando presiona los botones de la lista
                Intent li = new Intent(getApplicationContext(), buscar.class);
                startActivity(li);
            }
        });
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

    }
}

