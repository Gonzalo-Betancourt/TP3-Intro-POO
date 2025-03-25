public class Main {

    public static void main(String[] args) {

        Libro libro1 = new Libro("Juego de Tronos", "George R.R. Martin", 1996);

        System.out.println(libro1.getTitulo());
        System.out.println(libro1.getAutor());
        System.out.println(libro1.getAñoPublicacion());

        libro1.setAñoPublicacion(1800);
        libro1.setAñoPublicacion(1997);

        System.out.println(libro1.getAñoPublicacion());

    }
}