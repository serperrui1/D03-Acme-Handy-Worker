package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Access(AccessType.PROPERTY)
public class Warranty extends DomainEntity {

	private String title;
	private Collection<String> terms;
	private Collection<String> laws;

	@NotBlank
	public String getTitle() {
		return this.title;
	}

	public void setTitle(final String title) {
		this.title = title;
	}

	@NotBlank
	public Collection<String> getTerms() {
		return this.terms;
	}

	public void setTerms(Collection<String>terms) {
		this.terms = terms;
	}

	@NotBlank
	public Collection<String> getLaws() {
		return this.laws;
	}

	public void setLaws(Collection<String>laws) {
		this.laws = laws;
	}

	// Relationships

	private Finder finder;

	@OneToOne(optional = true)
	public Finder getFinder() {
		return this.finder;
	}

	public void setFinder(final Finder finder) {
		this.finder = finder;
	}

}
