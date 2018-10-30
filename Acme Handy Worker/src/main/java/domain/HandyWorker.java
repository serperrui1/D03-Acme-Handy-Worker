
package domain;


import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Access(AccessType.PROPERTY)
public class HandyWorker extends Actor{

	public String		makeName;
//	private WorkPlan 	workplan;
//	private Curriculum curriculum;
//	private Application application;


	@NotBlank
	public String getMakeName() {
		return this.makeName;
	}
	
	public void setMakeName(String makeName) {
		this.makeName = makeName;
	}


}
