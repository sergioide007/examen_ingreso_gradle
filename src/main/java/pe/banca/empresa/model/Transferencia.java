/**
 * 
 */
package pe.banca.empresa.model;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "transferencia")
public class Transferencia implements Serializable{

  private static final long serialVersionUID = 7401548380514451401L;
  
  public Transferencia() {}
 
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;
  
  @NotNull
  @Column(name = "numero_cuenta_origen")
  String numeroCuentaOrigen;
 
  @NotNull
  @Column(name = "numero_cuenta_destino")
  String numeroCuentaDestino;
  
  @NotNull
  @Column(name = "importe")
  BigDecimal importe;
  
  @NotNull
  @Column(name = "estado")
  String estado;
  
  public Long getId() {
	return id;
  }
  
  public void setId(Long id) {
    this.id = id;
  }
   


  /**
 * @return the numeroCuentaOrigen
 */
public String getNumeroCuentaOrigen() {
	return numeroCuentaOrigen;
}

/**
 * @param numeroCuentaOrigen the numeroCuentaOrigen to set
 */
public void setNumeroCuentaOrigen(String numeroCuentaOrigen) {
	this.numeroCuentaOrigen = numeroCuentaOrigen;
}

/**
 * @return the numeroCuentaDestino
 */
public String getNumeroCuentaDestino() {
	return numeroCuentaDestino;
}

/**
 * @param numeroCuentaDestino the numeroCuentaDestino to set
 */
public void setNumeroCuentaDestino(String numeroCuentaDestino) {
	this.numeroCuentaDestino = numeroCuentaDestino;
}

/**
 * @return the importe
 */
public BigDecimal getImporte() {
	return importe;
}

/**
 * @param importe the importe to set
 */
public void setImporte(BigDecimal importe) {
	this.importe = importe;
}

public String getEstado() {
    return estado;
  }
  
  public void setEstado(String estado) {
    this.estado = estado;
  }

/* (non-Javadoc)
 * @see java.lang.Object#hashCode()
 */
@Override
public int hashCode() {
	return Objects.hash(estado, id, importe, numeroCuentaDestino, numeroCuentaOrigen);
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
	if (!(obj instanceof Transferencia)) {
		return false;
	}
	Transferencia other = (Transferencia) obj;
	return Objects.equals(estado, other.estado) && Objects.equals(id, other.id)
			&& Objects.equals(importe, other.importe) && Objects.equals(numeroCuentaDestino, other.numeroCuentaDestino)
			&& Objects.equals(numeroCuentaOrigen, other.numeroCuentaOrigen);
}

/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Transferencia [id=" + id + ", numeroCuentaOrigen=" + numeroCuentaOrigen + ", numeroCuentaDestino="
			+ numeroCuentaDestino + ", importe=" + importe + ", estado=" + estado + "]";
}


}
