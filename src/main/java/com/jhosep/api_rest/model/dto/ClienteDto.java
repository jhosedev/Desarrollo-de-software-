package com.jhosep.api_rest.model.dto;

import jakarta.persistence.Column;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@ToString
@Builder

public class ClienteDto implements Serializable {

    private int idCliente;
    private String nombre;
    private String apellido;
    private String correo;
    private Date fechaRegistro;
}
