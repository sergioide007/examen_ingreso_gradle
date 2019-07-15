/**
 * 
 */
package pe.banca.empresa.model;

import java.io.Serializable;
import java.util.Objects;

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
@Table(name = "servicio")
public class Servicio implements Serializable{

  private static final long serialVersionUID = 7401548380514451401L;
  
  public Servicio() {}
 
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;
  
  @Column(name = "empresa_id")
  String empresaId;

  @Column(name = "name")
  String name;

  @NotNull
  @Column(name = "descripcion")
  String descripcion;

  @Column(name = "servicio_number")
  String servicioNumber;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescripcion() {
	return descripcion;
  }

  public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
  }

  public String getServicioNumber() {
	return servicioNumber;
  }

  public void setServicioNumber(String servicioNumber) {
	this.servicioNumber = servicioNumber;
  }

/**
 * @return the empresaId
 */
public String getEmpresaId() {
	return empresaId;
}

/**
 * @param empresaId the empresaId to set
 */
public void setEmpresaId(String empresaId) {
	this.empresaId = empresaId;
}

/* (non-Javadoc)
 * @see java.lang.Object#hashCode()
 */
@Override
public int hashCode() {
	return Objects.hash(descripcion, empresaId, id, name, servicioNumber);
}

/* (non-Javadoc)
 * @see java.lang.Object#equals(java.lang.Object)
 */
@Override
public boolean equals(Object obj) {
	if (this == obj) {
		return true;
	}
	if (obj == null) {
		return false;
	}
	if (!(obj instanceof Servicio)) {
		return false;
	}
	Servicio other = (Servicio) obj;
	return Objects.equals(descripcion, other.descripcion) && Objects.equals(empresaId, other.empresaId)
			&& Objects.equals(id, other.id) && Objects.equals(name, other.name)
			&& Objects.equals(servicioNumber, other.servicioNumber);
}

/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Servicio [id=" + id + ", empresaId=" + empresaId + ", name=" + name + ", descripcion=" + descripcion
			+ ", servicioNumber=" + servicioNumber + "]";
}


}
