package net.ivanvega.fragmentosdinamicos;

import java.util.Vector;

public class Libro {

    static Vector<Libro> libros = new Vector<Libro>();
    static{
        final String SERVIDOR =
                "https://www.audiomol.com/media/dinamico/libros/demos/";

        libros.add(new Libro("Kappa", "Akutagawa", R.drawable.kappa, SERVIDOR + "Trailer%20Ben-hur.mp3", Libro.G_S_XIX, false, false));
        libros.add(new Libro("Avecilla", "Alas Clarín, Leopoldo", R.drawable.avecilla, SERVIDOR + "Sample_Asi_hablo_Zaratustra_Gl6Fq40.mp3", Libro.G_S_XIX, true, false));
        libros.add(new Libro("Divina Comedia", "Dante", R.drawable.divina_comedia, SERVIDOR + "La_Divina_Comedia_bONemUk.mp3", Libro.G_EPICO, true, false));
        libros.add(new Libro("Viejo Pancho, El", "Alonso y Trelles, José", R.drawable.viejo_pancho, SERVIDOR + "los_viejos_amigos.mp3", Libro.G_S_XIX, true, true));
        libros.add(new Libro("Canción de Rolando", "Anónimo", R.drawable.cancion_rolando, SERVIDOR + "el_arte_de_la_guerra.mp3", Libro.G_EPICO, false, true));
        libros.add(new Libro("Matrimonio de sabuesos", "Agata Christie", R.drawable.matrim_sabuesos, SERVIDOR + "La_Narrativa_de_Arthur_Gordon_Pym_Sample.mp3", Libro.G_SUSPENSE, false, true));
        libros.add(new Libro("La iliada", "Homero", R.drawable.la_iliada, SERVIDOR + "El_Criador_de_Gorilas_Sample.mp3", Libro.G_EPICO, true, false));
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getRecursoImagen() {
        return recursoImagen;
    }

    public void setRecursoImagen(int recursoImagen) {
        this.recursoImagen = recursoImagen;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Libro( String titulo, String autor,
                  int recursoImagen, String url,
                  String genero,Boolean novedad, Boolean leido) {
        this.novedad = novedad;
        this.leido = leido;
        this.titulo = titulo;
        this.autor = autor;
        this.recursoImagen = recursoImagen;
        this.url = url;
        this.genero = genero;
    }

    public static Vector<Libro> ejemplosLibros(){
        return libros;
    }

    public Boolean getNovedad() {
        return novedad;
    }

    public void setNovedad(Boolean novedad) {
        this.novedad = novedad;
    }

    public Boolean getLeido() {
        return leido;
    }

    public void setLeido(Boolean leido) {
        this.leido = leido;
    }

    public String titulo;
    public String autor;
    public int recursoImagen;
    public String url;
    public String genero;
    public Boolean novedad; // Es una novedad
    public Boolean leido;

    // Leído por el usuario
    public final static String G_TODOS = "Todos los géneros";
    public final static String G_EPICO = "Poema épico";
    public final static String G_S_XIX = "Literatura siglo XIX";
    public final static String G_SUSPENSE = "Suspense";


}
