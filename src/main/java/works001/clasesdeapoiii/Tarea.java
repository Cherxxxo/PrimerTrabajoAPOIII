/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package works001.clasesdeapoiii;

import java.util.Arrays;

/**
 *
 * @author darka
 */


public class Tarea implements Comparable<Tarea> {

  // Atributos
  private int id;
  private String descripcion;
  private int prioridad;

  // Constructor
  public Tarea(int id, String descripcion, int prioridad) {
    this.id = id;
    this.descripcion = descripcion;
    this.prioridad = prioridad;
  }

  // Métodos getter y setter
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public int getPrioridad() {
    return prioridad;
  }

  public void setPrioridad(int prioridad) {
    this.prioridad = prioridad;
  }

  // Método para comparar tareas por prioridad
  @Override
  public int compareTo(Tarea t) {
    return this.prioridad - t.prioridad;
  }
}
