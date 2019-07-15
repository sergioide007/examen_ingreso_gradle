/**
 * 
 */
package pe.banca.empresa.service;

import java.util.List;

import pe.banca.empresa.model.Cliente;

/**
 * ClienteService interface for Clientes.
 * @author vector
 *
 */
public interface ClienteService {
  public List<Cliente> getAll();
  
  public Cliente save(Cliente p);
  
  public Cliente findById(Long clienteId);
  
}
