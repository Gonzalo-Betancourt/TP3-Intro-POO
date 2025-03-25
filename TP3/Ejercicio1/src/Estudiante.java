public class Estudiante {

    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;

    public Estudiante(String nombre, String apellido, String curso, double calificacion) {  // Constructor
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }

    public void mostrarInfo() { // Imprime la información de los atributos
        System.out.println("Estudiante : " + nombre + apellido);
        System.out.println("Curso : " + curso);
        System.out.println("Calificación : " + calificacion);
    }

    public void subirCalificacion(double puntos){ // Sube la calificacion
        var nuevaCalificacion = calificacion + puntos;
        if (nuevaCalificacion <= 10) {
            this.calificacion = nuevaCalificacion;
            System.out.println("Nueva calificación : " + calificacion);
        } else {
            this.calificacion = 10;
            System.out.println("La máxima calificación alcanzable es 10.\nNueva calificación : " + calificacion);
        }
    }

    public void bajarCalificacion(double puntos){ // Baja la calificacion
        var nuevaCalificacion = calificacion - puntos;

        if (nuevaCalificacion >= 0) {
            this.calificacion = nuevaCalificacion;
            System.out.println("Nueva calificación : " + calificacion);
        } else {
            this.calificacion = 0;
            System.out.println("La calificación no puede ser menor a 0.\nNueva califiación : " + calificacion);
        }
    }

}
