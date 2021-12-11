package com.bd_tienda_test.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="tabla_Usuarios")
public class UsuarioModel {
		
	
	@Id
	private String cedula_Usuario;
	private String nombre_Usuario;
	private String correo_Usuario;
	private String usuario;
	private String clave_Usuario;
	
	public UsuarioModel()
	{
		
	}

	public UsuarioModel(String nombre, String cedula, String correo, String usuario_U, String clave) {
		super();
		nombre_Usuario = nombre;
		cedula_Usuario = cedula;
		correo_Usuario = correo;
		usuario = usuario_U;
		clave_Usuario = clave;
	}
	
	public String getNombre_Usuario() {
		return nombre_Usuario;
	}

	public void setNombre_Usuario(String nombre_Usuario) {
		this.nombre_Usuario = nombre_Usuario;
	}

	public String getCedula_Usuario() {
		return cedula_Usuario;
	}

	public void setCedula_Usuario(String cedula_Usuario) {
		this.cedula_Usuario = cedula_Usuario;
	}

	public String getCorreo_Usuario() {
		return correo_Usuario;
	}

	public void setCorreo_Usuario(String correo_Usuario) {
		this.correo_Usuario = correo_Usuario;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getClave_Usuario() {
		return clave_Usuario;
	}

	public void setClave_Usuario(String contraseña_Usuario) {
		this.clave_Usuario = contraseña_Usuario;
	}

	
}
