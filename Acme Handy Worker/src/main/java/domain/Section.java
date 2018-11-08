
package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

@Entity
@Access(AccessType.PROPERTY)
public class Section extends DomainEntity {

	private Integer				id;
	private String				title;
	private String				text;
	private Collection<String>	picture;


	/*
	 * @Override
	 * 
	 * @Column(unique = true)
	 * public int getId() {
	 * return this.id;
	 * }
	 * 
	 * public void setId(final Integer id) {
	 * this.id = id;
	 * }
	 */

	@NotBlank
	public String getTitle() {
		return this.title;
	}

	public void setTitle(final String title) {
		this.title = title;
	}

	@NotBlank
	public String getText() {
		return this.text;
	}

	public void setText(final String text) {
		this.text = text;
	}

	@URL
	@ElementCollection
	public Collection<String> getPicture() {
		return this.picture;
	}

	public void setPicture(final Collection<String> picture) {
		this.picture = picture;
	}

}
