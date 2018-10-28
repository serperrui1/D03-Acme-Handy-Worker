
package domain;

import org.hibernate.validator.constraints.NotBlank;

public class HandyWorker extends Actor{

	public String		makeName;
	public FixUpTask	task;
	public Double 		score;
	private WorkPlan 	workplan;
	private Curriculum curriculum;


	@NotBlank
	public String getMakeName() {
		return this.makeName;
	}

	public FixUpTask getTask() {
		return this.task;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public WorkPlan getWorkplan() {
		return workplan;
	}

	public void setWorkplan(WorkPlan workplan) {
		this.workplan = workplan;
	}

	public Curriculum getCurriculum() {
		return curriculum;
	}

	public void setCurriculum(Curriculum curriculum) {
		this.curriculum = curriculum;
	}

	public void setMakeName(String makeName) {
		this.makeName = makeName;
	}

	public void setTask(FixUpTask task) {
		this.task = task;
	}

}
