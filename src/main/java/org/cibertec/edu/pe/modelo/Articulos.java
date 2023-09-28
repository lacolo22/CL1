package org.cibertec.edu.pe.modelo;
import javax.persistence.Id;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Articulos")
public class Articulos {
	
	@Id
	private String Id;
	private String Nombre;
	private String Descripcion;
	private double Precio;
	private int Cantidad;
	private double Total;
	
	public Articulos() {
		
	}
	
	
	public Articulos(String id, String nombre, String descripcion, double precio, int cantidad, double total) {

		Id = id;
		Nombre = nombre;
		Descripcion = descripcion;
		Precio = precio;
		Cantidad = cantidad;
		Total = total;
	}


	public String getId() {
		return Id;
	}


	public void setId(String id) {
		Id = id;
	}


	public String getNombre() {
		return Nombre;
	}


	public void setNombre(String nombre) {
		Nombre = nombre;
	}


	public String getDescripcion() {
		return Descripcion;
	}


	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}


	public double getPrecio() {
		return Precio;
	}


	public void setPrecio(double precio) {
		Precio = precio;
	}


	public int getCantidad() {
		return Cantidad;
	}


	public void setCantidad(int cantidad) {
		Cantidad = cantidad;
	}


	public double getTotal() {
		return Total;
	}


	public void setTotal(double total) {
		Total = total;
	}
	
	
	
}
