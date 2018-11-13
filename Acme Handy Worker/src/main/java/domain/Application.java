
package domain;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

@Entity
@Access(AccessType.PROPERTY)
public class Application extends DomainEntity {

	private Date				moment;
	private String				status;
	private Double				price;
	private Collection<String>	comments;


	@Past
	@Temporal(TemporalType.TIMESTAMP)

	public Date getMoment() {
		return this.moment;
	}

	@Pattern(regexp = "^(PENDING|ACCEPTED|REJECTED)$")
	public String getStatus() {
		return this.status;
	}

	@NotNull
	public Double getPrice() {
		return this.price;
	}

	public void setStatus(final String status) {
		this.status = status;
	}

	public void setMoment(final Date moment) {
		this.moment = moment;
	}

	public void setPrice(final Double price) {
		this.price = price;
	}

	@Valid
	@ElementCollection
	public Collection<String> getComments() {
		return this.comments;
	}

	public void setComments(final Collection<String> comments) {
		this.comments = comments;
	}


	//	// TODO: Propiedad derivada
	//	// @Transient
	//	public String getStatusColor() {
	//		String res;
	//		if (status.equals("PENDING")) {
	//			res = "GREY";
	//		} else if (status.equals("ACCEPTED")) {
	//			res = "GREEN";
	//		} else
	//			res = "ORANGE";
	//		return res;
	//
	//	}
	//
	//	public void setStatusColor(final String statusColor) {
	//	}

	// Relationships

	private Collection<FixUpTask>	fixUpTasks;
	private HandyWorker	handyworker;


	@OneToMany(mappedBy="aplication")
	public Collection<FixUpTask> getFixUpTask() {
		return this.fixUpTasks;
	}

	public void setFixUpTask(final Collection<FixUpTask> fixUpTasks) {
		this.fixUpTasks = fixUpTasks;
	}

	@OneToOne(optional = false)
	public HandyWorker getHandyworker() {
		return this.handyworker;
	}

	public void setHandyworker(final HandyWorker handyworker) {
		this.handyworker = handyworker;
	}

}
