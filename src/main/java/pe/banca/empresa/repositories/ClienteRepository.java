/**
 * 
 */
package pe.banca.empresa.repositories;

import java.util.Optional;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import pe.banca.empresa.model.Cliente;

/**
 * Person repository for basic operations on Person entity.
 * @author crossover
 */
@RestResource(exported=false)
public interface ClienteRepository extends PagingAndSortingRepository<Cliente, Long> {
  Optional<Cliente> findById(Long id);
}
