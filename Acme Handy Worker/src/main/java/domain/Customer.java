package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

import org.hibernate.validator.constraints.Range;

// import org.hibernate.validator.constraints.Range;

@Entity
@Access(AccessType.PROPERTY)
public class Customer extends Endorser {

	private Double score;

	@Transient
	// TODO: atributo derivado
	@Range(min = -1, max = 1)
	public Double getScore() {
		return this.score;
	}

	public void setScore( Double score) {
		this.score = score;
	}

	// Relationships ----------------------------------------------------------

	private Collection<Complaint> complaints;
	private Collection<FixUpTask> fixUpTasks;
	private Collection<Comment> comments;

	@OneToMany(mappedBy = "customer")
	public Collection<FixUpTask> getFixUpTasks() {
		return this.fixUpTasks;
	}

	public void setFixUpTasks(Collection<FixUpTask> fixUpTasks) {
		this.fixUpTasks = fixUpTasks;
	}

	public void setComplaints(Collection<Complaint> complaints) {
		this.complaints = complaints;
	}

	@OneToMany(mappedBy = "customer")
	public Collection<Complaint> getComplaints() {
		return this.complaints;
	}

	@OneToMany(mappedBy = "customer")
	public Collection<Comment> getComments() {
		return comments;
	}

	public void setComments(Collection<Comment> comments) {
		this.comments = comments;
	}

}
