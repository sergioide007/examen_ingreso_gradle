/**
 * 
 */
package pe.banca.empresa.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.banca.empresa.model.Transferencia;
import pe.banca.empresa.repositories.TransferenciaRepository;

/**
 * @author vector
 *
 */
@Service
public class TransferenciaServiceImpl implements TransferenciaService{

  @Autowired
  TransferenciaRepository transferenciaRepository;
  
  /* (non-Javadoc)
   * @see pe.banca.transferencia.service.transferenciaService#getAll()
   */
  @Override
  public List<Transferencia> getAll() {
    List<Transferencia> transferenciaList = new ArrayList<>();
    transferenciaRepository.findAll().forEach(transferenciaList::add);
    return transferenciaList;
    
  }
  
  public Transferencia save(Transferencia p) {
    return transferenciaRepository.save(p);
  }

  @Override
  public Transferencia findById(Long transferenciaId) {
    Optional<Transferencia> dbtransferencia = transferenciaRepository.findById(transferenciaId);
    return dbtransferencia.orElse(null);
  }
  
  

}
