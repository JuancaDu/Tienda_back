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

import com.bd_tienda_test.Interfaces.Service.IUsuarioService;
import com.bd_tienda_test.Model.UsuarioModel;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping
public class UsuarioControlador {

	@Autowired
	private IUsuarioService serviceUsuario;

	@PostMapping("/validar")
	public boolean validar(@RequestBody UsuarioModel p) {
		boolean valido = serviceUsuario.validarUsuario(p.getUsuario(), p.getClave_Usuario());
		if (valido) {
			return true;
		} else {
						
			return false;
			
		}

	}	

	//@GetMapping("/Menu")
	//public String mostarMenu() {
	//	return "Menu";
	//}
	
	//@GetMapping("/index")
	//public String mostarIndex() {
	//	return "index";
	//}
	
	
	@GetMapping("/listarUsuario")
	public List<UsuarioModel> listarUsuario()
	{
		return serviceUsuario.listarUsuarios();
	}
	
		
	@PostMapping("/saveUsuario")
	public boolean saveUsuario (@RequestBody UsuarioModel u) {
		serviceUsuario.saveUsuario(u);
		return true;
	}	
	
	//@GetMapping("/newUsuario")
	//public String agregarUsuario (Model model) {
	//	model.addAttribute("usuario", new UsuarioModel());
	//	return "formUsuarios.html";
	//}
	
	@GetMapping ("/Usuario/{Cedula}")
	public UsuarioModel obtenerUsuarioPorCedula (@PathVariable String Cedula)
	{
		Optional <UsuarioModel> usuario =serviceUsuario.listarIdUsuario(Cedula);
		return usuario.get();
	}
	
	@PutMapping("/Usuario/{Cedula}")
	public boolean actualizarUsuarioPorCedula(@PathVariable String Cedula, UsuarioModel u) {
		Optional<UsuarioModel> usuario = serviceUsuario.listarIdUsuario(Cedula);
		if (usuario.isPresent()) {
			serviceUsuario.saveUsuario(u);
			return true;
		} else {
			return false;
		}
	}
	
	
	@DeleteMapping ("eliminarUsuario/{Cedula}")
	public boolean deleteUsuario (@PathVariable String Cedula)
	{
		serviceUsuario.deleteUsuario(Cedula);
		return true;
	}

	
}
