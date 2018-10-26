
package domain;

import java.util.Date;
import java.util.Set;

import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotBlank;

public class Message extends DomainEntity {

	private Date			moment;
	private String			subject;
	private String			body;
	private PriorityEnum	priority;
	private Set<String>		tags;


	//TODO: Falta messageFolder
	@Past
	public Date getMoment() {
		return this.moment;
	}

	@NotBlank
	public String getSubject() {
		return this.subject;
	}
	@NotBlank
	public String getBody() {
		return this.body;
	}
	@NotBlank // no se si hace falta esto
	public PriorityEnum getPriority() {
		return this.priority;
	}

	public Set<String> getTags() {
		return this.tags;
	}

}
