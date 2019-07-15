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
@Table(name = "cuenta")
public class Cuenta implements Serializable{

  private static final long serialVersionUID = 7401548380514451401L;
  
  public Cuenta() {}
 
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;
  
  @NotNull
  @Column(name = "numero_cuenta")
  String numeroCuenta;
 
  @NotNull
  @Column(name = "saldo")
  BigDecimal saldo;
  
  @NotNull
  @Column(name = "estado")
  String estado;
  
  public Long getId() {
	return id;
  }
  
  public void setId(Long id) {
    this.id = id;
  }
   
  public String getNumeroCuenta() {
	return numeroCuenta;
  }

  public void setNumeroCuenta(String numeroCuenta) {
	this.numeroCuenta = numeroCuenta;
  }

  public BigDecimal getSaldo() {
	return saldo;
  }

  public void setSaldo(BigDecimal saldo) {
	this.saldo = saldo;
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
	return Objects.hash(estado, id, numeroCuenta, saldo);
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
	if (!(obj instanceof Cuenta)) {
		return false;
	}
	Cuenta other = (Cuenta) obj;
	return Objects.equals(estado, other.estado) && Objects.equals(id, other.id)
			&& Objects.equals(numeroCuenta, other.numeroCuenta) && Objects.equals(saldo, other.saldo);
}

/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Cuenta [id=" + id + ", numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + ", estado=" + estado + "]";
}

}
