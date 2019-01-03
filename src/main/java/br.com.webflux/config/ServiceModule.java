package br.com.webflux.config;

import br.com.webflux.service.WebFluxService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceModule {
    @Bean
    public WebFluxService webFluxService(){
        return new WebFluxService();
    }
}
