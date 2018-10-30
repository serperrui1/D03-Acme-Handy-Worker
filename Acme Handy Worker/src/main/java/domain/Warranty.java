
package domain;

import java.util.Set;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Access(AccessType.PROPERTY)
public class Warranty extends DomainEntity{

	private String		title;
	private Set<String>	terms;
	private Set<String>	laws;


	public void setTitle(String title) {
		this.title = title;
	}
	public void setTerms(Set<String> terms) {
		this.terms = terms;
	}
	public void setLaws(Set<String> laws) {
		this.laws = laws;
	}
	@NotBlank
	public String getTitle() {
		return this.title;
	}
	@NotBlank
	public Set<String> getTerms() {
		return this.terms;
	}
	@NotBlank
	public Set<String> getLaws() {
		return this.laws;
	}

}
