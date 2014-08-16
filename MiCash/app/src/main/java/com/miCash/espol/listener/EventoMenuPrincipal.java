package com.miCash.espol.listener;

import android.view.View.OnClickListener;
import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.miCash.espol.activity.LoginActivity;
import com.miCash.espol.activity.Registrarse;

/**
 * Created by usuario on 16/08/2014.
 */
public class EventoMenuPrincipal implements OnClickListener{

    private Context contexto;
    private int opcion;

    public EventoMenuPrincipal(Context contexto, int opcion) {
        super();
        this.contexto = contexto;
        this.opcion = opcion;
    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        switch (this.opcion){
            case 0:{
                Intent iniciarSesion = new Intent(this.contexto,LoginActivity.class);
                this.contexto.startActivity(iniciarSesion);
                break;
            }
            case 1:{
                Intent registrarse = new Intent(this.contexto, Registrarse.class);
                this.contexto.startActivity(registrarse);
                break;
            }
        }
    }

}
