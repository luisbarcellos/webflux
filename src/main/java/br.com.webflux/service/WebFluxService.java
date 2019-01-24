package br.com.webflux.service;

import br.com.webflux.database.CarroRepository;
import br.com.webflux.model.CarroModel;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class WebFluxService {
    private CarroRepository carroRepository;

    public CarroModel buscarCarroPorPlaca(String placa){
        return carroRepository.findByPlaca(placa);
    }
}