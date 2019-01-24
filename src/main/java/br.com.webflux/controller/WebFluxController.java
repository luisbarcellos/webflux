package br.com.webflux.controller;

import br.com.webflux.model.CarroModel;
import br.com.webflux.service.WebFluxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/webflux")
public class WebFluxController {
    @Autowired
    private WebFluxService webFluxService;

    @RequestMapping(method =  RequestMethod.GET, value = "/placa/{placa}")
    @ResponseBody
    @CrossOrigin(origins = "*")
    public CarroModel buscarCarro(@PathVariable("placa") String placa){
        return webFluxService.buscarCarroPorPlaca(placa);
    }
}