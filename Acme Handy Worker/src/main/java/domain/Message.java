package domain;

import java.util.Date;
import java.util.Set;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Access(AccessType.PROPERTY)
public class Message extends DomainEntity {

	private Date			moment;
	private String			subject;
	private String			body;
	private String 		 	priority;
	private Set<String>		tags;



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
	@Pattern(regexp ="^(HIGH|NEUTRAL|LOW)$")
	public String getPriority() {
		return this.priority;
	}

	public Set<String> getTags() {
		return this.tags;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public void setTags(Set<String> tags) {
		this.tags = tags;
	}
	// Relationships ----------------------------------------------------------
	private Actor			sender;
	private Actor			recipient;
	private MessageFolder	messageFolder;


	@Valid
	@NotNull
	@ManyToOne
	public Actor getSender() {
		return this.sender;
	}
	public void setSender(Actor sender) {
		this.sender = sender;
	}

	@Valid
	@NotNull
	@ManyToOne
	public Actor getRecipient() {
		return this.recipient;
	}
	public void setRecipient(Actor recipient) {
		this.recipient = recipient;
	}

	@Valid
	@NotNull
	@ManyToOne
	public MessageFolder getMessageFolder() {
		return this.messageFolder;
	}
	public void setMessageFolder(MessageFolder messageFolder) {
		this.messageFolder = messageFolder;
	}

}
