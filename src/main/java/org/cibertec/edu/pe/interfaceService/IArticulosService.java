package org.cibertec.edu.pe.interfaceService;

import java.util.List;
import java.util.Optional;

import org.cibertec.edu.pe.modelo.Articulos;


public interface IArticulosService {
	public List<Articulos> Listar();
	public Optional<Articulos> Buscar(String Id);
	public int Grabar(Articulos objC);
	public void Suprimir(String Id);

}
