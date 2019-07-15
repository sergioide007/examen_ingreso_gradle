/**
 * 
 */
package pe.banca.empresa.service;

import java.util.List;

import pe.banca.empresa.model.Cuenta;

/**
 * CuentaService interface for Cuentas.
 * @author vector
 *
 */
public interface CuentaService {
  public List<Cuenta> getAll();
  
  public Cuenta save(Cuenta p);
  
  public Cuenta findById(Long cuentaId);
  
}
