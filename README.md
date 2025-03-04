import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PaseDeLista {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Lista de estudiantes (nombre y estado de asistencia)
        Map<String, Boolean> listaAsistencia = new HashMap<>();
        
        // Agregamos estudiantes a la lista
        listaAsistencia.put("Juan", false);
        listaAsistencia.put("María", false);
        listaAsistencia.put("Carlos", false);
        listaAsistencia.put("Ana", false);
        listaAsistencia.put("Luis", false);
        
        System.out.println("Pase de lista: Ingrese 'P' para presente o 'A' para ausente.");
        
        // Recorrer la lista para marcar asistencia
        for (String estudiante : listaAsistencia.keySet()) {
            System.out.print("¿" + estudiante + " está presente? (P/A): ");
            String respuesta = scanner.nextLine().trim().toUpperCase();
            
            if (respuesta.equals("P")) {
                listaAsistencia.put(estudiante, true);
            } else {
                listaAsistencia.put(estudiante, false);
            }
        }
        
        // Mostrar la lista de asistencia
        System.out.println("\nLista de asistencia:");
        for (Map.Entry<String, Boolean> entry : listaAsistencia.entrySet()) {
            String estado = entry.getValue() ? "Presente" : "Ausente";
            System.out.println(entry.getKey() + ": " + estado);
        }
        
        scanner.close();
    }
}
