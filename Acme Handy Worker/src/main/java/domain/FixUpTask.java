
package domain;

import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Access(AccessType.PROPERTY)
public class FixUpTask extends DomainEntity{

	private String		ticker;
	private Date		startMoment;
	private Date		endMoment;
	private String		description;
	private String		addres;
	private Double		maximumPrice;
	private Category	category;
	private Phase		phase;
	private Warranty 	warranty;
	
	


	@NotBlank
	public String getTicker() {
		return this.ticker;
	}
	

	public Warranty getWarranty() {
		return warranty;
	}

	public void setWarranty(Warranty warranty) {
		this.warranty = warranty;
	}

	public void setTicker(String ticker) {
		this.ticker = ticker;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setAddres(String addres) {
		this.addres = addres;
	}

	public void setMaximumPrice(Double maximumPrice) {
		this.maximumPrice = maximumPrice;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public void setPhase(Phase phase) {
		this.phase = phase;
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
		//		if (this.getStartMoment().after(this.phase.getStartMoment()))
		//			throw new IllegalArgumentException("A phase cannot start before it's fix up task has started already");
		this.startMoment = startMoment;
	}

	public void setEndMoment(final Date endMoment) {
		//		if (this.phase.getEndMoment().after(this.getEndMoment()))
		//			throw new IllegalArgumentException("A phase cannot finish after it's fix up task is finished");
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
