package org.cibertec.edu.pe.service;

import java.util.List;
import java.util.Optional;

import org.cibertec.edu.pe.interfaceService.IArticulosService;
import org.cibertec.edu.pe.interfaces.IArticulos;
import org.cibertec.edu.pe.modelo.Articulos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticulosService implements IArticulosService {
	@Autowired
	private IArticulos data;
	
	
	@Override
	public List<Articulos> Listar() {
		return (List<Articulos>)data.findAll();
		
	}

	@Override
	public Optional<Articulos> Buscar(String Id) {
		return data.findById(Id);

	}

	@Override
	public int Grabar(Articulos ObjC) {
		int rpta = 0;
		Articulos Obj = data.save(ObjC);
		if(!Obj.equals(null))rpta = 1;
		return rpta;
	}

	@Override
	public void Suprimir(String Id) {
		data.deleteById(Id);
		
	}

}
