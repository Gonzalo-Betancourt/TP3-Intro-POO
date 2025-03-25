public class Mascota {

    private String nombre;
    private String especie;
    private int edad;

    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    public void mostrarInfo (){
        System.out.println("Nombre : " + nombre);
        System.out.println("Especie : " + especie);
        System.out.println("Edad : " + edad);
    }

    public void cumplirAnios () {
        this.edad = edad + 1;
        System.out.println("Felicidades" + nombre + " cumplió años y ahora tiene " + edad + "!");
    }

}
