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

import com.bd_tienda_test.Interfaces.Service.IClienteService;
import com.bd_tienda_test.Model.ClienteModel;

@CrossOrigin(origins = "http://localhost:3000")

@RestController

@RequestMapping
public class ClienteControlador {

	@Autowired
	private IClienteService serviceCliente;

	@GetMapping("/listarCliente")
	
	public List<ClienteModel> listarCliente() {
		
		return serviceCliente.listarClientes();
		
	}

	@PostMapping("/saveCliente")
	public boolean saveCliente(@RequestBody ClienteModel c) {
		serviceCliente.saveCliente(c);
		return true;
	}

	
	

	@GetMapping("/Cliente/{Cedula}")
	public ClienteModel obtenerClientePorCedula(@PathVariable String Cedula) {
		Optional<ClienteModel> cliente = serviceCliente.listarIdCliente(Cedula);
		return cliente.get();
	}

	@PutMapping("/Cliente/{Cedula}")
	public boolean actualizarClientePorCedula(@PathVariable String Cedula, ClienteModel c) {
		Optional<ClienteModel> cliente = serviceCliente.listarIdCliente(Cedula);
		if (cliente.isPresent()) {
			serviceCliente.saveCliente(c);
			return true;
		} else {
			return false;
		}
	}

	@DeleteMapping("eliminarCliente/{Cedula}")
	public boolean deleteCliente(@PathVariable String Cedula) {
		serviceCliente.deleteCliente(Cedula);
		return true;
	}
}
