
package domain;

import java.util.Set;

public class WorkPlan {

	private FixUpTask	task;
	private Set<Phase>	phases;
	private Status		status;


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

}
