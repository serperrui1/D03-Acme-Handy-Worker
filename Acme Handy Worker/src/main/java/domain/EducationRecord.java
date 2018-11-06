package domain;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.Valid;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Access(AccessType.PROPERTY)
public class EducationRecord extends DomainEntity {

	private Date endStudy;
	private String institution;
	private String link;
	private Collection<String> comments;

	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	public Date getEndStudy() {
		return this.endStudy;
	}

	public void setEndStudy(final Date endStudy) {
		this.endStudy = endStudy;
	}

	@NotBlank
	public String getInstitution() {
		return this.institution;
	}

	public void setInstitution(final String institution) {
		this.institution = institution;
	}

	@URL
	public String getLink() {
		return this.link;
	}

	public void setLink(final String link) {
		this.link = link;
	}

	@ElementCollection
	public Collection<String> getComments() {
		return comments;
	}

	public void setComments(Collection<String> comments) {
		this.comments = comments;
	}
	// Relationships ----------------------------------------------------------

		private Curriculum	curriculum;


		@Valid
		@ManyToOne(optional = false)
		public Curriculum getCurriculum() {
			return this.curriculum;
		}
		public void setCurriculum(final Curriculum curriculum) {
			this.curriculum = curriculum;
		}
}
