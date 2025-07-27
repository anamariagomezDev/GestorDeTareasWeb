package com.gestor.tareas.repository;

import com.gestor.tareas.model.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;

 /* Repositorio para la entidad Tarea.
 Esta interfaz proporciona operaciones de persistencia para las tareas,
 incluyendo métodos personalizados además de los proporcionados por JpaRepository -> CRUD.*/
public interface TareaRepository extends JpaRepository <Tarea, Long> {
}
