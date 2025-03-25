public class NaveEspacial {

    private String nombre;
    private int combustible;

    public NaveEspacial(String nombre, int combustible) {
        this.nombre = nombre;
        this.combustible = combustible;
    }

    public void despegar(){ // Reduce 10 unidades de combustible al despegar.
                            // No puede despegar si hay menos de 10 unidades.
        if (combustible >= 10) {
            System.out.println("La nave despegó...");
        } else {
            System.out.println("La nave no posee el combustible necesario para despegar.");
        }

    }

    public void avanzar(int distancia){ // Consume 1 unidad de combustible por cada unidad de distancia.
                                        // No puede avanzar si no hay suficiente combustible.
        var gastoCombustible = combustible - distancia;
        if (gastoCombustible >= 0){
            System.out.println("La nave avanzó...");
            combustible -= distancia;
        } else {
            System.out.println("La nave no avanzó debido a que no tenia suficiente combustible...");
        }
    }

    public void recargarCombustible(int cantaidad){ // Aumenta la cantidad de combustible en la nave.
                                                    // No puede superar el límite máximo de 100 unidades.
        var recargaCombustible = combustible + cantaidad;
        if (recargaCombustible <= 100){
            combustible = recargaCombustible;
            System.out.println("Combustible tras la recarga : " + combustible);
        } else {
            combustible = 100;
            System.out.println("La cantidad máxima de combustible es 100.");
            System.out.println("Combustible tras la recarga : " + cantaidad);
        }

    }

    public void mostrarEstado(){ // Muestra el nombre de la nave y la cantidad de combustible actual.
        System.out.println("Nombre : " + nombre);
        System.out.println("Cantidad : " + combustible);
    }
}