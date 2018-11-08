
package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
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


	@OneToMany
	public Collection<Message> getMessages() {
		return this.messages;
	}

	public void setMessages(final Collection<Message> messages) {
		this.messages = messages;
	}

}
