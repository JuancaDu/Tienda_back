package com.bd_tienda_test.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bd_tienda_test.Interfaces.IReportes;
import com.bd_tienda_test.Interfaces.Service.IReporteService;
import com.bd_tienda_test.Model.ReportesModel;

@Service
public class ReportesService implements IReporteService {

	@Autowired
	private IReportes reportesdb;
	
	@Override
	public List<ReportesModel> listarVentasClientes(){
		return (List<ReportesModel>) reportesdb.findAll();
	}
}
