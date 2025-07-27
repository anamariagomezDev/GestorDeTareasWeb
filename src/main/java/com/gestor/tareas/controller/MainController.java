package com.gestor.tareas.controller;

import com.gestor.tareas.model.Tarea;
import com.gestor.tareas.repository.TareaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")

public class MainController {
    @Autowired
    private TareaRepository tareaRepository;
    @GetMapping("/")
    @Transactional
    public String saludar ( ){
        Tarea tarea = new Tarea();
       // tarea.setId(1L);

        tarea.setTitulo("Saludar");
        tareaRepository.save(tarea);
        return "te quiero alejo";
    }
}
