
package domain;

import org.hibernate.validator.constraints.NotBlank;

public class HandyWorker {

	public String		makeName;
	public FixUpTask	task;


	@NotBlank
	public String getMakeName() {
		return this.makeName;
	}

	public FixUpTask getTask() {
		return this.task;
	}

}
