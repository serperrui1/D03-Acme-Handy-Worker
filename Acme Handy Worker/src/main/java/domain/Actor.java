
package domain;


import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;
@Entity
@Access(AccessType.PROPERTY)
public class Actor extends DomainEntity {

	private String				name;
	private String				surname;
	private String				middleName;
	private String				photo;
	private String				email;
	private String				phone;
	private String				address;
//	private Set<Profile>		profile;
//	private Set<MessageFolder>	messageFolder;


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
	public String getPhoto() {
		return this.photo;
	}

	@NotBlank
	@Email
	public String getEmail() {
		return this.email;
	}

	@NotBlank
	public String getPhone() {
		return this.phone;
	}

	public String getAddress() {
		return this.address;
	}

	

	public void setName(String name) {
		this.name = name;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
