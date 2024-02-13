/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package works001.clasesdeapoiii;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Checho Morillo
 */
public class ClasesDeAPOIII {

  private static ArrayList<Tarea> misTareas = new ArrayList<>();

  public static void main(String[] args) {

    Scanner lector = new Scanner(System.in);

    boolean activo = true;
    do {
      System.out.println("Ingrese una opción:");
      System.out.println("1. Agregar Tarea");
      System.out.println("2. Mostrar Tareas");
      System.out.println("3. Salir");

      int opcion = lector.nextInt();

      switch (opcion) {
          //tenia algun problema con la asignacion de las prioridades y con la ayuda de un maestro ingrese el switch
          //para poder gestionar en vez de if y el else if
        case 1:
          // Agregar tarea
          int id = leerId(lector);
          String descripcion = leerDescripcion(lector);
          int prioridad = leerPrioridad(lector);

          Tarea nuevaTarea = new Tarea(id, descripcion, prioridad);
          misTareas.add(nuevaTarea);
          System.out.println("Tarea Agregada satisfactoriamente");
          break;
        case 2:
          // Mostrar tareas
          mostrarTareas();
          break;
        case 3:
          // Salir
          System.out.println("¡Hasta luego!");
          return;
        default:
          System.out.println("Opción no válida");
      }
    } while (activo);
  }

  private static int leerId(Scanner lector) {
    System.out.println("Ingrese el id de la tarea:");
    return lector.nextInt();
  }

  private static String leerDescripcion(Scanner lector) {
    System.out.println("Ingrese la descripción de la tarea:");
    lector.nextLine();
    return lector.nextLine();
  }

  private static int leerPrioridad(Scanner lector) {
    System.out.println("Ingrese la prioridad de 1-5:");
    return lector.nextInt();
  }

  private static void mostrarTareas() {
    // Ordenar las tareas por prioridad
    Collections.sort(misTareas);

    System.out.println("=======Tareas Registradas");
    for (Tarea t : misTareas) {
      System.out.println("id:" + t.getId());
      System.out.println("descripcion:" + t.getDescripcion());
      System.out.println("prioridad:" + t.getPrioridad());
      System.out.println("==============");
    }
  }
}

