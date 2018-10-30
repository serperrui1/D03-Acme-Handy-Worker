
package domain;



import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.Pattern;


import org.hibernate.validator.constraints.NotBlank;

@Entity
@Access(AccessType.PROPERTY)
public class Curriculum extends DomainEntity {

	private String					ticker;
//	private PersonalRecord			personalRecord;
//	private Set<EducationRecord>	educationalRecord;
//	private Set<ProfessionalRecord>	profesionalRecord;
//	private Set<EndoserRecord>		endoserRecord;
//	private Set<MiscellaneousRecord>	miscellaniousRecord;
	
	
	@NotBlank
	@Column(unique = true)
	@Pattern(regexp = "^[0-9][0-9](0[1-9]|1[0-2])(0[1-9]|[1-2][0-9]|3[0-1])-[A-Z0-9] {6}$")
	public String getTicker() {
		return ticker;
	}

	public void setTicker(String ticker) {
		this.ticker = ticker;
	}
	
	
	
	

}
