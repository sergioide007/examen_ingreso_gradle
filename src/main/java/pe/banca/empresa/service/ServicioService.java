/**
 * 
 */
package pe.banca.empresa.service;

import java.util.List;

import pe.banca.empresa.model.Servicio;

/**
 * ServicioService interface for servicios.
 * @author vector
 *
 */
public interface ServicioService {
  public List<Servicio> getAll();
  
  public Servicio save(Servicio p);
  
  public Servicio findById(Long servicioId);
  
}
