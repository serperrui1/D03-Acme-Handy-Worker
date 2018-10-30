
package domain;

import java.util.Set;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;

import org.hibernate.validator.constraints.NotBlank;
@Entity
@Access(AccessType.PROPERTY)
public class MessageFolder extends DomainEntity {

	private String			name;
	private Boolean			modifiable;
	private Set<Message>	messages;


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

	public Set<Message> getMessages() {
		return this.messages;
	}

	public void setMessages(final Set<Message> messages) {
		this.messages = messages;
	}

	public void setModifiable(Boolean modifiable) {
		this.modifiable = modifiable;
	}

}
