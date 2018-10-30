
package domain;


import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Access(AccessType.PROPERTY)
public class HandyWorker extends Actor{

	public String		makeName;
	public Double 		score;
	private WorkPlan 	workplan;
	private Curriculum curriculum;
	private Application application;


	@NotBlank
	public String getMakeName() {
		return this.makeName;
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

	public Application getApplication() {
		return application;
	}

	public void setApplication(Application application) {
		this.application = application;
	}

}
