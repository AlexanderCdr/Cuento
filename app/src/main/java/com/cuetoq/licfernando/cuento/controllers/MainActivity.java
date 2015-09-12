package com.cuetoq.licfernando.cuento.controllers;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.cuetoq.licfernando.cuento.R;


public class MainActivity extends ActionBarActivity {

    Button btnEmpieza;
    TextView tvNombre;
public static final String TAG = MainActivity.class.getSimpleName(); //nunca va cambiar esta variable

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //inicialirar recursos
        btnEmpieza = (Button) findViewById(R.id.btnEmpieza);
        tvNombre = (TextView) findViewById(R.id.tuNombre);

       btnEmpieza.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               //String name = tvNombre.getText().toString();
               //Log.d(TAG,name);
               //crear instancia de una clase
               Intent intent = new Intent(MainActivity.this, HistoriaActivity.class);//objeto
               startActivity(intent);//abrir activiti compartida
           }
       });
    }


}
