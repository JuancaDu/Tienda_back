package com.bd_tienda_test.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tabla_Ventas_Factura ")
public class FacturaModel {

	@Id
	private String codigo_Vta;
	private String cedula_Cli_Vta;
	private String nombre_Cli_Vta; 
	private String cod_Producto;
	private double cantidad;
	private double valor_Vta;
	private double valor_IVA;
	private double valor_Total;

	public FacturaModel() {

	}

	public FacturaModel(String codigo, String cedulaCli, String nombreCli, String codProduc,double cant,double valorVenta, double valorIVA,
			double valorFactura) {
		super();
		codigo_Vta = codigo;
		cedula_Cli_Vta = cedulaCli;
		nombre_Cli_Vta = nombreCli;
		cod_Producto =codProduc;
		cantidad =cant;
		valor_Vta = valorVenta;
		valor_IVA = valorIVA;
		valor_Total = valorFactura;
	}

	public String getCodigo_Vta() {
		return codigo_Vta;
	}

	public void setCodigo_Vta(String codigo_Vta) {
		this.codigo_Vta = codigo_Vta;
	}

	public String getCedula_Cli_Vta() {
		return cedula_Cli_Vta;
	}

	public void setCedula_Cli_Vta(String cedula_Cli_Vta) {
		this.cedula_Cli_Vta = cedula_Cli_Vta;
	}

	public String getNombre_Cli_Vta() {
		return nombre_Cli_Vta;
	}

	public void setNombre_Cli_Vta(String nombre_Cli_Vta) {
		this.nombre_Cli_Vta = nombre_Cli_Vta;
	}

	public String getCod_Producto() {
		return cod_Producto;
	}

	public void setCod_Producto(String cod_Producto) {
		this.cod_Producto = cod_Producto;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public double getValor_Vta() {
		return valor_Vta;
	}

	public void setValor_Vta(double valor_Vta) {
		this.valor_Vta = valor_Vta;
	}

	public double getValor_IVA() {
		return valor_IVA;
	}

	public void setValor_IVA(double valor_IVA) {
		this.valor_IVA = valor_IVA;
	}

	public double getValor_Total() {
		return valor_Total;
	}

	public void setValor_Total(double valor_Total) {
		this.valor_Total = valor_Total;
	}

	
}