
package domain;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Access(AccessType.PROPERTY)
public class Warranty extends DomainEntity {

	private String	title;
	private String	terms;
	private String	laws;


	@NotBlank
	public String getTitle() {
		return this.title;
	}
	public void setTitle(final String title) {
		this.title = title;
	}
	@NotBlank
	public String getTerms() {
		return this.terms;
	}
	public void setTerms(final String terms) {
		this.terms = terms;
	}
	@NotBlank
	public String getLaws() {
		return this.laws;
	}
	public void setLaws(final String laws) {
		this.laws = laws;
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

	@OneToOne(optional = false)
	public FixUpTask getFixUpTask() {
		return this.fixUpTask;
	}
	public void setFixUpTask(final FixUpTask fixUpTask) {
		this.fixUpTask = fixUpTask;
	}

}