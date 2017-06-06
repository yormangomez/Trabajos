package commm.example.yorman.trabajo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Informacion extends AppCompatActivity implements View.OnClickListener {
    Spinner spe;
    Button boton,boton2;
    EditText texto, texto2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion);

        boton = (Button) findViewById(R.id.boton);
        boton.setOnClickListener(this);
        boton2 = (Button) findViewById(R.id.boton2);
        boton2.setOnClickListener(this);

        //este listado
        spe = (Spinner) findViewById(R.id.spe);
        List list = new ArrayList();
        list.add("Administrativo");
        list.add("Estudiante");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1, list);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spe.setAdapter(arrayAdapter);

        spe.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(Informacion.this, "position" + String.valueOf(spe.getSelectedItem()), Toast.LENGTH_LONG).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                // va hasta aca
            }
        });
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.boton:
                Intent intent = new Intent(this,menus.class);
                startActivity(intent);
                break;
            case R.id.boton2:
                Intent login = new Intent(this,menus.class);
                startActivity(login);
                break;
        }
    }
}


