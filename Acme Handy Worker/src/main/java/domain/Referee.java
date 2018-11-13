
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
	private Collection<Report>	reports;

	@OneToMany
	public Collection<Report> getReports() {
		return this.reports;
	}

	public void setReports(final Collection<Report> Report) {
		this.reports = Report;
	}
}
