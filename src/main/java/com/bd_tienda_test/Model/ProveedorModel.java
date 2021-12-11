package com.bd_tienda_test.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tabla_Proveedores")
public class ProveedorModel {

	@Id
	private String nit_Proveedor;
	private String nombre_Proveedor;
	private String direccion_Proveedor;
	private String ciudad_Proveedor;
	private String telefono_Proveedor;
	
	public ProveedorModel(){
		
	}
	
	public ProveedorModel(String nombre, String nit, String direccion, String ciudad, String telefono) {
		super();
		nombre_Proveedor = nombre;
		nit_Proveedor = nit;
		direccion_Proveedor = direccion;
		ciudad_Proveedor = ciudad;
		telefono_Proveedor = telefono;
}

	public String getNit_Proveedor() {
		return nit_Proveedor;
	}

	public void setNit_Proveedor(String nit_Proveedor) {
		this.nit_Proveedor = nit_Proveedor;
	}

	public String getNombre_Proveedor() {
		return nombre_Proveedor;
	}

	public void setNombre_Proveedor(String nombre_Proveedor) {
		this.nombre_Proveedor = nombre_Proveedor;
	}

	public String getDireccion_Proveedor() {
		return direccion_Proveedor;
	}

	public void setDireccion_Proveedor(String direccion_Proveedor) {
		this.direccion_Proveedor = direccion_Proveedor;
	}

	public String getCiudad_Proveedor() {
		return ciudad_Proveedor;
	}

	public void setCiudad_Proveedor(String ciudad_Proveedor) {
		this.ciudad_Proveedor = ciudad_Proveedor;
	}

	public String getTelefono_Proveedor() {
		return telefono_Proveedor;
	}

	public void setTelefono_Proveedor(String telefono_Proveedor) {
		this.telefono_Proveedor = telefono_Proveedor;
	}

}