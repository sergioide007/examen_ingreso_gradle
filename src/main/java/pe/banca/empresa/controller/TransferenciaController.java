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

import pe.banca.empresa.model.Transferencia;
import pe.banca.empresa.service.TransferenciaService;

/**
 * 
 * @author vector
 */

@RestController
public class TransferenciaController {
  
  @Autowired
  TransferenciaService transferenciaService;
  
  @PostMapping(path = "/api/transferencia")
  public ResponseEntity<Transferencia> register(@RequestBody Transferencia p) {
    return ResponseEntity.ok(transferenciaService.save(p));
  }
  
  @GetMapping(path = "/api/transferencia")
  public ResponseEntity<List<Transferencia>> getAlltransferenciaServicios() {
    return ResponseEntity.ok(transferenciaService.getAll());
  }
  
  @GetMapping(path = "/api/transferencia/{transferencia-id}")
  public ResponseEntity<Transferencia> gettransferenciaServicioById(@PathVariable(name="transferencia-id", required=true)Long transferenciaServicioId) {
    Transferencia transferenciaServicio = transferenciaService.findById(transferenciaServicioId);
    if (transferenciaServicio != null) {
      return ResponseEntity.ok(transferenciaServicio);
    }
    return ResponseEntity.notFound().build();
  }
  
}
