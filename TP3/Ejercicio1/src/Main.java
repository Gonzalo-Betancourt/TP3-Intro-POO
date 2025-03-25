
public class Main {
    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante("Pablo", "Torres", "1PROG2", 8);
        estudiante1.mostrarInfo();
        estudiante1.subirCalificacion(2);
        estudiante1.bajarCalificacion(11);

    }
}