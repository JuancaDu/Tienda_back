package com.bd_tienda_test.Controlador;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bd_tienda_test.Interfaces.Service.IReporteService;
import com.bd_tienda_test.Model.ReportesModel;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping
public class ReportesControlador {
	
	@Autowired
	private IReporteService serviceReportes;
	
	//@GetMapping("/reportes")
	//public String mostrarReportes(Model model) {
	//	return "reportes";
	//}
	
	@GetMapping ("/listarVentasClientes")
    public List<ReportesModel> listarVentasCientes() {
		List<ReportesModel> listaVentasCliente = serviceReportes.listarVentasClientes();
		return listaVentasCliente ;
	}
	
}
