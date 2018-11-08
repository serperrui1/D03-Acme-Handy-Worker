package domain;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Past;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Access(AccessType.PROPERTY)
public class Endorsement extends DomainEntity {

	private Date moment;
	private Collection<String> comments;

	@Past
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy HH:mm")
	public Date getMoment() {
		return this.moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public Collection<String> getComments() {
		return this.comments;
	}

	public void setComments(Collection<String> comments) {
		this.comments = comments;
	}

	// Relationships ----------------------------------------------------------

	private Endorser endorser;
	private Endorser recipient;

	@ManyToOne(optional = false)
	public Endorser getEndorser() {
		return this.endorser;
	}

	public void setEndorser(Endorser endorser) {
		this.endorser = endorser;
	}

	@ManyToOne(optional = false)
	public Endorser getRecipient() {
		return this.recipient;
	}

	public void setRecipient(Endorser recipient) {
		this.recipient = recipient;
	}

}
