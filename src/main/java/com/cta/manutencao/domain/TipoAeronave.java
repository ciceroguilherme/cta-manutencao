package com.cta.manutencao.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TipoAeronave implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String tipo;
	
//	@JsonBackReference
//	@OneToMany(mappedBy = "tipo")
//	private List<ModeloAeronave> modeloAeronave;
	
	public TipoAeronave() {
		
	}

	public TipoAeronave(Integer id, String tipo) {
		this.id = id;
		this.tipo = tipo;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

//	public List<ModeloAeronave> getModeloAeronave() {
//		return modeloAeronave;
//	}
//
//	public void setModeloAeronave(List<ModeloAeronave> modeloAeronave) {
//		this.modeloAeronave = modeloAeronave;
//	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		TipoAeronave other = (TipoAeronave) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	
	
}
