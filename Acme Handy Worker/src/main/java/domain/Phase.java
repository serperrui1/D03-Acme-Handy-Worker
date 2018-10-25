
package domain;

import java.util.Date;

import org.hibernate.validator.constraints.NotBlank;

public class Phase {

	private String	title;
	private String	description;
	private Date	startMoment;
	private Date	endMoment;


	@NotBlank
	public String getTitle() {
		return this.title;
	}
	@NotBlank
	public String getDescription() {
		return this.description;
	}

	public Date getStartMoment() {
		return this.startMoment;
	}

	public Date getEndMoment() {
		return this.endMoment;
	}

}
