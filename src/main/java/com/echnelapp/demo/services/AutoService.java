package com.echnelapp.demo.services;

import com.echnelapp.demo.models.Auto;
import com.echnelapp.demo.repositories.IAutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutoService {

    private IAutoRepository autoRepository;
    @Autowired
    public AutoService(IAutoRepository autoRepository) {
        this.autoRepository = autoRepository;
    }
    public void crearAuto(Auto auto) {
        autoRepository.save(auto);
    }
    public List<Auto> listarAutos() {
        return autoRepository.findAll();
    }
    public Optional<Auto> buscarPorId(Long id) {
        return autoRepository.findById(id);
    }

    public void actualizarAuto(Auto auto) {
        autoRepository.save(auto);
    }
    public void eliminarAutoPorId(Long id) {
        autoRepository.deleteById(id);
    }
    public List<Auto> buscarPorMarca(String marca) {
        return autoRepository.findByMarca(marca);
    }
    public List<Auto> buscarPorModelo(String modelo) {
        return autoRepository.findByModelo(modelo);
    }
    public List<Auto> buscarPorColor(String color) {
        return autoRepository.findByColor(color);
    }
    public List<Auto> buscarPorAnio(Long anio) {
        return autoRepository.findByAnio(anio);
    }
}
