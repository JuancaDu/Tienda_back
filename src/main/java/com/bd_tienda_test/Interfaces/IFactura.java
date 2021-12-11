package com.bd_tienda_test.Interfaces;

import org.springframework.data.repository.CrudRepository;

import com.bd_tienda_test.Model.FacturaModel;


public interface IFactura extends CrudRepository<FacturaModel, String>{

}
