package com.bd_tienda_test.Controlador;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bd_tienda_test.Interfaces.Service.IProveedorService;
import com.bd_tienda_test.Model.ProveedorModel;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping
public class ProveedorControlador {

	@Autowired
	private IProveedorService serviceProveedor;
	
	@GetMapping("/listarProveedor")
	public List<ProveedorModel> listarProveedor()
	{
		return serviceProveedor.listarProveedores();
		 
	}
	
		
	@PostMapping("/saveProveedor")
	public boolean saveProveedor (@RequestBody ProveedorModel p) {
		serviceProveedor.saveProveedor(p);
		return true;
	}	
	
	//@GetMapping("/newProveedor")
	//public String agregarProveedor (Model model) {
	//	model.addAttribute("proveedor", new ProveedorModel());
	//	return "formProveedores.html";
	//}
	
	@GetMapping ("/Proveedor/{nit}")
	public ProveedorModel obtenerProveedorPorNit (@PathVariable String nit)
	{
		Optional <ProveedorModel> proveedor =serviceProveedor.listarIdProveedor(nit);
		return proveedor.get();
	}
	
	
	@PutMapping("/Proveedor/{nit}")
	public boolean actualizarProveedorPorNit(@PathVariable String Nit, ProveedorModel p) {
		Optional<ProveedorModel> proveedor = serviceProveedor.listarIdProveedor(Nit);
		if (proveedor.isPresent()) {
			serviceProveedor.saveProveedor(p);
			return true;
		} else {
			return false;
		}
	}
	
	
	@DeleteMapping ("eliminarProveedor/{nit}")
	public boolean deleteProveedor (@PathVariable String Nit)
	{
		serviceProveedor.deleteProveedor(Nit);
		return true;
	}
	
}
