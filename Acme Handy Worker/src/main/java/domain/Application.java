
package domain;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Access(AccessType.PROPERTY)
public class Application extends DomainEntity{

	private Date			moment;
	private String		    status;
	private Double			price;
	private List<String>	comments;
	private Set<FixUpTask>  tasks;

	@Past
	public Date getMoment() {
		return this.moment;
	}

	public String getStatus() {
		return this.status;
	}
	@NotEmpty
	public Double getPrice() {
		return this.price;
	}

	public List<String> getComments() {
		return this.comments;
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

	public void setComments(List<String> comments) {
		this.comments = comments;
	}

	public Set<FixUpTask> getTasks() {
		return tasks;
	}

	public void setTasks(Set<FixUpTask> tasks) {
		this.tasks = tasks;
	}
	

}
