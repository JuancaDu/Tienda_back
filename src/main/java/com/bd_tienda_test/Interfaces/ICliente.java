package com.bd_tienda_test.Interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bd_tienda_test.Model.ClienteModel;


@Repository
public interface ICliente extends CrudRepository<ClienteModel, String> {

}
