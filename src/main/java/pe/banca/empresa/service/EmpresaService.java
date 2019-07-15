/**
 * 
 */
package pe.banca.empresa.service;

import java.util.List;

import pe.banca.empresa.model.Empresa;

/**
 * EmpresaService interface for empresas.
 * @author vector
 *
 */
public interface EmpresaService {
  public List<Empresa> getAll();
  
  public Empresa save(Empresa p);
  
  public Empresa findById(Long empresaId);
  
}
