package com.gestor.tareas.service;

import com.gestor.tareas.model.Tarea;
import com.gestor.tareas.repository.TareaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TareaService {

    private TareaRepository tareaRepository;

    public TareaService(TareaRepository tareaRepository) {
        this.tareaRepository = tareaRepository;
    }
    public Tarea crearTarea(Tarea tarea) {
        return tareaRepository.save(tarea);
    }
    public List<Tarea> obtenerTodas() {
        return tareaRepository.findAll();
    }
    public Optional<Tarea> actualizarTarea(Long id, Tarea nuevaTarea) {
        return tareaRepository.findById(id).map(tareaExistente -> {
            tareaExistente.setTitulo(nuevaTarea.getTitulo());
            tareaExistente.setDescripcion(nuevaTarea.getDescripcion());
            tareaExistente.setFecha(nuevaTarea.getFecha());
            return tareaRepository.save(tareaExistente);
        });
    }
    public Optional<Tarea> obtenerTareaPorId(Long id) {
        return tareaRepository.findById(id);
    }
    public boolean eliminarTarea(Long id) {
        if (tareaRepository.existsById(id)) {
            tareaRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
