
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
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Access(AccessType.PROPERTY)
public class Message extends DomainEntity {

	private Date		moment;
	private String		subject;
	private String		body;
	private String		priority;
	private Collection<String>	tags;


	@Past
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy HH:mm")
	public Date getMoment() {
		return this.moment;
	}

	@NotBlank
	public String getSubject() {
		return this.subject;
	}
	@NotBlank
	public String getBody() {
		return this.body;
	}

	@NotBlank
	@Pattern(regexp = "^(HIGH|NEUTRAL|LOW)$")
	public String getPriority() {
		return this.priority;
	}

	public Collection<String> getTags() {
		return this.tags;
	}

	public void setMoment(final Date moment) {
		this.moment = moment;
	}

	public void setSubject(final String subject) {
		this.subject = subject;
	}

	public void setBody(final String body) {
		this.body = body;
	}

	public void setPriority(final String priority) {
		this.priority = priority;
	}

	public void setTags(final Collection<String> tags) {
		this.tags = tags;
	}


	// Relationships ----------------------------------------------------------
	private Actor			sender;
	private Actor			recipient;


	@ManyToOne(optional = false)
	public Actor getSender() {
		return this.sender;
	}
	public void setSender(final Actor sender) {
		this.sender = sender;
	}

	@ManyToOne(optional = false)
	public Actor getRecipient() {
		return this.recipient;
	}
	public void setRecipient(final Actor recipient) {
		this.recipient = recipient;
	}


}
