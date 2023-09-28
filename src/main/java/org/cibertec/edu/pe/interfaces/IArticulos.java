package org.cibertec.edu.pe.interfaces;

import org.cibertec.edu.pe.modelo.Articulos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IArticulos extends JpaRepository<Articulos, String> {

}
