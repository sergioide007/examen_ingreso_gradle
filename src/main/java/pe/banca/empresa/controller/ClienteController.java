/**
 * 
 */
package pe.banca.empresa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import pe.banca.empresa.model.Cliente;
import pe.banca.empresa.service.ClienteService;

/**
 * 
 * @author vector
 */

@RestController
public class ClienteController {
  
  @Autowired
  ClienteService clienteService;
  
  @PostMapping(path = "/api/cliente")
  public ResponseEntity<Cliente> register(@RequestBody Cliente p) {
    return ResponseEntity.ok(clienteService.save(p));
  }
  
  @GetMapping(path = "/api/cliente")
  public ResponseEntity<List<Cliente>> getAllclienteServicios() {
    return ResponseEntity.ok(clienteService.getAll());
  }
  
  @GetMapping(path = "/api/cliente/{cliente-id}")
  public ResponseEntity<Cliente> getclienteServicioById(@PathVariable(name="cliente-id", required=true)Long clienteServicioId) {
    Cliente clienteServicio = clienteService.findById(clienteServicioId);
    if (clienteServicio != null) {
      return ResponseEntity.ok(clienteServicio);
    }
    return ResponseEntity.notFound().build();
  }
  
}
