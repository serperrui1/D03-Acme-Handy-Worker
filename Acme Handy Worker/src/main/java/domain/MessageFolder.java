
package domain;

import java.util.Set;

import org.hibernate.validator.constraints.NotBlank;

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
		if (this.name.equals(DefaultFolders.INBOX) || this.name.equals(DefaultFolders.OUTBOX) || this.name.equals(DefaultFolders.SPAMBOX) || this.name.equals(DefaultFolders.TRASHBOX))
			this.modifiable = false;
		else
			this.modifiable = true;
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
