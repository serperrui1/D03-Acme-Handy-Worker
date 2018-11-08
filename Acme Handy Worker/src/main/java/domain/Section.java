package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.Valid;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

@Entity
@Access(AccessType.PROPERTY)
public class Section extends DomainEntity {

	private Integer id;
	private String title;
	private String text;
	private Collection<String> picture;

	@Column(unique = true)
	public int getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@NotBlank
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@NotBlank
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@URL
	public Collection<String> getPicture() {
		return picture;
	}

	public void setPicture(Collection<String> picture) {
		this.picture = picture;
	}

//	// Relationships ----------------------------------------------------------
//	private Tutorial tutorial;
//
//
//	@ManyToOne(optional = false)
//	public Tutorial getTutorial() {
//		return this.tutorial;
//	}
//
//	public void setTutorial(Tutorial tutorial) {
//		this.tutorial = tutorial;
//	}

}
