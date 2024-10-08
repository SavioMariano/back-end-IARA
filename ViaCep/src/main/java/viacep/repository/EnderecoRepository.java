package viacep.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import viacep.model.Endereco;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {
    
}
