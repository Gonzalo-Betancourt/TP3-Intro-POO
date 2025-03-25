public class Main {

    public static void main(String[] args) {

        // Crear una instancia de la clase NaveEspacial con un nombre y 50 unidades de combustible.
        NaveEspacial nave1 = new NaveEspacial("Nave 1", 50);

        // Intentar avanzar 60 unidades sin recargar (debe fallar por falta de combustible).
        nave1.avanzar(60);

        // Recargar 40 unidades de combustible.
        nave1.recargarCombustible(40);

        // Intentar avanzar 60 unidades nuevamente (ahora debe funcionar).
        nave1.avanzar(60);

        // Mostrar el estado actual de la nave.
        nave1.mostrarEstado();

    }
}