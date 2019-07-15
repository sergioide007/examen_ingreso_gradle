/**
 * 
 */
package pe.banca.empresa.service;

import java.util.List;

import pe.banca.empresa.model.Transferencia;

/**
 * TransferenciaService interface for Transferencias.
 * @author vector
 *
 */
public interface TransferenciaService {
  public List<Transferencia> getAll();
  
  public Transferencia save(Transferencia p);
  
  public Transferencia findById(Long transferenciaId);
  
}
