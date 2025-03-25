public class Libro {

    private String titulo;
    private String autor;
    private int añoPublicacion;

    public Libro(String titulo, String autor, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int nuevoAñoPublicacion) {
        if (nuevoAñoPublicacion >= 1900 && nuevoAñoPublicacion <= 2025)
            this.añoPublicacion = nuevoAñoPublicacion;
        else
            System.out.println("No es posible actualizar el año de publicación debido a que el año ingresado esta fuera de rango.");
    }
}
