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

import pe.banca.empresa.model.Cuenta;
import pe.banca.empresa.service.CuentaService;

/**
 * 
 * @author vector
 */

@RestController
public class CuentaController {
  
  @Autowired
  CuentaService cuentaService;
  
  @PostMapping(path = "/api/cuenta")
  public ResponseEntity<Cuenta> register(@RequestBody Cuenta p) {
    return ResponseEntity.ok(cuentaService.save(p));
  }
  
  @GetMapping(path = "/api/cuenta")
  public ResponseEntity<List<Cuenta>> getAllcuentaServicios() {
    return ResponseEntity.ok(cuentaService.getAll());
  }
  
  @GetMapping(path = "/api/cuenta/{cuenta-id}")
  public ResponseEntity<Cuenta> getcuentaServicioById(@PathVariable(name="cuenta-id", required=true)Long cuentaServicioId) {
    Cuenta cuentaServicio = cuentaService.findById(cuentaServicioId);
    if (cuentaServicio != null) {
      return ResponseEntity.ok(cuentaServicio);
    }
    return ResponseEntity.notFound().build();
  }
  
}
