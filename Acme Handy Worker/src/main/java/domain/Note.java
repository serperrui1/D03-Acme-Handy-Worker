
package domain;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Past;

@Entity
@Access(AccessType.PROPERTY)
public class Note extends DomainEntity {

	private Date	moment;


	@Past
	@Temporal(TemporalType.TIMESTAMP)
	public Date getMoment() {
		return this.moment;
	}

	public void setMoment(final Date moment) {
		this.moment = moment;
	}


	// Relationships ----------------------------------------------------------
	private Report				report;
	private Collection<String>	customerComments;
	private Collection<String>	refereeComments;
	private Collection<String>	HandyWorkerComments;



	public Collection<String> getCustomerComments() {
		return customerComments;
	}

	public void setCustomerComments(Collection<String> customerComments) {
		this.customerComments = customerComments;
	}

	public Collection<String> getRefereeComments() {
		return refereeComments;
	}

	public void setRefereeComments(Collection<String> refereeComments) {
		this.refereeComments = refereeComments;
	}

	public Collection<String> getHandyWorkerComments() {
		return HandyWorkerComments;
	}

	public void setHandyWorkerComments(Collection<String> handyWorkerComments) {
		HandyWorkerComments = handyWorkerComments;
	}

	@ManyToOne(optional = false)
	public Report getReport() {
		return this.report;
	}

	public void setReport(final Report report) {
		this.report = report;
	}
}
