
package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

import security.UserAccount;

@Entity
@Access(AccessType.PROPERTY)
public class Actor extends DomainEntity {

	private String	name;
	private String	surname;
	private String	middleName;
	private String	photo;
	private String	email;
	private String	phone;
	private String	address;


	@NotBlank
	public String getName() {
		return this.name;
	}

	@NotBlank
	public String getSurname() {
		return this.surname;
	}

	public void setSurname(final String surname) {
		this.surname = surname;
	}

	public String getMiddleName() {
		return this.middleName;
	}

	@URL
	@NotBlank
	public String getPhoto() {
		return this.photo;
	}

	@NotBlank
	public String getEmail() {
		return this.email;
	}

	public String getPhone() {
		return this.phone;
	}

	public String getAddress() {
		return this.address;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public void setMiddleName(final String middleName) {
		this.middleName = middleName;
	}

	public void setPhoto(final String photo) {
		this.photo = photo;
	}

	public void setEmail(final String email) {
		this.email = email;
	}

	public void setPhone(final String phone) {
		this.phone = phone;
	}

	public void setAddress(final String address) {
		this.address = address;
	}


	// Relationships ----------------------------------------------------------
	private UserAccount					userAccount;
	private Collection<Message>			sentMessages;
	private Collection<Message>			receivedMessages;
	private Collection<MessageFolder>	messageFolders;
	private Collection<Profile>			profiles;


	@NotNull
	@OneToOne(cascade = CascadeType.ALL, optional = false, fetch = FetchType.LAZY)
	public UserAccount getUserAccount() {
		return this.userAccount;
	}
	public void setUserAccount(final UserAccount userAccount) {
		this.userAccount = userAccount;
	}

	@OneToMany(mappedBy = "sender")
	public Collection<Message> getSentMessages() {
		return this.sentMessages;
	}

	public void setSentMessages(final Collection<Message> sentMessages) {
		this.sentMessages = sentMessages;
	}

	@OneToMany(mappedBy = "recipient")
	public Collection<Message> getReceivedMessages() {
		return this.receivedMessages;
	}

	public void setReceivedMessages(final Collection<Message> receivedMessages) {
		this.receivedMessages = receivedMessages;
	}

	@OneToMany()
	public Collection<MessageFolder> getMessageFolders() {
		return this.messageFolders;
	}

	public void setMessageFolders(final Collection<MessageFolder> messageFolders) {
		this.messageFolders = messageFolders;
	}

	@OneToMany()
	public Collection<Profile> getProfiles() {
		return this.profiles;
	}

	public void setProfiles(final Collection<Profile> profiles) {
		this.profiles = profiles;
	}

}
