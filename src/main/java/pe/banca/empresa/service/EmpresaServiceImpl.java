/**
 * 
 */
package pe.banca.empresa.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.banca.empresa.model.Empresa;
import pe.banca.empresa.repositories.EmpresaRepository;

/**
 * @author vector
 *
 */
@Service
public class EmpresaServiceImpl implements EmpresaService{

  @Autowired
  EmpresaRepository empresaRepository;
  
  /* (non-Javadoc)
   * @see pe.banca.empresa.service.EmpresaService#getAll()
   */
  @Override
  public List<Empresa> getAll() {
    List<Empresa> empresaList = new ArrayList<>();
    empresaRepository.findAll().forEach(empresaList::add);
    return empresaList;
    
  }
  
  public Empresa save(Empresa p) {
    return empresaRepository.save(p);
  }

  @Override
  public Empresa findById(Long empresaId) {
    Optional<Empresa> dbEmpresa = empresaRepository.findById(empresaId);
    return dbEmpresa.orElse(null);
  }
  
  

}
