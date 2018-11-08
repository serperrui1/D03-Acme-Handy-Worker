
package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;

@Entity
@Access(AccessType.PROPERTY)
public class HandyWorker extends Endorser {

	private String	makeName;
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



	@NotBlank
	//TODO: default name
	public String getMakeName() {
		return this.makeName;
	}

	public void setMakeName( String makeName) {
		this.makeName = makeName;
	}


	// Relationships ----------------------------------------------------------
	private Collection<Tutorial>	tutorials;
	private Application				application;
	private Collection<WorkPlan>	workPlans;
	private Curriculum				curriculum;



	@OneToMany(mappedBy = "handyWorker")
	public Collection<Tutorial> getTutorials() {
		return this.tutorials;
	}

	public void setTutorials( Collection<Tutorial> tutorial) {
		this.tutorials = tutorial;
	}

	@OneToOne(optional = false)
	public Application getApplication() {
		return this.application;
	}

	public void setApplication( Application application) {
		this.application = application;
	}

	@OneToMany(mappedBy = "handyWorker")
	public Collection<WorkPlan> getWorkPlans() {
		return this.workPlans;
	}

	public void setWorkPlans( Collection<WorkPlan> workPlans) {
		this.workPlans = workPlans;
	}

	@OneToOne(optional = true)
	public Curriculum getCurriculum() {
		return this.curriculum;
	}

	public void setCurriculum( Curriculum curriculum) {
		this.curriculum = curriculum;
	}
}
