package br.com.webflux.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class CarroModel {
    private String modelo;
    private Integer ano;
    private String montadora;
    private String placa;
}