
package domain;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotEmpty;

public class Application extends DomainEntity{

	private Date			moment;
	private Status			status;
	private Double			price;
	private List<String>	comments;

	@Past
	public Date getMoment() {
		return this.moment;
	}

	public Status getStatus() {
		return this.status;
	}
	@NotEmpty
	public Double getPrice() {
		return this.price;
	}

	public List<String> getComments() {
		return this.comments;
	}

	public void setStatus(final Status status) {
		this.status = status;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public void setComments(List<String> comments) {
		this.comments = comments;
	}
	

}
