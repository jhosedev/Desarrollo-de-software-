package com.jhosep.api_rest.controller;

import com.jhosep.api_rest.model.dto.ClienteDto;
import com.jhosep.api_rest.model.entity.Cliente;
import com.jhosep.api_rest.service.ICliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("/api")
public class ClienteController {
    @Autowired
    private ICliente  clienteService;

    @PostMapping("cliente")
    public Cliente create (@RequestBody ClienteDto clienteDto){
        return clienteService.save(cliente);
    }

    @PutMapping("cliente")
    public Cliente update (@RequestBody ClienteDto clienteDto){
        return clienteService.save(cliente);
    }

    @DeleteMapping("cliente/{id}")
    public ResponseEntity<?> delete (@PathVariable int id){
         Map<String, Object> response = new HashMap<>();
         try{
             Cliente clienteDelete = clienteService.findById(id);
             clienteService.delete(clienteDelete);
             return new ResponseEntity<>(clienteDelete, HttpStatus.NO_CONTENT);
         }catch(DataAccessException exDt){
             response.put("mensaje", exDt.getMessage());
             response.put("cliente", null);

             return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR );
         }
    }

    @GetMapping("cliente/{id}")
    public ClienteDto showById (@PathVariable int id){
        return clienteService.findById(id);
    }

}
