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

import com.bd_tienda_test.Interfaces.Service.IProductoService;
import com.bd_tienda_test.Model.ProductoModel;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping
public class ProductoControlador {
	
	@Autowired
	private IProductoService serviceProducto;
	
	@GetMapping("/listarProducto")
	public List<ProductoModel> listarProducto()
	{
		return serviceProducto.listarProductos();
		
	}
	
		
	@PostMapping("/saveProducto")
	public boolean saveProducto (@RequestBody ProductoModel pr) {
		serviceProducto.saveProducto(pr);
		return true;
	}	
	
	//@GetMapping("/newProducto")
	//public String agregarProducto (Model model) {
	//	model.addAttribute("producto", new ProductoModel());
	//	return "formProductos.html";
	//}
	
	@GetMapping ("/Producto/{Codigo}")
	public ProductoModel obtenerProductoPorCodigo (@PathVariable String Codigo)
	{
		Optional <ProductoModel> producto =serviceProducto.listarIdProducto(Codigo);
		return producto.get();
	}
	
	@PutMapping("/Producto/{Cedula}")
	public boolean actualizarProductoPorCodigo(@PathVariable String Codigo, ProductoModel pr) {
		Optional<ProductoModel> producto = serviceProducto.listarIdProducto(Codigo);
		if (producto.isPresent()) {
			serviceProducto.saveProducto(pr);
			return true;
		} else {
			return false;
		}
	}
	
	@DeleteMapping ("eliminarProducto/{Codigo}")
	public boolean deleteProducto (@PathVariable String Codigo)
	{
		serviceProducto.deleteProducto(Codigo);
		return true;
	}
}
