package br.com.webflux.database;

import br.com.webflux.model.CarroModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarroRepository extends MongoRepository<CarroModel, String> {
    CarroModel findByPlaca(String placa);
}