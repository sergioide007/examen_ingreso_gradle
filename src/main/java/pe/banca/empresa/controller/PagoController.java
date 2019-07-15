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

import pe.banca.empresa.model.Pago;
import pe.banca.empresa.service.PagoService;

/**
 * 
 * @author vector
 */

@RestController
public class PagoController {
  
  @Autowired
  PagoService pagoService;
  
  @PostMapping(path = "/api/pago")
  public ResponseEntity<Pago> register(@RequestBody Pago p) {
    return ResponseEntity.ok(pagoService.save(p));
  }
  
  @GetMapping(path = "/api/pago")
  public ResponseEntity<List<Pago>> getAllpagoServicios() {
    return ResponseEntity.ok(pagoService.getAll());
  }
  
  @GetMapping(path = "/api/pago/{pago-id}")
  public ResponseEntity<Pago> getpagoServicioById(@PathVariable(name="pago-id", required=true)Long pagoServicioId) {
    Pago pagoServicio = pagoService.findById(pagoServicioId);
    if (pagoServicio != null) {
      return ResponseEntity.ok(pagoServicio);
    }
    return ResponseEntity.notFound().build();
  }
  
}
