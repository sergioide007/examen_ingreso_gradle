/**
 * 
 */
package pe.banca.empresa.repositories;

import java.util.Optional;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import pe.banca.empresa.model.Empresa;

/**
 * Person repository for basic operations on Person entity.
 * @author crossover
 */
@RestResource(exported=false)
public interface EmpresaRepository extends PagingAndSortingRepository<Empresa, Long> {
  Optional<Empresa> findById(Long id);
}
