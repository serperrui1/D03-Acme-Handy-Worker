package domain;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;

//import org.hibernate.validator.constraints.Range;

@Entity
@Access(AccessType.PROPERTY)
public class Customer extends Actor{
	/*private Double score;
	//private List<FixUpTask> tasks;
	
	@Range(min=-1,max=1)
	public Double getScore() {
		return score;
	}
	public void setScore(Double score) {
		this.score = score;
	}*/

}
