package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Access(AccessType.PROPERTY)
public class HandyWorker extends Actor {

	private String makeName;

	@NotBlank
	public String getMakeName() {
		return this.makeName;
	}

	public void setMakeName(String makeName) {
		this.makeName = makeName;
	}

	// Relationships ----------------------------------------------------------
	private Collection<Tutorial> tutorials;
	private Collection<Endorsement> sentEndorsements;
	private Collection<Endorsement> receivedEndorsements;

	@Valid
	@OneToMany
	public Collection<Tutorial> getTutorials() {
		return this.tutorials;
	}

	public void setTutorials(Collection<Tutorial> tutorial) {
		this.tutorials = tutorial;
	}

	@Valid
	@NotNull
	@OneToMany(mappedBy = "sender")
	public Collection<Endorsement> getSentEndorsements() {
		return this.sentEndorsements;
	}

	public void setSentEndorsements(Collection<Endorsement> sentEndorsements) {
		this.sentEndorsements = sentEndorsements;
	}

	@Valid
	@NotNull
	@OneToMany(mappedBy = "recipient")
	public Collection<Endorsement> getReceivedEndorsements() {
		return this.receivedEndorsements;
	}

	public void setReceivedEndorsements(
			Collection<Endorsement> receivedEndorsements) {
		this.receivedEndorsements = receivedEndorsements;
	}
}
