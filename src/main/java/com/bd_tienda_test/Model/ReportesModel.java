package com.bd_tienda_test.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tabla_Ventas_Factura ")
public class ReportesModel {
	@Id
	private String codigo_Vta;
	private String cedula_Usu_Vta;
	private String cedula_Cli_Vta;
	private String  nombre_Cli_Vta;
	private double valor_Vta;
	private double valor_IVA;
	private double valor_Total;

	public ReportesModel() {

	}

	public ReportesModel(String codigo, String cedulaUsu, String cedulaCli, String nombreCli, double valorVenta, double valorIVA,
			double valorFactura) {
		super();
		codigo_Vta = codigo;
		cedula_Usu_Vta = cedulaUsu;
		cedula_Cli_Vta = cedulaCli;
		nombre_Cli_Vta = nombreCli;
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

	public String getCedula_Usu_Vta() {
		return cedula_Usu_Vta;
	}

	public void setCedula_Usu_Vta(String cedula_Usu_Vta) {
		this.cedula_Usu_Vta = cedula_Usu_Vta;
	}

	public String getCedula_Cli_Vta() {
		return cedula_Cli_Vta;
	}

	public void setCedula_Cli_Vta(String cedula_Cli_Vta) {
		this.cedula_Cli_Vta = cedula_Cli_Vta;
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

	public String getNombre_Cli_Vta() {
		return nombre_Cli_Vta;
	}

	public void setNombre_Cli_Vta(String nombre_Cli_Vta) {
		this.nombre_Cli_Vta = nombre_Cli_Vta;
	}
}
