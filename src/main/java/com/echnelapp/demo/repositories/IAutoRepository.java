package com.echnelapp.demo.repositories;

import com.echnelapp.demo.models.Auto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IAutoRepository extends JpaRepository<Auto, Long> {
    List<Auto> findByMarca(String marca);
    List<Auto> findByColor(String color);
    List<Auto> findByModelo(String modelo);
    List<Auto> findByAnio(Long anio);
}
