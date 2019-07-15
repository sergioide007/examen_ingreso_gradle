/**
 * 
 */
package pe.banca.empresa.service;

import java.util.List;

import pe.banca.empresa.model.Pago;

/**
 * PagoService interface for pagos.
 * @author vector
 *
 */
public interface PagoService {
  public List<Pago> getAll();
  
  public Pago save(Pago p);
  
  public Pago findById(Long pagoId);
  
}
