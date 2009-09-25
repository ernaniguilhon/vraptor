package br.com.caelum.vraptor.mydvds.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Dvd entity.
 *
 * Represents the table DVD from the database.
 *
 * A persisted object of this class represents a record in the database.
 */
@Entity
public class Dvd {

		/*
	 * Primary key.
	 */
	@Id
	@GeneratedValue
	private Long id;

	private String title;

	private String description;

	// dvd to user mapping
	@OneToMany(mappedBy = "dvd")
	private Set<DvdCopy> copies;

	@Enumerated(EnumType.STRING)
	private DvdType type;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public DvdType getType() {
		return type;
	}

	public void setType(DvdType type) {
		this.type = type;
	}

	public Set<DvdCopy> getCopies() {
		return copies;
	}

	public void setCopies(Set<DvdCopy> copies) {
		this.copies = copies;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Dvd other = (Dvd) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		return true;
	}


}
