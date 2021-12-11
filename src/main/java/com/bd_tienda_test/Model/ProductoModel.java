package com.bd_tienda_test.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tabla_Productos")
public class ProductoModel {

	@Id
	private String codigo_Producto;
	private String nombre_Producto;
	private String nit_Proveedor;
	private double precio_Compra;
	private double iva_Producto;
	private double precio_Venta_Producto;
	
	public ProductoModel() {
		
	}
	
	public ProductoModel (String nombre, String codigo, String nit, double costo, double iva, double precioVenta) {
		super();
		nombre_Producto = nombre;
		codigo_Producto = codigo;
		nit_Proveedor = nit;
		precio_Compra = costo;
		iva_Producto = iva;
		precio_Venta_Producto = precioVenta;
	}

	public String getCodigo_Producto() {
		return codigo_Producto;
	}

	public void setCodigo_Producto(String codigo_Producto) {
		this.codigo_Producto = codigo_Producto;
	}

	public String getNombre_Producto() {
		return nombre_Producto;
	}

	public void setNombre_Producto(String nombre_Producto) {
		this.nombre_Producto = nombre_Producto;
	}

	public String getNit_Proveedor() {
		return nit_Proveedor;
	}

	public void setNit_Proveedor(String nit_Proveedor) {
		this.nit_Proveedor = nit_Proveedor;
	}

	public double getPrecio_Compra() {
		return precio_Compra;
	}

	public void setPrecio_Compra(double precio_Compra) {
		this.precio_Compra = precio_Compra;
	}

	public double getIva_Producto() {
		return iva_Producto;
	}

	public void setIva_Producto(double iva_Producto) {
		this.iva_Producto = iva_Producto;
	}

	public double getPrecio_Venta_Producto() {
		return precio_Venta_Producto;
	}

	public void setPrecio_Venta_Producto(double precio_Venta_Producto) {
		this.precio_Venta_Producto = precio_Venta_Producto;
	}
	
	
	
	
}
