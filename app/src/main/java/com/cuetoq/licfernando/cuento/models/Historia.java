package com.cuetoq.licfernando.cuento.models;

import android.graphics.pdf.PdfDocument;

import com.cuetoq.licfernando.cuento.R;

/** INFORMACION  DATOS
 * Created by Lic.Fernando on 05/09/2015.
 */
public class Historia {
    private Pagina[] paginas; //array

    //constructor
    public Historia(){
        paginas = new Pagina[7]; //un array de 7

        //4 parametros ke tiene la clase Pagina
        paginas[0] = new Pagina(
                R.drawable.page0,
                "En tu regreso del viaje de estudios de los anillos de saturno tu escuchas una señal" +
                        "que parece venir de la supercie de marte. Es extraño ya que "+
                        "existico ninguna colonia" +
                        "nombre Ayucame por favor tu eres mi unica esperanza",
                new Opcion("Detente e investiga",1), //botnoes pagina 1
                new Opcion("Continuar de regreso a la tierra",2) //pagina 2
        );

        paginas[1] = new Pagina(
                R.drawable.page1,
                "Tu aterrado aterrizas tu nave cerkillas de donde viene la señal, tu no notas" +
                        "solo que enfrente de ti hay una cueva con una nave abandona del siglo XXV",
                new Opcion("Exlorar la cueva",3), //botnoes pagina 1
                new Opcion("Explorar navecilla",4)//pagina 2
        );

        paginas[2] = new Pagina(
                R.drawable.page2,
                "Tu  continuas tu camino hacia la tierra, pero 2 dias despues te llaga" +
                        "un mail" +
                        "del depto espacial diciendote ke hay" +
                        "una anomalia en el planet Marte" +
                        "cerca de la nave abandonada.  Te estan pidiendo" +
                        "ke vayas y pues nimodo tienes ke ir" +
                        "...se tardo mas de la previsto y ya te terminaste la comida y el agua.",
                new Opcion("ir a marte",4), //botnoes pagina 1
                new Opcion("regresar a la tierraa",6) //pagina 2
        );

        paginas[3] = new Pagina(
                R.drawable.page3,
                "Tu  continuas tu camino hacia la tierra, pero 2 dias despues te llaga" +
                        "un mail" +
                        "del depto espacial diciendote ke hay" +
                        "una anomalia en el planet Marte" +
                        "cerca de la nave abandonada.  Te estan pidiendo" +
                        "ke vayas y pues nimodo tienes ke ir" +
                        "...se tardo mas de la previsto y ya te terminaste la comida y el agua.",
                new Opcion("rellenar tanke y ver nave abandonada",4), //botnoes pagina 1
                new Opcion("continuar por la luz",6) //pagina 2
        );

        paginas[4] = new Pagina(
                R.drawable.page4,
                "La nave esta cubierta en polvo y la mayoria de los cristales" +
                        "estan rotos, ero te" +
                        "sorprende al ver ke ell sit de la " +
                        "nave esta funcionando y en la pantlalla" +
                        "hay un mensajito ke dice ve a  estas" +
                        "coordenadas 28,81 estas coordenadas" +
                        "no estan muy lejos pao no sanes si te" +
                        "alcannce el ocigeno para or ay venir",
                new Opcion("rellenar tanke y ver nave abandonada",5), //botnoes pagina 1
                new Opcion("continuar de regreso a la tierra",6) //pagina 2
        );

        //llama al segundo constructor
        paginas[5] = new Pagina(
                R.drawable.page5,
                "Despues de una largo camino arriba descubres en un" +
                        "pekeño crater" +
                        "que esta tu samsug  ke habias olvidado" +
                        "en un amision previa" +
                        "marte lo tomas y te tomas una selfie"
        );

        paginas[6] = new Pagina(
                R.drawable.page6,
                "Tu llegas a la tierra despues de haber concluido tu" +
                        "mision en saturno, preguntandote" +
                        "que habria sido akella señal espacial en marte, alo mejor no era nada" +
                        "asi ke fuga" +
                        "a investigar"
        );

    }//FIN CONSTRUCTOR

    //creas un apagina
    public Pagina obtenerPagina(int numPag){
        return paginas[numPag];//busco mi array
    }
}
