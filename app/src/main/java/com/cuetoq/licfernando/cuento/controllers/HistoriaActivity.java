package com.cuetoq.licfernando.cuento.controllers;

import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.cuetoq.licfernando.cuento.R;
import com.cuetoq.licfernando.cuento.models.Historia;
import com.cuetoq.licfernando.cuento.models.Pagina;


public class HistoriaActivity extends ActionBarActivity {

    Historia historia = new Historia();//objeto, aki estan el contenido
    //incializar controles
    TextView tvTexto;
    Button btnOpcion1;
    Button btnOpcion2;
    ImageView ivImagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historia);

        tvTexto = (TextView) findViewById(R.id.tvTexto);
        btnOpcion1 = (Button) findViewById(R.id.btnOpcion1);
        btnOpcion2 = (Button) findViewById(R.id.btnOpcion2);
        ivImagen = (ImageView) findViewById(R.id.ivImagen);

        cargarPagina(0);

    }

    public void cargarPagina(int numPag){
        final Pagina paginaActual = historia.obtenerPagina(numPag);//obtener pagina del Modelo Historia
        //obtener la imagen
        Drawable drawable = getResources().getDrawable(paginaActual.getImagenID()); //trae la carpeta de drawable en la.posicion del archivo
        ivImagen.setImageDrawable(drawable);
        tvTexto.setText(paginaActual.getTexto());

        if (paginaActual.paginaFinal){
            //fin
            btnOpcion1.setVisibility(View.INVISIBLE);
            btnOpcion2.setText("Volver a jugar");
            btnOpcion2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();//termina la Activity
                }
            });
        }else {
            //continuas
            btnOpcion1.setText(paginaActual.getOpcion1().getTexto()); //obtiene el texto "ir a marte"
            btnOpcion2.setText(paginaActual.getOpcion2().getTexto());

            //los clicks de las opciones
            //BOTON 1
            btnOpcion1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int numPagSel = paginaActual.getOpcion1().getNumPag(); //opcion ke seleccionaste
                    cargarPagina(numPagSel);
                }
            });
            //BOTON 2
            btnOpcion2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int numPagSel = paginaActual.getOpcion2().getNumPag(); //opcion ke seleccionaste
                    cargarPagina(numPagSel);
                }
            });
        }
    }


}
