public class Main {

    public static void main(String[] args) {

        Gallina gallina1 = new Gallina(1, 3, 30);
        Gallina gallina2 = new Gallina(2, 1, 10);

        gallina1.mostrarEstado();
        gallina2.mostrarEstado();

        gallina1.ponerHuevos();
        gallina2.ponerHuevos();

        gallina1.envejecer();
        gallina2.envejecer();

        gallina1.mostrarEstado();
        gallina2.mostrarEstado();

    }
}