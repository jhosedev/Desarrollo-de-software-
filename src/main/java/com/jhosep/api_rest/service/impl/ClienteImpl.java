package com.jhosep.api_rest.service.impl;

import com.jhosep.api_rest.model.dao.ClienteDao;
import com.jhosep.api_rest.model.entity.Cliente;
import com.jhosep.api_rest.service.ICliente;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteImpl implements ICliente {

    @Autowired
    private ClienteDao clienteDao;

    @Transactional
    @Override
    public Cliente save(Cliente cliente) {
        return clienteDao.save(cliente);
    }

    @Transactional
    @Override
    public Cliente findById(int id) {
        return clienteDao.findById(id).orElse(null);
    }

    @Transactional
    @Override
    public void delete(Cliente cliente) {
        clienteDao.delete(cliente);
    }
}
