package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Access(AccessType.PROPERTY)
public class MessageFolder extends DomainEntity {

	private String name;
	private Boolean modifiable;

	@NotBlank
	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		if (this.getModifiable())
			this.name = name;

	}

	public Boolean getModifiable() {
		return this.modifiable;
	}

	public void setModifiable(Boolean modifiable) {
		this.modifiable = modifiable;
	}

	// Relationships ----------------------------------------------------------
	private Collection<Message> messages;
	private Actor actor;

	@Valid
	@NotNull
	@OneToMany(mappedBy = "messageFolder")
	public Collection<Message> getMessages() {
		return this.messages;
	}

	public void setMessages(Collection<Message> messages) {
		this.messages = messages;
	}

	@Valid
	@NotNull
	@ManyToOne
	public Actor getActor() {
		return this.actor;
	}

	public void setActor(Actor actor) {
		this.actor = actor;
	}

}
