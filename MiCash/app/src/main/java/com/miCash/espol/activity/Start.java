package com.miCash.espol.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import com.miCash.espol.listener.EventoMenuPrincipal;

public class Start extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        Button iniciarSesion = (Button) findViewById (R.id.btn_iniciarSesion );
        iniciarSesion.setOnClickListener(new EventoMenuPrincipal(this, 0));

        Button registrarse = (Button) findViewById (R.id.btn_registrarse);
        registrarse.setOnClickListener(new EventoMenuPrincipal(this, 1));

        /*Button iniciarFb = (Button) findViewById (R.id.action_settings );
        iniciarFb.setOnClikListener(new EventosMenuPrincipal(this, 2));*/
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.start, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
