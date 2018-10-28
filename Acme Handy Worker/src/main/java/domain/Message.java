
package domain;

import java.util.Date;
import java.util.Set;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

public class Message extends DomainEntity {

	private Date			moment;
	private String			subject;
	private String			body;
	private Priority		priority;
	private Set<String>		tags;
	private Actor 			sender;
	private Actor 			recipient;


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
	public Actor getSender() {
		return sender;
	}

	public void setSender(Actor sender) {
		this.sender = sender;
	}

	public Actor getRecipient() {
		return recipient;
	}

	public void setRecipient(Actor recipient) {
		this.recipient = recipient;
	}

	@NotBlank // no se si hace falta esto
	public Priority getPriority() {
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

	public void setPriority(Priority priority) {
		this.priority = priority;
	}

	public void setTags(Set<String> tags) {
		this.tags = tags;
	}

}
