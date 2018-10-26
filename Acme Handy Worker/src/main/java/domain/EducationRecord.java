
package domain;

import java.util.Date;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

public class EducationRecord extends DomainEntity {

	private Date	endStudy;
	private String	institution;
	private String	link;
	private String	comments;


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

	public String getComments() {
		return this.comments;
	}

	public void setComments(final String comments) {
		this.comments = comments;
	}

}
