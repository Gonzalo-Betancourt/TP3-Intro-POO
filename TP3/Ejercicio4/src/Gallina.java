public class Gallina {

    private int idGallina;
    private int edad;
    private int huevosPuestos;

    public Gallina(int idGallina, int edad, int huevosPuestos) {
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = huevosPuestos;
    }

    public void ponerHuevos(){
        this.huevosPuestos += 1;
        System.out.println("Id : " + idGallina + " - Huevos puestos : " + huevosPuestos);
    }

    public void envejecer(){
        this.edad += 1;
        System.out.println("Id : " + idGallina + " - Edad : " + edad);
    }

    public void mostrarEstado(){
        System.out.println("Id : " + idGallina + " - Edad : " + edad + " - Heuvos puestos : " + huevosPuestos);
    }

}
