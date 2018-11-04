package domain;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Access(AccessType.PROPERTY)
public class Application extends DomainEntity {

	private Date moment;
	private String status;
	private Double price;
	private Collection<String> comments;

	@Past
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

	public void setStatus(String status) {
		this.status = status;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Collection<String> getComments() {
		return this.comments;
	}

	public void setComments(Collection<String> comments) {
		this.comments = comments;
	}

}
