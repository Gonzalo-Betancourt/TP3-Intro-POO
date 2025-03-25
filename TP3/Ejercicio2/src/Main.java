public class Main {

    public static void main(String[] args) {

        Mascota gato1 = new Mascota("Felipe", "Gato", 1);

        gato1.mostrarInfo();

        System.out.println();

        gato1.cumplirAnios();
        gato1.cumplirAnios();

        System.out.println();

        gato1.mostrarInfo();
    }
}