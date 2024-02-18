package com.echnelapp.demo.controllers;

import com.echnelapp.demo.models.Auto;
import com.echnelapp.demo.services.AutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/autos")
public class AutoRestController {
    private AutoService autoService;
    @Autowired
    public AutoRestController(AutoService autoService) {
        this.autoService = autoService;
    }
    @PostMapping(value = "crear", headers = "Accept=application/json")
    public void crearAuto(@RequestBody Auto auto) {
        autoService.crearAuto(auto);
    }
    @GetMapping(value = "listar", headers = "Accept=application/json")
    public List<Auto> listarAutos() {
        return autoService.listarAutos();
    }
    @GetMapping(value = "listar/{id}", headers = "Accept=application/json")
    public Optional<Auto> listarAutoPorId(@PathVariable Long id) {
        return autoService.buscarPorId(id);
    }
    @PutMapping(value = "actualizar", headers = "Accept=application/json")
    public void actualizarAuto(@RequestBody Auto auto) {
        autoService.actualizarAuto(auto);
    }
    @DeleteMapping(value = "eliminar/{id}", headers = "Accept=application/json")
    public void eliminarAuto(@PathVariable Long id) {
        autoService.eliminarAutoPorId(id);
    }
    @GetMapping(value = "listarMarca/{marca}", headers = "Accept=application/json")
    public List<Auto> listarPorMarca(@PathVariable String marca) {
        return autoService.buscarPorMarca(marca);
    }
    @GetMapping(value = "listarPorModelo/{modelo}")
    public List<Auto> listarPorModelo(@PathVariable String modelo) {
        return autoService.buscarPorModelo(modelo);
    }
    @GetMapping(value = "listarPorColor/{color}")
    public List<Auto> listarPorColor(@PathVariable String color) {
        return autoService.buscarPorColor(color);
    }
    @GetMapping(value = "listarPorAnio/{anio}")
    public List<Auto> listarPorAnio(@PathVariable Long anio) {
        return autoService.buscarPorAnio(anio);
    }
}
