
package domain;

import java.util.Set;


import org.hibernate.validator.constraints.NotBlank;

public class Curriculum extends DomainEntity {

	private String					ticker;
	private PersonalRecord			personalRecord;
	private Set<EducationRecord>	educationalRecord;
	private Set<ProfessionalRecord>	profesionalRecord;
	private Set<EndoserRecord>		endoserRecord;
	private Set<MiscellaneousRecord>	miscellaniousRecord;
	
	
	public String getTicker() {
		return ticker;
	}
	
	@NotBlank
	public void setTicker(String ticker) {
		this.ticker = ticker;
	}
	public PersonalRecord getPersonalRecord() {
		return personalRecord;
	}
	public void setPersonalRecord(PersonalRecord personalRecord) {
		this.personalRecord = personalRecord;
	}
	public Set<EducationRecord> getEducationalRecord() {
		return educationalRecord;
	}
	public void setEducationalRecord(Set<EducationRecord> educationalRecord) {
		this.educationalRecord = educationalRecord;
	}
	public Set<ProfessionalRecord> getProfesionalRecord() {
		return profesionalRecord;
	}
	public void setProfesionalRecord(Set<ProfessionalRecord> profesionalRecord) {
		this.profesionalRecord = profesionalRecord;
	}
	public Set<EndoserRecord> getEndoserRecord() {
		return endoserRecord;
	}
	public void setEndoserRecord(Set<EndoserRecord> endoserRecord) {
		this.endoserRecord = endoserRecord;
	}
	public Set<MiscellaneousRecord> getMiscellaniousRecord() {
		return miscellaniousRecord;
	}
	public void setMiscellaniousRecord(Set<MiscellaneousRecord> miscellaniousRecord) {
		this.miscellaniousRecord = miscellaniousRecord;
	}
	
	
	

}
