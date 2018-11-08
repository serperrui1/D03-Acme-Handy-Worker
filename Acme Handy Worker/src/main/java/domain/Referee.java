package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
@Access(AccessType.PROPERTY)
public class Referee extends Actor {

	// Relationships ----------------------------------------------------------
	private Collection<Report> reports;
	private Collection<Comment> comments;
	
	
	@OneToMany
	public Collection<Comment> getComments() {
		return comments;
	}

	public void setComments(Collection<Comment> comments) {
		this.comments = comments;
	}

	@OneToMany
	public Collection<Report> getReports() {
		return this.reports;
	}

	public void setReports(Collection<Report> Report) {
		this.reports = Report;
	}
}
