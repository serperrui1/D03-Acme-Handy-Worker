
package domain;

import java.util.Date;

import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

public class ProfessionalRecord {

	private String	nameCompany;
	private Date	startPeriod;
	private Date	endPeriod;
	private String	role;
	private String	link;
	private String	comments;


	@NotBlank
	public String getNameCompany() {
		return this.nameCompany;
	}

	public void setNameCompany(final String nameCompany) {
		this.nameCompany = nameCompany;
	}
	@Past
	public Date getStartPeriod() {
		return this.startPeriod;
	}

	public void setStartPeriod(final Date startPeriod) {
		this.startPeriod = startPeriod;
	}

	public Date getEndPeriod() {
		return this.endPeriod;
	}

	public void setEndPeriod(final Date endPeriod) {
		this.endPeriod = endPeriod;
	}
	@NotBlank
	public String getRole() {
		return this.role;
	}

	public void setRole(final String role) {
		this.role = role;
	}

	public String getLink() {
		return this.link;
	}

	public void setLink(final String link) {
		this.link = link;
	}
	@URL
	public String getComments() {
		return this.comments;
	}

	public void setComments(final String comments) {
		this.comments = comments;
	}

}
