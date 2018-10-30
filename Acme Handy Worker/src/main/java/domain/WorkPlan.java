
package domain;

import java.util.Set;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;

@Entity
@Access(AccessType.PROPERTY)
public class WorkPlan extends DomainEntity{

	private FixUpTask	task;
	private Set<Phase>	phases;
	


	public FixUpTask getTask() {
		return this.task;
	}

	public void setTask(final FixUpTask task) {
		//		if (this.status.equals(Status.ACCEPTED))
		//			this.task = task;
		//		else
		this.task = null;
	}

	public Set<Phase> getPhases() {
		return this.phases;
	}


	public void setPhases(Set<Phase> phases) {
		this.phases = phases;
	}

}
