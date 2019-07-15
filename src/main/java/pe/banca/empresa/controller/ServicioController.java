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

import pe.banca.empresa.model.Servicio;
import pe.banca.empresa.service.ServicioService;

/**
 * 
 * @author vector
 */

@RestController
public class ServicioController {
  
  @Autowired
  ServicioService servicioService;
  
  @PostMapping(path = "/api/servicio")
  public ResponseEntity<Servicio> register(@RequestBody Servicio p) {
    return ResponseEntity.ok(servicioService.save(p));
  }
  
  @GetMapping(path = "/api/servicio")
  public ResponseEntity<List<Servicio>> getAllservicios() {
    return ResponseEntity.ok(servicioService.getAll());
  }
  
  @GetMapping(path = "/api/servicio/{servicio-id}")
  public ResponseEntity<Servicio> getservicioById(@PathVariable(name="servicio-id", required=true)Long servicioId) {
    Servicio servicio = servicioService.findById(servicioId);
    if (servicio != null) {
      return ResponseEntity.ok(servicio);
    }
    return ResponseEntity.notFound().build();
  }
  
}
