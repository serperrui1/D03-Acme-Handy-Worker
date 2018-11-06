
package domain;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Access(AccessType.PROPERTY)
public class Category extends DomainEntity {

	private String	name;
	private Boolean	root;


	@NotBlank
	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		/*
		 * if (this.root.equals(false)) {
		 * this.name.toUpperCase();
		 * } else {
		 */
		this.name = name;
		//}
	}

	public Boolean getRoot() {
		return this.root;
	}

	public void setRoot(final Boolean root) {
		this.root = root;
	}


	//Relationships

	private Finder		finder;
	private FixUpTask	fixUpTask;


	@OneToOne(optional = true)
	public Finder getFinder() {
		return this.finder;
	}

	public void setFinder(final Finder finder) {
		this.finder = finder;
	}

	@OneToMany
	public FixUpTask getFixUpTask() {
		return this.fixUpTask;
	}

	public void setFixUpTask(final FixUpTask fixUpTask) {
		this.fixUpTask = fixUpTask;
	}

}
