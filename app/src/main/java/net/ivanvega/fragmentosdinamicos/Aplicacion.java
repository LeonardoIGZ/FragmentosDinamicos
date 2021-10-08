package net.ivanvega.fragmentosdinamicos;

import android.app.Application;

import java.util.Vector;

public class Aplicacion extends Application {
    private Vector<Libro> vectorLibros;
    private AdaptadorLibrosFiltro adaptador;

    @Override
    public void onCreate(){
        vectorLibros = Libro.ejemplosLibros();
        adaptador =  new AdaptadorLibrosFiltro(this, vectorLibros);
    }

    public Vector<Libro> getVectorLibros() {
        return vectorLibros;
    }

    public AdaptadorLibrosFiltro getAdaptador() {
        return adaptador;
    }
}
