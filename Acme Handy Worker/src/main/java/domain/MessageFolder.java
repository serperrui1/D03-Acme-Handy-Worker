
package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Access(AccessType.PROPERTY)
public class MessageFolder extends DomainEntity {
	@NotBlank
	private String	name;
	private boolean	modifiable;


	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		//if (this.getModifiable())
			this.name = name;

	}

	public Boolean getModifiable() {
		return this.modifiable;
	}

	public void setModifiable(Boolean modifiable) {
		this.modifiable = modifiable;
	}


	// Relationships ----------------------------------------------------------
	private Collection<Message>	messages;

	@ManyToMany
	public Collection<Message> getMessages() {
		return this.messages;
	}

	public void setMessages(Collection<Message> messages) {
		this.messages = messages;
	}

}
