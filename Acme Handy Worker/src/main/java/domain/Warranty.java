
package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Access(AccessType.PROPERTY)
public class Warranty extends DomainEntity {

	private String				title;
	private Collection<String>	terms;
	private Collection<String>	laws;


	@NotBlank
	public String getTitle() {
		return this.title;
	}

	public void setTitle(final String title) {
		this.title = title;
	}

	@NotEmpty
	@ElementCollection
	public Collection<String> getTerms() {
		return this.terms;
	}

	public void setTerms(Collection<String> terms) {
		this.terms = terms;
	}

	@NotEmpty
	@ElementCollection
	public Collection<String> getLaws() {
		return this.laws;
	}

	public void setLaws(Collection<String> laws) {
		this.laws = laws;
	}

}
