
package domain;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Access(AccessType.PROPERTY)
public class Category extends DomainEntity {

	private String		name;
	private Boolean		root;
	private Category	father;


	@NotBlank
	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		/*
		 * if (this.root.equals(false)) { this.name.toUpperCase(); } else {
		 */
		this.name = name;
		// }
	}

	public Boolean getRoot() {
		return this.root;
	}

	public void setRoot(final Boolean root) {
		this.root = root;
	}

	@ManyToOne(optional = true)
	public Category getFather() {
		return this.father;
	}

	public void setFather(final Category father) {
		this.father = father;
	}

}
