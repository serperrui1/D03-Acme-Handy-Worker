
package domain;

import java.util.Date;

import org.hibernate.validator.constraints.NotBlank;

public class FixUpTask {

	private String		ticker;
	private Date		startMoment;
	private Date		endMoment;
	private String		description;
	private String		addres;
	private Double		maximumPrice;
	private Category	category;
	private Phase		phase;


	@NotBlank
	public String getTicker() {
		return this.ticker;
	}

	public Date getStartMoment() {
		return this.startMoment;
	}

	public Date getEndMoment() {
		return this.endMoment;
	}
	@NotBlank
	public String getDescription() {
		return this.description;
	}

	public void setStartMoment(final Date startMoment) {
		if (this.getStartMoment().after(this.phase.getStartMoment()))
			throw new IllegalArgumentException("A phase cannot start before it's fix up task has started already");
		this.startMoment = startMoment;
	}

	public void setEndMoment(final Date endMoment) {
		if (this.phase.getEndMoment().after(this.getEndMoment()))
			throw new IllegalArgumentException("A phase cannot finish after it's fix up task is finished");
		this.endMoment = endMoment;
	}
	@NotBlank
	public String getAddres() {
		return this.addres;
	}

	public Double getMaximumPrice() {
		return this.maximumPrice;
	}

	public Category getCategory() {
		return this.category;
	}

	public Phase getPhase() {
		return this.phase;
	}

}
