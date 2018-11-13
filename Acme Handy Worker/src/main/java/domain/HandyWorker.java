
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
	private Double	score;


	@Transient
	// TODO: atributo derivado
	@Range(min = -1, max = 1)
	public Double getScore() {
		return this.score;
	}

	public void setScore(final Double score) {
		this.score = score;
	}

	@NotBlank
	public String getMakeName() {
		if (this.getMiddleName() == null)
			this.makeName = this.getName() + " " + this.getSurname();
		else
			this.makeName = this.getName() + " " + this.getMiddleName() + " " + this.getSurname();
		return this.makeName;
	}

	public void setMakeName(final String makeName) {
		this.makeName = makeName;
	}


	// Relationships ----------------------------------------------------------
	private Collection<Tutorial>	tutorials;
	private Application				application;
	private Curriculum				curriculum;
	private Finder					finder;
	


	@OneToMany
	public Collection<Tutorial> getTutorials() {
		return this.tutorials;
	}

	public void setTutorials(final Collection<Tutorial> tutorial) {
		this.tutorials = tutorial;
	}

	@OneToOne(optional = true)
	public Application getApplication() {
		return this.application;
	}

	public void setApplication(final Application application) {
		this.application = application;
	}

	@OneToOne(optional = true)
	public Curriculum getCurriculum() {
		return this.curriculum;
	}

	public void setCurriculum(final Curriculum curriculum) {
		this.curriculum = curriculum;
	}

	@OneToOne(optional = true)
	public Finder getFinder() {
		return this.finder;
	}

	public void setFinder(final Finder finder) {
		this.finder = finder;
	}

}
