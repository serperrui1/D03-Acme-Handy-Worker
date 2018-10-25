
package domain;

import java.util.Date;
import java.util.List;

import org.hibernate.validator.constraints.NotEmpty;

public class Application {

	private Date			moment;
	private Status			status;
	private Double			price;
	private List<String>	comments;


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

}
