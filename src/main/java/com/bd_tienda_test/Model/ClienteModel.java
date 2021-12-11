package com.bd_tienda_test.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tabla_Clientes")	

public class ClienteModel {
	
	@Id
	private String cedula_Cliente;
	private String nombre_Cliente;
	private String correo_Cliente;
	private String direccion_Cliente;
	private String telefono_Cliente;
	
	
	public ClienteModel() {
		
	}

	public ClienteModel (String nombre, String cedula, String correo, String direccion, String telefono) {
		super();
		nombre_Cliente = nombre;
		cedula_Cliente = cedula;
		correo_Cliente = correo;
		direccion_Cliente = direccion;
		telefono_Cliente = telefono;
	}

	public String getCedula_Cliente() {
		return cedula_Cliente;
	}

	public void setCedula_Cliente(String cedula_Cliente) {
		this.cedula_Cliente = cedula_Cliente;
	}

	public String getNombre_Cliente() {
		return nombre_Cliente;
	}

	public void setNombre_Cliente(String nombre_Cliente) {
		this.nombre_Cliente = nombre_Cliente;
	}

	public String getCorreo_Cliente() {
		return correo_Cliente;
	}

	public void setCorreo_Cliente(String correo_Cliente) {
		this.correo_Cliente = correo_Cliente;
	}

	public String getDireccion_Cliente() {
		return direccion_Cliente;
	}

	public void setDireccion_Cliente(String direccion_Cliente) {
		this.direccion_Cliente = direccion_Cliente;
	}

	public String getTelefono_Cliente() {
		return telefono_Cliente;
	}

	public void setTelefono_Cliente(String telefono_Cliente) {
		this.telefono_Cliente = telefono_Cliente;
	}
	
}
	