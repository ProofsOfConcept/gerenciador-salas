package br.com.model;

import java.io.Serializable;

import javax.persistence.Cacheable;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

@MappedSuperclass
@Cacheable
public abstract class BaseEntity<PK extends Serializable> {
	@Version
	private Integer version;
	
	public abstract PK getId();
	public abstract void setId(PK id);
	
	public Integer getVersion() {
		return version;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getId() == null) ? super.hashCode() : getId().hashCode());
		return result;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BaseEntity<PK> other = (BaseEntity<PK>) obj;
		if (getId() == null) {
			if (other.getId() != null)
				return false;
		} else if (!getId().equals(other.getId()))
			return false;
		return true;
	}
}
