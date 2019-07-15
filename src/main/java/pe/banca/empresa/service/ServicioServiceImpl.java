/**
 * 
 */
package pe.banca.empresa.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.banca.empresa.model.Servicio;
import pe.banca.empresa.repositories.ServicioRepository;

/**
 * @author vector
 *
 */
@Service
public class ServicioServiceImpl implements ServicioService{

  @Autowired
  ServicioRepository servicioRepository;
  
  /* (non-Javadoc)
   * @see pe.banca.empresa.service.ServicioService#getAll()
   */
  @Override
  public List<Servicio> getAll() {
    List<Servicio> servicioList = new ArrayList<>();
    servicioRepository.findAll().forEach(servicioList::add);
    return servicioList;
    
  }
  
  public Servicio save(Servicio p) {
    return servicioRepository.save(p);
  }

  @Override
  public Servicio findById(Long servicioId) {
    Optional<Servicio> dbServicio = servicioRepository.findById(servicioId);
    return dbServicio.orElse(null);
  }
  
  

}
