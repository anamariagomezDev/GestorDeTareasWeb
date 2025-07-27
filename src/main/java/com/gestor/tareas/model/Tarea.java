package com.gestor.tareas.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor//constructor sin argumentos
@AllArgsConstructor // constructor con todos los atributos
@ToString


public class Tarea {

    @Id
    /*Esto le dice a JPA que use la estrategia autoincremental del motor de base de datos*/
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    /* @Column(columnDefinition = "TEXT"):
    le indica a JPA que cree la columna descripcion como TEXT en la
    base de datos, permitiendo almacenar cadenas de texto más largas
    que el límite por defecto de VARCHAR(255).*/
    @Column(columnDefinition = "TEXT")
    private String descripcion;

    private LocalDate fecha;

}


