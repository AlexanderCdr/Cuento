package com.cuetoq.licfernando.cuento.models;

/**
 * Created by Lic.Fernando on 05/09/2015.
 */
//BOTONES!
//clase
public class Opcion {
    //atributos
    private String texto;
    private int numPag;

    //constructor (mismo nombre ke la clase)
    public Opcion(String texto,int numPag){
        //inicialzar variables
        this.texto = texto;
        this.numPag = numPag;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }
}
