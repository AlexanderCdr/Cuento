package com.cuetoq.licfernando.cuento.models;

/**
 * Created by Lic.Fernando on 05/09/2015.
 */
public class Pagina {
    private int imagenID;
    private String texto;
    private Opcion opcion1; //clase Opcion
    private Opcion opcion2;
    public boolean paginaFinal = false; //para ke se vea en Historia.java publico

    //constructor
    public Pagina(int imagenID,String texto,Opcion opcion1,Opcion opcion2){
        this.imagenID = imagenID;
        this.texto = texto;
        this.opcion1 = opcion1;
        this.opcion2 = opcion2;
    }

    //otro constructor para las paginas ke no tienen opciones
    //se llama solo en las ultimas opciones
    public Pagina(int imagenID,String texto){
        this.imagenID = imagenID;
        this.texto = texto;
        this.opcion1 = null;
        this.opcion2 = null;
        paginaFinal = true;
    }

    public int getImagenID() {
        return imagenID;
    }

    public void setImagenID(int imagenID) {
        this.imagenID = imagenID;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Opcion getOpcion1() {
        return opcion1;
    }

    public void setOpcion1(Opcion opcion1) {
        this.opcion1 = opcion1;
    }

    public Opcion getOpcion2() {
        return opcion2;
    }

    public void setOpcion2(Opcion opcion2) {
        this.opcion2 = opcion2;
    }
}
