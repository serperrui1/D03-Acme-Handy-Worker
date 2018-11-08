
package domain;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Access(AccessType.PROPERTY)
public class Application extends DomainEntity {

	private Date				moment;
	private String				status;
	private Double				price;
	private Collection<String>	comments;
	private String statusColor;

	@Past
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy HH:mm")
	public Date getMoment() {
		return this.moment;
	}

	@Pattern(regexp = "^(PENDING|ACEPTED|REJECTED)$")
	public String getStatus() {
		return this.status;
	}

	@NotEmpty
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

	public Collection<String> getComments() {
		return this.comments;
	}

	public void setComments(final Collection<String> comments) {
		this.comments = comments;
	}

	//TODO: Propiedad derivada
	@Transient
	public String getStatusColor() {
		return statusColor;
	}

	public void setStatusColor(String statusColor) {
		this.statusColor = statusColor;
	}

	//Relationships



	private FixUpTask	fixUpTask;
	private HandyWorker	handyworker;


	@OneToOne(optional = false)
	public FixUpTask getFixUpTask() {
		return this.fixUpTask;
	}

	public void setFixUpTask(final FixUpTask fixUpTask) {
		this.fixUpTask = fixUpTask;
	}

	@OneToOne(optional = false)
	public HandyWorker getHandyworker() {
		return this.handyworker;
	}

	public void setHandyworker(final HandyWorker handyworker) {
		this.handyworker = handyworker;
	}

}
