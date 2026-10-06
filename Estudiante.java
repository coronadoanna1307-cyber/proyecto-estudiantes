public class Estudiante {
    private String nombre;
    private String matricula;
    private String carrera;
    private double promedio;

    public Estudiante(String nombre, String matricula, String carrera, double promedio) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.carrera = carrera;
        this.promedio = promedio;
    }

    public void mostrarInformacion() {
        System.out.println("================================");
        System.out.println("Nombre:     " + nombre);
        System.out.println("Matrícula:  " + matricula);
        System.out.println("Carrera:    " + carrera);
        System.out.println("Promedio:   " + promedio);
        System.out.println("================================");
    }

    public boolean estaAprobado() {
        return promedio >= 6.0;
    }

    public void actualizarPromedio(double nuevaNota) {
        if (nuevaNota >= 0 && nuevaNota <= 10) {
            promedio = nuevaNota;
            System.out.println("Promedio actualizado: " + promedio);
        } else {
            System.out.println("Error: La nota debe estar entre 0 y 10");
        }
    }

    public String getNombre() {
        return nombre;
    }
}