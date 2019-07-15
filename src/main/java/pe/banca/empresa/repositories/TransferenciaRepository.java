/**
 * 
 */
package pe.banca.empresa.repositories;

import java.util.Optional;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import pe.banca.empresa.model.Transferencia;

/**
 * Person repository for basic operations on Person entity.
 * @author crossover
 */
@RestResource(exported=false)
public interface TransferenciaRepository extends PagingAndSortingRepository<Transferencia, Long> {
  Optional<Transferencia> findById(Long id);
}
