package org.cibertec.edu.pe.controller;

import java.util.List;
import java.util.Optional;

import org.cibertec.edu.pe.interfaceService.IArticulosService;
import org.cibertec.edu.pe.modelo.Articulos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping
public class ArticulosController {

	@Autowired
	private IArticulosService servicio;
	
	// Método para Listar Principal

		@GetMapping("/principal")	// localhost:8080/listar

		public String Listado(Model m) {

			List<Articulos> lista = servicio.Listar();

			m.addAttribute("articulos", lista);

			return "principal";	// principal.html

		}

		
		// Método para Listar detallecarrito

		@GetMapping("/detallecarrito")	// localhost:8080/detallecarrito

		public String Listado2(Model m) {

			List<Articulos> lista = servicio.Listar();

			m.addAttribute("articulos", lista);

			return "detallecarrito";	// detallecarrito.html

		}


		// Método para Buscar

		@GetMapping("/ver/{id}") // localhost:8080/ver/1

		public String Buscar(@PathVariable String id,Model m) {

			Optional<Articulos> ObjC = servicio.Buscar(id);

			m.addAttribute("articulo", ObjC);

			return "ver";		// ver.html

		}

		

		// Método para insertar

		@GetMapping("/nuevo")

		public String agregar(Model m) {

			m.addAttribute("articulos",new Articulos());

			return "form";		// form.html

		}

		

		// Método para salvar

		@PostMapping("/salvar")

		public String salvar(@Validated Articulos ObjC, Model m) {

			servicio.Grabar(ObjC);

			return "redirect:/listar";

		}

		

		// Método para editar

		@GetMapping("/editar/{id}")

		public String editar(@PathVariable String id, Model m) {

			Optional<Articulos> ObjC = servicio.Buscar(id);

			m.addAttribute("articulos", ObjC);

			return "form";		// form.html

		}

		

		// Método para eliminar

		@GetMapping("/eliminar/{id}")

		public String eliminar(@PathVariable String id, Model m) {

			servicio.Suprimir(id);

			return "redirect:/listar";		// form.html

		}

}
