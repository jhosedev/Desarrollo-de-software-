package com.jhosep.api_rest.service;

import com.jhosep.api_rest.model.entity.Cliente;

public interface ICliente {
    Cliente save(Cliente cliente);

    Cliente findById(int id);

    void delete(Cliente cliente);


}