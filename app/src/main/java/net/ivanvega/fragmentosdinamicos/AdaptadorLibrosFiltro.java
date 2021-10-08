package net.ivanvega.fragmentosdinamicos;

import android.content.Context;

import java.util.Locale;
import java.util.Vector;

public class AdaptadorLibrosFiltro extends MiAdaptadorPersonalizado{
    private Vector<Libro> vectorSinFiltro; //Vector con todos los libros
    private Vector<Integer> indiceFiltro; //Indice en vectorSinFiltro de
                                            //Cada elemento de vectorLibros
    private String busqueda = "";           //buscqueda sobre autor o titulo
    private String genero = "";             //Gener
    private boolean novedad = false;
    private boolean leido = false;


    public AdaptadorLibrosFiltro(Context context, Vector<Libro> libroVector){
        super(context, libroVector);
        vectorSinFiltro = libroVector;
        recalculaFiltro();
    }

    public void setBusqueda(String busqueda){
        this.busqueda=busqueda.toLowerCase();
        recalculaFiltro();
    }
    public  void setGenero(String genero){
        this.genero=genero;
        recalculaFiltro();
    }
    public void setNovedad(boolean novedad){
        this.novedad = novedad;
        recalculaFiltro();
    }
    public void setLeido(boolean leido){
        this.leido=leido;
        recalculaFiltro();
    }

    public void recalculaFiltro(){
        libros = new Vector<Libro>();
        indiceFiltro = new Vector<Integer>();
        for(int i = 0; i < vectorSinFiltro.size(); i++){
            Libro libro =  vectorSinFiltro.elementAt(i);
            if((libro.titulo.toLowerCase().contains(busqueda) || libro.autor.toLowerCase().contains(busqueda))
                && (libro.genero.startsWith(genero))
                    &&(!novedad || (novedad && libro.novedad))
                        &&(!leido || (leido && libro.leido))){
                libros.add(libro);
                indiceFiltro.add(i);
            }
        }
    }

    public Libro getItem(int posicion){
        return vectorSinFiltro.elementAt(indiceFiltro.elementAt(posicion));
    }

    public long getItemId(int posicion){
        return indiceFiltro.elementAt(posicion);
    }

    public void borrar(int posicion){
        vectorSinFiltro.remove((int)getItemId(posicion));
        recalculaFiltro();
    }

    public void insertar(Libro libro){
        vectorSinFiltro.add(libro);
        recalculaFiltro();;
    }

}
