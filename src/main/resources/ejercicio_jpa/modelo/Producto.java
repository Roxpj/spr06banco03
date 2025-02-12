package es.cursosprhib.jpa03ejerciciojpa.modelo;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class Producto implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer idProducto;
	private String producto;
	private Double precio;
	private List<Cliente> clientes;

	public Integer getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idProducto);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return Objects.equals(idProducto, other.idProducto);
	}

	@Override
	public String toString() {
		return "Producto [" + idProducto + ", " + producto + ", " + precio + "]";
	}
}
