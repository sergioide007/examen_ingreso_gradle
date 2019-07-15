/**
 * 
 */
package pe.banca.empresa.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.banca.empresa.model.Cliente;
import pe.banca.empresa.repositories.ClienteRepository;

/**
 * @author vector
 *
 */
@Service
public class ClienteServiceImpl implements ClienteService{

  @Autowired
  ClienteRepository clienteRepository;
  
  /* (non-Javadoc)
   * @see pe.banca.cliente.service.clienteService#getAll()
   */
  @Override
  public List<Cliente> getAll() {
    List<Cliente> clienteList = new ArrayList<>();
    clienteRepository.findAll().forEach(clienteList::add);
    return clienteList;
    
  }
  
  public Cliente save(Cliente p) {
    return clienteRepository.save(p);
  }

  @Override
  public Cliente findById(Long clienteId) {
    Optional<Cliente> dbcliente = clienteRepository.findById(clienteId);
    return dbcliente.orElse(null);
  }
  
  

}
