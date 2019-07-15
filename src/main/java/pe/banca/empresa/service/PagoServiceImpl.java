/**
 * 
 */
package pe.banca.empresa.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.banca.empresa.model.Pago;
import pe.banca.empresa.repositories.PagoRepository;

/**
 * @author vector
 *
 */
@Service
public class PagoServiceImpl implements PagoService{

  @Autowired
  PagoRepository pagoRepository;
  
  /* (non-Javadoc)
   * @see pe.banca.empresa.service.PagoService#getAll()
   */
  @Override
  public List<Pago> getAll() {
    List<Pago> pagoList = new ArrayList<>();
    pagoRepository.findAll().forEach(pagoList::add);
    return pagoList;
    
  }
  
  public Pago save(Pago p) {
    return pagoRepository.save(p);
  }

  @Override
  public Pago findById(Long pagoId) {
    Optional<Pago> dbPago = pagoRepository.findById(pagoId);
    return dbPago.orElse(null);
  }
  
  

}
