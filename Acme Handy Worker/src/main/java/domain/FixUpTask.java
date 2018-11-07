
package domain;

import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Access(AccessType.PROPERTY)
public class FixUpTask extends DomainEntity {

	private String	ticker;
	private Date	startMoment;
	private Date	endMoment;
	private String	description;
	private String	addres;
	private Double	maximumPrice;


	@NotBlank
	@Column(unique = true)
	@Pattern(regexp = "^[0-9][0-9](0[1-9]|1[0-2])(0[1-9]|[1-2][0-9]|3[0-1])-[A-Z0-9]{6}$")
	public String getTicker() {
		return this.ticker;
	}

	public void setTicker(final String ticker) {
		this.ticker = ticker;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

	public void setAddres(final String addres) {
		this.addres = addres;
	}

	public void setMaximumPrice(final Double maximumPrice) {
		this.maximumPrice = maximumPrice;
	}

	@Past
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
		// if (this.getStartMoment().after(this.phase.getStartMoment()))
		// throw new
		// IllegalArgumentException("A phase cannot start before it's fix up task has started already");
		this.startMoment = startMoment;
	}

	public void setEndMoment(final Date endMoment) {
		// if (this.phase.getEndMoment().after(this.getEndMoment()))
		// throw new
		// IllegalArgumentException("A phase cannot finish after it's fix up task is finished");
		this.endMoment = endMoment;
	}

	@NotBlank
	public String getAddres() {
		return this.addres;
	}

	public Double getMaximumPrice() {
		return this.maximumPrice;
	}


	// Relationships ----------------------------------------------------------
	private Warranty	warranty;
	private Customer	customer;
	private WorkPlan	workPlan;
	private Category	category;
	private Finder		finder;
	private Application	application;


	@ManyToOne(optional = false)
	public Category getCategory() {
		return this.category;
	}

	public void setCategory(final Category category) {
		this.category = category;
	}

	@ManyToMany
	public Finder getFinder() {
		return this.finder;
	}

	public void setFinder(final Finder finder) {
		this.finder = finder;
	}

	@OneToOne(optional = false)
	public Application getApplication() {
		return this.application;
	}

	public void setApplication(final Application application) {
		this.application = application;
	}

	@OneToOne(optional = false)
	public WorkPlan getWorkPlan() {
		return this.workPlan;
	}

	public void setWorkPlan(final WorkPlan workPlan) {
		this.workPlan = workPlan;
	}

	@OneToOne(optional = false)
	public Warranty getWarranty() {
		return this.warranty;
	}

	public void setWarranty(final Warranty warranty) {
		this.warranty = warranty;
	}

	@ManyToOne
	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(final Customer customer) {
		this.customer = customer;
	}

}
