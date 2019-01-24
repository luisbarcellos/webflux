package br.com.webflux.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@Data
@Document(collection = "carros")
public class CarroModel {
    private String modelo;
    private Integer ano;
    private String montadora;
    private String placa;
}