/**
 * 
 */
package pe.banca.empresa.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


/**
 * @author vector
 *
 */
@Entity
@Table(name = "pago")
public class Pago implements Serializable{

  private static final long serialVersionUID = 7401548380514451401L;
  
  public Pago() {}
 
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;
  
  @NotNull
  @Column(name = "empresa_id")
  String empresaId;
 
  @NotNull
  @Column(name = "servicio_id")
  String servicioId;
  
  @Column(name = "importe")
  BigDecimal importe;
  
  @Column(name = "estado")
  String estado;
  
  @Column(name = "fecha")
  Date fecha;


  public Long getId() {
	return id;
  }
  
  public void setId(Long id) {
    this.id = id;
  }
  
  public String getEmpresaId() {
    return empresaId;
  }
  
  public void setEmpresaId(String empresaId) {
    this.empresaId = empresaId;
  }
  
  public String getServicioId() {
    return servicioId;
  }
  
  public void setServicioId(String servicioId) {
    this.servicioId = servicioId;
  }
  
  public BigDecimal getImporte() {
    return importe;
  }
  
  public void setImporte(BigDecimal importe) {
    this.importe = importe;
  }
  
  public String getEstado() {
    return estado;
  }
  
  public void setEstado(String estado) {
    this.estado = estado;
  }
  
  public Date getFecha() {
    return fecha;
  }
  
  public void setFecha(Date fecha) {
    this.fecha = fecha;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((empresaId == null) ? 0 : empresaId.hashCode());
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    result = prime * result + ((servicioId == null) ? 0 : servicioId.hashCode());
    result = prime * result + ((importe == null) ? 0 : importe.hashCode());
    result = prime * result + ((estado == null) ? 0 : estado.hashCode());
    result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Pago other = (Pago) obj;
    if (empresaId == null) {
      if (other.empresaId != null)
        return false;
    } else if (!empresaId.equals(other.empresaId))
      return false;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    if (servicioId == null) {
      if (other.servicioId != null)
        return false;
    } else if (!servicioId.equals(other.servicioId))
      return false;
    if (importe == null) {
      if (other.importe != null)
        return false;
    } else if (!importe.equals(other.importe))
      return false;
    if (estado == null) {
        if (other.estado != null)
          return false;
      } else if (!estado.equals(other.estado))
        return false;
    if (fecha == null) {
        if (other.fecha != null)
          return false;
      } else if (!fecha.equals(other.fecha))
        return false;
    return true;
  }

  @Override
  public String toString() {
	return "Pago [id=" + id + ", empresaId=" + empresaId + ", servicioId=" + servicioId + ", importe=" + importe
			+ ", estado=" + estado + ", fecha=" + fecha + "]";
  }

}
