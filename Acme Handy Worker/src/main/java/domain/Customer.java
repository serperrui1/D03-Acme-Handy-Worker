package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Transient;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

//import org.hibernate.validator.constraints.Range;

@Entity
@Access(AccessType.PROPERTY)
public class Customer extends Actor {
	private Double score;

	@Transient
	@Range(min = -1, max = 1)
	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	// Relationships ----------------------------------------------------------

	private Collection<Complaint> complaints;
	private Collection<Endorsement> sentEndorsements;
	private Collection<Endorsement> receivedEndorsements;

	@Valid
	@OneToMany(mappedBy = "customer")
	public Collection<Complaint> getComplaints() {
		return this.complaints;
	}

	public void setComplaints(Collection<Complaint> complaints) {
		this.complaints = complaints;
	}
	@Valid
	@NotNull
	@OneToMany(mappedBy = "makes")
	public Collection<Endorsement> getSentEndorsements() {
		return this.sentEndorsements;
	}

	public void setSentEndorsements(final Collection<Endorsement> sentEndorsements) {
		this.sentEndorsements = sentEndorsements;
	}

	@Valid
	@NotNull
	@OneToMany(mappedBy = "recipient")
	public Collection<Endorsement> getReceivedEndorsements() {
		return this.receivedEndorsements;
	}

	public void setReceivedEndorsements(final Collection<Endorsement> receivedEndorsements) {
		this.receivedEndorsements = receivedEndorsements;
	}
}
