package domain;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Access(AccessType.PROPERTY)
public class Category extends DomainEntity {

	private String name;
	private Boolean root;

	@NotBlank
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		/*
		 * if (this.root.equals(false)) { this.name.toUpperCase(); } else {
		 */
		this.name = name;
		// }
	}

	public Boolean getRoot() {
		return this.root;
	}

	public void setRoot(Boolean root) {
		this.root = root;
	}

	// Relationships

	private Finder finder;

	@OneToOne(optional = true)
	public Finder getFinder() {
		return this.finder;
	}

	public void setFinder(Finder finder) {
		this.finder = finder;
	}

}
