package domain;

import java.util.List;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

@Entity
@Access(AccessType.PROPERTY)
public class Section extends DomainEntity {
	
	private Integer id;
	private String title;
	private String text;
	private List<String> picture;
	
	
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
	public List<String> getPicture() {
		return picture;
	}
	public void setPicture(List<String> picture) {
		this.picture = picture;
	}

}
