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
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;


/**
 * @author vector
 *
 */
@Entity
@Table(name = "cliente")
public class Cliente implements Serializable{

  private static final long serialVersionUID = 7401548380514451401L;
  
  public Cliente() {}
 
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;

  @Column(name = "name")
  String name;

  @NotNull
  @Email
  @Column(name = "email")
  String email;

  @Column(name = "cliente_number")
  String clienteNumber;
  
  @NotNull
  @Column(name = "numero_cuenta")
  String numeroCuenta;

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

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
  


/**
 * @return the clienteNumber
 */
public String getClienteNumber() {
	return clienteNumber;
}

/**
 * @param clienteNumber the clienteNumber to set
 */
public void setClienteNumber(String clienteNumber) {
	this.clienteNumber = clienteNumber;
}

/**
 * @return the numeroCuenta
 */
public String getNumeroCuenta() {
	return numeroCuenta;
}

/**
 * @param numeroCuenta the numeroCuenta to set
 */
public void setNumeroCuenta(String numeroCuenta) {
	this.numeroCuenta = numeroCuenta;
}

/* (non-Javadoc)
 * @see java.lang.Object#hashCode()
 */
@Override
public int hashCode() {
	return Objects.hash(clienteNumber, email, id, name, numeroCuenta);
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
	if (!(obj instanceof Cliente)) {
		return false;
	}
	Cliente other = (Cliente) obj;
	return Objects.equals(clienteNumber, other.clienteNumber) && Objects.equals(email, other.email)
			&& Objects.equals(id, other.id) && Objects.equals(name, other.name)
			&& Objects.equals(numeroCuenta, other.numeroCuenta);
}

/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Cliente [id=" + id + ", name=" + name + ", email=" + email + ", clienteNumber=" + clienteNumber
			+ ", numeroCuenta=" + numeroCuenta + "]";
}


}
