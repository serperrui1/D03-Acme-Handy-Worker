
package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Access(AccessType.PROPERTY)
public class MessageFolder extends DomainEntity {

	private String	name;
	private boolean	modifiable;


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

	public void setModifiable(final Boolean modifiable) {
		this.modifiable = modifiable;
	}


	// Relationships ----------------------------------------------------------
	private Collection<Message>	messages;
	private Actor				actor;


	@OneToMany()
	public Collection<Message> getMessages() {
		return this.messages;
	}

	public void setMessages(final Collection<Message> messages) {
		this.messages = messages;
	}

	@ManyToOne(optional = false)
	public Actor getActor() {
		return this.actor;
	}

	public void setActor(final Actor actor) {
		this.actor = actor;
	}

}
