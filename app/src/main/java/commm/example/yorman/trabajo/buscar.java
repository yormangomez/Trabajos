package commm.example.yorman.trabajo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class buscar extends AppCompatActivity implements View.OnClickListener{
    Button crear,login;
    TextView buscar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscar);

        crear = (Button) findViewById(R.id.crear);
        crear.setOnClickListener(this);
        login = (Button) findViewById(R.id.crear);
        login.setOnClickListener(this);
        buscar = (TextView)findViewById(R.id.buscar);
        buscar.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.crear:
                Intent cuenta = new Intent(this,Informacion.class);
                startActivity(cuenta);
                break;
            case R.id.login:
                Intent Login = new Intent(this,Informacion.class);
                startActivity(Login);
                break;
            case R.id.buscar:
                Intent servicio = new Intent(this,menus.class);
                startActivity(servicio);
                break;
        }

    }
}
