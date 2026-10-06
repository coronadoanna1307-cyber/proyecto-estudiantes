public class Principal {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante(
            "Erick Alberto Morales Trejo",
            "105618",
            "Ingeniería en Datos",
            9.2
        );

        Estudiante e2 = new Estudiante(
            "Juan García Ruiz",
            "105620",
            "Ingeniería en Datos",
            5.8
        );

        System.out.println("===== ESTUDIANTES =====");
        
        e1.mostrarInformacion();
        System.out.println("¿Aprobado? " + (e1.estaAprobado() ? "Sí" : "No") + "\n");

        e2.mostrarInformacion();
        System.out.println("¿Aprobado? " + (e2.estaAprobado() ? "Sí" : "No"));
        
        System.out.println("\n===== ACTUALIZAR NOTA =====");
        e2.actualizarPromedio(7.5);
        System.out.println("¿Aprobado ahora? " + (e2.estaAprobado() ? "Sí" : "No"));
    }
}