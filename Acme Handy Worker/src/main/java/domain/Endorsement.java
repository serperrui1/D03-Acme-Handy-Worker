
package domain;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.Past;

@Entity
@Access(AccessType.PROPERTY)
public class Endorsement extends DomainEntity {

	private Date				moment;
	private Collection<String>	comments;


	@Past
	public Date getMoment() {
		return this.moment;
	}

	public void setMoment(final Date moment) {
		this.moment = moment;
	}

	public Collection<String> getComments() {
		return this.comments;
	}

	public void setComments(final Collection<String> comments) {
		this.comments = comments;
	}


	// Relationships ----------------------------------------------------------

	private Endorser	endorser;
	private Endorser	recipient;


	@OneToMany(mappedBy = "endorser")
	public Endorser getEndorser() {
		return this.endorser;
	}

	public void setEndorser(final Endorser endorser) {
		this.endorser = endorser;
	}

	@OneToMany(mappedBy = "recipient")
	public Endorser getRecipient() {
		return this.recipient;
	}

	public void setRecipient(final Endorser recipient) {
		this.recipient = recipient;
	}

}
