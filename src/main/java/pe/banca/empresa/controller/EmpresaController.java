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

import pe.banca.empresa.model.Empresa;
import pe.banca.empresa.service.EmpresaService;

/**
 * 
 * @author vector
 */

@RestController
public class EmpresaController {
  
  @Autowired
  EmpresaService empresaService;
  
  @PostMapping(path = "/api/empresa")
  public ResponseEntity<Empresa> register(@RequestBody Empresa p) {
    return ResponseEntity.ok(empresaService.save(p));
  }
  
  @GetMapping(path = "/api/empresa")
  public ResponseEntity<List<Empresa>> getAllempresas() {
    return ResponseEntity.ok(empresaService.getAll());
  }
  
  @GetMapping(path = "/api/empresa/{empresa-id}")
  public ResponseEntity<Empresa> getempresaById(@PathVariable(name="empresa-id", required=true)Long empresaId) {
    Empresa empresa = empresaService.findById(empresaId);
    if (empresa != null) {
      return ResponseEntity.ok(empresa);
    }
    return ResponseEntity.notFound().build();
  }
  
}
