package com.bd_tienda_test.Interfaces.Service;

import java.util.List;
import java.util.Optional;

import com.bd_tienda_test.Model.ClienteModel;


public interface IClienteService {
	
	public List<ClienteModel> listarClientes();
	public Optional<ClienteModel> listarIdCliente(String Cedula);
	public int saveCliente (ClienteModel c);	
	public void deleteCliente (String cedula);
}
